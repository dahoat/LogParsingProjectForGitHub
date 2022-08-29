package at.daho.logparsingproject.logparser.propertymodel.processor;

import at.daho.logparsingproject.logparser.model.CommonEvent;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import at.daho.logparsingproject.logparser.processor.DatabaseModelWriter;
import at.daho.logparsingproject.logparser.propertymodel.model.PtEvent;
import at.daho.logparsingproject.logparser.propertymodel.model.PtIp;
import at.daho.logparsingproject.logparser.propertymodel.model.PtProcess;
import at.daho.logparsingproject.logparser.propertymodel.model.PtType;
import at.daho.logparsingproject.logparser.propertymodel.service.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class PropertyModelWriter implements DatabaseModelWriter
{
	private final PtAttackerService attackerService;
	private final PtEventService eventService;
	private final PtIpService ipService;
	private final PtTypeService typeService;
	private final PtProcessService processService;

	public PropertyModelWriter(PtAttackerService attackerService, PtEventService eventService, PtIpService ipService, PtTypeService typeService, PtProcessService processService) {
		this.attackerService = attackerService;
		this.eventService = eventService;
		this.ipService = ipService;
		this.typeService = typeService;
		this.processService = processService;
	}

	@Override
	public void clearDatabase()
	{
		this.attackerService.deleteAll();
		this.eventService.deleteAll();
		this.ipService.deleteAll();
		this.typeService.deleteAll();
	}

	@Override
	public void storeEvent(CommonEvent commonEvent)
	{
		PtType type = typeService.findOrCreateByName(commonEvent.getType().getName());
		PtIp attackerIp = ipService.findOrCreateByIp(commonEvent.getAttackerIp().getIp());
		PtIp targetIp = ipService.findOrCreateByIp(commonEvent.getTargetIp().getIp());
		Date timestamp = commonTimestampToDate(commonEvent.getTimestamp());
		PtProcess process = processService.findOrCreate(commonEvent.getProcessId().getId());

		PtEvent event = new PtEvent(type, attackerIp, targetIp, timestamp, process, commonEvent.getTimestamp());
		eventService.save(event);
	}

	private Date commonTimestampToDate(CommonTimestamp timestamp) {
		return new GregorianCalendar(timestamp.getYear(), timestamp.getMonth()-1, timestamp.getDay(), timestamp.getHour(), timestamp.getMinute(), timestamp.getSecond()).getTime();
	}
}
