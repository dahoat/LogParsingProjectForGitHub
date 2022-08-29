package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericService;
import at.daho.logparsingproject.logparser.timelinemodel.model.*;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlEventRepository;

public interface TlEventService extends GenericService<TlEvent, Long, TlEventRepository>
{
	void createEvent(TlType type, TlIp attackerIp, TlIp targetIp, TlTimestamp timestamp, TlProcess process);

}
