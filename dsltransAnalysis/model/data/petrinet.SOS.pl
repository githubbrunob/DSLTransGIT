:- dynamic(gendef/1), dynamic(op/2),
   dynamic(opdef/1), dynamic(rule/4).  
:- retractall(gendef(_)), retractall(op(_,_)),
   retractall(opdef(_)), retractall(rule(_,_,_,_)).

op(flip(zero), zero) :- 
    callReverseList([]).
op(flip(pred(Xx)), suc(Id0)) :- 
    callReverseList([op(flip(Xx), Id0)]).
op(flip(suc(Xx)), pred(Id1)) :- 
    callReverseList([op(flip(Xx), Id1)]).
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
op(leq(suc(Xx), suc(Xy)), Id2) :- 
    callReverseList([op(leq(Xx, Xy), Id2)]).
op(leq(pred(Xx), pred(Xy)), Id3) :- 
    callReverseList([op(leq(Xx, Xy), Id3)]).
op(leq(suc(Xx), pred(Xy)), false) :- 
    callReverseList([]).
op(leq(pred(Xx), suc(Xy)), true) :- 
    callReverseList([]).
op(plus(zero, Xx), Xx) :- 
    callReverseList([]).
op(plus(Xx, zero), Id4) :- 
    (callReverseList([not(equals(Xx, zero))])), callReverseList([op(plus(zero, Xx), Id4)]).
op(plus(suc(Xx), pred(Xy)), Id5) :- 
    callReverseList([op(plus(Xx, Xy), Id5)]).
op(plus(pred(Xx), suc(Xy)), Id6) :- 
    callReverseList([op(plus(pred(Xx), suc(Xy)), Id6)]).
op(plus(suc(Xx), suc(Xy)), suc(suc(Id7))) :- 
    callReverseList([op(plus(Xx, Xy), Id7)]).
op(plus(pred(Xx), pred(Xy)), pred(pred(Id8))) :- 
    callReverseList([op(plus(Xx, Xy), Id8)]).
op(minus(Xx, Xy), Id10) :- 
    callReverseList([op(plus(Xx, Id9), Id10), op(flip(Xy), Id9)]).
op(harmonypred(zero), zero) :- 
    callReverseList([]).
op(harmonypred(suc(Xx)), Id11) :- 
    callReverseList([op(harmonypred(Xx), Id11)]).
op(harmonypred(pred(Xx)), pred(Id12)) :- 
    callReverseList([op(harmonypred(Xx), Id12)]).
op(harmonysuc(zero), zero) :- 
    callReverseList([]).
op(harmonysuc(pred(Xx)), Id13) :- 
    callReverseList([op(harmonysuc(Xx), Id13)]).
op(harmonysuc(suc(Xx)), suc(Id14)) :- 
    callReverseList([op(harmonysuc(Xx), Id14)]).
op(harmony(Xx), Id17) :- 
    callReverseList([op(plus(Id16, Id15), Id17), op(harmonysuc(Xx), Id16), op(harmonypred(Xx), Id15)]).
op(hleq(Xx, Xy), Id20) :- 
    callReverseList([op(leq(Id19, Id18), Id20), op(harmony(Xx), Id19), op(harmony(Xy), Id18)]).
op(hplus(Xx, Xy), Id23) :- 
    callReverseList([op(plus(Id22, Id21), Id23), op(harmony(Xx), Id22), op(harmony(Xy), Id21)]).
op(hminus(Xx, Xy), Id26) :- 
    callReverseList([op(minus(Id25, Id24), Id26), op(harmony(Xx), Id25), op(harmony(Xy), Id24)]).
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
op(buildString(Xs1), str(Xc, Id28)) :- 
    (callReverseList([equals(Id29, true), opFundamental(member(Xc, Xs1), Id29)])), callReverseList([op(buildString(Id27), Id28), opFundamental(excluding(Xc, Xs1), Id27)]).
