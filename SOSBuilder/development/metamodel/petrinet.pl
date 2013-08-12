% generic predicates

:- 
	discontiguous((op/2)),
	discontiguous((sort/1)),
	discontiguous((gen/2)),
	dynamic((sort/1)),
	dynamic((gen/2)),
	dynamic((class/5)),
	['sosfundamentals'].

% from petrinet.SOS

% ADT Relatives
sort(rel).
gen(zero,rel).
gen(suc(X),rel):- gen(X,rel).
gen(pred(X),rel):- gen(X,rel).

op(flip(zero),zero).
op(flip(pred(X)),suc(R)):- 
	op(flip(X),R).
op(flip(suc(X)),pred(R)):- 
	op(flip(X),R).

op(leq(zero, zero),true).

op(leq(zero, pred(X)),false).
	
op(leq(zero, suc(X)),true).
	
op(leq(pred(X),zero),true).
	
op(leq(suc(X),zero),false).	

op(leq(suc(X), suc(Y)),R):-
	op(leq(X,Y),R).	
	
op(leq(pred(X), pred(Y)),R):- op(leq(X,Y),R).	
	
op(leq(suc(X), pred(Y)),false).	
	
op(leq(pred(X), suc(Y)),true).
	
op(plus(zero,X),X).

op(plus(X,zero),R):-
	not((X = zero)),
	op(plus(zero,X),R).

op(plus(suc(X),pred(Y)),R):-
	op(plus(X,Y),R).

op(plus(pred(X),suc(Y)),R):-
	op(plus(suc(Y),pred(X)),R).

	
op(plus(suc(X),suc(Y)),suc(suc(R))):-
	op(plus(X,Y),R).

op(plus(pred(X),pred(Y)),pred(pred(R))):-
	op(plus(X,Y),R).
	
op(minus(X,Y),R):-
	op(flip(Y),Y1),
	op(plus(X,Y1),R).
	
op(harmonypred(zero),zero).
	
op(harmonypred(suc(X)),R):-
	op(harmonypred(X),R).

op(harmonypred(pred(X)),pred(R)):-
	op(harmonypred(X),R).
	
op(harmonysuc(zero),zero).
	
op(harmonysuc(pred(X)),R):-
	op(harmonysuc(X),R).

op(harmonysuc(suc(X)),suc(R)):-
	op(harmonysuc(X),R).
	
op(harmony(X),R):-
	op(harmonysuc(X),X1),
	op(harmonypred(X),X2),
	op(plus(X1,X2),R).
	
op(hleq(X,Y),R):-
	op(harmony(X),X1),
	op(harmony(Y),Y1),
	op(hleq(X1,Y1),R).
	
op(hplus(X,Y),R):-
	op(harmony(X),X1),
	op(harmony(Y),Y1),
	op(plus(X1,Y1),R).
	
op(hminus(X,Y),R):-
	op(harmony(X),X1),
	op(harmony(Y),Y1),
	op(minus(X1,Y1),R).
	
% ADT Char
sort(char).
gen(aa,char).
gen(ab,char).
gen(ac,char).
gen(ad,char).
gen(ae,char).
gen(af,char).
gen(ag,char).
gen(ah,char).
gen(ai,char).
gen(aj,char).
gen(ak,char).
gen(al,char).
gen(am,char).
gen(an,char).
gen(ao,char).
gen(ap,char).
gen(aq,char).
gen(ar,char).
gen(as,char).
gen(at,char).
gen(av,char).
gen(aw,char).
gen(ax,char).
gen(ay,char).
gen(az,char).
gen(aA,char).
gen(aB,char).
gen(aC,char).
gen(aD,char).
gen(aE,char).
gen(aF,char).
gen(aG,char).
gen(aH,char).
gen(aI,char).
gen(aJ,char).
gen(aK,char).
gen(aL,char).
gen(aM,char).
gen(aN,char).
gen(aO,char).
gen(aP,char).
gen(aQ,char).
gen(aR,char).
gen(aS,char).
gen(aT,char).
gen(aV,char).
gen(aW,char).
gen(aX,char).
gen(aY,char).
gen(aZ,char).
gen(n0,char).
gen(n1,char).
gen(n2,char).
gen(n3,char).
gen(n4,char).
gen(n5,char).
gen(n6,char).
gen(n7,char).
gen(n8,char).
gen(n9,char).

% ADT String
sort(string).
gen(end,string).
gen(str(X,Y),string):- gen(X,char),gen(Y,string).

op(buildString(S1),str(C,R)):-
	op(member(C,S1),true),
	op(excluding(C,S1),S2),
	op(buildString(S2),R).
	
op(buildString(empty),end).

% ADT Boolean
sort(bool).
gen(true,bool).
gen(false,bool).

% ADT Tokens

sort(token).
gen(p(P,X),token):- once(class('petrinet','Place',P,_,_)), gen(X,rel).

op(pre(T),R):-
	once(class('petrinet','Transition',T,TAtt,TRels)),
	forall(p(P,RValue), (
			op(membergenModel('petrinet','Place',P,PAtt,PRels),PTrue),
			equals(PTrue,true),
			op(membergenModel('petrinet','OutArc',O,OAtt,ORels),OTrue),
			equals(OTrue,true),
			op(membergenModel(T,'outArc',O),TRelsTrue),
			equals(TRelsTrue,true),
			op(membergenModel(O,'sourcePlace',P),ORelsTrue),
			equals(ORelsTrue,true),
			member(p('weight',AValue),OAtt),
			atom_number(AValue,Value),
			iter(suc,zero,Value,RValue)),R).

