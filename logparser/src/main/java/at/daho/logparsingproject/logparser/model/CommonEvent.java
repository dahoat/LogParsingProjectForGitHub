package at.daho.logparsingproject.logparser.model;

import at.daho.logparsingproject.logparser.processor.CommonProcessId;

public class CommonEvent
{
	private final CommonType type;
	private final CommonIp attackerIp;
	private final CommonIp targetIp;
	private final CommonTimestamp timestamp;
	private final CommonProcessId processId;

	public CommonEvent(CommonType type, CommonIp attackerIp, CommonIp targetIp, CommonTimestamp timestamp, CommonProcessId processId)
	{
		this.type = type;
		this.attackerIp = attackerIp;
		this.targetIp = targetIp;
		this.timestamp = timestamp;
		this.processId = processId;
	}

	public CommonType getType()
	{
		return type;
	}

	public CommonIp getAttackerIp()
	{
		return attackerIp;
	}

	public CommonIp getTargetIp()
	{
		return targetIp;
	}

	public CommonTimestamp getTimestamp()
	{
		return timestamp;
	}

	public CommonProcessId getProcessId()
	{
		return processId;
	}
}
