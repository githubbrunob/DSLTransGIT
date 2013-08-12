% member definition

member(X, [X|_]).
member(X, [_|T]):- member(X,T).

memberchk(A,B):- once(member(A,B)).

% auxiliary lists
list_size([],0).
list_size([_|T],Totalsize):- 
	list_size(T,Tsize), Totalsize is Tsize+1.

concatenate([],L1, L1).
	
concatenate([H1|L1], L2, [H1|L1L2]):-
	concatenate(L1, L2, L1L2).

list_remove(_,[],[]).
list_remove(H,[H|R],L):- list_remove(H,R,L).
list_remove(H,[H1|R],[H1|L]):- 
	H \= H1,
	list_remove(H,R,L).

list_replace(_,_,[],[]).
list_replace(S,T,[S|L1],[T|L2]):-
	list_replace(S,T,L1,L2).
list_replace(S,T,[X|L1],[X|L2]):- S \= X,
	list_replace(S,T,L1,L2).

% length

length([],0).
length([_|Y],R):- length(Y,R1), R is R1+1.

% auxiliary cartesian product

product([_],[],[]).
product([HL],[HR|R],[product(HL,HR)|TotalProduct]):-
	product([HL],R,TotalProduct).
product([HL|L],R,TotalProduct):-
	product([HL],R,HLPartialProduct),
	product(L,R,LPartialProduct),
	concatenate(
		HLPartialProduct,
		LPartialProduct,
		TotalProduct).

%try(X):- product([a,b,c],[1,2,3],L),member(X,L).

rip([],_,[]).
rip([X|L],X,TotalRip):- rip(L,X,TotalRip).
rip([X|L],Y,[X|TotalRip]):- X \= Y, rip(L,Y,TotalRip).
	
flattenTerm([],[]).
flattenTerm([H|T],L):-
		flattenTerm(H,L1),
		flattenTerm(T,L2),	
	concatenate(L1,L2,L).
	
flattenTerm(H, [H1]):- H =.. [H1].	
flattenTerm(Term, L):- 
	Term =.. [H|T], list_size(T,TSize), TSize >= 1,
	flattenTerm(H,L1),
	flattenTerm(T,L2),
	concatenate(L1,L2,L).	



flatten([],[]).
flatten([P|L],[NewProduct|Flat]):-
	P =.. TermList,
	once(flattenTerm(TermList,FlattenTermList)),
	rip(FlattenTermList,product,NewTermList),
	NewProduct =.. [product|NewTermList],
	flatten(L,Flat).

bigproduct([], []).

bigproduct([S1], S1).

bigproduct([S1|S], TotalBigProduct):-
	bigproduct(S, BPS),
	once(product(S1,BPS,TotalBigProduct)).

assocbigproduct(Li,Lo):-
	bigproduct(Li,L1),
	flatten(L1,Lo).

%try(X):- assocbigproduct(
%		[
%			[a,b,c,d,e,f],
%			[1,2,3],
%			[x,y,z,w]
%		],L),
%	member(X,L).



%%%%%%%%%%%%% combinatorial utilities

combination([], []). 
combination([_|T], P) :- combination(T,P). 
combination([H|T], [H|P]) :- combination(T,P).

%%%%%%%%%%%%% member of cartesian product between two sets without permutations

getmember_aux(L1,L2,M,A,[Result]):-
	member(V1,L1),
	member(V2,L2),
	concatenate(M,[V1,V2],M_1),
	X_M =.. M_1, 
	call(X_M),
	concatenate(A,[V1,V2,Result],A_1),
	X_A =.. A_1,
	call(X_A).

getmember_aux(L1,L2,M,A,[Result|VList_n]):-
	member(V1,L1),
	member(V2,L2),
	concatenate(M,[V1,V2],M_1),
	X_M =.. M_1, 
	call(X_M),
	concatenate(A,[V1,V2,Result],A_1),
	X_A =.. A_1,
	call(X_A),
	once((
		list_remove(V1,L1,L1_1),
		list_remove(V2,L2,L2_1)
	)),
	getmember_aux(L1_1,L2_1,M,A,VList_n).
		
getmember(L1,L2,M,A,LK):-
	findall(X,getmember_aux(L1,L2,M,A,X),XL),
	remove_duplicates(XL,Ln),
	member(LK,[[]|Ln]).

%%%%%%%%%%%%%%%%%%%%%%%%%%

trymatch(_,_).
tryapply(V1,V2,p(V1,V2)).

