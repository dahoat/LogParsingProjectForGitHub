package at.daho.logparsingproject;

import at.daho.logparsingproject.logparser.LogparserApplication;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.hierarchymodel.service.HrEventService;
import at.daho.logparsingproject.logparser.hierarchymodel.service.HrQueryService;
import at.daho.logparsingproject.logparser.hierarchymodel.service.HrTimestampService;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LogparserApplication.class)
public class HierarchicalQueryTests
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private HrQueryService hrQueryService;
	@Autowired
	private HrEventService hrEventService;
	@Autowired
	private HrTimestampService hrTimestampService;


	@Test
	public void fuzzConnectionsAtTimestamp() {
		int maxRounds = 200;
		int year = 2020;
		int month = 4;
		int day = 26;
		int hour = 6;
		int minute = 48;
		int second = 55;
		Random random = new Random();

		Iterator<Integer> days = random.ints(26, 27+1).iterator();
		Iterator<Integer> hours = random.ints(0, 23+1).iterator();
		Iterator<Integer> minutes = random.ints(0, 59+1).iterator();
		Iterator<Integer> seconds = random.ints(0, 59+1).iterator();


		Map<CommonTimestamp, Long> timestamps = new HashMap<>();
		List<HrEvent> allEvents = new ArrayList<>();
		hrEventService.findAll().forEach(allEvents::add);
		allEvents.forEach(evt -> timestamps.put(hrTimestampService.getTimestamp(evt.getTimestamp()), evt.getId()));


		try {
			for(int i = 0; i < maxRounds; i++) {
				Set<String> referencePreview = null;
				System.out.format("Running fuzzConnectionsAtTimestamp: %d/%d\n", i+1, maxRounds);

				while(referencePreview == null || referencePreview.isEmpty()) {
					day = days.next();
					hour = hours.next();
					minute = minutes.next();
					second = seconds.next();
					CommonTimestamp timestamp = new CommonTimestamp(year, month, day, hour, minute, second);
					List<HrEvent> connects = getConnectsBeforeOrOnTimestamp(allEvents, timestamps, timestamp);
					List<HrEvent> disconnects = getMatchingDisconnectsAfterOrOnTimestamp(allEvents, timestamps, timestamp, connects);
					referencePreview = disconnects.stream().map(dis -> dis.getAttackerIp().getIp()).collect(Collectors.toSet());
				}

				Set<String> connectedIpsReference = getConnectionsAtTimestampReference(year, month, day, hour, minute, second);
				assertEquals(connectedIpsReference, referencePreview);

				Set<String> connectedIpsQuery = getConnectedAtTimestampQuery(year, month, day, hour, minute, second);

				System.out.println(connectedIpsReference);
				assertEquals(connectedIpsReference, connectedIpsQuery);
			}
		}
		catch(AssertionError e) {
			System.out.println("Year: " + year);
			System.out.println("Month: " + month);
			System.out.println("Day: " + day);
			System.out.println("Hour: " + hour);
			System.out.println("Minute: " + minute);
			System.out.println("Second: " + second);
			throw e;
		}


	}

	private List<HrEvent> getConnectsBeforeOrOnTimestamp(List<HrEvent> allEvents, Map<CommonTimestamp, Long> timestamps, CommonTimestamp timestamp) {
		return timestamps.entrySet().stream()
				.filter(entry -> entry.getKey().compareTo(timestamp) <= 0)
				.map(Map.Entry::getValue)
				.flatMap(evtKey -> allEvents.stream().filter(evt -> evt.getId().equals(evtKey)))
				.filter(evt -> evt.getType().getName().equals("connect"))
				.collect(Collectors.toList());
	}

	private List<HrEvent> getMatchingDisconnectsAfterOrOnTimestamp(List<HrEvent> allEvents, Map<CommonTimestamp, Long> timestamps, CommonTimestamp timestamp, List<HrEvent> connects)
	{
		return timestamps.entrySet().stream()
				.filter(entry -> entry.getKey().compareTo(timestamp) >= 0)
				.map(Map.Entry::getValue)
				.flatMap(evtKey -> allEvents.stream().filter(evt -> evt.getId().equals(evtKey)))
				.filter(evt -> evt.getType().getName().equals("disconnect"))
				.filter(dis -> connects.stream().anyMatch(con -> con.getProcessId().getProcessId().equals(dis.getProcessId().getProcessId()) && con.getAttackerIp().getIp().equals(dis.getAttackerIp().getIp())))
				.collect(Collectors.toList());
	}

	private Set<String> getConnectionsAtTimestampReference(int year, int month, int day, int hour, int minute, int second) {
		List<Long> connectionIds = findConnectIdsBeforeTimestamp(year, month, day, hour, minute, second);
		List<Long> disconnectionIds = findDisconnectIdsForConnectIds(connectionIds);
		/*System.out.print("Connection ids:    ");
		System.out.println(connectionIds);
		System.out.print("Disconnection ids: ");
		System.out.println(disconnectionIds);*/

		return disconnectionIds.stream().map(id -> hrEventService.findById(id)).filter(dis -> eventTimestampGreaterEquals(dis, year, month, day, hour, minute, second)).map(dis -> dis.getAttackerIp().getIp()).collect(Collectors.toSet());
	}

	private Set<String> getConnectedAtTimestampQuery(int year, int month, int day, int hour, int minute, int second) {
		String query = "MATCH (year:Hr_Year)-[:FINER]->(month:Hr_Month)-[:FINER]->(day:Hr_Day)-[:FINER]->(hour:Hr_Hour)-[:FINER]->(minute:Hr_Minute)-[:FINER]->(second:Hr_Second) " +
				"WHERE datetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value})<=datetime({year: ?, month: ?, day: ?, hour: ?, minute: ?, second: ?}) " +
				"WITH second " +
				"MATCH " +
				"(connect:Hr_Event)-[:HAPPENED_AT]->(second), " +
				"(connect)-[:IS_TYPE]->(connectType:Hr_Type {name: 'connect'}) " +
				"WITH connect " +
				"MATCH " +
				"(disconnect:Hr_Event)-[:ATTACKER_IP]->(ip:Hr_Ip)<-[:ATTACKER_IP]-(connect), " +
				"(connect)-[:HAPPENED_AT]->(con_sec:Hr_Second), " +
				"(disconnect)-[:HAPPENED_AT]->(dis_sec:Hr_Second), " +
				"(connect)-[:NEXT_EVENT*]->(disconnect), " +
				"(connect)-[:HAS_PID]->(:Hr_Process)<-[:HAS_PID]-(disconnect), " +
				"(disconnect)-[:IS_TYPE]->(connectType:Hr_Type {name: 'disconnect'}), " +
				"p=shortestPath((connect)-[:NEXT_EVENT*..10]-(disconnect)) " +
				"WITH connect, disconnect, p ORDER BY id(connect) ASC, length(p) ASC " +
				"WITH {id: id(connect), disconnections: collect({len: length(p), id: id(disconnect)})} AS con " +
				"WITH con.disconnections[0].id AS dis " +
				"MATCH(year:Hr_Year)-[:FINER]->(month:Hr_Month)-[:FINER]->(day:Hr_Day)-[:FINER]->(hour:Hr_Hour)-[:FINER]->(minute:Hr_Minute)-[:FINER]->(second:Hr_Second)<-[:HAPPENED_AT]-(disconnect) " +
				"WHERE id(disconnect) = dis AND datetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value})>=datetime({year: ?, month: ?, day: ?, hour: ?, minute: ?, second: ?}) " +
				"WITH disconnect " +
				"MATCH (disconnect)-[:ATTACKER_IP]->(ip:Hr_Ip) RETURN ip.ip";
		Object[] args = {year, month, day, hour, minute, second, year, month, day, hour, minute, second};
		List<String> results = jdbcTemplate.query(query, args, (resultSet, i) -> resultSet.getString(1));
		return new HashSet<>(results);
	}

	private boolean eventTimestampGreaterEquals(HrEvent event, int year, int month, int day, int hour, int minute, int second) {
		return hrTimestampService.getTimestamp(event.getTimestamp()).compareTo(new CommonTimestamp(year, month, day, hour, minute, second)) >= 0;
	}

	private List<Long> findDisconnectIdsForConnectIds(List<Long> connectIds) {
		return connectIds.stream().map(this::findDisconnectIdForConnectId).collect(Collectors.toList());
	}

	public List<Long> findConnectIdsBeforeTimestamp(int year, int month, int day, int hour, int minute, int second) {
		String queryConnectIds = "match (year:Hr_Year)-[:FINER]->(month:Hr_Month)-[:FINER]->(day:Hr_Day)-[:FINER]->(hour:Hr_Hour)-[:FINER]->(minute:Hr_Minute)-[:FINER]->(second:Hr_Second) " +
				"where datetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value})<=datetime({year: ?, month: ?, day: ?, hour: ?, minute: ?, second: ?}) " +
				"with second " +
				"match " +
				"(connect:Hr_Event)-[:HAPPENED_AT]->(second), " +
				"(connect)-[:IS_TYPE]->(connectType:Hr_Type {name: 'connect'}) " +
				"return id(connect)";
		Object[] args = {year, month, day, hour, minute, second};
		return jdbcTemplate.query(queryConnectIds, args, (resultSet, i) -> resultSet.getLong(1));
	}

	public Long findDisconnectIdForConnectId(long connectId) {
		String query = "match " +
				"(connect) where id(connect) = ? " +
				"with connect " +
				"match " +
				"(disconnect:Hr_Event)-[:ATTACKER_IP]->(ip:Hr_Ip)<-[:ATTACKER_IP]-(connect:Hr_Event), " +
				"(connect)-[:HAPPENED_AT]->(con_sec:Hr_Second), " +
				"(disconnect)-[:HAPPENED_AT]->(dis_sec:Hr_Second), " +
				"(connect)-[:NEXT_EVENT*]->(disconnect), " +
				"(connect)-[:HAS_PID]->(:Hr_Process)<-[:HAS_PID]-(disconnect), " +
				"p=shortestPath((con_sec:Hr_Second)-[:FINER|NEXT*0..10]-(dis_sec:Hr_Second)) " +
				"return id(disconnect) order by length(p) asc limit 1";

		Object[] args = {connectId};
		return jdbcTemplate.queryForObject(query, args, (resultSet, i) -> resultSet.getLong(1));
	}

	@Test
	public void testFindDisconnectForAllConnect()
	{
		List<HrEvent> connectEvents = hrQueryService.findAllConnect();
		connectEvents.forEach(connect -> {
			CommonTimestamp connect_timestamp = hrTimestampService.getTimestamp(connect.getTimestamp());

			Long disconnectId = findDisconnectIdForConnectId(connect.getId());
			HrEvent disconnect = hrEventService.findById(disconnectId);

			assertNotNull(disconnect);

			CommonTimestamp disconnect_timestamp = hrTimestampService.getTimestamp(disconnect.getTimestamp());

			assertEquals(connect.getProcessId().getProcessId(), disconnect.getProcessId().getProcessId());
			assertEquals(connect.getAttackerIp().getIp(), disconnect.getAttackerIp().getIp());
			assertTrue(connect_timestamp.compareTo(disconnect_timestamp) <= 0);
			assertNotEquals(connect.getType().getName(), disconnect.getType().getName());
			assertEquals("disconnect", disconnect.getType().getName());
		});
	}

	@Test
	public void fuzzComparison() {
		int maxRounds = 200;

		Map<Long, CommonTimestamp> timestamps = new HashMap<>();
		List<HrEvent> allEvents = new ArrayList<>();
		hrEventService.findAll().forEach(allEvents::add);
		allEvents.forEach(evt -> timestamps.put(evt.getId(), hrTimestampService.getTimestamp(evt.getTimestamp())));

		Random random = new Random();
		boolean lessHit = false;
		boolean greaterHit = false;
		boolean equalHit = false;

		for(int i = 0; i < maxRounds; i++) {
			System.out.format("Running fuzzConnectionsAtTimestamp: %d/%d\n", i+1, maxRounds);
			int r1 = random.nextInt(allEvents.size());
			int r2 = random.nextInt(allEvents.size());

			Long id1 = allEvents.get(r1).getId();
			Long id2 = allEvents.get(r2).getId();

			CommonTimestamp timestamp1 = timestamps.get(id1);
			CommonTimestamp timestamp2 = timestamps.get(id2);

			String query = "match (n)-[:HAPPENED_AT]->(tn) where id(n) = ? with *  " +
					"match (m)-[:HAPPENED_AT]->(tm) where id(m) = ? with * " +
					"optional match p=((tn)<-[:FINER*0..10]-(middlen)-[:NEXT]->(middlem)-[:FINER*0..10]->(tm)) with * " +
					"optional match q=((tn)<-[:FINER*0..10]-(middlen)<-[:NEXT]-(middlem)-[:FINER*0..10]->(tm)) with * " +
					"optional match r=((tn)<-[:FINER*0..10]-(cn)<-[:FINER]-(common)-[:FINER]->(cm)-[:FINER*0..10]->(tm)) " +
					"return p is not null or cn.value < cm.value as greater, q is not null or cn.value > cm.value as less, tn = tm as equal";
			Object[] args = {id1, id2};
			Map<String, Boolean> result = jdbcTemplate.queryForObject(query, args, (resultSet, j) -> {
				Map<String, Boolean> map = new HashMap<>();
				map.put("greater", resultSet.getBoolean("greater"));
				map.put("less", resultSet.getBoolean("less"));
				map.put("equal", resultSet.getBoolean("equal"));
				return map;
			});

			try {
				assertNotNull(result);
				if(timestamp2.compareTo(timestamp1) < 0) {
					assertFalse(result.get("greater"));
					assertTrue(result.get("less"));
					assertFalse(result.get("equal"));
					lessHit = true;
				} else if (timestamp2.compareTo(timestamp1) == 0) {
					assertFalse(result.get("greater"));
					assertFalse(result.get("less"));
					assertTrue(result.get("equal"));
					equalHit = true;
				} else if (timestamp2.compareTo(timestamp1) > 0) {
					assertTrue(result.get("greater"));
					assertFalse(result.get("less"));
					assertFalse(result.get("equal"));
					greaterHit = true;
				} else {
					fail();
				}
			} catch(AssertionError e) {
				System.out.format("Event id 1: %d\n", id1);
				System.out.format("Event id 2: %d\n", id2);
				throw e;
			}


		}

		assertTrue(lessHit);
		assertTrue(equalHit);
		assertTrue(greaterHit);

	}


}
