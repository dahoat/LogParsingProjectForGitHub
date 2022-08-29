lexer grammar PostfixConnectionLexer;

@header {
package at.daho.logparsingproject.logparser.antlr.parser;
}

Whitespace: [ \t]+ -> skip;
Linebreak: '\r'?'\n';

Colon: ':';
Dot: '.';
Slash: '/';
SquareBracketOpen: '[';
SquareBracketClose: ']';

Connect: 'connect';
Disconnect: 'disconnect';
From: 'from';

Month: Jan | Feb | Mar | Apr | May | Jun | Jul | Aug | Sep | Oct | Nov | Dec;
fragment Jan: 'Jan';
fragment Feb: 'Feb';
fragment Mar: 'Mar';
fragment Apr: 'Apr';
fragment May: 'May';
fragment Jun: 'Jun';
fragment Jul: 'Jul';
fragment Aug: 'Aug';
fragment Sep: 'Sep';
fragment Oct: 'Oct';
fragment Nov: 'Nov';
fragment Dec: 'Dec';

Ip: Integer Dot Integer Dot Integer Dot Integer;

Integer: '0'..'9'+;
Float: Integer'.'Integer;

Word: LowerWord | UpperWord | MixedWord;
fragment LowerWord: LowerChar+;
fragment UpperWord: UpperChar+;
fragment MixedWord: (LowerChar | UpperChar)+;
Char: LowerChar | UpperChar;
fragment LowerChar: 'a'..'z';
fragment UpperChar: 'A'..'Z';
fragment SpecialChar: [-];

String: (Char | Integer | SpecialChar)+;

Remainder: .+?;
