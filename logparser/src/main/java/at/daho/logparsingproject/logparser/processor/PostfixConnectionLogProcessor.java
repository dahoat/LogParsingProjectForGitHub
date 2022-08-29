package at.daho.logparsingproject.logparser.processor;

import at.daho.logparsingproject.logparser.antlr.parser.PostfixConnectionLexer;
import at.daho.logparsingproject.logparser.antlr.parser.PostfixConnectionParser;
import at.daho.logparsingproject.logparser.antlr.parser.PostfixConnectionParser.LoglineContext;
import at.daho.logparsingproject.logparser.antlr.parser.PostfixConnectionParser.TimeContext;
import at.daho.logparsingproject.logparser.hierarchymodel.processor.HierarchyModelWriter;
import at.daho.logparsingproject.logparser.model.CommonEvent;
import at.daho.logparsingproject.logparser.model.CommonIp;
import at.daho.logparsingproject.logparser.model.CommonTimestamp;
import at.daho.logparsingproject.logparser.model.CommonType;
import at.daho.logparsingproject.logparser.propertymodel.processor.PropertyModelWriter;
import at.daho.logparsingproject.logparser.service.CommonQueryService;
import at.daho.logparsingproject.logparser.timelinemodel.processor.TimeLineModelWriter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@Component
public class PostfixConnectionLogProcessor
{
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PostfixConnectionLogProcessor.class);

	private final ResourceLoader resourceLoader;

	public final static String PROPERTY_BASED_MODEL = "property_based_model";
	public final static String TIMELINE_MODEL = "timeline_model";
	public final static String HIERARCHICAL_MODEL = "hierarchical_model";

	private final String FILTER_REGEX = ".*?connect from.*?|.*?disconnect from.*?";
	private final CommonIp targetIp = new CommonIp("192.168.0.2");

	private final PropertyModelWriter propertyModelWriter;
	private final TimeLineModelWriter timeLineModelWriter;
	private final HierarchyModelWriter hierarchyModelWriter;
	private final CommonQueryService commonQueryService;

	private String modelName = null;

	public PostfixConnectionLogProcessor(ResourceLoader resourceLoader, PropertyModelWriter propertyModelWriter, TimeLineModelWriter timeLineModelWriter, HierarchyModelWriter hierarchyModelWriter, CommonQueryService commonQueryService)
	{
		this.resourceLoader = resourceLoader;
		this.propertyModelWriter = propertyModelWriter;
		this.timeLineModelWriter = timeLineModelWriter;
		this.hierarchyModelWriter = hierarchyModelWriter;
		this.commonQueryService = commonQueryService;
	}

	public void process(String logFileName, String modelName)
	{
		this.modelName = modelName;

		PostfixConnectionParser parser = getParser(getContent(logFileName));
		List<LoglineContext> logLines = parser.log().logline();
		commonQueryService.clearDatabase();

		for(int i = 0; i < logLines.size(); i++) {
			LoglineContext logLine = logLines.get(i);
			logger.info("Saving {}/{}", i+1, logLines.size());
			processLogLine(logLine);
		}
	}

	public void process(String logFileName) {
		process(logFileName, null);
	}

	private void processLogLine(LoglineContext logLine)
	{
		CommonIp attackerIp;
		CommonType type;
		CommonTimestamp timestamp = getTimestamp(logLine);
		CommonProcessId processId = getProcessId(logLine);

		if(isConnect(logLine))
		{
			attackerIp = new CommonIp(logLine.logcontent().connect().hostnameWithIp().Ip().getText());
			type = new CommonType(CommonType.CONNECT);
		} else if(isDisconnect(logLine)) {
			attackerIp = new CommonIp(logLine.logcontent().disconnect().hostnameWithIp().Ip().getText());
			type = new CommonType(CommonType.DISCONNECT);
		} else {
			throw new IllegalArgumentException("Could not parse log line.");
		}

		storeEvent(new CommonEvent(type, attackerIp, targetIp, timestamp, processId));
	}

	private void storeEvent(CommonEvent commonEvent) {
		if(this.modelName == null) {
			this.propertyModelWriter.storeEvent(commonEvent);
			this.timeLineModelWriter.storeEvent(commonEvent);
			this.hierarchyModelWriter.storeEvent(commonEvent);
			return;
		}

		switch (this.modelName) {
			case PROPERTY_BASED_MODEL:
				this.propertyModelWriter.storeEvent(commonEvent);
				break;
			case TIMELINE_MODEL:
				this.timeLineModelWriter.storeEvent(commonEvent);
				break;
			case HIERARCHICAL_MODEL:
				this.hierarchyModelWriter.storeEvent(commonEvent);
				break;
		}
	}


	private boolean isConnect(LoglineContext logLine)
	{
		return logLine.logcontent().connect() != null;
	}

	private boolean isDisconnect(LoglineContext logLine)
	{
		return logLine.logcontent().disconnect() != null;
	}

	private CommonTimestamp getTimestamp(LoglineContext logLine)
	{
		//int year = Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
		int year = 2020;
		int month = monthNameToInt(logLine.logheader().timestamp().Month().getText());
		int day = Integer.parseInt(logLine.logheader().timestamp().day().getText());

		TimeContext time = logLine.logheader().timestamp().time();
		int hour = Integer.parseInt(time.hour().getText());
		int minute = Integer.parseInt(time.minute().getText());
		int second = Integer.parseInt(time.second().getText());

		return new CommonTimestamp(year, month, day, hour, minute, second);
	}

	private int monthNameToInt(String monthName)
	{
		switch(monthName)
		{
			case "Jan":
				return 1;
			case "Feb":
				return 2;
			case "Mar":
				return 3;
			case "Apr":
				return 4;
			case "May":
				return 5;
			case "Jun":
				return 6;
			case "Jul":
				return 7;
			case "Aug":
				return 8;
			case "Sep":
				return 9;
			case "Oct":
				return 10;
			case "Nov":
				return 11;
			case "Dec":
				return 12;
			default:
				throw new IllegalArgumentException("Invalid month");
		}
	}

	private String getContent(String logFileName)
	{
		try
		{
			Resource fileResource = resourceLoader.getResource(logFileName);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fileResource.getInputStream()));
			StringBuilder sb = new StringBuilder();

			Iterator<String> iter = reader.lines().iterator();

			while(iter.hasNext())
			{
				String line = iter.next();
				if(line.matches(FILTER_REGEX))
				{
					sb.append(line);
					sb.append('\n');
				}
			}
			return sb.toString();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private PostfixConnectionParser getParser(String content)
	{
		PostfixConnectionLexer lexer = new PostfixConnectionLexer(CharStreams.fromString(content));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new PostfixConnectionParser(tokens);
	}

	private CommonProcessId getProcessId(LoglineContext logLine) {
		long id = Long.parseLong(logLine.logheader().processinformation().processId().Integer().getText());
		return new CommonProcessId(id);
	}
}
