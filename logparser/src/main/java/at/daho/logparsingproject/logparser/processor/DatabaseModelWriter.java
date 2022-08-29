package at.daho.logparsingproject.logparser.processor;

import at.daho.logparsingproject.logparser.model.CommonEvent;

public interface DatabaseModelWriter
{
	void clearDatabase();
	void storeEvent(CommonEvent commonEvent);
}
