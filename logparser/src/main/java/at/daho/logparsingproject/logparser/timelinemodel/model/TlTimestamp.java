package at.daho.logparsingproject.logparser.timelinemodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.typeconversion.LocalDateTimeStringConverter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@NodeEntity(label = "Tl_Timestamp")
public class TlTimestamp
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "NEXT")
	private TlTimestamp next;

	private Integer year;
	private Integer month;
	private Integer day;
	private Integer hour;
	private Integer minute;
	private Integer second;
	private Integer timezone;

	private ZonedDateTime timestamp;
	private Long unixTimestamp;

	public TlTimestamp() {

	}

	public TlTimestamp(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.timezone = 2 * 60 * 60;

		Calendar calendar = new GregorianCalendar(year, month-1, day, hour, minute, second);
		timestamp = ZonedDateTime.of(year, month, day, hour, minute, second, 0, ZoneId.of("Europe/Vienna"));
		unixTimestamp = calendar.toInstant().getEpochSecond();
	}

	public Long getId()
	{
		return id;
	}

	public TlTimestamp getNext()
	{
		return next;
	}

	public void setNext(TlTimestamp next)
	{
		this.next = next;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}

	public Integer getMonth()
	{
		return month;
	}

	public void setMonth(Integer month)
	{
		this.month = month;
	}

	public Integer getDay()
	{
		return day;
	}

	public void setDay(Integer day)
	{
		this.day = day;
	}

	public Integer getHour()
	{
		return hour;
	}

	public void setHour(Integer hour)
	{
		this.hour = hour;
	}

	public Integer getMinute()
	{
		return minute;
	}

	public void setMinute(Integer minute)
	{
		this.minute = minute;
	}

	public Integer getSecond()
	{
		return second;
	}

	public void setSecond(Integer second)
	{
		this.second = second;
	}

	public Long getUnixTimestamp()
	{
		return unixTimestamp;
	}

	public void setUnixTimestamp(Long unixTimestamp)
	{
		this.unixTimestamp = unixTimestamp;
	}

	public ZonedDateTime getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(ZonedDateTime timestamp)
	{
		this.timestamp = timestamp;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		TlTimestamp that = (TlTimestamp) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(year, that.year) &&
				Objects.equals(month, that.month) &&
				Objects.equals(day, that.day) &&
				Objects.equals(hour, that.hour) &&
				Objects.equals(minute, that.minute) &&
				Objects.equals(second, that.second) &&
				Objects.equals(timestamp, that.timestamp) &&
				Objects.equals(unixTimestamp, that.unixTimestamp);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, year, month, day, hour, minute, second, timestamp, unixTimestamp);
	}
}
