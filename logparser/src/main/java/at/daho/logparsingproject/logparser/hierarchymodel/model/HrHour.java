package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Hour)
public class HrHour extends HrTimeNodeImpl<HrHour>
{
	public HrHour() {

	}

	public HrHour(int hour)
	{
		super(hour);
	}

}
