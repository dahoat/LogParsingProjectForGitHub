package at.daho.logparsingproject.logparser.timelinemodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "Tl_Type")
public class TlType
{
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public TlType() {
	}

	public TlType(String name)
	{
		this.name = name;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
