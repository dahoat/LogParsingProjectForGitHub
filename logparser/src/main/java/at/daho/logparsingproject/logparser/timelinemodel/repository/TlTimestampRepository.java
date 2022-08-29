package at.daho.logparsingproject.logparser.timelinemodel.repository;

import at.daho.logparsingproject.logparser.repository.GenericRepository;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlTimestamp;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;

public interface TlTimestampRepository extends GenericRepository<TlTimestamp>
{
	@Query("MATCH (t:Tl_Timestamp {year: $year, month: $month, day: $day, hour: $hour, minute: $minute, second: $second}) return t")
	TlTimestamp find(@Param("year") int year, @Param("month") int month, @Param("day") int day, @Param("hour") int hour, @Param("minute") int minute, @Param("second") int second);

	@Query("MATCH (t:Tl_Timestamp) WHERE t.unixTimestamp <= $unixTimestamp and not (t)-[:NEXT]->() RETURN t UNION MATCH (t:Tl_Timestamp)-[:NEXT]->(t2) WHERE t.unixTimestamp <= $unixTimestamp and t2.unixTimestamp > $unixTimestamp RETURN t ORDER BY t.unixTimestamp DESC LIMIT 1")
	TlTimestamp findPreviousByUnixTimestamp(@Param("unixTimestamp") Long unixTimestamp);

	@Query("MATCH (t:Tl_Timestamp) WHERE t.unixTimestamp > $unixTimestamp RETURN t ORDER BY t.unixTimestamp ASC LIMIT 1")
	TlTimestamp findNextByUnixTimestmap(@Param("unixTimestamp") Long unixTimestamp);

	@Query("MATCH (t:Tl_Timestamp) WHERE NOT (:Tl_Timestamp)-[:NEXT]->(t) RETURN t")
	TlTimestamp findFirstTimestamp();

	@Query("MATCH (t:Tl_Timestamp) WHERE NOT (t)-[:NEXT]->(:Tl_Timestamp) RETURN t")
	TlTimestamp findLastTimestamp();
}
