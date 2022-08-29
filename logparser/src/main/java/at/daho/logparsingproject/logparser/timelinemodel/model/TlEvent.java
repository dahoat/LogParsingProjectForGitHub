package at.daho.logparsingproject.logparser.timelinemodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "Tl_Event")
public class TlEvent
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "IS_TYPE")
	private TlType type;

	@Relationship(type = "ATTACKER_IP")
	private TlIp attackerIp;

	@Relationship(type = "TARGET_IP")
	private TlIp targetIp;

	@Relationship(type = "HAPPENED_AT")
	private TlTimestamp timestamp;

	@Relationship(type = "HAS_PID")
	private TlProcess process;

	public TlEvent() {

	}

	public TlEvent(TlType type, TlIp attackerIp, TlIp targetIp, TlTimestamp timestamp, TlProcess process) {
		this.type = type;
		this.attackerIp = attackerIp;
		this.targetIp = targetIp;
		this.timestamp = timestamp;
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

	public TlType getType()
	{
		return type;
	}

	public void setType(TlType type)
	{
		this.type = type;
	}

	public TlIp getAttackerIp()
	{
		return attackerIp;
	}

	public void setAttackerIp(TlIp attackerIp)
	{
		this.attackerIp = attackerIp;
	}

	public TlIp getTargetIp()
	{
		return targetIp;
	}

	public void setTargetIp(TlIp targetIp)
	{
		this.targetIp = targetIp;
	}

	public TlProcess getProcess()
	{
		return process;
	}

	public void setProcess(TlProcess process)
	{
		this.process = process;
	}

	public TlTimestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(TlTimestamp timestamp) {
		this.timestamp = timestamp;
	}
}
