package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrMonth;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HrMonthRepository extends HrTimestampRepository<HrMonth, Long>
{
	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+") WHERE year.value = $timeItem.year and month.value < $timeItem.month RETURN month ORDER BY month.value DESC LIMIT 1")
	HrMonth findPrevious(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+") WHERE year.value = $timeItem.year and month.value > $timeItem.month RETURN month ORDER BY month.value ASC LIMIT 1")
	HrMonth findNext(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+") WHERE year.value = $timeItem.year and month.value = $timeItem.month RETURN month")
	HrMonth find(HrTimeItem timeItem);
}
