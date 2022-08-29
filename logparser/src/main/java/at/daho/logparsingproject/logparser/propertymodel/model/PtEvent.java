package at.daho.logparsingproject.logparser.propertymodel.model;

import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@NodeEntity(label = "Pt_Event")
public class PtEvent
{
	private static Long orderCounter = 1L;
	private static Date lastTimestamp = null;

	@Id
	@GeneratedValue
	private Long id;

	private Long order;

	@Relationship(type = "IS_TYPE")
	private PtType type;

	@Relationship(type = "ATTACKER_IP")
	private PtIp attackerIp;

	@Relationship(type = "TARGET_IP")
	private PtIp targetIp;

	private ZonedDateTime timestamp;

	@Relationship(type = "HAS_PID")
	private PtProcess process;

	public PtEvent() {

	}

	public PtEvent(PtType type, PtIp attackerIp, PtIp targetIp, Date timestamp, PtProcess process, CommonTimestamp commonTimestamp) {
		if(lastTimestamp != null && lastTimestamp.compareTo(timestamp) == 0) {
			order = ++orderCounter;
		} else {
			orderCounter = 1L;
			order = orderCounter;
		}
		lastTimestamp = timestamp;

		this.type = type;
		this.attackerIp = attackerIp;
		this.targetIp = targetIp;
		this.timestamp = ZonedDateTime.of(commonTimestamp.getYear(), commonTimestamp.getMonth(), commonTimestamp.getDay(), commonTimestamp.getHour(), commonTimestamp.getMinute(), commonTimestamp.getSecond(), 0, ZoneId.of("Europe/Vienna"));
		this.process = process;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public PtType getType()
	{
		return type;
	}

	public void setType(PtType type)
	{
		this.type = type;
	}

	public PtIp getAttackerIp()
	{
		return attackerIp;
	}

	public void setAttackerIp(PtIp attackerIp)
	{
		this.attackerIp = attackerIp;
	}

	public PtIp getTargetIp()
	{
		return targetIp;
	}

	public void setTargetIp(PtIp targetIp)
	{
		this.targetIp = targetIp;
	}

	public ZonedDateTime getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(ZonedDateTime timestamp)
	{
		this.timestamp = timestamp;
	}

	public PtProcess getProcess()
	{
		return process;
	}

	public void setProcess(PtProcess process)
	{
		this.process = process;
	}

	public Long getOrder()
	{
		return order;
	}

	public void setOrder(Long order)
	{
		this.order = order;
	}
}
