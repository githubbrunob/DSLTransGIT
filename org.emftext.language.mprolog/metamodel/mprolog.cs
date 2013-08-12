SYNTAXDEF pl
FOR <mprolog>
START Model

OPTIONS {
	generateCodeFromGeneratorModel = "true";
	usePredefinedTokens = "true";
}

TOKENS {
//	DEFINE RULE $':-'$;
	DEFINE COMMENT  $'%'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE VARIABLE  $('A'..'Z' |  '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE ATOM  $( 'a'..'z' )('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE NUMBER $('0'..'9')$;
	//Alguns operadores
	DEFINE OPERATOR  $('='('='|'..')? | '/' | '>' | '<' | '\\='('=')? ) $; 
}


TOKENSTYLES {
 //	"RULE" COLOR #666666, ITALIC;
	//"COMMENT" COLOR #008000, ITALIC;
	"VARIABLE" COLOR #00FF10;
	"ATOM" COLOR #0000FF, BOLD;
	
}


RULES {
	@SuppressWarnings(featureWithoutSyntax)
	Model ::= ownedClause* ;
	Clause ::= (ownedHead)? (":-" ownedBody)? ".";
	Head ::= ownedFunctor;
	Body ::=  ownedTerm;
	Variable ::= name[VARIABLE] ("," nextTerm )?;
	Parenthesis ::= "(" ownedTerm ")" ("," nextTerm)?;
	Functor ::=  (text[NUMBER] | text[ATOM] ("(" ownedTerm ")" )?) ("," nextTerm)?;
	QuotedAtom ::=  text['\'','\''] ("," nextTerm)? ;
	List ::= "[" (ownedHeadTerms ("|" ownedTailTerms)?)? "]" ("," nextTerm)?;
	InfixExpression ::=  "(" leftTerm ownedOperator rightTerm ")"  (","  nextTerm)?;
	Operator ::=  symbol[OPERATOR] ;
}



















