parser grammar PostfixConnectionParser;

@header {
package at.daho.logparsingproject.logparser.antlr.parser;
}

options {
    tokenVocab=PostfixConnectionLexer;
}

// Shared
hostnameWithIp: hostname SquareBracketOpen Ip SquareBracketClose;
hostname: domainname (Dot domainname)*;
domainname: String | Word | Ip | Integer;

// Log structure
log: (logline)* EOF;
logline: logheader Colon logcontent Linebreak?;
logheader: timestamp hostname processinformation;

// Timestamp
timestamp: Month day time;
time: hour Colon minute Colon second;
day: Integer;
hour: Integer;
minute: Integer;
second: Integer;

// Process information
processinformation: (service Slash)* processName SquareBracketOpen processId SquareBracketClose;
service: Word | String;
processName: Word | String;
processId: Integer;

// Actual logged information
logcontent: connect | disconnect;

connect: Connect From hostnameWithIp;
disconnect: Disconnect From hostnameWithIp;
