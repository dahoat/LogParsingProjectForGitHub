package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Minute)
public class HrMinute extends HrTimeNodeImpl<HrMinute>
{
	public HrMinute()
	{
	}

	public HrMinute(int minute)
	{
		super(minute);
	}
}
