package at.daho.logparsingproject.logparser.timelinemodel.repository;

import at.daho.logparsingproject.logparser.timelinemodel.model.TlProcess;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TlProcessRepository extends Neo4jRepository<TlProcess, Long>
{
	TlProcess findByProcessId(Long processId);
}
