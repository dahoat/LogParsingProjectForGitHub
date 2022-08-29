package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlAttacker;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlIp;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlIpRepository;
import org.springframework.stereotype.Service;

@Service
public class TlIpServiceImpl extends GenericServiceImpl<TlIp, Long, TlIpRepository> implements TlIpService
{
	@Override
	public TlIp findByIp(String ipString) {
		return repository.findByIp(ipString);
	}

	@Override
	public TlIp findOrCreateByIp(String ipString)
	{
		TlIp ip = this.findByIp(ipString);
		if (ip == null) {
			TlAttacker attacker = new TlAttacker();
			ip = new TlIp(ipString, attacker);
			ip = repository.save(ip);
		}
		return ip;
	}
}
