lexer grammar PostfixLogLexer;

@header {
package at.daho.logparsingproject.logparser.antlr.parser;
}

WS: [ \t]+ -> skip;
NewLine: '\r\n' | '\n';

Text: Quote String Quote;

Colon: ':';
Slash: '/';
RoundBracketOpen: '(';
RoundBracketClose: ')';
SquareBracketOpen: '[';
SquareBracketClose: ']';
Dot: '.';
Comma: ',';
Singlequote: '\'';
Doublequote: '"';
Quote: Singlequote | Doublequote;

Connect: 'connect';
Disconnect: 'disconnect';
From: 'from';
AnonymousTlsConnectionEstablished: 'Anonymous TLS connection established';
TlsVersion: 'TLSv' String;
WithCipher: 'with cipher';
Bits: 'bits';
Warning: 'warning';
Lost: 'lost';
Statistics: 'statistics';
SaslLoginAuthenticationFailed: 'SASL LOGIN authentication failed';
LostConnectionAfter: 'lost connection after';
MaxConnectionRate: 'max connection rate';
MaxConnectionCount: 'max connection count';
MaxCacheSize: 'max cache size';
SixtySeconds: '60s';
At: 'at';
For: 'for';
NotInternal: 'not internal';
Less: '<';
Greater: '>';
NotAuthenticated: 'not authenticated';
DkimVerificationSuccessful: 'DKIM verification successful';
SelectorEquals: 's=';
DomainEquals: 'd=';
Ssl: 'SSL';
FromEquals: 'from=';
ToEquals: 'to=';
RelayEquals: 'relay=';
DelayEquals: 'delay=';
DelaysEquals: 'delays=';
SizeEquals: 'size=';
NumRecipientsEquals: 'nrcpt=';
MessageIdEquals: 'message-id=';
ClientEquals: 'client=';
PrivateDovecot: 'private/dovecot-lmtp';
DsnEquals: 'dsn=';
StatusEquals: 'status=';
Saved: 'Saved';
Removed: 'removed';
KeyRetrieval: 'key retrieval';
DoesNotResolveToAddress: 'does not resolve to address';
Hostname: 'hostname';

//Anonymous TLS connection established from unknown[185.50.149.15]: TLSv1.2 with cipher ECDHE-RSA-AES256-GCM-SHA384 (256/256 bits)

Char: 'a'..'z' | 'A'..'Z';
Int: '0'..'9'+;
Float: Int'.'Int;
Month: Jan | Feb | Mar | Apr | May | Jun | Jul | Aug | Sep | Oct | Nov | Dec;
Jan: 'Jan';
Feb: 'Feb';
Mar: 'Mar';
Apr: 'Apr';
May: 'May';
Jun: 'Jun';
Jul: 'Jul';
Aug: 'Aug';
Sep: 'Sep';
Oct: 'Oct';
Nov: 'Nov';
Dec: 'Dec';


Ip: Int Dot Int Dot Int Dot Int;
Word: (Char)+;
Alphanum: (Char | Int)+;
Email: String'@'String;
String: (Char | Int | Specialchar)+;
fragment Specialchar: '.' | '-' | '@' | '_';

