package at.daho.logparsingproject.logparser.hierarchymodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity(label = "Hr_Attacker")
public class HrAttacker
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_IP")
	private final List<HrIp> ips = new ArrayList<>();

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public List<HrIp> getIps()
	{
		return ips;
	}
}
