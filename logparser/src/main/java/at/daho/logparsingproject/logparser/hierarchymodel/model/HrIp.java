package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import static org.neo4j.ogm.annotation.Relationship.INCOMING;

@NodeEntity(label = GraphDBNames.Hr_Ip)
public class HrIp
{
	@Id
	@GeneratedValue
	private Long id;

	private String ip;

	@Relationship(type = "HAS_IP", direction = INCOMING)
	private HrAttacker attacker;

	public HrIp () {

	}

	public HrIp(String ip, HrAttacker attacker)
	{
		this.ip = ip;
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

	public HrAttacker getAttacker()
	{
		return attacker;
	}

	public void setAttacker(HrAttacker attacker)
	{
		this.attacker = attacker;
	}
}
