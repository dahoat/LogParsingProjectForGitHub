package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Month)
public class HrMonth extends HrTimeNodeImpl<HrMonth>
{
	public HrMonth()
	{
	}

	public HrMonth(int month)
	{
		super(month);
	}
}
