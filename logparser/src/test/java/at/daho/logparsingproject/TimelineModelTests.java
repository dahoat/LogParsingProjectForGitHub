package at.daho.logparsingproject;

import at.daho.logparsingproject.logparser.timelinemodel.model.TlTimestamp;
import at.daho.logparsingproject.logparser.timelinemodel.service.TlTimestampService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("quickTest")
public class TimelineModelTests
{
	@Autowired
	private TlTimestampService timestampService;

	private final List<TlTimestamp> timestamps = new ArrayList<>();
	private TlTimestamp firstTimestamp;
	private TlTimestamp lastTimestamp;

	@Before
	public void setUp() {
		for(TlTimestamp timestamp: timestampService.findAll()) {
			timestamps.add(timestamp);
		}

		firstTimestamp = timestamps.stream().reduce((t1, t2) -> t1.getUnixTimestamp() < t2.getUnixTimestamp() ? t1 : t2).orElseThrow();
		lastTimestamp = timestamps.stream().reduce((t1, t2) -> t1.getUnixTimestamp() > t2.getUnixTimestamp() ? t1 : t2).orElseThrow();
	}

	@Test
	public void testSpringAutowire() {
		assertNotNull(this.timestampService);
	}

	@Test
	public void testFindFirstTimestamp() {
		TlTimestamp timestamp = timestampService.findFirstTimestamp();
		assertNotNull(timestamp);
		assertTrue(firstTimestamp.equals(timestamp));
		assertEquals(firstTimestamp, timestamp);
	}

	@Test
	public void testFindLastTimestamp() {
		TlTimestamp timestamp = timestampService.findLastTimestamp();
		assertNotNull(timestamp);
		assertEquals(lastTimestamp, timestamp);
	}

	@Test
	public void testTimestampOrderAndCompletenessOfTimeline() {
		List<TlTimestamp> timestamps = new ArrayList<>(this.timestamps);
		long unix = Long.MIN_VALUE;

		for(TlTimestamp current = firstTimestamp; current != null; current = timestampService.findNext(current)) {
			assertTrue(unix < current.getUnixTimestamp());
			unix = current.getUnixTimestamp();
			timestamps.remove(current);
		}

		assertTrue(timestamps.isEmpty());
	}


}
