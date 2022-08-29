package at.daho.logparsingproject.logparser.propertymodel.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "Pt_Process")
public class PtProcess
{
	@Id
	@GeneratedValue
	private Long id;

	private Long processId;

	public PtProcess()
	{
	}

	public PtProcess(Long processId)
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
