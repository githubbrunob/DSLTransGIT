:- ['analytics/util', 'graph_def'].


collapse(transformation(X,Y),transformation(X,Z)):-
	collapse(transformation(X,Y),rules([]),Y,Z).
	
collapse(_,_,[],[]).

collapse(Original,Past,[Layer|T],[CLayer0|R]):-
	collapse(Past,Layer,CLayer),
	markTemporal(Original,CLayer,CLayer0),
	collapse(Original,CLayer0,T,R).

collapse(rules(Past),rules(Present),rules(Futures)):-
	findall(Future,(
			combination(Present,LC),
			collapse_graphs(LC,[LK]),
			matchRules(Past,LK,Future_1),
			member(Future,Future_1)
   		), Futures).

matchRules(_,graph(ID,V,Edges),[graph(ID,V,Edges)]):-
		not(memberchk(edge(typeE(['PositiveBackwardRestriction']),_,_,_),Edges)).
	
matchRules(Past,graph(ID,V,Edges),Set):-
		memberchk(edge(typeE(['PositiveBackwardRestriction']),_,_,_),Edges),
		matchRule(Past,graph(ID,V,Edges),Set),
		length(Set,N), N > 0.

matchRule([],_,[]).	
matchRule([Model|Models],Rule,SetN_1):-
		matchSubGraph(Rule,Model,Set),
	matchRule(Models,Rule,SetN_0),
		concatenate(Set,SetN_0,SetN_1).

matchSubGraph(A,B,ABL):-
	splitbackwards(A,A_Backwards,_),
	splitbackwards(B,B_Backwards,_),
	findall(AB,
		(
			subgraph_isomorphism(A_Backwards,B_Backwards,ABmap),
			merge(ABmap,A,B,AB)
		),
		ABL
	).

collapse_graphs([],[]).
collapse_graphs([H],[H]).
collapse_graphs([H,E|T],[R]):-
	collapse_graphs([E|T],[TC]),
		collapse_graph(H,TC,R).

matchNodes(Vv1,Vv2):-
	isOnlyMatch(Vv1),
	isOnlyMatch(Vv2),
	sametype(Vv1,Vv2).

applyPairNodes(Vv1,Vv2,map(Vv1,Vv2)).

collapse_graph(
	graph(id(ID1,N1),V1,E1),
	graph(id(ID2,N2),V2,E2),
	graph(id(ID3,N3),V3_1,E3_1)
):-
	atom_concat(N1,' + ',N11), atom_concat(N11,N2,N3),
	getmember(V1,V2,[matchNodes],[applyPairNodes],PairList),
	xi(PairList,V1,V2,E1,E2,V1_1,V2_1,VvList),
	once((
		union(V1_1,V2_1,V3),
	   	union(E1,E2,E3)
	)),
	fill_remove_redundant_edges(VvList,E3,E3_1),
	concatenate(V3,VvList,V3_1),	
	concatenate(ID1,ID2,ID3).

xi([],V1,V2,_,_,V1,V2,[]).

xi([map(Vv1,Vv2)|List],V1,V2,E1,E2,V1_n,V2_n,[Vv3|VvList]):-
		once((
			merge_pair_list([map(Vv1,Vv2)],V1,V2,[Vv3],V1_1,V2_1),
			get_temporal_edges(Vv1,E1,Br1),
			get_temporal_edges(Vv2,E2,Br2)
		)),
		getmember(Br1,Br2,[matchEdges,V1_1,V2_1],[applyEdges,V1_1,V2_1],PairList),
		merge_pair_list(PairList,V1_1,V2_1,VvList_1,V1_2,V2_2),
	xi(List,V1_2,V2_2,E1,E2,V1_n,V2_n,VvList_2),
	concatenate(VvList_1,VvList_2,VvList).

matchEdges(V1,V2,edge(_,_,_,TList1),edge(_,_,_,TList2)):-
	once((member(node(NT1,IDN1),V1), intersect(IDN1,TList1))),
	once((member(node(NT2,IDN2),V2), intersect(IDN2,TList2))),
	sametype(node(NT1,IDN1),node(NT2,IDN2)).

applyEdges(V1,V2,edge(_,_,_,TList1),edge(_,_,_,TList2),map(node(NT1,IDN1),node(NT2,IDN2))):-
	once((member(node(NT1,IDN1),V1), intersect(IDN1,TList1))),
	once((member(node(NT2,IDN2),V2), intersect(IDN2,TList2))).	

get_temporal_edges(node(_,ListN),Edges,L):-
	findall(
		edge(typeE(['PositiveBackwardRestriction']),Id,SList,TList),
		(
			member(edge(typeE(['PositiveBackwardRestriction']),Id,SList,TList),Edges),
			intersect(ListN,SList)
		), L).

markTemporal(_,rules([]),rules([])).

markTemporal(Trans,rules([H|T]),rules([H1|R])):-
	markTemporalRule(Trans,H,H1),
	markTemporal(Trans,rules(T),rules(R)).

markTemporalRule(Transformation,graph(ID,V,E0),graph(ID,V,E2)):-
	findall(Vv,(member(Vv,V),isOnlyMatch(Vv)),V1),
	findall(Fv,(member(Fv,V),isFreeNode(Fv,E0)),V2),
	findall(edge(typeE(['PositiveBackwardRestriction']),new,IDS,IDT),
		(
			member(node(_,IDS),V1),
			member(node(_,IDT),V2),
			sameGraph(ID,Transformation,IDS,IDT)
		),
	E1),
	concatenate(E0,E1,E2).

sameGraph(id(ID,_),Trans,IDS,IDT):-
	findall(R,getRules(ID,Trans,R),Rules),
	member(graph(_,V,_),Rules),
	member(node(_,IDX),V),
		intersect(IDS,IDX),
	member(node(_,IDK),V),
		intersect(IDT,IDK),!.

getRules(IDList,transformation(_,RuleList),R):-
	member(ID,IDList),
	member(rules(Rules),RuleList),
	getRulesFromID(ID,Rules,R).


getRulesFromID(ID,[graph(id([ID],Label),V,E)|_],graph(id([ID],Label),V,E)).

getRulesFromID(ID,[graph(id([ID1],_),_,_)|R],G):-
	ID \= ID1,
	getRulesFromID(ID,R,G).
	
isFreeNode(node(typeV(['ApplyClass'|_]),IdList),Edges):-
	not(checkBackwards(IdList,Edges)).

isOnlyMatch(node(typeV(['AnyMatchClass'|_]),_)).
isOnlyMatch(node(typeV(['NegativeMatchClass'|_]),_)).

checkBackwards([Id|_],Edges):- 
	memberchk(edge(typeE(['PositiveBackwardRestriction']),_,_,[Id]),Edges).
checkBackwards([Id|T],Edges):- 
	not(memberchk(edge(typeE(['PositiveBackwardRestriction']),_,_,[Id]),Edges)),
	checkBackwards(T,Edges).



