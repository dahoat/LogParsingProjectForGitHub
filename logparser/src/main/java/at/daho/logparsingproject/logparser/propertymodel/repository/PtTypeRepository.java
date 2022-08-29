package at.daho.logparsingproject.logparser.propertymodel.repository;

import at.daho.logparsingproject.logparser.propertymodel.model.PtType;
import at.daho.logparsingproject.logparser.repository.GenericRepository;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PtTypeRepository extends GenericRepository<PtType>
{
	@Query("MATCH (t:Pt_Type{name: $name}) return t")
	PtType findByName(@Param("name") String name);
}
