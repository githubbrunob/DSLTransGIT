op(flip(zero), zero) :- 
    callReverseList([]).
op(flip(pred(Xx)), suc(#OPRES#)) :- 
    callReverseList([op(flip(Xx), #OPRES#)]).
op(flip(suc(Xx)), pred(#OPRES#)) :- 
    callReverseList([op(flip(Xx), #OPRES#)]).
op(leq(zero, zero), true) :- 
    callReverseList([]).
op(leq(zero, pred(Xx)), false) :- 
    callReverseList([]).
op(leq(zero, suc(Xx)), true) :- 
    callReverseList([]).
op(leq(pred(Xx), zero), true) :- 
    callReverseList([]).
op(leq(suc(Xx), zero), false) :- 
    callReverseList([]).
op(leq(suc(Xx), suc(Xy)), #OPRES#) :- 
    callReverseList([op(leq(Xx, Xy), #OPRES#)]).
op(leq(pred(Xx), pred(Xy)), #OPRES#) :- 
    callReverseList([op(leq(Xx, Xy), #OPRES#)]).
op(leq(suc(Xx), pred(Xy)), false) :- 
    callReverseList([]).
op(leq(pred(Xx), suc(Xy)), true) :- 
    callReverseList([]).
op(plus(zero, Xx), Xx) :- 
    callReverseList([]).
op(plus(Xx, zero), #OPRES#) :- 
    (callReverseList([not(equals(Xx, zero))])), callReverseList([op(plus(zero, Xx), #OPRES#)]).
op(plus(suc(Xx), pred(Xy)), #OPRES#) :- 
    callReverseList([op(plus(Xx, Xy), #OPRES#)]).
op(plus(pred(Xx), suc(Xy)), #OPRES#) :- 
    callReverseList([op(plus(pred(Xx), suc(Xy)), #OPRES#)]).
op(plus(suc(Xx), suc(Xy)), suc(suc(#OPRES#))) :- 
    callReverseList([op(plus(Xx, Xy), #OPRES#)]).
op(plus(pred(Xx), pred(Xy)), pred(pred(#OPRES#))) :- 
    callReverseList([op(plus(Xx, Xy), #OPRES#)]).
op(minus(Xx, Xy), #OPRES#) :- 
    callReverseList([op(plus(Xx, #OPRES#), #OPRES#), op(flip(Xy), #OPRES#)]).
op(harmonypred(zero), zero) :- 
    callReverseList([]).
op(harmonypred(suc(Xx)), #OPRES#) :- 
    callReverseList([op(harmonypred(Xx), #OPRES#)]).
op(harmonypred(pred(Xx)), pred(#OPRES#)) :- 
    callReverseList([op(harmonypred(Xx), #OPRES#)]).
op(harmonysuc(zero), zero) :- 
    callReverseList([]).
op(harmonysuc(pred(Xx)), #OPRES#) :- 
    callReverseList([op(harmonysuc(Xx), #OPRES#)]).
op(harmonysuc(suc(Xx)), suc(#OPRES#)) :- 
    callReverseList([op(harmonysuc(Xx), #OPRES#)]).
op(harmony(Xx), #OPRES#) :- 
    callReverseList([op(plus(#OPRES#, #OPRES#), #OPRES#), op(harmonysuc(Xx), #OPRES#), op(harmonypred(Xx), #OPRES#)]).
op(hleq(Xx, Xy), #OPRES#) :- 
    callReverseList([op(leq(#OPRES#, #OPRES#), #OPRES#), op(harmony(Xx), #OPRES#), op(harmony(Xy), #OPRES#)]).
op(hplus(Xx, Xy), #OPRES#) :- 
    callReverseList([op(plus(#OPRES#, #OPRES#), #OPRES#), op(harmony(Xx), #OPRES#), op(harmony(Xy), #OPRES#)]).
op(hminus(Xx, Xy), #OPRES#) :- 
    callReverseList([op(minus(#OPRES#, #OPRES#), #OPRES#), op(harmony(Xx), #OPRES#), op(harmony(Xy), #OPRES#)]).
opdef(hplus).
opdef(hminus).
opdef(hleq).
opdef(plus).
opdef(minus).
opdef(leq).
opdef(flip).
opdef(harmonypred).
opdef(harmonysuc).
opdef(harmony).
gendef(zero).
gendef(suc).
gendef(pred).
gendef(aa).
gendef(ab).
gendef(ac).
gendef(ad).
gendef(ae).
gendef(af).
gendef(ag).
gendef(ah).
gendef(ai).
gendef(aj).
gendef(ak).
gendef(al).
gendef(am).
gendef(an).
gendef(ao).
gendef(ap).
gendef(aq).
gendef(ar).
gendef(as).
gendef(at).
gendef(au).
gendef(av).
gendef(aw).
gendef(ax).
gendef(ay).
gendef(az).
gendef(aA).
gendef(aB).
gendef(aC).
gendef(aD).
gendef(aE).
gendef(aF).
gendef(aG).
gendef(aH).
gendef(aI).
gendef(aJ).
gendef(aK).
gendef(aL).
gendef(aM).
gendef(aN).
gendef(aO).
gendef(aP).
gendef(aQ).
gendef(aR).
gendef(aS).
gendef(aT).
gendef(aU).
gendef(aV).
gendef(aW).
gendef(aX).
gendef(aY).
gendef(aZ).
gendef(n0).
gendef(n1).
gendef(n2).
gendef(n3).
gendef(n4).
gendef(n5).
gendef(n6).
gendef(n7).
gendef(n8).
gendef(n9).
op(buildString(Xs1), str(Xc, #OPRES#)) :- 
    (callReverseList([equals])), callReverseList([op(buildString, #OPRES#)]).
op(buildString(empty), end) :- 
    callReverseList([]).
opdef(buildString).
gendef(end).
gendef(str).
gendef(true).
gendef(false).
op(pre(Xt), #OPRES#) :- 
    once(class('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt)), callReverseList([forall(, ((callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)]))), #OPRES#), op(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), #OPRES#), op(membergenModel('petrinet', 'OutArc', Xoutarc, Att_Xoutarc, Rel_Xoutarc), #OPRES#), op(membergenModel(t, 'outArc', outarc), #OPRES#), op(membergenModel(outarc, 'sourcePlace', p1), #OPRES#)]).
op(pos(Xt), #OPRES#) :- 
    once(class('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt)), callReverseList([forall(, ((callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)])), (callReverseList([equals(#OPRES#, true)]))), #OPRES#), op(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), #OPRES#), op(membergenModel('petrinet', 'InArc', Xinarc, Att_Xinarc, Rel_Xinarc), #OPRES#), op(membergenModel(t, 'inArc', inarc), #OPRES#), op(membergenModel(inarc, 'targetPlace', p1), #OPRES#)]).
op(initial, #OPRES#) :- 
    callReverseList([forall(, ((callReverseList([equals(#OPRES#, true)]))), #OPRES#), op(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), #OPRES#)]).
opdef(pre).
opdef(pos).
opdef(initial).
gendef(p).
op(build(Xs), marking(Xm, #OPRES#)) :- 
    (callReverseList([equals])), callReverseList([op(build, #OPRES#)]).
op(build(empty), e) :- 
    callReverseList([]).
op(member(Xm, e), false) :- 
    callReverseList([]).
op(member(Xm, marking(Xm, Xmark1)), true) :- 
    callReverseList([]).
op(member(Xm, marking(Xm1, Xmark1)), #OPRES#) :- 
    (callReverseList([not(equals(Xm, Xm1))])), callReverseList([op(member(Xm, Xmark1), #OPRES#)]).
op(add(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, #OPRES#), #OPRES#)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, true), op(member(p(Xp1, Xn2), Xmark2), #OPRES#)])), callReverseList([op(plus(Xn1, Xn2), #OPRES#), op(add(Xmark1, #OPRES#), #OPRES#), op(remove(p(Xp1, Xn2), Xmark2), #OPRES#)]).
op(add(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Xn1), #OPRES#)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, false), op(member(p(Xp1, Xn2), Xmark2), #OPRES#)])), callReverseList([op(add(Xmark1, Xmark2), #OPRES#)]).
op(add(e, Xmark1), Xmark1) :- 
    callReverseList([]).
op(subtract(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, #OPRES#), #OPRES#)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, true), op(member(p(Xp1, Xn2), Xmark2), #OPRES#)])), callReverseList([op(minus(Xn2, Xn1), #OPRES#), op(subtract(Xmark1, #OPRES#), #OPRES#), op(remove(p(Xp1, Xn2), Xmark2), #OPRES#)]).
op(subtract(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Xn1), #OPRES#)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, false), op(member(p(Xp1, Xn2), Xmark2), #OPRES#)])), callReverseList([op(subtract(Xmark1, Xmark2), #OPRES#)]).
op(subtract(e, Xmark1), Xmark1) :- 
    callReverseList([]).
op(positive(e), true) :- 
    callReverseList([]).
op(positive(marking(p(Xp1, Xn1), Xmark1)), #OPRES#) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, false), op(leq(Xn1, pred(zero)), #OPRES#)])), callReverseList([op(positive(Xmark1), #OPRES#)]).
op(positive(marking(p(Xp1, Xn1), Xmark1)), false) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(#OPRES#, true), op(leq(Xn1, pred(zero)), #OPRES#)])), callReverseList([]).
op(remove(Xm, e), e) :- 
    callReverseList([]).
op(remove(Xm, marking(Xm, Xmark1)), #OPRES#) :- 
    callReverseList([op(remove(Xm, Xmark1), #OPRES#)]).
op(remove(Xm, marking(Xm1, Xmark1)), marking(Xm1, #OPRES#)) :- 
    (callReverseList([not(equals(Xm, Xm1))])), callReverseList([op(remove(Xm, Xmark1), #OPRES#)]).
op(equals(e, e), true) :- 
    callReverseList([]).
op(equals(marking(Xm, Xmark1), Xmark2), #OPRES#) :- 
    (callReverseList([equals(#OPRES#, true), op(member(Xm, Xmark2), #OPRES#)])), callReverseList([op(equals(Xmark1, #OPRES#), #OPRES#), op(remove(Xm, Xmark2), #OPRES#)]).
op(equals(marking(Xm, Xmark1), Xmark2), false) :- 
    (callReverseList([equals(#OPRES#, false), op(member(Xm, Xmark2), #OPRES#)])), callReverseList([]).
opdef(build).
opdef(subtract).
opdef(add).
opdef(positive).
opdef(member).
opdef(remove).
opdef(equals).
gendef(e).
gendef(marking).
