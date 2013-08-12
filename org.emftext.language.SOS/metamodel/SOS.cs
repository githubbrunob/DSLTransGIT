SYNTAXDEF SOS
FOR <http://www.emftext.org/language/SOS>
START Semantics,SOS.adtmm.ADT


IMPORTS {
	SOS.adtmm:<SOS.adtmm>
	SOS.set:<SOS.set>
}


TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"Semantics" COLOR #7F0055, BOLD;
	"{" COLOR #7F0055, BOLD;
	"}" COLOR #7F0055, BOLD;
	"Assuming" COLOR #7F0055, BOLD;
	":" COLOR #7F0055, BOLD;
	"Then" COLOR #7F0055, BOLD;
	"Fact" COLOR #7F0055, BOLD;
	"," COLOR #7F0055, BOLD;
	"ADT" COLOR #7F0055, BOLD;
	"Sorts" COLOR #7F0055, BOLD;
	"Generators" COLOR #7F0055, BOLD;
	"Operations" COLOR #7F0055, BOLD;
	"Axioms" COLOR #7F0055, BOLD;
	"Where" COLOR #7F0055, BOLD;
	"Union" COLOR #7F0055, BOLD;
	"Intersect" COLOR #7F0055, BOLD;
	"Excluding" COLOR #7F0055, BOLD;
	"->" COLOR #7F0055, BOLD;
	"->>" COLOR #7F0055, BOLD;
	";" COLOR #7F0055, BOLD;
	"." COLOR #7F0055, BOLD;
	"(" COLOR #7F0055, BOLD;
	")" COLOR #7F0055, BOLD;
	"=>" COLOR #7F0055, BOLD;
	"|-" COLOR #7F0055, BOLD;
	"@" COLOR #7F0055, BOLD;
	"^" COLOR #7F0055, BOLD;
	"=" COLOR #7F0055, BOLD;
	"!=" COLOR #7F0055, BOLD;
	"class" COLOR #7F0055, BOLD;
	"in" COLOR #7F0055, BOLD;
	"existsIn" COLOR #7F0055, BOLD;
	"Model" COLOR #7F0055, BOLD;
	"|" COLOR #7F0055, BOLD;
}


RULES {
	Semantics ::= "Semantics" (rules | signature)*;
	Rule ::= 
				(
					("Assuming" assumes "Then" concludes) | 
					("Fact" concludes)
				) ("Where" ownedVariables+)?;	
	PremisseList ::= has ("," next)?;
	AlgebraicConditionList ::= has ("," next)?;
	Conclusion ::= has;
	Transition ::= 
					(environment ":")?
					preState "->>" label "->>" posState "in" "Transition" "System";
	TypeJudment ::= 
					(environment ":")? 
					leftHandSide "|-" rightHandSide;

	AlgebraicCondition ::= "("ownedConditions")"|ownedConditions;

	SOS.adtmm.ADT ::= "ADT" name[] 
						("Sorts" ownedSorts+)?
						("Generators" ownedGenerators+)?
						("Operations" ownedOperations+)?						
						("Axioms" ownedAxioms+)? 
						("Where" ownedVariables+)?;
	SOS.adtmm.Operation ::= name[] ":" operationSorts* "->" result ";";
	SOS.adtmm.Variable ::= name[] (":" variableSort)? ";";
	SOS.adtmm.CondEquation ::= ("(" ownedConditions+ ")" "=>")? ownedEquation ";";
	SOS.adtmm.VariableRef ::= "@"variable[];
	SOS.adtmm.CTerm ::= op[]("^" (iter[INTEGER] | iterTerm))? ("(" ownedTerms+ ")")?;
	SOS.adtmm.Equation ::= ownedLeftTerm "=" ownedRightTerm;
	SOS.adtmm.Inequation ::= ownedLeftTerm "!=" ownedRightTerm;
	SOS.adtmm.AtomicSort ::= declaration[];
	SOS.adtmm.SortDeclaration ::= name[];

	SOS.set.Set ::= "Set" "(" sort ")";	
	SOS.set.ModelSet ::= "Model";
	SOS.set.SetConstructor ::= "{" (member ("|" suchThat)?)? "}";
	SOS.set.ForAllIn ::= "in" "(" leftHandSide "," rightHandSide")";
	SOS.set.ExistsIn ::= "existsIn" "(" leftHandSide "," rightHandSide")";	
	SOS.set.Union ::= "Union" "(" leftHandSide "," rightHandSide ")";
	SOS.set.Excluding ::= "Excluding" "(" leftHandSide "," rightHandSide")";
	SOS.set.Intersection ::= "Intersect" "(" leftHandSide "," rightHandSide")";
	SOS.set.ModelRelation ::= source "->"referenceName[]"->" target;
	SOS.set.ModelClassAttribute ::= selector "." attributeName[];
	SOS.set.ModelSort ::= "class" "(" packageName['"','"'] "," className['"','"'] ")" ;
}