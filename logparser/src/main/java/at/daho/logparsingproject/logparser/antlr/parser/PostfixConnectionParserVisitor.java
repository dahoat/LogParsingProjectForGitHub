// Generated from PostfixConnectionParser.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostfixConnectionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostfixConnectionParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#hostnameWithIp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostnameWithIp(PostfixConnectionParser.HostnameWithIpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(PostfixConnectionParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#domainname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainname(PostfixConnectionParser.DomainnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(PostfixConnectionParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#logline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogline(PostfixConnectionParser.LoglineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#logheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogheader(PostfixConnectionParser.LogheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(PostfixConnectionParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(PostfixConnectionParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(PostfixConnectionParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(PostfixConnectionParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(PostfixConnectionParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(PostfixConnectionParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#processinformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessinformation(PostfixConnectionParser.ProcessinformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService(PostfixConnectionParser.ServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#processName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessName(PostfixConnectionParser.ProcessNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#processId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessId(PostfixConnectionParser.ProcessIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#logcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogcontent(PostfixConnectionParser.LogcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#connect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect(PostfixConnectionParser.ConnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixConnectionParser#disconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect(PostfixConnectionParser.DisconnectContext ctx);
}