package at.daho.logparsingproject.logparser.propertymodel.service;

import at.daho.logparsingproject.logparser.propertymodel.model.PtAttacker;
import at.daho.logparsingproject.logparser.propertymodel.model.PtIp;
import at.daho.logparsingproject.logparser.propertymodel.repository.PtIpRepository;
import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PtIpServiceImpl extends GenericServiceImpl<PtIp, Long, PtIpRepository> implements PtIpService
{
	@Override
	public PtIp findByIp(String ipString) {
		return repository.findByIp(ipString);
	}

	@Override
	public PtIp findOrCreateByIp(String ipString)
	{
		PtIp ip = this.findByIp(ipString);
		if (ip == null) {
			PtAttacker attacker = new PtAttacker();
			ip = new PtIp(ipString, attacker);
			ip = repository.save(ip);
		}
		return ip;
	}
}
