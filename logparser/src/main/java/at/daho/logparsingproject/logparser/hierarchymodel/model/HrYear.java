package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Year)
public class HrYear extends HrTimeNodeImpl<HrYear>
{
	public HrYear()
	{
	}

	public HrYear(int year)
	{
		super(year);
	}
}
