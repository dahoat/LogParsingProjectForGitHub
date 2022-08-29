package at.daho.logparsingproject.logparser.timelinemodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import static org.neo4j.ogm.annotation.Relationship.INCOMING;

@NodeEntity(label = "Tl_Ip")
public class TlIp
{
	@Id
	@GeneratedValue
	private Long id;

	private String ip;

	@Relationship(type = "HAS_IP", direction = INCOMING)
	private TlAttacker attacker;

	public TlIp() {

	}

	public TlIp(String ipString, TlAttacker attacker) {
		this.ip = ipString;
		this.attacker = attacker;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getIp()
	{
		return ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	public TlAttacker getAttacker()
	{
		return attacker;
	}

	public void setAttacker(TlAttacker attacker)
	{
		this.attacker = attacker;
	}
}
