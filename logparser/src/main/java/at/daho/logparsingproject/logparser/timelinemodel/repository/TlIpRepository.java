package at.daho.logparsingproject.logparser.timelinemodel.repository;

import at.daho.logparsingproject.logparser.repository.GenericRepository;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlIp;
import org.springframework.stereotype.Repository;

@Repository
public interface TlIpRepository extends GenericRepository<TlIp>
{
	TlIp findByIp(String ip);
}
