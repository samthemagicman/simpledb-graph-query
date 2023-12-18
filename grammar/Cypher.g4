grammar Cypher;

// Lexer rules
WS: [ \t\r\n]+ -> skip;

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
MATCH: 'MATCH';
RETURN: 'RETURN';
CREATE: 'CREATE';
PERIOD: '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';

ID: [a-zA-Z0-9_]+;
QUOTE_STRING:
	'"' (~[\r\n"] | '""')* '"' {
     // Strip the quotes
     String s = getText();
     s = s.substring(1, s.length() - 1);
     setText(s);
   };
query: (matchCommand | returnCommand | createCommand | deleteCommand)+;

createCommand: CREATE createCommandPattern (COMMA createCommandPattern)?;

createCommandPattern:
	nodeFrom = nodePattern '-' relationship = nodeRelationshipPattern '->' nodeTo = nodePattern		# createNodeRelationship
	| nodeTo = nodePattern '<-' relationship = nodeRelationshipPattern '-' nodeFrom = nodePattern	# createNodeInverseRelationship
	| node = nodePattern																			# createSingleNode;

nodeRelationshipPattern: '[' nodeNameAndLabel = pair properties = nodeProperties ']';

nodePattern: '(' nodeNameAndLabel = pair properties = nodeProperties ')';

nodeProperties: '{' (pair (COMMA pair)*)? '}' |;

matchAndReturnCommand: matchCommand returnCommand;

deleteCommand: 'DELETE' nodeVariable = ID;

matchCommand: MATCH matchPattern;

returnCommand: RETURN returnPattern;

returnPattern: '*' # returnAll | ID # returnSingleNode | (returnItem (COMMA returnItem)*)? # returnMultipleNodes;

returnItem: object = ID PERIOD property = ID;

matchPattern:
	nodeFrom = nodePattern '--' nodeTo = nodePattern
	| nodeFrom = nodePattern '-' relationship = nodeRelationshipPattern '->' nodeTo = nodePattern
	| nodeTo = nodePattern '<-' relationship = nodeRelationshipPattern '-' nodeFrom = nodePattern
	| node = nodePattern;

relationshipPattern: '[]' | '[' pair ']';

pair: (property = ID* ':')* value = ID | (property = ID ':')* value = QUOTE_STRING;