trygetmember(L1,L2,L,Ln):- 
	findall(X,getmember_aux(L1,L2,[trymatch],[tryapply],X),XL),
	remove_duplicates(XL,L), length(L,Ln).


%%%%%%%%%%%%% remove duplicates from a set

remove_duplicates(A,B):- remove_duplicates_aux(A,[],B).
	
remove_duplicates_aux([],E,E).
	
remove_duplicates_aux([X|List],E,Res):-
	not((member(X1,E),samelist(X,X1))),
	remove_duplicates_aux(List,[X|E],Res).
	
remove_duplicates_aux([X|List],E,Res):-
	once((member(X1,E),samelist(X,X1))),
	remove_duplicates_aux(List,E,Res).	

samelist([],[]):-!.
samelist([X|L],L1):-
	memberchk(X,L1),
	once(list_remove(X,L1,L1_1)),
	once(samelist(L,L1_1)).

sametype(node(typeV(L1),_),node(typeV(L2),_)):- union(L1,L2,L2).

sametype(edge(typeE(L1),_,S_1,T_1),edge(typeE(L2),_,S_2,T_2),V1,V2):- 
	union(L1,L2,L2),
	once((member(node(N1s,IDN1s),V1), intersect(IDN1s,S_1))),
	once((member(node(N2s,IDN2s),V2), intersect(IDN2s,S_2))),
	sametype(node(N1s,IDN1s),node(N2s,IDN2s)),
	once((member(node(N1t,IDN1t),V1), intersect(IDN1t,T_1))),
	once((member(node(N2t,IDN2t),V2), intersect(IDN2t,T_2))),
	sametype(node(N1t,IDN1t),node(N2t,IDN2t)).

getSource(edge(typeE(_),_,S,_), V, node(N1s,IDN1s)):-
	once((member(node(N1s,IDN1s),V), intersect(IDN1s,S))).

getTarget(edge(typeE(_),_,_,T), V, node(N1s,IDN1s)):-
	once((member(node(N1s,IDN1s),V), intersect(IDN1s,T))).


%%%%%%%%%%%%% isomorphism utilities

%subgraph_isomorphism_vertex(graph(_,[],_),graph(_,_,_)).
%subgraph_isomorphism_vertex(graph(_,[Vv1|V1],_),graph(_,V2,_)):-
%	member(Vv2,V2),
%	sametype(Vv1,Vv2),
%	list_remove(Vv2,V2,V2_1),
%	subgraph_isomorphism_vertex(graph(_,V1,_),graph(_,V2_1,_)).

subgraph_isomorphism_vertex(graph(_,[],_),graph(_,_,_),M,M).

subgraph_isomorphism_vertex(graph(_,[Vv1|V1],_),graph(_,V2,_),M,R):-
	memberchk(map(Vv1,Vv2),M),
	once(list_remove(Vv2,V2,V2_1)),!,
	subgraph_isomorphism_vertex(graph(_,V1,_),graph(_,V2_1,_),M,R).	

subgraph_isomorphism_vertex(graph(_,[Vv1|V1],_),graph(_,V2,_),M,R):-
	not(member(map(Vv1,_),M)),
	member(Vv2,V2),
	sametype(Vv1,Vv2),
	once(list_remove(Vv2,V2,V2_1)),!,
	subgraph_isomorphism_vertex(graph(_,V1,_),graph(_,V2_1,_),[map(Vv1,Vv2)|M],R).	

subgraph_isomorphism_edge(graph(_,_,[]),graph(_,_,_),M,M).

subgraph_isomorphism_edge(graph(_,V1,[Ee1|E1]),graph(_,V2,E2),M,R):-
	getSource(Ee1,V1,VS_Ee1),
	getTarget(Ee1,V1,VT_Ee1),
	memberchk(map(VS_Ee1,VS_Ee2),M),% source map already exists
	memberchk(map(VT_Ee1,VT_Ee2),M),% target map already exists
	member(Ee2,E2),sametype(Ee1,Ee2,V1,V2),getSource(Ee2,V2,VS_Ee2),getTarget(Ee2,V2,VT_Ee2),	
	once(list_remove(Ee2,E2,E2_1)),
	subgraph_isomorphism_edge(graph(_,V1,E1),graph(_,V2,E2_1),M,R).	

