package at.daho.logparsingproject.logparser.util;

import at.daho.logparsingproject.logparser.hierarchymodel.model.HrEvent;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import org.springframework.stereotype.Service;

@Service
public class CommonTimestampUtils
{
	private static String getTimestampString(CommonTimestamp timestamp)
	{
		return String.format("%04d-%02d-%02d %02d:%02d:%02d", timestamp.getYear(), timestamp.getMonth(), timestamp.getDay(), timestamp.getHour(), timestamp.getMinute(), timestamp.getSecond());
	}
}
