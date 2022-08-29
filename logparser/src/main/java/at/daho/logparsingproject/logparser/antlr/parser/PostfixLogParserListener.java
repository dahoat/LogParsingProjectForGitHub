// Generated from PostfixLogParser.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostfixLogParser}.
 */
public interface PostfixLogParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(PostfixLogParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(PostfixLogParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#logline}.
	 * @param ctx the parse tree
	 */
	void enterLogline(PostfixLogParser.LoglineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#logline}.
	 * @param ctx the parse tree
	 */
	void exitLogline(PostfixLogParser.LoglineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#serverNameWithIp}.
	 * @param ctx the parse tree
	 */
	void enterServerNameWithIp(PostfixLogParser.ServerNameWithIpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#serverNameWithIp}.
	 * @param ctx the parse tree
	 */
	void exitServerNameWithIp(PostfixLogParser.ServerNameWithIpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#cipher}.
	 * @param ctx the parse tree
	 */
	void enterCipher(PostfixLogParser.CipherContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#cipher}.
	 * @param ctx the parse tree
	 */
	void exitCipher(PostfixLogParser.CipherContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#bits}.
	 * @param ctx the parse tree
	 */
	void enterBits(PostfixLogParser.BitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#bits}.
	 * @param ctx the parse tree
	 */
	void exitBits(PostfixLogParser.BitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#saslAuthString}.
	 * @param ctx the parse tree
	 */
	void enterSaslAuthString(PostfixLogParser.SaslAuthStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#saslAuthString}.
	 * @param ctx the parse tree
	 */
	void exitSaslAuthString(PostfixLogParser.SaslAuthStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PostfixLogParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PostfixLogParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#numConnections}.
	 * @param ctx the parse tree
	 */
	void enterNumConnections(PostfixLogParser.NumConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#numConnections}.
	 * @param ctx the parse tree
	 */
	void exitNumConnections(PostfixLogParser.NumConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(PostfixLogParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(PostfixLogParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#mailIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMailIdentifier(PostfixLogParser.MailIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#mailIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMailIdentifier(PostfixLogParser.MailIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(PostfixLogParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(PostfixLogParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(PostfixLogParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(PostfixLogParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(PostfixLogParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(PostfixLogParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(PostfixLogParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(PostfixLogParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(PostfixLogParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(PostfixLogParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(PostfixLogParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(PostfixLogParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#logheader}.
	 * @param ctx the parse tree
	 */
	void enterLogheader(PostfixLogParser.LogheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#logheader}.
	 * @param ctx the parse tree
	 */
	void exitLogheader(PostfixLogParser.LogheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterPid(PostfixLogParser.PidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitPid(PostfixLogParser.PidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(PostfixLogParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(PostfixLogParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(PostfixLogParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(PostfixLogParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#localTransport}.
	 * @param ctx the parse tree
	 */
	void enterLocalTransport(PostfixLogParser.LocalTransportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#localTransport}.
	 * @param ctx the parse tree
	 */
	void exitLocalTransport(PostfixLogParser.LocalTransportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PostfixLogParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PostfixLogParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#connect}.
	 * @param ctx the parse tree
	 */
	void enterConnect(PostfixLogParser.ConnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#connect}.
	 * @param ctx the parse tree
	 */
	void exitConnect(PostfixLogParser.ConnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect(PostfixLogParser.DisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect(PostfixLogParser.DisconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#anonymousTlsConnection}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousTlsConnection(PostfixLogParser.AnonymousTlsConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#anonymousTlsConnection}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousTlsConnection(PostfixLogParser.AnonymousTlsConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#failedSaslLogin}.
	 * @param ctx the parse tree
	 */
	void enterFailedSaslLogin(PostfixLogParser.FailedSaslLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#failedSaslLogin}.
	 * @param ctx the parse tree
	 */
	void exitFailedSaslLogin(PostfixLogParser.FailedSaslLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#reverseLookupDifferent}.
	 * @param ctx the parse tree
	 */
	void enterReverseLookupDifferent(PostfixLogParser.ReverseLookupDifferentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#reverseLookupDifferent}.
	 * @param ctx the parse tree
	 */
	void exitReverseLookupDifferent(PostfixLogParser.ReverseLookupDifferentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#lostConnectionAfterAuth}.
	 * @param ctx the parse tree
	 */
	void enterLostConnectionAfterAuth(PostfixLogParser.LostConnectionAfterAuthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#lostConnectionAfterAuth}.
	 * @param ctx the parse tree
	 */
	void exitLostConnectionAfterAuth(PostfixLogParser.LostConnectionAfterAuthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#cleanupMessageId}.
	 * @param ctx the parse tree
	 */
	void enterCleanupMessageId(PostfixLogParser.CleanupMessageIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#cleanupMessageId}.
	 * @param ctx the parse tree
	 */
	void exitCleanupMessageId(PostfixLogParser.CleanupMessageIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#getMailFrom}.
	 * @param ctx the parse tree
	 */
	void enterGetMailFrom(PostfixLogParser.GetMailFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#getMailFrom}.
	 * @param ctx the parse tree
	 */
	void exitGetMailFrom(PostfixLogParser.GetMailFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#getMailTo}.
	 * @param ctx the parse tree
	 */
	void enterGetMailTo(PostfixLogParser.GetMailToContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#getMailTo}.
	 * @param ctx the parse tree
	 */
	void exitGetMailTo(PostfixLogParser.GetMailToContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#getMailRemovedFromQueue}.
	 * @param ctx the parse tree
	 */
	void enterGetMailRemovedFromQueue(PostfixLogParser.GetMailRemovedFromQueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#getMailRemovedFromQueue}.
	 * @param ctx the parse tree
	 */
	void exitGetMailRemovedFromQueue(PostfixLogParser.GetMailRemovedFromQueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#statistics}.
	 * @param ctx the parse tree
	 */
	void enterStatistics(PostfixLogParser.StatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#statistics}.
	 * @param ctx the parse tree
	 */
	void exitStatistics(PostfixLogParser.StatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#statisticsMaxConRate}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsMaxConRate(PostfixLogParser.StatisticsMaxConRateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#statisticsMaxConRate}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsMaxConRate(PostfixLogParser.StatisticsMaxConRateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#statisticsMaxConCount}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsMaxConCount(PostfixLogParser.StatisticsMaxConCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#statisticsMaxConCount}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsMaxConCount(PostfixLogParser.StatisticsMaxConCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#statisticsMaxCacheSize}.
	 * @param ctx the parse tree
	 */
	void enterStatisticsMaxCacheSize(PostfixLogParser.StatisticsMaxCacheSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#statisticsMaxCacheSize}.
	 * @param ctx the parse tree
	 */
	void exitStatisticsMaxCacheSize(PostfixLogParser.StatisticsMaxCacheSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#transaction}.
	 * @param ctx the parse tree
	 */
	void enterTransaction(PostfixLogParser.TransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#transaction}.
	 * @param ctx the parse tree
	 */
	void exitTransaction(PostfixLogParser.TransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkim}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkim(PostfixLogParser.OpenDkimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkim}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkim(PostfixLogParser.OpenDkimContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkimNotInternal}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkimNotInternal(PostfixLogParser.OpenDkimNotInternalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkimNotInternal}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkimNotInternal(PostfixLogParser.OpenDkimNotInternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkimNotAuthenticated}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkimNotAuthenticated(PostfixLogParser.OpenDkimNotAuthenticatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkimNotAuthenticated}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkimNotAuthenticated(PostfixLogParser.OpenDkimNotAuthenticatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkimVerificationSuccessful}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkimVerificationSuccessful(PostfixLogParser.OpenDkimVerificationSuccessfulContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkimVerificationSuccessful}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkimVerificationSuccessful(PostfixLogParser.OpenDkimVerificationSuccessfulContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkimKeySelection}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkimKeySelection(PostfixLogParser.OpenDkimKeySelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkimKeySelection}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkimKeySelection(PostfixLogParser.OpenDkimKeySelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixLogParser#openDkimKeyRetrieval}.
	 * @param ctx the parse tree
	 */
	void enterOpenDkimKeyRetrieval(PostfixLogParser.OpenDkimKeyRetrievalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixLogParser#openDkimKeyRetrieval}.
	 * @param ctx the parse tree
	 */
	void exitOpenDkimKeyRetrieval(PostfixLogParser.OpenDkimKeyRetrievalContext ctx);
}