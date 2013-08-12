SYNTAXDEF dsltranstext
FOR <http://dsltrans/2.0>
START TransformationModel 

OPTIONS{
	defaultTokenName = "IDENTIFIER";
	usePredefinedTokens = "false";
}

TOKENS {
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
	DEFINE FRAGMENT STRICT $'strict'$;
	DEFINE IDENTIFIER $('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_' | '.')*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE DESC_COMMENT $'/*'.*'*/'$ ;
	
}
TOKENSTYLES {
     "DESC_COMMENT" COLOR #5CB627;
     "strict" COLOR #CC0000;
}	
RULES {
	TransformationModel ::=  source* ; 
	FilePort ::= "File" !1  
				 ("id"#1"="#1 name[IDENTIFIER]  !1)? 
				 ("uri"#1"="#1 filePathURI['\'','\'','\\'])? !1 	//path to .xmi model file 
							metaModelId ;	//identifier
				  					
	MetaModelIdentifier ::= "metamodel"#0"(" !2   //specify source of metamodel (Layer or FilePort)
							("mmname" #1 "=" #1 metaModelName[IDENTIFIER] !2)?  //name of the metamodel
							("uri" #1 "=" #1 metaModelURI['\'','\'','\\'])? !1")" !0;	//path of metamodel to its path to .ecore file
	
	Sequential ::= 
		
		"def"#1(description['\'','\'','\\'] #1 ":"#1) ? "layer" #2(name['\'','\'','\\'])? !1 
		"previous"#1"="#1previousSource['\'','\'','\\']+ !1
		("group"#1"="#1groupName[IDENTIFIER] !1)? 
		("output"#1"="#1 outputFilePathURI['\'','\'','\\']!1 )?
		 metaModelId !1
		 (hasRule!1)* !0
		"end" #1"def"!0 !0;
		
	Rule ::= "rule" (description['\'','\'','\\'])? !1 
	  		    ("match"#1 match)+ !1
				("apply"!2 apply) !1
				("where" (!1attributeRelations)*)? !1
				("restrictions" !2 (backwards !2)*)? !1  
				("import" !2 (imports!2)*)? !0 
			 "end"#1"rule" !0 !0; //defines a transformation between input(Match model) and output(Apply model) model 
	
	MatchModel ::= ("source"#1"="#1 explicitSource[IDENTIFIER] #1)? "with" !2 ( class !2)* !2 ("subject"#1"to" (!3association)*)?  ; //holds pattern that we want to capture from onput model
		
	ApplyModel ::=  (class!2)* ("subject" "to" (!3 association)*)? ; 

	AnyMatchClass ::= (description[DESC_COMMENT])?!2 (id[IDENTIFIER]":")? "any"#1 (allowInheritance["":"strict"])? #1 packageName[IDENTIFIER]#0"::"#0 className[IDENTIFIER]("("   //reason about packageName and className
					   ( #2 attribute)*  #1 ")")? ; 
	
	ExistsMatchClass ::= (description[DESC_COMMENT])?!2 (id[IDENTIFIER]":")? "existing" (allowInheritance["":"strict"])? #1 packageName[IDENTIFIER]#0"::"#0 className[IDENTIFIER] ("(" 
							 (#2 attribute*) #1  ")")?  ; 
	
	NegativeMatchClass ::= (description[DESC_COMMENT])?!2 (id[IDENTIFIER]":")? "not" (allowInheritance["":"strict"])? #1 packageName[IDENTIFIER]#0"::"#0 className[IDENTIFIER] ("("
							((#2 attribute)*) #1")")? ;  // NegativeMatchClass
	
	ApplyClass ::= (description[DESC_COMMENT])?!2 (id[IDENTIFIER]":")? (allowInheritance["":"strict"] )? #1 packageName[IDENTIFIER] #0 "::"#0 className[IDENTIFIER] ("("
	             (!3 attribute)* !2 ")")?  #1 ("in" #1"group" groupName['\'','\'','\\'])? ; 
	
	PositiveMatchAssociation ::= source[IDENTIFIER] #1"--"#0"(" #0 associationName[IDENTIFIER] #0 ")" #0 "->" #1 target[IDENTIFIER]; 
	NegativeMatchAssociation ::= source[IDENTIFIER] #1"!-"#0"(" #0 associationName[IDENTIFIER] #0 ")" #0 "->" #1 target[IDENTIFIER] ;	
	PositiveIndirectAssociation ::= source[IDENTIFIER] #1"~~"#0("(" #0 associationName[IDENTIFIER] #0 ")")? #0 "~>" #1 target[IDENTIFIER] ;
	NegativeIndirectAssociation ::= source[IDENTIFIER] #1"!~"#0("(" #0 associationName[IDENTIFIER] #0 ")")? #0 "~>" #1 target[IDENTIFIER] ;
	
	ApplyAssociation ::= source[IDENTIFIER]"--"#0"(" #0 associationName[IDENTIFIER] #0 ")" #0 "->" #1 target[IDENTIFIER];	
	
	MatchAttribute ::=  (id[IDENTIFIER ]#1":"#1)?  attributeName[IDENTIFIER] ("="attributeValue)?  ; // MatchAttribute
	
	ApplyAttribute ::=   ((id[IDENTIFIER ]#1":"#1)?  (attributeName[IDENTIFIER] ("="#1 attributeValue)?))| ("self" #1 "=" #1 attributeValue)   ;
	 
	
	PositiveBackwardRestriction  ::= targetClass[IDENTIFIER] #1 "derived" #1 "from" #1 sourceClass[IDENTIFIER] ; //PositiveBackwardRestriction
	
	NegativeBackwardRestriction ::= targetClass[IDENTIFIER] #1 "not" #1 "derived" "from" #1 sourceClass[IDENTIFIER] ;	//NegativeBackwardRestriction
	
	Import ::=  "("#1 "target" #1 "=" target[IDENTIFIER]#0","#1 "source" #1"="#1  source[IDENTIFIER] ")"; //Import
	
	Atom ::=  value['\'','\'','\\'] ; //Atom
	
	AttributeRef ::= "sameAs"#0"(" attributeRef[IDENTIFIER] ")" ;
	//"{"
								//"name:" attributeName[] ";" 
								//"description:" description[]? "}"; //AttributRef
	
	ClassRef ::= "sameAs"#0"(" classRef[IDENTIFIER]")" ; //("id:" description[])?  ":" packageName[]"."className[] ";"; //ClassRef
	
	Concat ::= "concat" #0 "(" leftTerm "with" rightTerm ")";	//Concat
	
	TypeOf ::= "typeOf" attributeRef[] ;//TypeOf
	
	Wildcard ::= "WILDCARD";

	isNull ::= "isNull"#0"="value["true" : "false" ]  ; //isNull 
	
	Sequencer ::= "Sequence.nextValue";
	AttributeEquality ::= sourceAttribute[IDENTIFIER] "=" targetAttribute[IDENTIFIER];
	AttributeInequality ::= sourceAttribute[IDENTIFIER] "<>" targetAttribute[IDENTIFIER];
	MatchMayBeSameRelation ::= "allow"  source[IDENTIFIER] "=" target[IDENTIFIER];
	ApplyMayBeSameRelation ::= "allow"  source[IDENTIFIER] "=" target[IDENTIFIER];
}