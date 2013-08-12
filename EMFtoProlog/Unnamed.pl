in([hmlTop], 'TickIntention').
in([V0, hmlNext(hmlEvent(m_tick), hmlTop)], 'TickIntention') :- 
    in([V0], 'TickIntention'), nbEvents(V0,R), integer(6),boolLT(R, 6).
in([V2, hmlNext(hmlEvent(m_mark, g_alarm), hmlTop)], 'MarkIntention') :- 
    , in([V2], 'TickIntention').



gt(X,Y):-X>Y.
lt(X,Y):-X<Y.
lte(X,Y):-
or


nat(zero).
nat(suc(V3)) :- 
    nat(V3).
sum(X, zero, zero).
sum(X, suc(Y), suc(V6)) :- 
    sum(X, Y, V6).
eq(zero, suc(X), false).
eq(suc(Y), zero, false).
eq(zero, zero, true).
eq(suc(X), suc(Y), V11) :- 
    eq(X, Y, V11).
lt(zero, suc(X), true).
lt(suc(X), zero, false).
lt(suc(X), suc(Y), V15) :- 
    lt(X, Y, V15).
bool(false).
bool(true).
neg(false, true).
neg(true, false).
list(nil).
list(cons(V18, V19)) :- 
    nat(V18), list(V19).
nbOcurr(E, cons(H, L), suc(V21)) :- 
    eq(E, H, true), nbOcurr(E, L, V21).
nbOcurr(E, cons(H, L), V24) :- 
    eq(E, H, false), nbOcurr(E, L, V24).
size(nil, zero).
size(cons(H, L), suc(V28)) :- 
    size(L, V28).
nbOcurr(E, nil, zero).
