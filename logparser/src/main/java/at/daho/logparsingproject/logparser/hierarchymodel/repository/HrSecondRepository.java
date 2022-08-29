package at.daho.logparsingproject.logparser.hierarchymodel.repository;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrSecond;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeItem;
import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HrSecondRepository extends HrTimestampRepository<HrSecond, Long>
{
	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+")-[:"+GraphDBNames.FINER+"]->(second:"+GraphDBNames.Hr_Second+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value = $timeItem.minute and second.value < $timeItem.second RETURN second ORDER BY second.value DESC LIMIT 1")
	HrSecond findPrevious(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+")-[:"+GraphDBNames.FINER+"]->(second:"+GraphDBNames.Hr_Second+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value = $timeItem.minute and second.value > $timeItem.second RETURN second ORDER BY second.value ASC LIMIT 1")
	HrSecond findNext(HrTimeItem timeItem);

	@Override
	@Query("MATCH (year:"+GraphDBNames.Hr_Year+")-[:"+GraphDBNames.FINER+"]->(month:"+GraphDBNames.Hr_Month+")-[:"+GraphDBNames.FINER+"]->(day:"+GraphDBNames.Hr_Day+")" +
			"-[:"+GraphDBNames.FINER+"]->(hour:"+GraphDBNames.Hr_Hour+")-[:"+GraphDBNames.FINER+"]->(minute:"+GraphDBNames.Hr_Minute+")-[:"+GraphDBNames.FINER+"]->(second:"+GraphDBNames.Hr_Second+") " +
			"WHERE year.value = $timeItem.year and month.value = $timeItem.month and day.value = $timeItem.day " +
			"and hour.value = $timeItem.hour and minute.value = $timeItem.minute and second.value = $timeItem.second RETURN second")
	HrSecond find(HrTimeItem timeItem);
}