subgraph_isomorphism_edge(graph(_,V1,[Ee1|E1]),graph(_,V2,E2),M,R):-
	getSource(Ee1,V1,VS_Ee1),
	getTarget(Ee1,V1,VT_Ee1),
	memberchk(map(VS_Ee1,VS_Ee2),M),% source map already exists
	not(member(map(VT_Ee1,_),M)),
	member(Ee2,E2),sametype(Ee1,Ee2,V1,V2),getSource(Ee2,V2,VS_Ee2),getTarget(Ee2,V2,VT_Ee2),	
	once(list_remove(Ee2,E2,E2_1)),
	subgraph_isomorphism_edge(graph(_,V1,E1),graph(_,V2,E2_1),[map(VT_Ee1,VT_Ee2)|M],R).	

subgraph_isomorphism_edge(graph(_,V1,[Ee1|E1]),graph(_,V2,E2),M,R):-
	getSource(Ee1,V1,VS_Ee1),
	getTarget(Ee1,V1,VT_Ee1),
	not(member(map(VS_Ee1,_),M)),
	memberchk(map(VT_Ee1,VT_Ee2),M),% target map already exists
	member(Ee2,E2),sametype(Ee1,Ee2,V1,V2),getSource(Ee2,V2,VS_Ee2),getTarget(Ee2,V2,VT_Ee2),	
	once(list_remove(Ee2,E2,E2_1)),
	subgraph_isomorphism_edge(graph(_,V1,E1),graph(_,V2,E2_1),[map(VS_Ee1,VS_Ee2)|M],R).	

subgraph_isomorphism_edge(graph(_,V1,[Ee1|E1]),graph(_,V2,E2),M,R):-
	getSource(Ee1,V1,VS_Ee1),
	getTarget(Ee1,V1,VT_Ee1),
	not(member(map(VS_Ee1,_),M)),
	not(member(map(VT_Ee1,_),M)),
	member(Ee2,E2),
	sametype(Ee1,Ee2,V1,V2),
	getSource(Ee2,V2,VS_Ee2),
	getTarget(Ee2,V2,VT_Ee2),	
	once(list_remove(Ee2,E2,E2_1)),
	subgraph_isomorphism_edge(graph(_,V1,E1),graph(_,V2,E2_1),[map(VS_Ee1,VS_Ee2),map(VT_Ee1,VT_Ee2)|M],R).	

subgraph_isomorphism(graph(_,V1,E1),graph(_,V2,E2),VMap_N):-
	once((
		list_size(V1,L_1), list_size(V2,L_2), L_1 =< L_2, % size(V1) =< size(V2)
		list_size(E1,L_3), list_size(E2,L_4), L_3 =< L_4  % size(V1) =< size(V2)
	)),
	subgraph_isomorphism_edge(graph(_,V1,E1),graph(_,V2,E2),[],VMap_1),
	subgraph_isomorphism_vertex(graph(_,V1,_),graph(_,V2,_),VMap_1,VMap_N).
	
graph_isomorphism(graph(_,V1,E1),graph(_,V2,E2)):-
	once((
		list_size(V1,L_1), list_size(V2,L_1),% size(V1) = size(V2)
		list_size(E1,L_2), list_size(E2,L_2) % size(E1) = size(E2)
	)),
	once(subgraph_isomorphism(graph(_,V1,E1),graph(_,V2,E2),M)),
	once(subgraph_isomorphism(graph(_,V2,E2),graph(_,V1,E1),M_1)), invMap(M,M_1).	

%%%%%%%%%%%% inverse mapping

invMap([],[]).
invMap([map(A,B)|X],Y):-
	memberchk(map(B,A),Y),
	list_remove(map(B,A),Y,Y_1),!,
	invMap(X,Y_1).

%%%%%%%%%%%%% union

union([X|Y],Z,W):- member(X,Z),union(Y,Z,W).
union([X|Y],Z,[X|W]):- not(member(X,Z)), union(Y,Z,W).
union([],Z,Z).

%%%%%%%%%%%%% graph union

gunion([],E,E).
gunion([H|T],E,[H|R]):-
	memberchk(H,E),
	list_remove(H,E,E_1),
	gunion(T,E_1,R).

gunion([H|T],E,[H|R]):-
	not(memberchk(H,E)),
	gunion(T,E,R).


gunion(graph(id(_,_),V_1,E_1),graph(id(ID_2,L_2),V_2,E_2),graph(id(ID_2,L_2),VU,EU)):-
	gunion(V_1,V_2,VU),
	gunion(E_1,E_2,EU).
	
%%%%%%%%%%%%% split backwards

