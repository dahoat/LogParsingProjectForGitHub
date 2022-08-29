package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrAttacker;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrIp;
import at.daho.logparsingproject.logparser.hierarchymodel.repository.HrIpRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HrIpServiceImpl extends GenericServiceImpl<HrIp, Long, HrIpRepository> implements HrIpService
{
	@Override
	public HrIp findByIp(String ipString) {
		return repository.findByIp(ipString);
	}

	@Override
	public HrIp findOrCreateByIp(String ipString)
	{
		HrIp ip = this.findByIp(ipString);
		if (ip == null) {
			HrAttacker attacker = new HrAttacker();
			ip = new HrIp(ipString, attacker);
			ip = repository.save(ip);
		}
		return ip;
	}
}
