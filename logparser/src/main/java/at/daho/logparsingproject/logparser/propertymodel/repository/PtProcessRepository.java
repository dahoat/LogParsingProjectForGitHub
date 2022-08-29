package at.daho.logparsingproject.logparser.propertymodel.repository;

import at.daho.logparsingproject.logparser.propertymodel.model.PtProcess;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PtProcessRepository extends Neo4jRepository<PtProcess, Long>
{
	PtProcess findByProcessId(Long processId);
}
