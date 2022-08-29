package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericService;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlTimestamp;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlTimestampRepository;

public interface TlTimestampService extends GenericService<TlTimestamp, Long, TlTimestampRepository>
{
	TlTimestamp findOrCreate(int year, int month, int day, int hour, int minute, int second);

	TlTimestamp find(int year, int month, int day, int hour, int minute, int second);

	TlTimestamp findPrevious(TlTimestamp timestamp);

	TlTimestamp findNext(TlTimestamp timestamp);

	void insertByValue(TlTimestamp timestamp);

	TlTimestamp findFirstTimestamp();
	TlTimestamp findLastTimestamp();
}
