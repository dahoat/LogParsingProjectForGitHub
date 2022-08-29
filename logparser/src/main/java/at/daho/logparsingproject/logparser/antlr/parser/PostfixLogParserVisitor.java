// Generated from PostfixLogParser.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostfixLogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostfixLogParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(PostfixLogParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#logline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogline(PostfixLogParser.LoglineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#serverNameWithIp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerNameWithIp(PostfixLogParser.ServerNameWithIpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#cipher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCipher(PostfixLogParser.CipherContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#bits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBits(PostfixLogParser.BitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#saslAuthString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaslAuthString(PostfixLogParser.SaslAuthStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PostfixLogParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#numConnections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumConnections(PostfixLogParser.NumConnectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(PostfixLogParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#mailIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMailIdentifier(PostfixLogParser.MailIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(PostfixLogParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(PostfixLogParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(PostfixLogParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(PostfixLogParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(PostfixLogParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(PostfixLogParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#logheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogheader(PostfixLogParser.LogheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#pid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPid(PostfixLogParser.PidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService(PostfixLogParser.ServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(PostfixLogParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#localTransport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTransport(PostfixLogParser.LocalTransportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(PostfixLogParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#connect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect(PostfixLogParser.ConnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#disconnect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect(PostfixLogParser.DisconnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#anonymousTlsConnection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousTlsConnection(PostfixLogParser.AnonymousTlsConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#failedSaslLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailedSaslLogin(PostfixLogParser.FailedSaslLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#reverseLookupDifferent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseLookupDifferent(PostfixLogParser.ReverseLookupDifferentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#lostConnectionAfterAuth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLostConnectionAfterAuth(PostfixLogParser.LostConnectionAfterAuthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#cleanupMessageId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCleanupMessageId(PostfixLogParser.CleanupMessageIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#getMailFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetMailFrom(PostfixLogParser.GetMailFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#getMailTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetMailTo(PostfixLogParser.GetMailToContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#getMailRemovedFromQueue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetMailRemovedFromQueue(PostfixLogParser.GetMailRemovedFromQueueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatistics(PostfixLogParser.StatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#statisticsMaxConRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsMaxConRate(PostfixLogParser.StatisticsMaxConRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#statisticsMaxConCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsMaxConCount(PostfixLogParser.StatisticsMaxConCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#statisticsMaxCacheSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatisticsMaxCacheSize(PostfixLogParser.StatisticsMaxCacheSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction(PostfixLogParser.TransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkim(PostfixLogParser.OpenDkimContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkimNotInternal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkimNotInternal(PostfixLogParser.OpenDkimNotInternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkimNotAuthenticated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkimNotAuthenticated(PostfixLogParser.OpenDkimNotAuthenticatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkimVerificationSuccessful}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkimVerificationSuccessful(PostfixLogParser.OpenDkimVerificationSuccessfulContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkimKeySelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkimKeySelection(PostfixLogParser.OpenDkimKeySelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixLogParser#openDkimKeyRetrieval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenDkimKeyRetrieval(PostfixLogParser.OpenDkimKeyRetrievalContext ctx);
}