op(buildString(empty), end) :- 
    callReverseList([]).
opdef(buildString).
gendef(end).
gendef(str).
gendef(true).
gendef(false).
op(pre(Xt), Id30) :- 
    once(class('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt)), callReverseList([forall((p(Xp1, Id32)), ((callReverseList([equals(Id36, true), opFundamental(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), Id36)])), (callReverseList([equals(Id35, true), opFundamental(membergenModel('petrinet', 'OutArc', Xoutarc, Att_Xoutarc, Rel_Xoutarc), Id35)])), (callReverseList([equals(Id34, true), opFundamental(membergenModel(Xt, 'outArc', Xoutarc), Id34)])), (callReverseList([equals(Id33, true), opFundamental(membergenModel(Xoutarc, 'sourcePlace', Xp1), Id33)])), callReverseList([iter(suc, (zero), (Id31), Id32), opFundamental(memberattModel(Xoutarc, 'weight'), Id31)])), Id30)]).
op(pos(Xt), Id37) :- 
    once(class('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt)), callReverseList([forall((p(Xp1, Id39)), ((callReverseList([equals(Id43, true), opFundamental(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), Id43)])), (callReverseList([equals(Id42, true), opFundamental(membergenModel('petrinet', 'InArc', Xinarc, Att_Xinarc, Rel_Xinarc), Id42)])), (callReverseList([equals(Id41, true), opFundamental(membergenModel(Xt, 'inArc', Xinarc), Id41)])), (callReverseList([equals(Id40, true), opFundamental(membergenModel(Xinarc, 'targetPlace', Xp1), Id40)])), callReverseList([iter(suc, (zero), (Id38), Id39), opFundamental(memberattModel(Xinarc, 'weight'), Id38)])), Id37)]).
op(initial, Id44) :- 
    callReverseList([forall((p(Xp1, Id46)), ((callReverseList([equals(Id47, true), opFundamental(membergenModel('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1), Id47)])), callReverseList([iter(suc, (zero), (Id45), Id46), opFundamental(memberattModel(Xp1, 'token'), Id45)])), Id44)]).
opdef(test).
opdef(pre).
opdef(pos).
opdef(initial).
gendef(p).
op(build(Xs), marking(Xm, Id49)) :- 
    (callReverseList([equals(Id50, true), opFundamental(member(Xm, Xs), Id50)])), callReverseList([op(build(Id48), Id49), opFundamental(excluding(Xm, Xs), Id48)]).
op(build(empty), e) :- 
    callReverseList([]).
op(member(Xm, e), false) :- 
    callReverseList([]).
op(member(Xm, marking(Xm, Xmark1)), true) :- 
    callReverseList([]).
op(member(Xm, marking(Xm1, Xmark1)), Id51) :- 
    (callReverseList([not(equals(Xm, Xm1))])), callReverseList([op(member(Xm, Xmark1), Id51)]).
op(add(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Id54), Id53)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id55, true), op(member(p(Xp1, Xn2), Xmark2), Id55)])), callReverseList([op(plus(Xn1, Xn2), Id54), op(add(Xmark1, Id52), Id53), op(remove(p(Xp1, Xn2), Xmark2), Id52)]).
op(add(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Xn1), Id56)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id57, false), op(member(p(Xp1, Xn2), Xmark2), Id57)])), callReverseList([op(add(Xmark1, Xmark2), Id56)]).
op(add(e, Xmark1), Xmark1) :- 
    callReverseList([]).
op(subtract(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Id60), Id59)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id61, true), op(member(p(Xp1, Xn2), Xmark2), Id61)])), callReverseList([op(minus(Xn2, Xn1), Id60), op(subtract(Xmark1, Id58), Id59), op(remove(p(Xp1, Xn2), Xmark2), Id58)]).
op(subtract(marking(p(Xp1, Xn1), Xmark1), Xmark2), marking(p(Xp1, Xn1), Id62)) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id63, false), op(member(p(Xp1, Xn2), Xmark2), Id63)])), callReverseList([op(subtract(Xmark1, Xmark2), Id62)]).
op(subtract(e, Xmark1), Xmark1) :- 
    callReverseList([]).
