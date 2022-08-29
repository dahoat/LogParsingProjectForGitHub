package at.daho.logparsingproject.logparser.hierarchymodel.model;

public class HrTimeItem
{
	private final Integer year;
	private final Integer month;
	private final Integer day;
	private final Integer hour;
	private final Integer minute;
	private final Integer second;

	public HrTimeItem(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public HrTimeItem(Integer year)
	{
		this(year, null, null, null, null, null);
	}

	public HrTimeItem(Integer year, Integer month)
	{
		this(year, month, null, null, null, null);
	}

	public HrTimeItem(int year, int month, int day, int hour, int minute)
	{
		this(year, month, day, hour, minute, null);
	}

	public HrTimeItem(int year, int month, int day)
	{
		this(year, month, day, null, null, null);
	}

	public HrTimeItem(int year, int month, int day, int hour)
	{
		this(year, month, day, hour, null, null);
	}

	public Integer getYear()
	{
		return year;
	}

	public Integer getMonth()
	{
		return month;
	}

	public Integer getDay()
	{
		return day;
	}

	public Integer getHour()
	{
		return hour;
	}

	public Integer getMinute()
	{
		return minute;
	}

	public Integer getSecond()
	{
		return second;
	}
}
