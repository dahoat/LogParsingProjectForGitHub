package at.daho.logparsingproject.logparser.timelinemodel.processor;

import at.daho.logparsingproject.logparser.model.CommonEvent;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import at.daho.logparsingproject.logparser.processor.DatabaseModelWriter;
import at.daho.logparsingproject.logparser.timelinemodel.model.*;
import at.daho.logparsingproject.logparser.timelinemodel.service.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TimeLineModelWriter implements DatabaseModelWriter
{


	private final TlAttackerService attackerService;
	private final TlEventService eventService;
	private final TlIpService ipService;
	private final TlTypeService typeService;
	private final TlTimestampService timestampService;
	private final TlProcessService processService;
	private final JdbcTemplate jdbcTemplate;

	public TimeLineModelWriter(TlAttackerService attackerService, TlEventService eventService, TlIpService ipService, TlTypeService typeService, TlTimestampService timestampService, TlProcessService processService, JdbcTemplate jdbcTemplate) {
		this.attackerService = attackerService;
		this.eventService = eventService;
		this.ipService = ipService;
		this.typeService = typeService;
		this.timestampService = timestampService;
		this.processService = processService;
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void clearDatabase()
	{
		this.attackerService.deleteAll();
		this.eventService.deleteAll();
		this.ipService.deleteAll();
		this.typeService.deleteAll();
		this.timestampService.deleteAll();
	}

	@Override
	public void storeEvent(CommonEvent commonEvent)
	{
		TlType type = typeService.findOrCreateByName(commonEvent.getType().getName());
		TlIp attackerIp = ipService.findOrCreateByIp(commonEvent.getAttackerIp().getIp());
		TlIp targetIp = ipService.findOrCreateByIp(commonEvent.getTargetIp().getIp());
		CommonTimestamp commonTimestamp = commonEvent.getTimestamp();
		TlTimestamp timestamp = timestampService.findOrCreate(commonTimestamp.getYear(), commonTimestamp.getMonth(), commonTimestamp.getDay(), commonTimestamp.getHour(), commonTimestamp.getMinute(), commonTimestamp.getSecond());
		TlProcess process = processService.findOrCreate(commonEvent.getProcessId().getId());

		TlEvent event = new TlEvent(type, attackerIp, targetIp, timestamp, process);
		event = eventService.save(event);

		//jdbcTemplate.update("match (t:Tl_Timestamp) where id(t) = ? set t.timestamp = datetime(t.timestamp) return \"ok\"", event.getTimestamp().getId());
	}

}
