package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrProcess;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrProcessRepository extends Neo4jRepository<HrProcess, Long>
{
	HrProcess findByProcessId(Long processId);
}
