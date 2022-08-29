package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericService;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlIp;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlIpRepository;

public interface TlIpService extends GenericService<TlIp, Long, TlIpRepository>
{
	TlIp findByIp(String ipString);

	TlIp findOrCreateByIp(String ipString);
}
