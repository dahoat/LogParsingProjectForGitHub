package at.daho.logparsingproject.logparser.propertymodel.repository;

import at.daho.logparsingproject.logparser.propertymodel.model.PtIp;
import at.daho.logparsingproject.logparser.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PtIpRepository extends GenericRepository<PtIp>
{
	PtIp findByIp(String ip);
}