op(positive(e), true) :- 
    callReverseList([]).
op(positive(marking(p(Xp1, Xn1), Xmark1)), Id64) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id65, false), op(leq(Xn1, pred(zero)), Id65)])), callReverseList([op(positive(Xmark1), Id64)]).
op(positive(marking(p(Xp1, Xn1), Xmark1)), false) :- 
    once(class('petrinet', 'Place', Xp1, Att_Xp1, Rel_Xp1)), (callReverseList([equals(Id66, true), op(leq(Xn1, pred(zero)), Id66)])), callReverseList([]).
op(remove(Xm, e), e) :- 
    callReverseList([]).
op(remove(Xm, marking(Xm, Xmark1)), Id67) :- 
    callReverseList([op(remove(Xm, Xmark1), Id67)]).
op(remove(Xm, marking(Xm1, Xmark1)), marking(Xm1, Id68)) :- 
    (callReverseList([not(equals(Xm, Xm1))])), callReverseList([op(remove(Xm, Xmark1), Id68)]).
op(equals(e, e), true) :- 
    callReverseList([]).
op(equals(marking(Xm, Xmark1), Xmark2), Id70) :- 
    (callReverseList([equals(Id71, true), op(member(Xm, Xmark2), Id71)])), callReverseList([op(equals(Xmark1, Id69), Id70), op(remove(Xm, Xmark2), Id69)]).
op(equals(marking(Xm, Xmark1), Xmark2), false) :- 
    (callReverseList([equals(Id72, false), op(member(Xm, Xmark2), Id72)])), callReverseList([]).
opdef(build).
opdef(subtract).
opdef(add).
opdef(positive).
opdef(member).
opdef(remove).
opdef(equals).
gendef(e).
gendef(marking).
rule(knowing(Id92), pre([(callReverseList([equals(Id91, true), opFundamental(membergenModel('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt), Id91)])), (callReverseList([equals(Id90, true), op(positive(Id89), Id90), op(subtract(Id88, Id86), Id89), op(build(Id87), Id88), op(pre(Xt), Id87), op(build(Id85), Id86), op(initial, Id85)]))]), pos([(callReverseList([op(build(Id83), Id84), op(initial, Id83)])), (callReverseList([op(buildString(Id81), Id82), opFundamental(memberattModel(Xt, 'name'), Id81)])), (callReverseList([op(add(Id79, Id77), Id80), op(build(Id78), Id79), op(pos(Xt), Id78), op(subtract(Id76, Id74), Id77), op(build(Id75), Id76), op(pre(Xt), Id75), op(build(Id73), Id74), op(initial, Id73)]))]), know(ts(Id84, p(Id82,[Xt]), Id80))).
rule(knowing(Id106), pre([(opFundamental(membergen(ts(Xoldmarking, p(XnameX,_), Xnewmarking), Id106), true)), (callReverseList([equals(Id105, true), opFundamental(membergenModel('petrinet', 'Transition', Xt, Att_Xt, Rel_Xt), Id105)])), (callReverseList([equals(Id104, true), op(positive(Id103), Id104), op(subtract(Id102, Xnewmarking), Id103), op(build(Id101), Id102), op(pre(Xt), Id101)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id99), Id100), opFundamental(memberattModel(Xt, 'name'), Id99)])), (callReverseList([op(add(Id97, Id95), Id98), op(build(Id96), Id97), op(pos(Xt), Id96), op(subtract(Id94, Xnewmarking), Id95), op(build(Id93), Id94), op(pre(Xt), Id93)]))]), know(ts(Xnewmarking, p(Id100,[Xt]), Id98))).
