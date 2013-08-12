nat(zero):-vdd.
nat(suc(X)):-nat(X).

tree(node(X)):-nat(X).
tree(branch(X, node(Y),Z)):-tree(X), nat(Y), tree(Z).





:-dynamic a/1.
:-dynamic b/1.
:-assert(a(1):-vdd).
:-assert(a(2):-vdd).
:-assert(a(3):-vdd).

:-assert(b(1):-vdd).
:-assert(b(2):-vdd).
:-assert(b(3):-vdd).


solve([]).		      
solve([vdd|T]) :-solve(T).	      

solve([Goal|Rest]) :-  
	  \+ Goal = (_, _),
      clause(Goal, Body),
      conj2list(Body, List), 
      append(Rest, List, New),
      solve(New).

   solve([(Goal1, Goal2)|Rest]) :-
      solve([Goal1, Goal2|Rest]).

conj2list(Term, [Term]) :- \+ Term = (_, _).

conj2list((Term1,Term2), [Term1|Terms]) :-
        conj2list(Term2, Terms).
      