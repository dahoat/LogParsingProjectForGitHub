package at.daho.logparsingproject.logparser.runner;

import at.daho.logparsingproject.logparser.processor.PostfixConnectionLogProcessor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
@Profile("timing")
public class TimeMeasurementRunner implements CommandLineRunner {

	//private final String logFileName = "logfiles/mail.log";
	private final String logFileName = "logfiles/mail_half.log";
	//private final String logFileName = "classpath:logfiles/mail_big.log";
	private final String outputFileName = "measurements/testfile.csv";
	private final int warmupRounds = 1000;
	private final int measurementRounds = 10000;

	private final PostfixConnectionLogProcessor postfixConnectionLogProcessor;
	private final JdbcTemplate jdbcTemplate;
	private final CSVPrinter csvPrinter;

	private int nextId = 0;

	public TimeMeasurementRunner(PostfixConnectionLogProcessor postfixConnectionLogProcessor, JdbcTemplate jdbcTemplate) throws IOException {
		this.postfixConnectionLogProcessor = postfixConnectionLogProcessor;
		this.jdbcTemplate = jdbcTemplate;

		this.csvPrinter = new CSVPrinter(new FileWriter(outputFileName), CSVFormat.DEFAULT.withHeader("id", "model", "query", "mode", "time"));
	}

	@Override
	public void run(String... args) throws Exception {
		runPropertyBasedTests();
		runTimelineTests();
		runHierarchicalTests();
		//runExtededTimelineTests();


		csvPrinter.flush();
		System.out.println("##### end #####");


	}

