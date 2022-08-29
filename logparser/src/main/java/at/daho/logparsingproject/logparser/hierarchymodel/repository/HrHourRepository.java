package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrHour;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HrHourRepository extends HrTimestampRepository<HrHour, Long>
{
	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day and hour.value < $timeItem.hour RETURN hour ORDER BY hour.value DESC LIMIT 1")
	HrHour findPrevious(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day and hour.value > $timeItem.hour RETURN hour ORDER BY hour.value ASC LIMIT 1")
	HrHour findNext(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day and hour.value = $timeItem.hour RETURN hour")
	HrHour find(HrTimeItem timeItem);
}
