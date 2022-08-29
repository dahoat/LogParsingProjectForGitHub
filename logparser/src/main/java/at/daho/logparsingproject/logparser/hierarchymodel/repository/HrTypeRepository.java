package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrType;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HrTypeRepository extends Neo4jRepository<HrType, Long>
{
	@Query("MATCH (t:" + GraphDBNames.Hr_Type + "{name: $name}) return t")
	HrType findByName(@Param("name") String name);
}
