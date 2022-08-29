package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtIp;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtIpRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface PtIpService extends GenericService<PtIp, Long, PtIpRepository>
{
	PtIp findByIp(String ipString);

	PtIp findOrCreateByIp(String ip);
}
