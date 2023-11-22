grammar Cypher;

// Lexer rules
WS : [ \t\r\n]+ -> skip;

LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';
LEFT_BRACE : '{';
RIGHT_BRACE : '}';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
MATCH : 'MATCH';
RETURN : 'RETURN';
CREATE : 'CREATE';
PERIOD: '.';
COMMA : ',';
SEMICOLON: ';';
COLON: ':';

ID : [a-zA-Z]+;
QUOTE_STRING
 : '"' (~[\r\n"] | '""')* '"'
   {
     // Strip the quotes
     String s = getText();
     s = s.substring(1, s.length() - 1);
     setText(s);
   }
 ;
query : (matchAndReturnClause | createCommand)+;

createCommand: CREATE createCommandPattern;

createCommandPattern : '(' pair createCommandProperties ')';

createCommandProperties:
    '{' (pair (COMMA pair)*)? '}'
    |
    ;

matchAndReturnClause : matchClause returnClause;

matchClause : MATCH pattern;

returnClause : RETURN returnPattern;

returnPattern:
    '*' # returnAll |
    ID #returnSingleNode |
    (returnItem (COMMA returnItem)*)? #returnMultipleNodes;

returnItem : object=ID PERIOD property=ID;

pattern: nodePattern '-' relationshipPattern '-' nodePattern | nodePattern;

relationshipPattern : '[]' | '[' pair ']';

nodePattern : '(' pair ')';

pair : (property=ID ':')* value=ID | (property=ID ':')* value=QUOTE_STRING;
