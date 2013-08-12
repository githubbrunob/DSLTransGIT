% resources
%:- [util].

sq_union(graph(V1,E1),graph(V2,E2),graph(V,E)):-
	union(V1,V2,V),
	union(E1,E2,E).

type(Vertex,type(F,A,B)):-
	Vertex =.. [F,A,B|_].%missing subtype here accoording to mm
	
type(Edge,V,type(F,A,C1,C2,D1,D2)):-
	Edge =.. [F,A,C,D],
	member(V1,V),
	V1 =.. [_,C1,C2,C],%missing subtype here accoording to mm
	member(V2,V),
	V2 =.. [_,D1,D2,D].%missing subtype here accoording to mm

subgraph_isomorphism_vertex(graph([],_),graph(_,_)).
subgraph_isomorphism_vertex(
	graph([V11|V1],[]),
	graph(V2,E2)):-
	type(V11,TV),
	member(V21,V2),type(V21,TV),
	list_remove(V21,V2,NV2),
	subgraph_isomorphism_vertex(graph(V1,[]),graph(NV2,E2)).

subgraph_isomorphism_edge(graph(_,[]),graph(_,_)).
subgraph_isomorphism_edge(
	graph(V1,[E11|E1]),
	graph(V2,E2)):-
	type(E11,V1,TE),
	member(E21,E2),
	type(E21,V2,TE),
	list_remove(E21,E2,NE2),
	subgraph_isomorphism_edge(graph(V1,E1),graph(V2,NE2)).	

subgraph_isomorphism(graph(V1,E1),graph(V2,E2)):-
	list_size(V1,L1),
	list_size(V2,L2), L1 =< L2,
	list_size(E1,L3),
	list_size(E2,L4), L3 =< L4,
	once(subgraph_isomorphism_vertex(graph(V1,[]),graph(V2,E2))),
	once(subgraph_isomorphism_edge(graph(V1,E1),graph(V2,E2))).
	
graph_isomorphism(graph(V1,E1),graph(V2,E2)):-
	list_size(V1,L1),
	list_size(V2,L1),
	list_size(E1,L3),
	list_size(E2,L3),
	subgraph_isomorphism(graph(V1,E1),graph(V2,E2)),
	subgraph_isomorphism(graph(V2,E2),graph(V1,E1)).	



isBr(br(_,_,_)).
isMatch(mc(_,_,_)).
isMatch(mda(_,_,_)).

replace_vertex(V1,V2,OldE,NewE):-
	V1 =.. [_,_,_,First],
	V2 =.. [_,_,_,Last],
	not(isBr(OldE)),
	isMatch(V1),
	isMatch(OldE),
	OldE =.. [F,N1,X1,Y1],
	memberchk(First,[X1,Y1]),
	list_replace(First,Last,[N1,X1,Y1],[N1,X2,Y2]),
	NewE =.. [F,N1,X2,Y2].

replace_vertex(V1,V2,OldE,NewE):-
	V1 =.. [_,_,_,First],
	V2 =.. [_,_,_,Last],
	not(isBr(OldE)),
	not(isMatch(V1)),
	not(isMatch(OldE)),
	OldE =.. [F,N1,X1,Y1],
	memberchk(First,[X1,Y1]),
	list_replace(First,Last,[N1,X1,Y1],[N1,X2,Y2]),
	NewE =.. [F,N1,X2,Y2].

replace_vertex(V1,V2,OldE,NewE):-
	V1 =.. [_,_,_,First],
	V2 =.. [_,_,_,Last],
	isBr(OldE),isMatch(V1),
	OldE =.. [F,N1,X1,Y1],
	memberchk(First,[X1]),
	list_replace(First,Last,[N1,X1,Y1],[N1,X2,_]),
	NewE =.. [F,N1,X2,Y1].	

replace_vertex(V1,V2,OldE,NewE):-
	V1 =.. [_,_,_,First],
	V2 =.. [_,_,_,Last],
	isBr(OldE),not(isMatch(V1)),
	OldE =.. [F,N1,X1,Y1],
	memberchk(First,[Y1]),
	list_replace(First,Last,[N1,X1,Y1],[N1,_,Y2]),
	NewE =.. [F,N1,X1,Y2].	

replace_vertex(_,_,_,[],[]).

replace_vertex(V1,V2,E,[E11|E1],[E11|E2]):-
	not(replace_vertex(V1,V2,E11,_)),
	replace_vertex(V1,V2,E,E1,E2).

replace_vertex(V1,V2,E,[E11|E1],[E21|E2]):-
	once(replace_vertex(V1,V2,E11,E21)),
	not(memberchk(E21,E)),
	replace_vertex(V1,V2,E,E1,E2).

replace_vertex(V1,V2,E,[E11|E1],E2):-
	once(replace_vertex(V1,V2,E11,E21)),
	memberchk(E21,E),
	replace_vertex(V1,V2,E,E1,E2).


switchVertices([],E,E).
switchVertices([pair(V11,V21)|T],graph(V2,E2),graph(V,E)):-
	once(list_remove(V21,V2,NV2)),
	once(replace_vertex(V21,V11,E2,E2,NE2)),
	switchVertices(T,graph(NV2,NE2),graph(V,E)).

getPairList([],_,_,[]).
getPairList([Vertex|NodeList],graph(V1,E1),L,[pair(V11,Vertex)|Pairs]):-
	type(Vertex,T),	
	%once( (
		member(V11,V1),
		type(V11,T),
		not(member(V11,L)),		
	%)),
	getPairList(NodeList,graph(V1,E1),[V11|L],Pairs).	


getPairList([Vertex|NodeList],graph(V1,E1),L,Pairs):-
	type(Vertex,T),	
	%once( (
		member(V11,V1),
		type(V11,T),
		member(V11,L),		
	%)),
	getPairList(NodeList,graph(V1,E1),L,Pairs).	

%%%%%%%%%%%%%%%%%%%%% printing facilities
printGraph(graph(V,E),Out):-
	write(Out,'graph(['),
	once(printGraph(V,Out)),nl(Out),
	write(Out,'], ['),
	once(printGraph(E,Out)),nl(Out),
	write(Out,']).'),nl(Out).

printGraph([],Out):- nl(Out).

printGraph([H],Out):- nl(Out),
	write(Out,'\t'),write(Out,H).

printGraph([H,L|T],Out):- nl(Out),
	write(Out,'\t'),write(Out,H),write(Out,','),
	printGraph([L|T],Out).
	
	
	
	
	