package at.daho.logparsingproject.logparser.hierarchymodel.service;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.hierarchymodel.model.HrTimeNode;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;

public interface HrTimestampService
{
	void deleteAll();

	HrTimeNode findOrCreate(CommonTimestamp commonTimestamp);

	CommonTimestamp getTimestamp(HrTimeNode timeNode);
}
