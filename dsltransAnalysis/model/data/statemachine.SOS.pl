:- dynamic(gendef/1), dynamic(op/2),
   dynamic(opdef/1), dynamic(rule/4).  
:- retractall(gendef(_)), retractall(op(_,_)),
   retractall(opdef(_)), retractall(rule(_,_,_,_)).

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
op(buildString(Xs1), str(Xc, Id1)) :- 
    (callReverseList([equals(Id2, true), opFundamental(member(Xc, Xs1), Id2)])), callReverseList([op(buildString(Id0), Id1), opFundamental(excluding(Xc, Xs1), Id0)]).
op(buildString(empty), end) :- 
    callReverseList([]).
opdef(buildString).
gendef(end).
gendef(str).
gendef(true).
gendef(false).
op(equals(Xx1, Xx1), true) :- 
    callReverseList([]).
op(equals(Xx1, Xy1), false) :- 
    (callReverseList([not(equals(Xx1, Xy1))])), callReverseList([]).
opdef(equals).
gendef(state).
gendef(initial).
rule(
	knowing(Id10), 
	pre([
		(callReverseList([
			equals(Id9, true), 
			opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id9)
		])), 
		(callReverseList([
			equals(Id8, true), 
			opFundamental(membergenModel('statemachine', 'Initial', Xi, Att_Xi, Rel_Xi), Id8)
		])), 
		(callReverseList([
			equals(Id7, true), 
			opFundamental(membergenModel('statemachine', 'State', Xs0, Att_Xs0, Rel_Xs0), Id7)
		])), 
		(callReverseList([
			equals(Id6, true), 
			opFundamental(membergenModel(Xt, 'source', Xi), Id6)
		])), 
		(callReverseList([
			equals(Id5, true), 
			opFundamental(membergenModel(Xt, 'target', Xs0), Id5)
		]))
	]), 
	pos([
		(callReverseList([])), 
		(callReverseList([
			op(buildString(Id3), Id4), 
			opFundamental(memberattModel(Xt, 'name'), Id3)
		])), 
		(callReverseList([]))]), 
	know(ts(initial(Xi), p(Id4,[Xt]), state(Xs0)))
).
rule(knowing(Id18), pre([(callReverseList([equals(Id17, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id17)])), (callReverseList([equals(Id16, true), opFundamental(membergenModel('statemachine', 'Initial', Xi, Att_Xi, Rel_Xi), Id16)])), (callReverseList([equals(Id15, true), opFundamental(membergenModel('statemachine', 'Initial', Xs0, Att_Xs0, Rel_Xs0), Id15)])), (callReverseList([equals(Id14, true), opFundamental(membergenModel(Xt, 'source', Xi), Id14)])), (callReverseList([equals(Id13, true), opFundamental(membergenModel(Xt, 'target', Xs0), Id13)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id11), Id12), opFundamental(memberattModel(Xt, 'name'), Id11)])), (callReverseList([]))]), know(ts(initial(Xi), p(Id12,[Xt]), initial(Xs0)))).
rule(
	knowing(Id26), 
	pre([
		(opFundamental(membergen(ts(state(Xs0), p(XnameX,_), state(Xs1)), Id26), true)), 
		(callReverseList([
					equals(Id25, true), 
					opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id25)
				])), 
		(callReverseList([
					equals(Id24, true), 
					opFundamental(membergenModel('statemachine', 'State', Xs1, Att_Xs1, Rel_Xs1), Id24)
				])), 
		(callReverseList([
					equals(Id23, true), 
					opFundamental(membergenModel('statemachine', 'State', Xs2, Att_Xs2, Rel_Xs2), Id23)
				])), 
		(callReverseList([
					equals(Id22, true), 
					opFundamental(membergenModel(Xt, 'source', Xs1), Id22)
				])), 
		(callReverseList([
					equals(Id21, true), 
					opFundamental(membergenModel(Xt, 'target', Xs2), Id21)]))
		]), 
	pos([
		(callReverseList([])), 
		(callReverseList([
					op(buildString(Id19), Id20), 
					opFundamental(memberattModel(Xt, 'name'), Id19)
		])), 
		(callReverseList([]))
	]), 
	know(ts(state(Xs1), p(Id20,[Xt]), state(Xs2)))).