op(pos(T),R):- 
	once(class('petrinet','Transition',T,TAtt,TRels)),
	forall(p(P,RValue), 
		(
			class('petrinet','Place',P,PAtt,PRels),
			class('petrinet','InArc',I,IAtt,IRels),
			member(p('inArc',I),TRels),
			member(p('targetPlace',P),IRels),
			member(p('weight',AValue),IAtt),
			atom_number(AValue,Value),
			iter(suc,zero,Value,RValue)
		),R).

op(initial,R):-
	forall(p(P,RValue),
		(
			class('petrinet','Place',P,PAtt,PRels),
			member(p('token',AValue),PAtt),
			atom_number(AValue,Value),
			iter(suc,zero,Value,RValue)
		),R).


% ADT Marking
sort(markingsort).
gen(e,markingsort).
gen(marking(T,M),markingsort):- 
	gen(T,token),gen(M,markingsort).

op(build(empty),e).

op(build(S),marking(M,R)):-
	op(member(M,S),true),
	op(excluding(M,S),S1),
	op(build(S1),R).
	
op(member(M,e),false).
	
op(member(M,marking(M,MSET)),true).

op(member(M,marking(M1,MSET)),R):- 
	not((M = M1)),
	op(member(M,MSET),R).

op(add(marking(p(P1,N1),MSET1),MSET2),
		marking(p(P1,N3), R)):-
	once(class('petrinet','Place',P1,_,_)),
	op(member(p(P1,N2),MSET2),true),
	op(hplus(N1,N2),N3),
	op(remove(p(P1,N2),MSET2),R1),
	op(add(MSET1, R1),R).


op(add(marking(p(P1,N1),MSET1),MSET2),
		marking(p(P1,N1), R)):-
	once(class('petrinet','Place',P1,_,_)),
	op(member(p(P1,N2),MSET2),false),
	op(add(MSET1, MSET2),R).

op(add(e,MSET1),MSET1).

op(subtract(marking(p(P1,N1),MSET1),MSET2),
		marking(p(P1,N3), R)):-
	once(class('petrinet','Place',P1,_,_)),
	op(member(p(P1,N2),MSET2),true),
	op(hminus(N2,N1),N3),
	op(remove(p(P1,N2),MSET2),R1),
	op(subtract(MSET1, R1),R).

op(subtract(marking(p(P1,N1),MSET1),MSET2),
		marking(p(P1,N1), R)):-
	once(class('petrinet','Place',P1,_,_)),
	op(member(p(P1,N2),MSET2),false),
	op(subtract(MSET1, MSET2),R).

op(subtract(e,MSET1),MSET1).

op(positive(e),true).

op(positive(marking(p(P1,N1),MSET1)),R):-
	once(class('petrinet','Place',P1,_,_)),
	op(leq(N1,pred(zero)),false),
	op(positive(MSET1),R).
	
op(positive(marking(p(P1,N1),MSET1)),false):-
	once(class('petrinet','Place',P1,_,_)),
	op(leq(N1,pred(zero)),true).

op(remove(M,e),e).

op(remove(M,marking(M,MSET1)),R):-
	op(remove(M,MSET1),R).
	
op(remove(M,marking(M1,MSET1)), marking(M1,R)):-
	not((M = M1)),
	op(remove(M,MSET1),R).	
	
op(equals(e,e),true).

op(equals(marking(M,MSET1),MSET2),R):-
	op(member(M,MSET2),true),
	op(remove(M,MSET2),MSET3),
	op(equals(MSET1,MSET3),R).
			
op(equals(marking(M,MSET1),MSET2),false):-
	op(member(M,MSET2),false).
	
%%%%%%%%%%%% inference rules	


rule(
	knowing(PREVTS),
	pre([
		class('petrinet','Transition',T,TAtt,TRels),
		op(pre(T),MSET5),
		op(build(MSET5),MSET2),
		op(initial,MSET4),
		op(build(MSET4),MSET3),
		op(subtract(MSET2,MSET3),MSET1),
		op(positive(MSET1),true)
	]),
	pos([
		op(initial,MSET7),
		op(build(MSET7),MSET6),
		member(p('name',Value),TAtt), atom_setchar(Value,SValue),
		op(buildString(SValue),String),
		op(pos(T),MSET11),
		op(build(MSET11),MSET9),
		op(pre(T),MSET15),
		op(build(MSET15),MSET12),
		op(initial,MSET14),
		op(build(MSET14),MSET13),
		op(subtract(MSET12,MSET13),MSET10),
		op(add(MSET9,MSET10),MSET8)
	]),
	know(ts(MSET6,String,MSET8))
).

rule(
	knowing(PREVTS),
	pre([
		op(membergen(ts(OLDMARKING,NAME,NEWMARKING),PREVTS),true),
		class('petrinet','Transition',T,TAtt,TRels),
		op(pre(T),MSET5),
		op(build(MSET5),MSET2),
		op(subtract(MSET2,NEWMARKING),MSET1),
		op(positive(MSET1),true)
	]),
	pos([
		member(p('name',Value),TAtt),atom_setchar(Value,SValue),
		op(buildString(SValue),String),
		op(pos(T),MSET11),
		op(build(MSET11),MSET9),
		op(pre(T),MSET15),
		op(build(MSET15),MSET12),
		op(subtract(MSET12,NEWMARKING),MSET10),
		op(add(MSET9,MSET10),MSET8)
	]),
	know(ts(NEWMARKING,String,MSET8))
).





