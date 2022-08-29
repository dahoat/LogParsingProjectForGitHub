package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrYear;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HrYearRepository extends HrTimestampRepository<HrYear, Long>
{
	@Override
	@Query("MATCH (year:" + GraphDBNames.Hr_Year + ") where year.value < $timeItem.year RETURN year ORDER BY year.value DESC LIMIT 1")
	HrYear findPrevious(@Param("timeItem") HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:" + GraphDBNames.Hr_Year + ") where year.value > $timeItem.year RETURN year ORDER BY year.value ASC LIMIT 1")
	HrYear findNext(@Param("timeItem") HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:" + GraphDBNames.Hr_Year + ") WHERE year.value = $timeItem.year RETURN year")
	HrYear find(@Param("timeItem") HrTimeItem timeItem);
}
