package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.*;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlEventRepository;
import org.springframework.stereotype.Service;

@Service
public class TlEventServiceImpl extends GenericServiceImpl<TlEvent, Long, TlEventRepository> implements TlEventService
{
	@Override
	public void createEvent(TlType type, TlIp attackerIp, TlIp targetIp, TlTimestamp timestamp, TlProcess process) {
		TlEvent event = new TlEvent(type, attackerIp, targetIp, timestamp, process);
		repository.save(event);
	}
}
