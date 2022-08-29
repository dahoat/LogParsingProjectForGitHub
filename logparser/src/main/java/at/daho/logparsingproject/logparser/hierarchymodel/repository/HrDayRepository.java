package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrDay;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDayRepository extends HrTimestampRepository<HrDay, Long>
{
	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value < $timeItem.day RETURN day ORDER BY day.value DESC LIMIT 1")
	HrDay findPrevious(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value > $timeItem.day RETURN day ORDER BY day.value ASC LIMIT 1")
	HrDay findNext(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day RETURN day")
	HrDay find(HrTimeItem timeItem);
}
