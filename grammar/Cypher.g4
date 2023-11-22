grammar Cypher;

// Lexer rules
WS : [ \t\r\n]+ -> skip;

MATCH : 'MATCH';
RETURN : 'RETURN';
PERIOD: '.';
COMMA : ',';
SEMICOLON: ';';
COLON: ':';

ID : [a-zA-Z]+;

// Parser rules
query : matchClause returnClause;

matchClause : MATCH pattern;

returnClause : RETURN nodeId | RETURN (returnItem (COMMA returnItem)*)?;

returnItem : nodeId PERIOD property;

property: ID;

pattern: nodePattern '-' relationshipPattern '-' nodePattern | nodePattern;

relationshipPattern : '[]' | '[' nodeId ':' nodeLabel ']' | '[' nodeId ']';

nodePattern : '(' nodeId ':' nodeLabel ')' | '(' nodeLabel ')';

nodeLabel: ID;

nodeId: ID;

// Other rules can be added as needed to support more features of openCypher.
// MATCH (person:Person)-[likes:LIKES]->(movie:Movie)
