package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrMinute;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HrMinuteRepository extends HrTimestampRepository<HrMinute, Long>
{
	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value < $timeItem.minute RETURN minute ORDER BY minute.value DESC LIMIT 1")
	HrMinute findPrevious(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value > $timeItem.minute RETURN minute ORDER BY minute.value ASC LIMIT 1")
	HrMinute findNext(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value = $timeItem.minute RETURN minute")
	HrMinute find(HrTimeItem timeItem);

}
