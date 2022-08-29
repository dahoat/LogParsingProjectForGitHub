package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrIp;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrIpRepository extends Neo4jRepository<HrIp, Long>
{
	HrIp findByIp(String ipString);
}
