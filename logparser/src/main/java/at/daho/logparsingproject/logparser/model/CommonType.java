package at.daho.logparsingproject.logparser.model;

public class CommonType
{
	public final static String CONNECT = "connect";
	public final static String DISCONNECT = "disconnect";

	private final String name;

	public CommonType(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
