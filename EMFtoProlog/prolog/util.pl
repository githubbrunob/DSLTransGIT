
% auxiliary lists
list_size([],0).
list_size([_|T],Totalsize):- 
	list_size(T,Tsize), Totalsize is Tsize+1.

concatenate([],L1, L1).
	
concatenate([H1|L1], L2, [H1|L1L2]):-
	concatenate(L1, L2, L1L2).
	
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