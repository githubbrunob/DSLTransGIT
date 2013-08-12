%%%% general initializations
:- ['analytics/util.pl'].
:- ['data/sosfundamentals'].

:- dynamic(class/5).  
:- dynamic(gendef/1). 
:- dynamic(op/2).
:- dynamic(opdef/1).
:- dynamic(rule/4).  

reset:- retractall(class(_,_,_,_,_)),
	retractall(gendef(_)),
	retractall(op(_,_)),
	retractall(opdef(_)),
	retractall(rule(_,_,_,_)).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

getGraphs(p(M,A,B)):-
	transformation(_,RuleSet),
	findall(Rule,
		(
			member(rules(RuleSet_0),RuleSet),
			member(Rule,RuleSet_0)
		),
	FlatRules),
	member(graph(_,V,E),FlatRules),
	getMatchApplyGraph(V,E,p(M,A,B)).
	
getMatchApplyGraph(V,E,p(M,A,B)):-
	filterNodesFromGraph('AnyMatchClass',V,M_V),
	convertToClassList(M_V,M_C),
	filterNodesFromGraph('ApplyClass',V,A_V),
	convertToClassList(A_V,A_C),
	filterEdgesFromGraph('PositiveMatchAssociation',E,M_E),
	addToClassList(M_E,M_C,M),
	filterEdgesFromGraph('ApplyAssociation',E,A_E),
	addToClassList(A_E,A_C,A),
	filterEdgesFromGraph('PositiveBackwardRestriction',E,B)
.

addToClassList([],A,A).

addToClassList([edge(typeE([_,EdgeName]),_,S_1,T_1)|E1],C1,C2):-
		once((
			member(class(Package,Class,S_2,Attrs,Rels),C1),
			samelist(S_1,S_2),
			member(class(_,_,T_2,_,_),C1),
			samelist(T_1,T_2)
		)),
		list_remove(class(Package,Class,S_2,Attrs,Rels),C1,C1_1),
	addToClassList(E1,
		[
			class(Package,Class,S_2,Attrs,
				[
					p(EdgeName,T_2)
					|Rels
				])
			|C1_1
		],C2).



filterEdgesFromGraph(Type,E,M_E):-
	findall(
		edge(typeE([Type|T]),ID_1,S_1,T_1),
		(
			member(edge(typeE([Type|T]),ID_1,S_1,T_1),E)
		),
		M_E
	).

filterNodesFromGraph(Type,V,M_V):-
	findall(
		node(typeV([Type,Package,Class]),IdList),
		(
			member(node(typeV([Type,Package,Class]),IdList),V)
		),M_V
	).


convertToClassList([],[]).
convertToClassList(
	[node(typeV([_,Package,Class]),IdList)|V],
	[class(Package,Class,IdList,AttrNoDup,[])|M]
):-
	getAttributes(IdList,Attr),
	removeDupAttributes(Attr,[],AttrNoDup),
	convertToClassList(V,M)
.

removeDupAttributes([],A,A).
removeDupAttributes([p(Name,_)|A1],A2,A3):-
	memberchk(p(Name,_),A2),
	removeDupAttributes(A1,A2,A3).
	
removeDupAttributes([p(Name,Value)|A1],A2,A3):-
	not(memberchk(p(Name,_),A2)),
	removeDupAttributes(A1,[p(Name,Value)|A2],A3).

getAttributes([],[]).
getAttributes([Id|IdList],AttrList_N):-
	once(class(_,_,Id,_,Rels)),
	findall(Attr,
		(
			member(p('attribute',IdAttr),Rels),
			getAttribute(IdAttr,Attr)
		),
		Attrs),
	getAttributes(IdList,AttrList),
	concatenate(Attrs,AttrList,AttrList_N).

getAttribute(IdAttr,p(Name,IdAttr)):-
	once((
		class(_,_,IdAttr,AttrAttr,AttrRels),
		member(p('attributeName', Name),AttrAttr)
	)),
	not(memberchk(p('attributeValue', _),AttrRels)).

getAttribute(IdAttr,p(Name,Value)):-
	once((
		class(_,_,IdAttr,AttrAttr,AttrRels),
		member(p('attributeName', Name),AttrAttr)
	)),
	once((
		member(p('attributeValue', IdValue),AttrRels),
		class(_,_,IdValue,ValueAttrs,_),
		member(p('value', Value),ValueAttrs)
	)).

getAttribute(IdAttr,p(Name,Value)):-
	once((
		class(_,_,IdAttr,AttrAttr,AttrRels),
		member(p('attributeName', Name),AttrAttr)
	)),
	once((
		member(p('attributeValue', IdValue),AttrRels),
		class(_,_,IdValue,_,ValueRels),
		member(p('attributeRef', Value),ValueRels)
	)).


computeTS(_,[],[]).
computeTS(match,[p(M,A,B)|L],[p(cs(M,FIX),A,B)|T]):-
	 retractall(class(_,_,_,_,_)),
	 compile(M),
	 getfixpoint(FIX),
	 computeTS(match,L,T)
.

computeTS(apply,[p(cs(M,FIXM),A,B)|L],[p(cs(M,FIXM),cs(A,FIX),B)|T]):-
	 not(FIXM == empty),
	 retractall(class(_,_,_,_,_)),
	 compile(A),
	 mydebug(A),
	 getfixpoint(FIX),
	 computeTS(apply,L,T)
.

computeTS(apply,[p(cs(M,empty),A,B)|L],[p(cs(M,empty),cs(A,empty),B)|T]):-
	 computeTS(apply,L,T)
.

mydebug(_).

checkFIX([]).
checkFIX(_).

compile([]).
compile([H|T]):- assert(H), compile(T).

%%% [class('statemachine', 'Initial', id25, [p('name',id68)],[])].
%%% [class('petrinet', 'Place', id25, [p('name',id68),p('token','1')],[])].
	
load:- 
	['data/SM2PN.dsltrans.pl'], 
	['data/analysed_graphs.pl'].
	
try(M):- load, 
	 findall(P,getGraphs(P),L),
	 consult('data/statemachine.SOS.pl'),
	 computeTS(match,L,L_1),
	 consult('data/petrinet.SOS.pl'),
	 computeTS(apply,L_1,L_2),
	 checkFIX(L_2).
	




