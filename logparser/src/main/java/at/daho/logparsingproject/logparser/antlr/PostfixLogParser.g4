parser grammar PostfixLogParser;

@header {
package at.daho.logparsingproject.logparser.antlr.parser;
}

options {
    tokenVocab=PostfixLogLexer;
}

log: logline* EOF;
logline: logheader event NewLine?;

serverNameWithIp: (Word | String) SquareBracketOpen Ip SquareBracketClose;
cipher: String;
bits: Int;
saslAuthString: Alphanum;
command: Word;
numConnections: Int;
size: Int;
mailIdentifier: Alphanum;

timestamp: Month day time;
time: hour Colon minute Colon second;
day: Int;
hour: Int;
minute: Int;
second: Int;

logheader: timestamp Word (service Slash)? process SquareBracketOpen pid SquareBracketClose Colon;
pid: Int;
service: Word Slash Word | Word;
process: Word;
localTransport: PrivateDovecot;

event: connect | disconnect | anonymousTlsConnection | failedSaslLogin | lostConnectionAfterAuth | statistics | transaction | openDkim | cleanupMessageId | getMailFrom | getMailTo | getMailRemovedFromQueue | reverseLookupDifferent;

connect: Connect From serverNameWithIp;
disconnect: Disconnect From serverNameWithIp;
anonymousTlsConnection: AnonymousTlsConnectionEstablished From serverNameWithIp Colon TlsVersion WithCipher cipher RoundBracketOpen bits Slash bits Bits RoundBracketClose;
failedSaslLogin: Warning Colon serverNameWithIp Colon SaslLoginAuthenticationFailed Colon saslAuthString;
reverseLookupDifferent: Warning Colon Hostname String DoesNotResolveToAddress Ip;
lostConnectionAfterAuth: LostConnectionAfter command From serverNameWithIp;
cleanupMessageId: Alphanum Colon MessageIdEquals Less Email Greater;
getMailFrom: mailIdentifier Colon FromEquals Less Email Greater Comma SizeEquals Int Comma NumRecipientsEquals Int RoundBracketOpen Word Word RoundBracketClose;
getMailTo: mailIdentifier Colon ToEquals Less Email Greater Comma RelayEquals String SquareBracketOpen localTransport SquareBracketClose Comma DelayEquals (Float|Int) Comma DelaysEquals ((Float|Int) Slash?)+ Comma DsnEquals String Comma StatusEquals Word RoundBracketOpen Int String Less Email Greater Alphanum Saved RoundBracketClose;
getMailRemovedFromQueue: mailIdentifier Colon Removed;

statistics: Statistics Colon (statisticsMaxConRate | statisticsMaxConCount | statisticsMaxCacheSize) At timestamp;
statisticsMaxConRate: MaxConnectionRate numConnections Slash SixtySeconds For RoundBracketOpen service Colon Ip RoundBracketClose;
statisticsMaxConCount: MaxConnectionCount numConnections For RoundBracketOpen service Colon Ip RoundBracketClose;
statisticsMaxCacheSize: MaxCacheSize size;

transaction: mailIdentifier Colon ClientEquals serverNameWithIp;

openDkim: openDkimNotInternal | openDkimNotAuthenticated | openDkimVerificationSuccessful | openDkimKeySelection | openDkimKeyRetrieval;
openDkimNotInternal: mailIdentifier Colon serverNameWithIp NotInternal;
openDkimNotAuthenticated: mailIdentifier Colon NotAuthenticated;
openDkimVerificationSuccessful: mailIdentifier Colon DkimVerificationSuccessful;
openDkimKeySelection: mailIdentifier Colon SelectorEquals String DomainEquals String Ssl;
openDkimKeyRetrieval: mailIdentifier Colon KeyRetrieval Word RoundBracketOpen SelectorEquals String Comma DomainEquals String RoundBracketClose Colon Text (Word | String | Alphanum)+?;

