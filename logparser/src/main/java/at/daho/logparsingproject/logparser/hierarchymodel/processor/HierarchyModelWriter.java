package at.daho.logparsingproject.logparser.hierarchymodel.processor;

import at.daho.logparsingproject.logparser.hierarchymodel.model.*;
import at.daho.logparsingproject.logparser.hierarchymodel.service.*;
import at.daho.logparsingproject.logparser.model.CommonEvent;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import at.daho.logparsingproject.logparser.processor.DatabaseModelWriter;
import org.springframework.stereotype.Component;

@Component
public class HierarchyModelWriter implements DatabaseModelWriter
{
	private final HrAttackerService attackerService;
	private final HrEventService eventService;
	private final HrIpService ipService;
	private final HrTypeService typeService;
	private final HrTimestampService timestampService;
	private final HrProcessService processIdService;

	public HierarchyModelWriter(HrAttackerService attackerService, HrEventService eventService, HrIpService ipService, HrTypeService typeService, HrTimestampService timestampService, HrProcessService processIdService)
	{
		this.attackerService = attackerService;
		this.eventService = eventService;
		this.ipService = ipService;
		this.typeService = typeService;
		this.timestampService = timestampService;
		this.processIdService = processIdService;
	}


	@Override
	public void clearDatabase()
	{
		attackerService.deleteAll();
		eventService.deleteAll();
		ipService.deleteAll();
		typeService.deleteAll();
		timestampService.deleteAll();
		processIdService.deleteAll();
	}

	@Override
	public void storeEvent(CommonEvent commonEvent)
	{
		HrType type = typeService.findOrCreateByName(commonEvent.getType().getName());
		HrIp attackerIp = ipService.findOrCreateByIp(commonEvent.getAttackerIp().getIp());
		HrIp targetIp = ipService.findOrCreateByIp(commonEvent.getTargetIp().getIp());
		CommonTimestamp commonTimestamp = commonEvent.getTimestamp();
		HrTimeNode timestamp = timestampService.findOrCreate(commonTimestamp);
		HrProcess processId = processIdService.findOrCreate(commonEvent.getProcessId().getId());
		HrEvent lastEvent = eventService.findLastEvent(processId);

		HrEvent event = new HrEvent(type, attackerIp, targetIp, timestamp, processId);
		eventService.save(event);
		if(lastEvent != null) {
			lastEvent.setNext(event);
			eventService.save(lastEvent);
		}
	}
}
