package at.daho.logparsingproject.logparser.model;

import java.util.Objects;

public class CommonTimestamp implements Comparable<CommonTimestamp>
{
	private final int year;
	private final int month;
	private final int day;
	private final int hour;
	private final int minute;
	private final int second;

	public CommonTimestamp(int year, int month, int day, int hour, int minute, int second)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getYear()
	{
		return year;
	}

	public int getMonth()
	{
		return month;
	}

	public int getDay()
	{
		return day;
	}

	public int getHour()
	{
		return hour;
	}

	public int getMinute()
	{
		return minute;
	}

	public int getSecond()
	{
		return second;
	}

	@Override
	public int compareTo(CommonTimestamp o)
	{
		int val = this.year - o.year;
		if(val != 0) {
			return val;
		}
		val = this.month - o.month;
		if(val != 0) {
			return val;
		}
		val = this.day - o.day;
		if(val != 0) {
			return val;
		}
		val = this.hour - o.hour;
		if(val != 0) {
			return val;
		}
		val = this.minute - o.minute;
		if(val != 0) {
			return val;
		}
		return this.second - o.second;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		CommonTimestamp that = (CommonTimestamp) o;
		return year == that.year &&
				month == that.month &&
				day == that.day &&
				hour == that.hour &&
				minute == that.minute &&
				second == that.second;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(year, month, day, hour, minute, second);
	}

	@Override
	public String toString()
	{
		return year + "-" + month + "-" + day + "T" + hour + ":" + minute + ":" + second;
	}
}