	private void runPropertyBasedTests() throws IOException {
		postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.PROPERTY_BASED_MODEL);
		runTest("property_based", "q1", getQueryQ1Pt());
		runTest("property_based", "q2", getQueryQ2Pt());
		runTest("property_based", "q3", getQueryQ3Pt());
		runTest("property_based", "q4", getQueryQ4Pt());
	}

	private void runTimelineTests() throws IOException {
		postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.TIMELINE_MODEL);
		runTest("timeline", "q1", getQueryQ1Tl());
		runTest("timeline", "q2", getQueryQ2Tl());
		runTest("timeline", "q3", getQueryQ3Tl());
		runTest("timeline", "q4", getQueryQ4Tl());
	}

	private void runExtededTimelineTests() throws IOException {
		postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.TIMELINE_MODEL);
		runTest("extededTimeline", "q2", getQueryQ2ETl());
	}

	private void runHierarchicalTests() throws IOException {
		postfixConnectionLogProcessor.process(logFileName, PostfixConnectionLogProcessor.HIERARCHICAL_MODEL);
		runTest("hierarchical", "q1", getQueryQ1Hr());
		runTest("hierarchical", "q2", getQueryQ2Hr());
		runTest("hierarchical", "q3", getQueryQ3Hr());
		runTest("hierarchical", "q4", getQueryQ4Hr());
	}

	private void runTest(String model, String queryName, String query) throws IOException {
		for (int i = 0; i < warmupRounds; i++) {
			if(i % 10 == 0) {
				System.out.println("Running warmup " + i + "/" + warmupRounds + ": " + model + " " + queryName);
			}
			long time = executeQuery(query);
			logMeasurement(model, queryName, "warmup", time);
		}

		for (int i = 0; i < measurementRounds; i++) {
			if(i % 10 == 0) {
				System.out.println("Running measurement " + i + "/" + measurementRounds + ": " + model + " " + queryName);
			}
			long time = executeQuery(query);
			logMeasurement(model, queryName, "measurement", time);
		}
	}

	private void logMeasurement(String model, String queryName, String mode, long time) throws IOException {
		csvPrinter.printRecord(this.nextId++, model, queryName, mode, time);
	}


	private long executeQuery(String query) {
		final long milis = System.currentTimeMillis();
		this.jdbcTemplate.queryForList(query);
		return System.currentTimeMillis() - milis;
	}

	private String getIdForQueryQ1Pt() {
		return jdbcTemplate.queryForObject("match (n:Pt_Event) where n.timestamp = datetime(\"2020-04-27T07:09:48[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ1Tl() {
		return jdbcTemplate.queryForObject("match (m:Tl_Timestamp)<-[:HAPPENED_AT]-(n:Tl_Event) where m.timestamp = datetime(\"2020-04-27T07:09:48[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ1Hr() {
		return jdbcTemplate.queryForObject("match (year:Hr_Year{value: 2020})-[:FINER]->(month:Hr_Month{value: 4})-[:FINER]->(day:Hr_Day{value: 27})" +
				"-[:FINER]->(hour:Hr_Hour{value:7})-[:FINER]->(minute:Hr_Minute{value:9})-[:FINER]-(second:Hr_Second{value:48})" +
				"<-[:HAPPENED_AT]-(n) return id(n)", String.class);
	}

	private String getQueryQ1Pt() {
		return "match (connect:Pt_Event) where id(connect) = " + getIdForQueryQ1Pt() + " with connect\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(connect:Pt_Event), (process:Pt_Process), (disconnect:Pt_Event), \n" +
				"\t(connect)-[:HAS_PID]->(process)<-[:HAS_PID]-(disconnect), \n" +
				"\t(disconnect)-[:IS_TYPE]->(:Pt_Type{name:'disconnect'}) \n" +
				"\twhere connect.timestamp <= disconnect.timestamp\n" +
				"\treturn disconnect \n" +
				"\torder by disconnect.timestamp ASC, disconnect.order ASC limit 1";
	}

	private String getQueryQ1Tl() {
		return "match (connect:Tl_Event) where id(connect) = " + getIdForQueryQ1Tl() + " with connect\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(connect)-[:HAPPENED_AT]->(connectTimestamp),\n" +
				"\t(disconnect)-[:HAPPENED_AT]->(disconnectTimestamp),\n" +
				"\t(disconnect:Tl_Event)-[:IS_TYPE]->(:Tl_Type{name:'disconnect'}),\n" +
				"\t(connect)-[:HAS_PID]->(t:Tl_Process)<-[:HAS_PID]-(disconnect), \n" +
				"\tp=shortestPath((connectTimestamp)-[:NEXT*1..]->(disconnectTimestamp))\n" +
				"\twith disconnect, length(p) as len order by len ASC limit 1\n" +
				"\treturn disconnect";
	}

	private String getQueryQ1Hr() {
		return "match (connect:Hr_Event) where id(connect) = " + getIdForQueryQ1Hr() + " with connect\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(disconnect:Hr_Event), (ip:Hr_Ip), (connect:Hr_Event), \n" +
				"\t(disconnect)-[:ATTACKER_IP]->(ip)<-[:ATTACKER_IP]-(connect),\n" +
				"\t(connect)-[:HAPPENED_AT]->(con_sec:Hr_Second),\n" +
				"\t(disconnect)-[:HAPPENED_AT]->(dis_sec:Hr_Second),\n" +
				"\t(connect)-[:NEXT_EVENT*]->(disconnect),\n" +
				"\t(disconnect)-[:IS_TYPE]->(connectType:Hr_Type {name: 'disconnect'}),\n" +
				"\tp=shortestPath((con_sec:Hr_Second)-[:FINER|NEXT*0..]-(dis_sec:Hr_Second))\n" +
				"\treturn disconnect order by length(p) asc limit 1";
	}

	private String getQueryQ2Pt() {
		return "with datetime(\"2020-04-26T06:30:17.000[Europe/Vienna]\") as timestamp\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(connect:Pt_Event), (process:Pt_Process), (disconnect:Pt_Event), \n" +
				"\t(connect)-[:HAS_PID]->(process)<-[:HAS_PID]-(disconnect), \n" +
				"\t(connect)-[:IS_TYPE]->(:Pt_Type{name:'connect'}),\n" +
				"\t(disconnect)-[:IS_TYPE]->(:Pt_Type{name:'disconnect'})\n" +
				"\twhere\n" +
				"\tconnect.timestamp <= timestamp and\n" +
				"\tdisconnect.timestamp >= timestamp and\n" +
				"\t(\n" +
				"\t\tconnect.timestamp < disconnect.timestamp \n" +
				"\t\tor \n" +
				"\t\tconnect.timestamp = disconnect.timestamp and \n" +
				"\t\tconnect.order < disconnect.order\n" +
				"\t)\n" +
				"\twith disconnect\n" +
				"\tmatch (disconnect)-[:ATTACKER_IP]->(ip)\n" +
				"\treturn distinct ip.ip as connected_ips";
	}

	private String getQueryQ2Tl() {
		return "with datetime(\"2020-04-26T06:30:17.000[Europe/Vienna]\") as timestamp\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(connect:Tl_Event)-[:HAPPENED_AT]->(connectTimestamp:Tl_Timestamp), \n" +
				"\t(connect)-[:IS_TYPE]->(:Tl_Type{name:'connect'}), \n" +
				"\t(disconnect:Tl_Event)-[:HAPPENED_AT]->(disconnectTimestamp:Tl_Timestamp), \n" +
				"\t(disconnect)-[:IS_TYPE]->(:Tl_Type{name:'disconnect'}), \n" +
				"\t(connect)-[:HAS_PID]->(:Tl_Process)<-[:HAS_PID]-(disconnect), \n" +
				"\tp=shortestPath((connectTimestamp)-[:NEXT*1..]->(disconnectTimestamp))\n" +
				"\twhere \n" +
				"\tconnectTimestamp.timestamp <= timestamp \n" +
				"\t\n" +
				"\twith timestamp, connect, p order by length(p) asc\n" +
				"\twith timestamp, connect, collect(p) as paths\n" +
				"\twith timestamp, connect, paths[0] as p\n" +
				"\tunwind nodes(p) as disconnectTimestamp \n" +
				"\twith timestamp, connect, disconnectTimestamp\n" +
				"\t\n" +
				"\tmatch \n" +
				"\t(connect)-[:HAS_PID]->(:Tl_Process)<-[:HAS_PID]-(disconnect), \n" +
				"\t(disconnect)-[:HAPPENED_AT]->(disconnectTimestamp), \n" +
				"\t(disconnect)-[:ATTACKER_IP]->(ip:Tl_Ip)\n" +
				"\twhere disconnectTimestamp.timestamp >= timestamp\n" +
				"\treturn ip.ip as connected_ips";
	}

	private String getQueryQ2ETl() {
		return "with \n" +
				"datetime(\"2020-04-26T06:30:17.000[Europe/Vienna]\") as timestamp\n" +
				"\n" +
				"match\n" +
				"(a:Tl_Timestamp)-[:NEXT*0..1]->(b:Tl_Timestamp),\n" +
				"(connectTimestamp:Tl_Timestamp)-[:NEXT*0..]->(a),\n" +
				"(b)-[:NEXT*0..]->(disconnectTimestamp:Tl_Timestamp),\n" +
				"\n" +
				"(connect:Tl_Event)-[:HAPPENED_AT]->(connectTimestamp), \n" +
				"(connect)-[:IS_TYPE]->(:Tl_Type{name:'connect'}), \n" +
				"(disconnect:Tl_Event)-[:HAPPENED_AT]->(disconnectTimestamp), \n" +
				"(disconnect)-[:IS_TYPE]->(:Tl_Type{name:'disconnect'}), \n" +
				"(connect)-[:HAS_PID]->(:Tl_Process)<-[:HAS_PID]-(disconnect),\n" +
				"p=shortestPath(\n" +
				"(connectTimestamp)-[:NEXT*1..]->(disconnectTimestamp)\n" +
				")\n" +
				"\n" +
				"where \n" +
				"a.timestamp < timestamp and timestamp < b.timestamp \n" +
				"or \n" +
				"a.timestamp = b.timestamp and a.timestamp = timestamp\n" +
				"\n" +
				"return p";
	}

	private String getQueryQ2Hr() {
		return "with datetime(\"2020-04-26T08:30:17.000[Europe/Vienna]\") as timestamp\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(year:Hr_Year)-[:FINER]->(month:Hr_Month)\n" +
				"\t\t-[:FINER]->(day:Hr_Day)\n" +
				"\t\t-[:FINER]->(hour:Hr_Hour)\n" +
				"\t\t-[:FINER]->(minute:Hr_Minute)\n" +
				"\t\t-[:FINER]->(second:Hr_Second), \n" +
				"\t(connect:Hr_Event)-[:HAPPENED_AT]->(second),\n" +
				"\t(connect)-[:IS_TYPE]->(:Hr_Type{name: 'connect'}), \n" +
				"\t(disconnect:Hr_Event)-[:IS_TYPE]->(:Hr_Type{name: 'disconnect'}), \n" +
				"\tp=shortestPath((connect)-[:NEXT_EVENT*1..]->(disconnect))\n" +
				"\twhere \n" +
				"\tdatetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value})<=timestamp\n" +
				"\twith timestamp, connect, disconnect, p\n" +
				"\t\n" +
				"\twith timestamp, connect, disconnect, p order by length(p) asc\n" +
				"\twith timestamp, connect, collect(p) as paths\n" +
				"\twith timestamp, connect, paths[0] as p\n" +
				"\tunwind nodes(p) as disconnect\n" +
				"\twith timestamp, connect, disconnect\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(year:Hr_Year)-[:FINER]->(month:Hr_Month)\n" +
				"\t\t-[:FINER]->(day:Hr_Day)\n" +
				"\t\t-[:FINER]->(hour:Hr_Hour)\n" +
				"\t\t-[:FINER]->(minute:Hr_Minute)\n" +
				"\t\t-[:FINER]->(second:Hr_Second), \n" +
				"\t(connect)-[:HAS_PID]->(:Hr_Process)<-[:HAS_PID]-(disconnect), \n" +
				"\t(disconnect)-[:HAPPENED_AT]->(second), \n" +
				"\t(disconnect)-[:ATTACKER_IP]->(ip:Hr_Ip)\n" +
				"\twhere \n" +
				"\tdatetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value})>=timestamp\n" +
				"\treturn ip.ip as connected_ips";
	}

	private String getIdForQueryQ3Pt1() {
		return jdbcTemplate.queryForObject("match (n:Pt_Event)-[:IS_TYPE]->(:Pt_Type{name:'connect'}) where n.timestamp = datetime(\"2020-04-26T20:05:41[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ3Tl1() {
		return jdbcTemplate.queryForObject("match (m:Tl_Timestamp)<-[:HAPPENED_AT]-(n:Tl_Event)-[:IS_TYPE]->(:Tl_Type{name:'connect'}) where m.timestamp = datetime(\"2020-04-26T20:05:41[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ3Hr1() {
		return jdbcTemplate.queryForObject("match (year:Hr_Year{value: 2020})-[:FINER]->(month:Hr_Month{value: 4})-[:FINER]->(day:Hr_Day{value: 26})-[:FINER]->(hour:Hr_Hour{value:20})-[:FINER]->(minute:Hr_Minute{value:5})-[:FINER]-(second:Hr_Second{value:41})<-[:HAPPENED_AT]-(n)-[:IS_TYPE]->(:Hr_Type{name:'connect'}) return id(n)", String.class);
	}

	private String getIdForQueryQ3Pt2() {
		return jdbcTemplate.queryForObject("match (n:Pt_Event)-[:IS_TYPE]->(:Pt_Type{name:'connect'}) where n.timestamp = datetime(\"2020-04-26T21:12:50[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ3Tl2() {
		return jdbcTemplate.queryForObject("match (m:Tl_Timestamp)<-[:HAPPENED_AT]-(n:Tl_Event)-[:IS_TYPE]->(:Tl_Type{name:'connect'}) where m.timestamp = datetime(\"2020-04-26T21:12:50[Europe/Vienna]\") return id(n)", String.class);
	}

	private String getIdForQueryQ3Hr2() {
		return jdbcTemplate.queryForObject("match (year:Hr_Year{value: 2020})-[:FINER]->(month:Hr_Month{value: 4})-[:FINER]->(day:Hr_Day{value: 26})-[:FINER]->(hour:Hr_Hour{value:21})-[:FINER]->(minute:Hr_Minute{value:12})-[:FINER]-(second:Hr_Second{value:50})<-[:HAPPENED_AT]-(n)-[:IS_TYPE]->(:Hr_Type{name:'connect'}) return id(n)", String.class);
	}

	private String getQueryQ3Pt() {
		return "match (a), (b) where id(a) = " + getIdForQueryQ3Pt1() + " and id(b) = " + getIdForQueryQ3Pt2() + "\n" +
				"\treturn \n" +
				"\t\ta.timestamp > b.timestamp as less, \n" +
				"\t\ta.timestamp = b.timestamp as equal, \n" +
				"\t\ta.timestamp < b.timestamp as greater";
	}

	private String getQueryQ3Tl() {
		return "match (a), (b) where id(a) = " + getIdForQueryQ3Tl1() + " and id(b) = " + getIdForQueryQ3Tl2() + " with a, b\n" +
				"\t\n" +
				"\tmatch\n" +
				"\t(a)-[:HAPPENED_AT]->(aTimestamp:Tl_Timestamp),\n" +
				"\t(b)-[:HAPPENED_AT]->(bTimestamp:Tl_Timestamp)\n" +
				"\treturn \n" +
				"\t\texists((aTimestamp)<-[:NEXT*]-(bTimestamp)) as less, \n" +
				"\t\taTimestamp.timestamp = bTimestamp.timestamp as equals, \n" +
				"\t\texists((aTimestamp)-[:NEXT*]->(bTimestamp)) as greater";
	}

	private String getQueryQ3Hr() {
		return "\tmatch (a)-[:HAPPENED_AT]->(timestampA) where id(a) = " + getIdForQueryQ3Hr1() + " with * \n" +
				"\tmatch (b)-[:HAPPENED_AT]->(timestampB) where id(b) = " + getIdForQueryQ3Hr2() + " with * \n" +
				"\t\n" +
				"\toptional match \n" +
				"\tp=((timestampA)<-[:FINER*0..]-()<-[:NEXT*]-()-[:FINER*0..]->(timestampB)) \n" +
				"\twith * \n" +
				"\t\n" +
				"\toptional match \n" +
				"\tq=((timestampA)<-[:FINER*0..]-()-[:NEXT*]->()-[:FINER*0..]->(timestampB)) \n" +
				"\twith * \n" +
				"\t\n" +
				"\toptional match \n" +
				"\tr=((timestampA)<-[:FINER*0..]-(commonA)<-[:FINER]-()-[:FINER]->(commonB)-[:FINER*0..]->(timestampB)) \n" +
				"\t\n" +
				"\treturn \n" +
				"\t\tp is not null or commonA.value > commonB.value as less, \n" +
				"\t\ttimestampA = timestampB as equal, \n" +
				"\t\tq is not null or commonA.value < commonB.value as greater";
	}

	private String getQueryQ4Pt() {
		return "match (event:Pt_Event) where id(event) = " + getIdForQueryQ1Pt() + " \n" +
				"\t\twith event.timestamp as timestamp \n" +
				"\t\t\n" +
				"\t\twith \n" +
				"\t\tdatetime({year: timestamp.year, month: timestamp.month, day: timestamp.day, hour: timestamp.hour-1, minute: timestamp.minute, second: timestamp.second}) as lowerTimestamp, \n" +
				"\t\ttimestamp as upperTimestamp \n" +
				"\t\t\n" +
				"\t\tmatch (events:Pt_Event) \n" +
				"\t\twhere \n" +
				"\t\tlowerTimestamp <= events.timestamp and \n" +
				"\t\tevents.timestamp <= upperTimestamp \n" +
				"\t\treturn events";
	}

	private String getQueryQ4Tl() {
		return "match (event:Tl_Event)-[:HAPPENED_AT]->(timestamp:Tl_Timestamp) \n" +
				"\t\twhere id(event)=" + getIdForQueryQ1Tl() + " \n" +
				"\t\twith timestamp, timestamp.timestamp as timeVar \n" +
				"\t\t\n" +
				"\t\tmatch \n" +
				"\t\t(earlierTimestamp:Tl_Timestamp)-[:NEXT*0..]->(timestamp), \n" +
				"\t\t(event:Tl_Event)-[:HAPPENED_AT]->(earlierTimestamp) \n" +
				"\t\twhere \n" +
				"\t\tearlierTimestamp.timestamp >= datetime({year:timeVar.year, month:timeVar.month,  day:timeVar.day, hour:timeVar.hour-1, minute:timeVar.minute, second:timeVar.second}) \n" +
				"\t\treturn event ";
	}

	private String getQueryQ4Hr() {
		return "match (event:Hr_Event)-[:HAPPENED_AT]-> \n" +
				"\t\t\t(second:Hr_Second)<-[:FINER]- \n" +
				"\t\t\t(minute:Hr_Minute)<-[:FINER]- \n" +
				"\t\t\t(hour:Hr_Hour)<-[:FINER]- \n" +
				"\t\t\t(day:Hr_Day)<-[:FINER]- \n" +
				"\t\t\t(month:Hr_Month)<-[:FINER]- \n" +
				"\t\t\t(year:Hr_Year) \n" +
				"\t\twhere id(event) = " + getIdForQueryQ1Hr() + " \n" +
				"\t\twith \n" +
				"\t\tdatetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value}) as upperTimestamp, \n" +
				"\t\tdatetime({year: year.value, month: month.value, day: day.value, hour: hour.value-1, minute: minute.value, second: second.value}) as lowerTimestamp \n" +
				"\t\t\n" +
				"\t\tmatch \n" +
				"\t\t\t(event:Hr_Event)-[:HAPPENED_AT]-> \n" +
				"\t\t\t(second:Hr_Second)<-[:FINER]- \n" +
				"\t\t\t(minute:Hr_Minute)<-[:FINER]- \n" +
				"\t\t\t(hour:Hr_Hour)<-[:FINER]- \n" +
				"\t\t\t(day:Hr_Day)<-[:FINER]- \n" +
				"\t\t\t(month:Hr_Month)<-[:FINER]- \n" +
				"\t\t\t(year:Hr_Year) \n" +
				"\t\twith lowerTimestamp, upperTimestamp, event, \n" +
				"\t\tdatetime({year: year.value, month: month.value, day: day.value, hour: hour.value, minute: minute.value, second: second.value}) as timestamp \n" +
				"\t\t\n" +
				"\t\twhere lowerTimestamp <= timestamp and timestamp <= upperTimestamp \n" +
				"\t\treturn event";
	}

}
