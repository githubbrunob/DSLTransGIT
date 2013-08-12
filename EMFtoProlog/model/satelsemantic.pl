%Condition Atoms
nbEvents([],0).
nbEvents([event(_,_)| T], N):-nbEvents(T,N1), N is N1+1,!.
nbEvents([_,T],N):-nbEvents(T,N).

boolNot(true, false).
boolNot(false, true).
boolEquals(A,B,true):-A=:=B.
boolEquals(A,B,false):-A=/=B.
boolNotEquals(A,B,true):-A=/=B.
boolNotEquals(A,B,false):-A=:=B.
boolGT(A,B,true):-A#>B,!.
boolGT(A,B,false).
boolLT(A,B,true):-A#<B,!.
boolGT(A,B,false).
