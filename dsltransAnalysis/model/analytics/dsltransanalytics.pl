% resources
:- [util,graph,translationspec].

% input data: transformation
:- [mprolog,properties].

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

get_a_property(LP,match_apply(
				MGP,
				AGP
			)):-
	property(LP),
	member(
		rule(_,_,
			match_apply(
				MGP,
				AGP
			) 
		),
	LP).

build_graphs(Comb,G):-
	findall(E,build_evidence(E),Evidences),
	findall(ECombination,combination(Evidences,ECombination),ECombinations),
	member(Comb,ECombinations),
	findall(G1,
		(
		member(
			evidence(
				LayerName1,
				IDL1,
				RuleName1,
				IDR1,
				PropertyName1,
				IDP1,
			G1),Comb)
		),
	TotalG),
	collapse(TotalG,G).

%%%%%%%%%%%%%%%%%%%%%% printing results

printCombination(L,Out):- 
	write(Out,'%['), 
	printCombination1(L,Out),
	write(Out,']'),nl(Out). 

printCombination1([],Out):- nl(Out).

printCombination1([
	evidence(
		LayerName,_,RuleName,_,_,_,_)
	],Out):- 
	write(Out,LayerName),
	write(Out,'_'),
	write(Out,RuleName).

printCombination1([
	evidence(
		LayerName,_,RuleName,_,_,_,_),
	E2|T],Out):- 
	write(Out,LayerName),
	write(Out,'_'),
	write(Out,RuleName),
	write(Out,','),
	printCombination1([E2|T],Out).

print_results([],Out):- nl(Out).

print_results([result(C,G)|T],Out):- nl(Out),
	print_results(C,G,Out), nl(Out),
	print_results(T,Out), nl(Out).	

print_results(C,G,Out):-
		once(printCombination(C,Out)),
		once(printGraph(G,Out)).

%%%%%%%%%%%%%%%%%%%%%% checking subgraph isomorphism

filterGraph(GP,G):-
	subgraph_isomorphism(GP,G).

processResults(GP,L1,L2):-
	findall(result(C,G),
	( 
		member(result(C,G),L1),
		filterGraph(GP,G)
	),
	L2).

%%%%%%%%%%%%%%%%%%%%%% optimization cuts
:- dynamic(path/1), dynamic(graph/2).

checkGraphCombination(graph(V,E)):-
	graph(V1,E1),
	union(V,V1,V1),
	union(E,E1,E1),!.
addGraphCombination(graph(V,E)):-
	not(graph(V,E)),
	not(checkGraphCombination(graph(V,E))),
	assert(graph(V,E)).

checkCombination(L):- path(L1),union(L,L1,L1),!.% avoid perm.
addCombination(L):- not(path(L)), 
		not(checkCombination(L)), 
		assert(path(L)).

% collapsing source with br to target 
% means that target will also be collapsed in one step

%collapse([H],H).

%collapse([H|T],R):- list_size(T,N), N >=1,
%	collapse(T,R1),
%	collapse(H,R1,R2),
%	sq_union(H,R2,R),
%	retractall(path(_)).

%collapse(G,B,R):- collapse([],G,B,R).

%collapse(_,G,B,R):-
%	collapse_one(G,B,R,_).
	
%collapse(L,G,B,R):-
%	collapse_one(G,B,C,VL),
%	concatenate(VL,L,LL),
%	addCombination(LL),
%	collapse(LL,G,C,R).
	
%collapse_one(graph(V1,E1),graph(V2,E2),graph(V,E),VL):-
%	member(V11,V1), type(V11,T),
%	member(V21,V2),	type(V21,T),
%	isMatch(V11),
%	get_br_nodes(V21,V2,E2,NodeList),
%	getPairList(NodeList,graph(V1,E1),[],Pairs),
%	switchVertices([pair(V11,V21)|Pairs],
%		graph(V2,E2),graph(V,E)),
%	findall(VK,member(pair(_,VK),Pairs),VL).

collapse([H],H).

collapse([H|T],R):- list_size(T,N), N >=1,
	collapse(T,R1),
	collapse(H,R1,R2),
	sq_union(H,R2,R).

collapse(G,B,R):-
	collapse_one(G,B,R).
	
collapse(G,B,R):-
	collapse_one(G,B,C),
	collapse(G,C,R).
	
collapse_one(graph(V1,E1),graph(V2,E2),graph(V,E)):-
	member(V11,V1), type(V11,T),
	member(V21,V2),	type(V21,T),
	isMatch(V11),
	get_br_nodes(V21,V2,E2,NodeList),
	getPairList(NodeList,graph(V1,E1),[],Pairs),
	switchVertices([pair(V11,V21)|Pairs],graph(V2,E2),graph(V,E)).


try:- 	open('graphs.pl', write, Graphs),
	findall(result(C,G),build_graphs(C,G),GL),
	list_size(GL,N),
	print(N),print(' results found.'),nl,
	print('processing results'),nl,
	property(LP),once(get_a_property(LP,match_apply(MGP,AGP))),
	sq_union(MGP,AGP,GP),	
	processResults(GP,GL,GL1),
	print('printing results'),nl,
	print_results(GL1,Graphs),
	close(Graphs).

try1:- collapse(
	[graph([mc('mprolog','Clause',id11),
		mc('mprolog','Head',id10),
		ac('Text','Block',id20),
		ac('Text','Content',id19),
		ac('Text','Content',id18)],
		[mda('ownedHead',id11,id10),
		br('_',id11,id20),
		br('_',id11,id19),
		br('_',id11,id18),
		br('_',id10,id20),
		br('_',id10,id19),
		br('_',id10,id18),
		aa('preLine',id20,id19),
		aa('next',id19,id18)]),
	graph([mc('mprolog','Functor',id3),
		ac('Text','Content',id3)],
		[br('_',id3,id3)]),
	graph([mc('mprolog','Head',id29),
		mc('mprolog','Functor',id28),
		ac('Text','Content',id42),
		ac('Text','Content',id41)],
		[mda('ownedFunctor',id29,id28),
		br('_',id29,id42),
		br('_',id29,id41),
		br('_',id28,id42),
		br('_',id28,id41),
		aa('content',id42,id41)])] 		
 		,G).


%graph([
%mc(mprolog,Clause,id6),
%mc(mprolog,Head,id5),
%mc(mprolog,Body,id4),
%mc(mprolog,Functor,id28),
%ac(Text,Block,id8),
%ac(Text,Content,id7),
%ac(Text,Content,id6),
%ac(Text,Content,id5),
%ac(Text,Content,id4),
%ac(Text,Content,id42)],
%[
%mda(ownedHead,id6,id5),
%mda(ownedBody,id6,id4),
%mda(ownedFunctor,id5,id28),
%br(_,id6,id8),
%br(_,id6,id7),
%br(_,id6,id6),
%br(_,id6,id5),
%br(_,id6,id4),
%br(_,id5,id8),
%br(_,id5,id7),
%br(_,id5,id6),
%br(_,id5,id5),
%br(_,id4,id8),
%br(_,id4,id7),
%br(_,id4,id6),
%br(_,id4,id5),
%br(_,id4,id4),
%br(_,id5,id42),
%br(_,id5,id4),
%br(_,id28,id42),
%br(_,id28,id4),
%aa(preLine,id8,id7),
%aa(next,id7,id6),
%aa(postLine,id8,id5),
%aa(next,id5,id4),
%aa(content,id42,id4)])

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

