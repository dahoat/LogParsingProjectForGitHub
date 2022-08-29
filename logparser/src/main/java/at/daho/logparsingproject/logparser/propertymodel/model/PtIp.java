package at.daho.logparsingproject.logparser.propertymodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import static org.neo4j.ogm.annotation.Relationship.INCOMING;

@NodeEntity(label = "Pt_Ip")
public class PtIp
{
	@Id
	@GeneratedValue
	private Long id;

	private String ip;

	@Relationship(type = "HAS_IP", direction = INCOMING)
	private PtAttacker attacker;

	public PtIp() {

	}

	public PtIp(String ipString, PtAttacker attacker) {
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

	public PtAttacker getAttacker()
	{
		return attacker;
	}

	public void setAttacker(PtAttacker attacker)
	{
		this.attacker = attacker;
	}
}
