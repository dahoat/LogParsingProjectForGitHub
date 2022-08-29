package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity(label = "Hr_Event")
public class HrEvent
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "IS_TYPE")
	private HrType type;

	@Relationship(type = "ATTACKER_IP")
	private HrIp attackerIp;

	@Relationship(type = "TARGET_IP")
	private HrIp targetIp;

	@Relationship(type = "HAPPENED_AT")
	private HrTimeNode timestamp;

	@Relationship(type = GraphDBNames.HAS_PID)
	private HrProcess processId;

	@Relationship(type = GraphDBNames.NEXT_EVENT)
	private HrEvent next;

	public HrEvent()
	{
	}

	public HrEvent(HrType type, HrIp attackerIp, HrIp targetIp, HrTimeNode timestamp, HrProcess processId)
	{
		this.type = type;
		this.attackerIp = attackerIp;
		this.targetIp = targetIp;
		this.timestamp = timestamp;
		this.processId = processId;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public HrType getType()
	{
		return type;
	}

	public void setType(HrType type)
	{
		this.type = type;
	}

	public HrIp getAttackerIp()
	{
		return attackerIp;
	}

	public void setAttackerIp(HrIp attackerIp)
	{
		this.attackerIp = attackerIp;
	}

	public HrIp getTargetIp()
	{
		return targetIp;
	}

	public void setTargetIp(HrIp targetIp)
	{
		this.targetIp = targetIp;
	}

	public HrTimeNode getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(HrTimeNode timestamp)
	{
		this.timestamp = timestamp;
	}

	public HrProcess getProcessId()
	{
		return processId;
	}

	public void setProcessId(HrProcess processId)
	{
		this.processId = processId;
	}

	public HrEvent getNext()
	{
		return next;
	}

	public void setNext(HrEvent next)
	{
		this.next = next;
	}
}
