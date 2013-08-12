% resources
%:- [util,graph].

%%%%%%%%% backward restriction

get_br_nodes(mc(_,_,V),Vs,Edges,L):-
	findall(
		ac(A,B,Tid),
		(
			member(Edge,Edges),
			isBr(Edge),
			Edge =.. [_,_,V,Tid],
			member(ac(A,B,Tid),Vs)
		),
		L
	).


get_br(_,[],_,[]).
get_br(V,[Vertex|ApplyVertices],EM,[br('_',IDV,IDVertex)|BrList]):-
	V =.. [_,_,_,IDV],
	Vertex =.. [_,_,_,IDVertex],
	not(memberchk(br('_',_,Vertex),EM)),%its a free node	
	get_br(V,ApplyVertices,EM,BrList).

temporal_morphism(
	match_apply(graph([],EM1),graph(VA1,EA1)),
	match_apply(graph([],EM1),graph(VA1,EA1))
).

temporal_morphism(
	match_apply(graph([V11|VM1],EM1),graph(VA1,EA1)),
	match_apply(graph([V11|VM2],EM2),graph(VA1,EA1))
):-
	get_br(V11,VA1,EM1,BrList),
	union(EM1,BrList,EMTotal),
	temporal_morphism(
		match_apply(graph(VM1,EMTotal),graph(VA1,EA1)),
		match_apply(graph(VM2,EM2),graph(VA1,EA1))
	).

build_evidence(
	evidence(
		LayerName,IDL,
		RuleName,IDR,
		PropertyName,IDP,
		GT
	)
):- 
	property(LP),
	layer(LayerName,IDL,LR,_),
	
	member(
		rule(PropertyName,IDP,
			match_apply(
				MGP,
				AGP
			) 
		),
	LP), sq_union(MGP,AGP,GP),
	
	member(
		rule(RuleName,IDR,
			match_apply(
				MG,
				AG
			) 
		),
	LR),  
	temporal_morphism(
		match_apply(MG,AG),
		match_apply(MGT,AGT)
	),
	sq_union(MG,AG,G),
	subgraph_isomorphism(G,GP),	
	sq_union(MGT,AGT,GT).
