package at.daho.logparsingproject.logparser.timelinemodel.model;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


@NodeEntity(label = "Tl_Process")
public class TlProcess
{
	@Id
	@GeneratedValue
	private Long id;

	private Long processId;

	public TlProcess(Long processId)
	{
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

	public Long getProcessId()
	{
		return processId;
	}

	public void setProcessId(Long processId)
	{
		this.processId = processId;
	}
}
