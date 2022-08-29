package at.daho.logparsingproject.logparser.timelinemodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity(label = "Tl_Attacker")
public class TlAttacker
{
	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_IP")
	private final List<TlIp> ips = new ArrayList<>();

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public List<TlIp> getIps()
	{
		return ips;
	}
}
