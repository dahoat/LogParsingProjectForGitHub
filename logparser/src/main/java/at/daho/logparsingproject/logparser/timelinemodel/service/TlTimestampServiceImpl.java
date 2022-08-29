package at.daho.logparsingproject.logparser.timelinemodel.service;

import at.daho.logparsingproject.logparser.service.GenericServiceImpl;
import at.daho.logparsingproject.logparser.timelinemodel.model.TlTimestamp;
import at.daho.logparsingproject.logparser.timelinemodel.repository.TlTimestampRepository;
import org.springframework.stereotype.Service;

@Service
public class TlTimestampServiceImpl extends GenericServiceImpl<TlTimestamp, Long, TlTimestampRepository> implements TlTimestampService
{
	@Override
	public TlTimestamp find(int year, int month, int day, int hour, int minute, int second)
	{
		return repository.find(year, month, day, hour, minute, second);
	}

	//FIXME only works, if second timestamp is later than first timestamp
	@Override
	public TlTimestamp findOrCreate(int year, int month, int day, int hour, int minute, int second)
	{
		//TlTimestamp timestamp = this.find(year, month, day, hour, minute, second);
		TlTimestamp timestamp = null;
		if (timestamp == null) {
			timestamp = new TlTimestamp(year, month, day, hour, minute, second);
			insertByValue(timestamp);
		}
		return timestamp;
	}

	@Override
	public TlTimestamp findPrevious(TlTimestamp timestamp) {
		return repository.findPreviousByUnixTimestamp(timestamp.getUnixTimestamp());
	}

	@Override
	public TlTimestamp findNext(TlTimestamp timestamp) {
		return repository.findNextByUnixTimestmap(timestamp.getUnixTimestamp());
	}

	@Override
	public void insertByValue(TlTimestamp timestamp) {
		TlTimestamp previous = findPrevious(timestamp);
		TlTimestamp next;
		if(previous != null) {
			next = previous.getNext();
			previous.setNext(timestamp);
			repository.save(previous);
		}
		else
		{
			next = findNext(timestamp);
		}

		timestamp.setNext(next);
		repository.save(timestamp);
	}

	@Override
	public TlTimestamp findFirstTimestamp()
	{
		return repository.findFirstTimestamp();
	}

	@Override
	public TlTimestamp findLastTimestamp()
	{
		return repository.findLastTimestamp();
	}
}
