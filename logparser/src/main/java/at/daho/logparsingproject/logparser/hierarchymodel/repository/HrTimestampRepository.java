package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.io.Serializable;

public interface HrTimestampRepository<T, ID extends Serializable> extends Neo4jRepository<T, ID>
{
	@Query("match (n) return n limit 0") //fixme
	T findPrevious(HrTimeItem timeItem);

	@Query("match (n) return n limit 0") //fixme
	T findNext(HrTimeItem timeItem);

	@Query("match (n) return n limit 0") //fixme
	T find(HrTimeItem timeItem);

}
