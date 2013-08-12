% resources
:- [util].

% spec
spec([
	clause(head(a('a1')),body(true)),
	clause(head(a('a2')),body(true)),
	clause(head(a('a3')),body(true)),
	clause(head( a(@(x),@(y)) ),%:-
		body( a(@(x)), a(@(y)) )),
	clause(head(b(b1)),body(true)),
	clause(head(b(b2)),body(true)),
	clause(head(b(b3)),body(true))
]).





% lemma
compatible(clause(head(H),_),Q):-
	H =.. [F|ArgsH], list_size(ArgsH,SizeArgs),
     	Q =.. [F|ArgsQ], list_size(ArgsQ,SizeArgs).

eval(spec([]),_,plan([])).

eval(spec([C | Tclause]), Q, plan([C | Tplan])):-
	compatible(C,Q),
	eval(spec(Tclause),Q,plan(Tplan)).
	
eval(spec([C | Tclause]), Q, plan(Tplan)):-
	not(compatible(C,Q)),
	eval(spec(Tclause),Q,plan(Tplan)).	


try(H):- spec(X),eval(spec(X),a(@(x)), plan(P)), member(H,P).



nat(zero).
nat(suc(X)):-nat(X), nat(Y).


[nat(zero), nat(suc(X)):-nat(X)] - solucao
[---, nat(suc(zero)), nat(suc(X)]









