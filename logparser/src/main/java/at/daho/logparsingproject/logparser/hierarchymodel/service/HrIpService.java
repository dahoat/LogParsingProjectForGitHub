package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrIp;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrIpRepository;
import at.daho.logparsingproject.logparser.service.GenericService;

public interface HrIpService extends GenericService<HrIp, Long, HrIpRepository>
{
	HrIp findByIp(String ipString);

	HrIp findOrCreateByIp(String ip);
}