splitbackwards(graph(ID,V,E),graph(ID,V_1,E_1),graph(ID,V_2,E_2)):-
	findall(
		edge(typeE(['PositiveBackwardRestriction']),ID_1,S_1,T_1),
		(
			member(edge(typeE(['PositiveBackwardRestriction']),ID_1,S_1,T_1),E)
		),
		E_1
	),
	findall(
		node(Type_2,ID_2),
		(
			member(node(Type_2,ID_2),V),
			member(edge(_,_,S_2,_),E_1),
			intersect(S_2,ID_2)
		),
		V_1_1
	),
	findall(
		node(Type_3,ID_3),
		(
			member(node(Type_3,ID_3),V),
			member(edge(_,_,_,T_3),E_1),
			intersect(T_3,ID_3)
		),
		V_1_2
	),
	concatenate(V_1_1,V_1_2,V_1),
	findall(
		edge(Type_4,ID_4,S_4,T_4),
		(
			member(edge(Type_4,ID_4,S_4,T_4),E),
			not(member(edge(Type_4,ID_4,S_4,T_4),E_1))
		),
		E_2
	),
	findall(
		node(Type_5,ID_5),
		(
			member(node(Type_5,ID_5),V),
			not(member(node(Type_5,ID_5),V_1))
		),
		V_2
	).
	
	
	
%%%%%%%%%%%% merge of nodes
merge_nodes(node(L1,IDList_1),node(_,IDList_2),node(L1,IDList_3)):-
	concatenate(IDList_1,IDList_2,IDList_3).

%%%%%%%%%%%% iterative merge of nodes

merge_pair_list([],V1,V2,[],V1,V2).

merge_pair_list([map(N1,N2)|PairList],V1_1,V2_1,[N3|VvList],V1_n,V2_n):-
		once((
			merge_nodes(N1,N2,N3),
			list_remove(N1,V1_1,V1_2),
			list_remove(N2,V2_1,V2_2)
		)),
	merge_pair_list(PairList,V1_2,V2_2,VvList,V1_n,V2_n).	

%%%%%%%%%%%% remove redundant edges
fill_remove_redundant_edges([],E,E).
fill_remove_redundant_edges([Vv|List],E0,E):-
		once((
			fill_edges(Vv,E0,E1),
			removeRedundant(E1,E2)
		)),
	fill_remove_redundant_edges(List,E2,E).

fill_edges(_,[],[]).
fill_edges(node(_,IdList),[edge(TE,Id,SList,TList)|T],[edge(TE,Id,SList_1,TList_1)|R]):-
	ifNodeIntersect(IdList,SList,SList_1),
	ifNodeIntersect(IdList,TList,TList_1),
	fill_edges(node(_,IdList),T,R).

ifNodeIntersect(IdList,SList,SList):- not(intersect(IdList,SList)).
ifNodeIntersect(IdList,SList,SList_1):- 
	intersect(IdList,SList), 
	union(IdList,SList,SList_1).

intersect([Id|_],T):- memberchk(Id,T),!.
intersect([Id|T],T1):- not(memberchk(Id,T1)), intersect(T,T1), !.

equalEdges(edge(TE,_,SList,TList),edge(TE,_,SList1,TList1)):-
	union(SList,SList1,SList1), union(TList,TList1,TList1).

hasEqualEdge(E,[E1|_]):- once(equalEdges(E,E1)),!.
hasEqualEdge(E,[E1|T]):- not(equalEdges(E,E1)),hasEqualEdge(E,T),!.


removeRedundant(A,B):- remove_redundant(A,[],B).

remove_redundant([],L,L).
remove_redundant([E|T],L,R):-
	once(hasEqualEdge(E,L)),
	remove_redundant(T,L,R).

remove_redundant([E|T],L,R):-
	not(hasEqualEdge(E,L)),
	remove_redundant(T,[E|L],R).


%%%%%%%%%%%%%%% merge of graphs given a mapping	
merge(
	XYmap,
	graph(id(ID1,N1),V1_1,E1_1),
	graph(id(ID2,N2),V2_1,E2_1),
	graph(id(ID3,N3),V3_2,E3_2)
):-
	atom_concat(N1,' + ',N11), atom_concat(N11,N2,N3),
	merge_pair_list(XYmap,V1_1,V2_1,VvList,V1_2,V2_2),
	once((
		union(V1_2,V2_2,V3_1),
	   	union(E1_1,E2_1,E3_1)
	)),
	fill_remove_redundant_edges(VvList,E3_1,E3_2),
	concatenate(V3_1,VvList,V3_2),
	concatenate(ID1,ID2,ID3).
	
