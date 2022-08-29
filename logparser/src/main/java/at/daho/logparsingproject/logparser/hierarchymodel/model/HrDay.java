package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Day)
public class HrDay extends HrTimeNodeImpl<HrDay>
{


	public HrDay()
	{
	}

	public HrDay(int day)
	{
		super(day);
	}

}
