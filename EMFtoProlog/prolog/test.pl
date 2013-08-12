a(1).
a(2).
a(X):-a(X,1).
a(X,Y):-a(X), a(Y).

nat(zero).
nat(suc(X)):-nat(X).
eq(zero, zero,true).
eq(suc(X),zero, false).
eq(zero, suc(X), false).
eq(suc(X), suc(Y),R):-eq(X,Y,R).

plus(X, zero, X).
plus(suc(X), suc(Y), suc(F)):-plus(suc(X), Y,F).
sum(X,zero, X).
sum(X,suc(Y), suc(R)):-sum(X,Y,R).
mul(_,zero,zero).
mul(X,suc(Y),R2):- mul(X,Y, R1), sum(R1,X, R2).
sub(X,zero,X).
sub(suc(X),suc(Y),R ):-sub(X,Y,R).


list(nil).
list(cons(H,L)):-nat(H), list(L).
size(nil, zero).
size(cons(H,L), suc(R)):-size(L,R).
insert(E, L, cons(E,L)). 
nbOcurrences(E,nil,zero).
nbOcurrences(E,cons(H,L), R):-eq(E,H,false), nbOcurrences(E,L,R).
nbOcurrences(E,cons(H,L), suc(R)):-eq(E,H,true), nbOcurrences(E,L,R).

tree(node(nil, E, nil)):-nat(E).
tree(node(L,E,R)):- tree(L), nat(E),tree(R).


%sumintern([X|T],R):-sum(T,R1), plus(X,R1,R).