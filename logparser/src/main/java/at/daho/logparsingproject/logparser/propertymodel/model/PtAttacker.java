package at.daho.logparsingproject.logparser.propertymodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity(label = "Pt_Attacker")
public class PtAttacker
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_IP")
	private final List<PtIp> ips = new ArrayList<>();

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public List<PtIp> getIps()
	{
		return ips;
	}
}
