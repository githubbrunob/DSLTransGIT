%booleanterms
boolNot(true,false).
boolNot(false,true).
boolSequence([],true).
boolSequence([top|L],R):-boolSequence(L,R).
boolSequence([hmlNot(A)|L],true):-boolSequence(A,true), boolSequence(L,true),!.
boolSequence([hmlNot(A)|L],false).
boolSequence([hmlAnd(P1,P2)|L],false).
boolSequence([hmlNext(E,N)|L],true):-boolSequence(N,true), boolSequence(true),!.
boolSequence([hmlNext(E,N)|L],false).
boolPositive([],true).
boolPositive([top|L],R):-boolPositive(L,R).
boolPositive([hmlNot(A)|L],false).
boolPositive([hmlAnd(P1,P2)|L],true):-boolPositive(P1,true), boolPositive(P2,true), boolPositive(L,true),!.
boolPositive([hmlAnd(P1,P2)|L],false).
boolPositive([hmlNext(E,N)|L],true):-boolPositive(N,true), boolPositive(L,true),!.
boolPositive([hmlNext(E,N)|L],false).
trace(P,true):-boolPositive(P,true), boolSequence(P,true),!.
trace(P,false).
boolAnd(true,true,true):-!.
boolAnd(_,_,false).
boolOr(X,Y):-X,!.
boolOr(X,Y):-Y.
boolEquals(X,X,true):-!.
boolEquals(X,Y,false).
boolNotEquals(X,X,false):-!.
boolNotEquals(X,Y,true).
boolGT(X,Y,true):-X>Y,!.
boolGT(X,Y,false).
boolLT(X,Y,true):-X<Y,!.
boolLT(X,Y,false).
boolLTE(X,Y,true):-X=<Y,!.
boolLTE(X,Y,false).
boolGTE(X,Y,true):-X>=Y,!.
boolGTE(X,Y,false).
boolVariable(X,X).
boolValue(X,X).
%arithmeticterms
bopPlus(X,Y,R):-R is X + Y.
bopMinus(X,Y,R):-R is X-Y.
bopDiv(X,Y,R):-R is div(X,Y).
bopTimes(X,Y,R):-R is X*Y.
nbEvents([],0).
nbEvents([top|L],R):-nbEvents(L,R).
nbEvents([hmlNot(A)|L],R):-nbEvents(A,R).
nbEvents([hmlAnd(P1,P2)|L],R):-nbEvents(P1,R1), nbEvents(P2,R2), R is R1+R2.
nbEvents([hmlNext(E,N)|L],R):-nbEvents(N,R1),R is 1+R1. %synchronizations
depth([],0).
depth([top|L],R):-depth(L,R).
depth([hmlNot(A)|L],R):-depth(A,R).
depth([hmlAnd(P1,P2)|L],R):-depth(P1,R1), depth(P2,R2), R is max(R1,R2).
depth([hmlNext(E,N)|L],R):-depth(N,R1),R is 1+R1. 
uopMinus(X,R):-R is -1*X.
integerValue(R,R).
integerVariable(K,K).

boolAnd(A,B):-bool(A,B,true).
