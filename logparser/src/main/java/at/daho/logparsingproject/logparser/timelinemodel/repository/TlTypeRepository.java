package at.daho.logparsingproject.logparser.timelinemodel.repository;

import at.daho.logparsingproject.logparser.repository.GenericRepository;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlType;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TlTypeRepository extends GenericRepository<TlType>
{
	@Query("MATCH (t:Tl_Type{name: $name}) return t")
	TlType findByName(@Param("name") String name);
}
