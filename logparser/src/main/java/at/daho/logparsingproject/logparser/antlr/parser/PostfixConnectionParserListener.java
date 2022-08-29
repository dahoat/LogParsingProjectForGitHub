// Generated from PostfixConnectionParser.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostfixConnectionParser}.
 */
public interface PostfixConnectionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#hostnameWithIp}.
	 * @param ctx the parse tree
	 */
	void enterHostnameWithIp(PostfixConnectionParser.HostnameWithIpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#hostnameWithIp}.
	 * @param ctx the parse tree
	 */
	void exitHostnameWithIp(PostfixConnectionParser.HostnameWithIpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(PostfixConnectionParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(PostfixConnectionParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#domainname}.
	 * @param ctx the parse tree
	 */
	void enterDomainname(PostfixConnectionParser.DomainnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#domainname}.
	 * @param ctx the parse tree
	 */
	void exitDomainname(PostfixConnectionParser.DomainnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(PostfixConnectionParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(PostfixConnectionParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#logline}.
	 * @param ctx the parse tree
	 */
	void enterLogline(PostfixConnectionParser.LoglineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#logline}.
	 * @param ctx the parse tree
	 */
	void exitLogline(PostfixConnectionParser.LoglineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#logheader}.
	 * @param ctx the parse tree
	 */
	void enterLogheader(PostfixConnectionParser.LogheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#logheader}.
	 * @param ctx the parse tree
	 */
	void exitLogheader(PostfixConnectionParser.LogheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(PostfixConnectionParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(PostfixConnectionParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(PostfixConnectionParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(PostfixConnectionParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(PostfixConnectionParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(PostfixConnectionParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(PostfixConnectionParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(PostfixConnectionParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(PostfixConnectionParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(PostfixConnectionParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(PostfixConnectionParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(PostfixConnectionParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#processinformation}.
	 * @param ctx the parse tree
	 */
	void enterProcessinformation(PostfixConnectionParser.ProcessinformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#processinformation}.
	 * @param ctx the parse tree
	 */
	void exitProcessinformation(PostfixConnectionParser.ProcessinformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(PostfixConnectionParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(PostfixConnectionParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#processName}.
	 * @param ctx the parse tree
	 */
	void enterProcessName(PostfixConnectionParser.ProcessNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#processName}.
	 * @param ctx the parse tree
	 */
	void exitProcessName(PostfixConnectionParser.ProcessNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#processId}.
	 * @param ctx the parse tree
	 */
	void enterProcessId(PostfixConnectionParser.ProcessIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#processId}.
	 * @param ctx the parse tree
	 */
	void exitProcessId(PostfixConnectionParser.ProcessIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#logcontent}.
	 * @param ctx the parse tree
	 */
	void enterLogcontent(PostfixConnectionParser.LogcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#logcontent}.
	 * @param ctx the parse tree
	 */
	void exitLogcontent(PostfixConnectionParser.LogcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#connect}.
	 * @param ctx the parse tree
	 */
	void enterConnect(PostfixConnectionParser.ConnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#connect}.
	 * @param ctx the parse tree
	 */
	void exitConnect(PostfixConnectionParser.ConnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixConnectionParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect(PostfixConnectionParser.DisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixConnectionParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect(PostfixConnectionParser.DisconnectContext ctx);
}