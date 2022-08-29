package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrEventRepository extends Neo4jRepository<HrEvent, Long>
{
	@Query("MATCH (n:" + GraphDBNames.Hr_Event + ")-[:" + GraphDBNames.HAS_PID + "]->(pid:" + GraphDBNames.Hr_Process + ") where not (n)-[:" + GraphDBNames.NEXT_EVENT + "*]->()  and pid.processId=$processId RETURN n")
	HrEvent findLastEvent(Long processId);

	@Query("MATCH (c:Hr_Event)-[:IS_TYPE]->(type:Hr_Type) where type.name='connect' return c")
	List<HrEvent> findAllConnect();
}
