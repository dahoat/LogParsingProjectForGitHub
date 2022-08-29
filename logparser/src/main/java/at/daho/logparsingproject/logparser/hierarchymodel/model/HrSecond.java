package at.daho.logparsingproject.logparser.hierarchymodel.model;

import at.daho.logparsingproject.logparser.model.GraphDBNames;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = GraphDBNames.Hr_Second)
public class HrSecond extends HrTimeNodeImpl<HrSecond>
{
	public HrSecond() {

	}

	public HrSecond(int second)
	{
		super(second);
	}

}