rule(knowing(Id34), pre([(opFundamental(membergen(ts(initial(Xs0), p(XnameX,_), state(Xs1)), Id34), true)), (callReverseList([equals(Id33, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id33)])), (callReverseList([equals(Id32, true), opFundamental(membergenModel('statemachine', 'State', Xs1, Att_Xs1, Rel_Xs1), Id32)])), (callReverseList([equals(Id31, true), opFundamental(membergenModel('statemachine', 'State', Xs2, Att_Xs2, Rel_Xs2), Id31)])), (callReverseList([equals(Id30, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id30)])), (callReverseList([equals(Id29, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id29)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id27), Id28), opFundamental(memberattModel(Xt, 'name'), Id27)])), (callReverseList([]))]), know(ts(state(Xs1), p(Id28,[Xt]), state(Xs2)))).
rule(knowing(Id42), pre([(opFundamental(membergen(ts(state(Xs0), p(XnameX,_), initial(Xs1)), Id42), true)), (callReverseList([equals(Id41, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id41)])), (callReverseList([equals(Id40, true), opFundamental(membergenModel('statemachine', 'Initial', Xs1, Att_Xs1, Rel_Xs1), Id40)])), (callReverseList([equals(Id39, true), opFundamental(membergenModel('statemachine', 'State', Xs2, Att_Xs2, Rel_Xs2), Id39)])), (callReverseList([equals(Id38, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id38)])), (callReverseList([equals(Id37, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id37)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id35), Id36), opFundamental(memberattModel(Xt, 'name'), Id35)])), (callReverseList([]))]), know(ts(initial(Xs1), p(Id36,[Xt]), state(Xs2)))).
rule(knowing(Id50), pre([(opFundamental(membergen(ts(state(Xs0), p(XnameX,_), state(Xs1)), Id50), true)), (callReverseList([equals(Id49, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id49)])), (callReverseList([equals(Id48, true), opFundamental(membergenModel('statemachine', 'State', Xs1, Att_Xs1, Rel_Xs1), Id48)])), (callReverseList([equals(Id47, true), opFundamental(membergenModel('statemachine', 'Initial', Xs2, Att_Xs2, Rel_Xs2), Id47)])), (callReverseList([equals(Id46, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id46)])), (callReverseList([equals(Id45, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id45)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id43), Id44), opFundamental(memberattModel(Xt, 'name'), Id43)])), (callReverseList([]))]), know(ts(state(Xs1), p(Id44,[Xt]), initial(Xs2)))).
rule(knowing(Id58), pre([(opFundamental(membergen(ts(initial(Xs0), p(XnameX,_), initial(Xs1)), Id58), true)), (callReverseList([equals(Id57, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id57)])), (callReverseList([equals(Id56, true), opFundamental(membergenModel('statemachine', 'Initial', Xs1, Att_Xs1, Rel_Xs1), Id56)])), (callReverseList([equals(Id55, true), opFundamental(membergenModel('statemachine', 'State', Xs2, Att_Xs2, Rel_Xs2), Id55)])), (callReverseList([equals(Id54, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id54)])), (callReverseList([equals(Id53, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id53)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id51), Id52), opFundamental(memberattModel(Xt, 'name'), Id51)])), (callReverseList([]))]), know(ts(initial(Xs1), p(Id52,[Xt]), state(Xs2)))).
rule(knowing(Id66), pre([(opFundamental(membergen(ts(initial(Xs0), p(XnameX,_), state(Xs1)), Id66), true)), (callReverseList([equals(Id65, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id65)])), (callReverseList([equals(Id64, true), opFundamental(membergenModel('statemachine', 'State', Xs1, Att_Xs1, Rel_Xs1), Id64)])), (callReverseList([equals(Id63, true), opFundamental(membergenModel('statemachine', 'Initial', Xs2, Att_Xs2, Rel_Xs2), Id63)])), (callReverseList([equals(Id62, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id62)])), (callReverseList([equals(Id61, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id61)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id59), Id60), opFundamental(memberattModel(Xt, 'name'), Id59)])), (callReverseList([]))]), know(ts(state(Xs1), p(Id60,[Xt]), initial(Xs2)))).
rule(knowing(Id74), pre([(opFundamental(membergen(ts(state(Xs0), p(XnameX,_), initial(Xs1)), Id74), true)), (callReverseList([equals(Id73, true), opFundamental(membergenModel('statemachine', 'Transition', Xt, Att_Xt, Rel_Xt), Id73)])), (callReverseList([equals(Id72, true), opFundamental(membergenModel('statemachine', 'Initial', Xs1, Att_Xs1, Rel_Xs1), Id72)])), (callReverseList([equals(Id71, true), opFundamental(membergenModel('statemachine', 'Initial', Xs2, Att_Xs2, Rel_Xs2), Id71)])), (callReverseList([equals(Id70, true), opFundamental(membergenModel(Xt, 'source', Xs1), Id70)])), (callReverseList([equals(Id69, true), opFundamental(membergenModel(Xt, 'target', Xs2), Id69)]))]), pos([(callReverseList([])), (callReverseList([op(buildString(Id67), Id68), opFundamental(memberattModel(Xt, 'name'), Id67)])), (callReverseList([]))]), know(ts(initial(Xs1), p(Id68,[Xt]), initial(Xs2)))).
