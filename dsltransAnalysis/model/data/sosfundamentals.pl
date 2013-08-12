% generic predicates

% atom_setchar
atom_setchar(A,Set):-
	atom_chars(A,USet),
	list_setchar(USet,Set).

% setchar_atom
setchar_atom(Set,A):-
	list_setchar(USet,Set),
	atom_chars(A,USet).



list_setchar([],empty).
list_setchar([C|T],bset(CS,TS)):-
	char_genchar(C,CS),
	list_setchar(T,TS).

char_genchar('a','aa').
char_genchar('A','aA').
char_genchar('b','ab').
char_genchar('B','aB').
char_genchar('c','ac').
char_genchar('C','aC').
char_genchar('d','ad').
char_genchar('D','aD').
char_genchar('e','ae').
char_genchar('E','aE').
char_genchar('f','af').
char_genchar('F','aF').
char_genchar('g','ag').
char_genchar('G','aG').
char_genchar('h','ah').
char_genchar('H','aH').
char_genchar('i','ai').
char_genchar('I','aI').
char_genchar('j','aj').
char_genchar('J','aJ').
char_genchar('k','ak').
char_genchar('K','aK').
char_genchar('l','al').
char_genchar('L','aL').
char_genchar('m','am').
char_genchar('M','aM').
char_genchar('n','an').
char_genchar('N','aN').
char_genchar('o','ao').
char_genchar('O','aO').
char_genchar('p','ap').
char_genchar('P','aP').
char_genchar('q','aq').
char_genchar('Q','aQ').
char_genchar('r','ar').
char_genchar('R','aR').
char_genchar('s','as').
char_genchar('S','aS').
char_genchar('t','at').
char_genchar('T','aT').
char_genchar('u','au').
char_genchar('U','aU').
char_genchar('v','av').
char_genchar('V','aV').
char_genchar('w','aw').
char_genchar('W','aW').
char_genchar('x','ax').
char_genchar('X','aX').
char_genchar('y','ay').
char_genchar('Y','aY').
char_genchar('z','az').
char_genchar('Z','aZ').
char_genchar('0','n0').
char_genchar('1','n1').
char_genchar('2','n2').
char_genchar('3','n3').
char_genchar('4','n4').
char_genchar('5','n5').
char_genchar('6','n6').
char_genchar('7','n7').
char_genchar('8','n8').
char_genchar('9','n9').

% iter
iter(A,(B),(CSet),D):- 
	setchar_atom(CSet,C),
	atom_number(C, CValue),
	iter_number(A,(B),(CValue),D).
	
iter_number(_,(T),(0),T).
iter_number(F,(T),(1),I):- (I =.. [F,T]).
iter_number(F,(T),(X),I):- (X > 1),
	(F1 =.. [F,T]),
	X1 is X - 1,
	iter_number(F,(F1),(X1),I).

sort(set(_)).
gen(empty,set(_)).
gen(bset(X,R),set(K)):- gen(X,K), gen(R,set(K)).

% forall
forall((P),C,LL):-
	findall(P,C,L),
	convert_to_set(L,LL).
	
% format converter
convert_to_set([],empty).
convert_to_set([H|T],bset(H,X)):- 
	convert_to_set(T,X).

% member on sets
opFundamental(member(X,empty),false).
opFundamental(member(X,bset(X,T)),true).
	
opFundamental(member(X,bset(Y,T)),R):-
	not((X = Y)),
	opFundamental(member(X,T),R).

% member gen on sets
opFundamental(membergen(X,empty),false).
opFundamental(membergen(X,bset(X,T)),true).
	
opFundamental(membergen(X,bset(Y,T)),R):-
	opFundamental(member(X,T),R).

% member gen on class
opFundamental(membergenModel(Package,Class,P,PAtt,PRels),true):-
	class(Package,Class,P,PAtt,PRels).

opFundamental(membergenModel(Package,Class,P,PAtt,PRels),false):-
	once(not(class(Package,Class,P,PAtt,PRels))).

% member gen on relation
opFundamental(membergenModel(SourceClass,RelName,TargetClass),true):-
	class(_,_,SourceClass,_,SRels),
	member(p(RelName,TargetClass),SRels).

opFundamental(membergenModel(Package,Class,P,PAtt,PRels),false):-
	once(not(
		(class(_,_,SourceClass,_,SRels),
		member(p(RelName,TargetClass),SRels))
	)).

% member on model attribute
opFundamental(memberattModel(Var,AttName),SetValue):-
	once(class(_,_,Var,VarAtt,_)),
	member(p(AttName, Value), VarAtt),
	atom_setchar(Value,SetValue).



% excluding on elem
opFundamental(excluding(_,empty), empty).

opFundamental(excluding(E,bset(E,T)), R):-
	opFundamental(excluding(E,T), R).

opFundamental(excluding(E1,bset(E2,T)), bset(E2,R)):-
	not((E1 = E2)),
	opFundamental(excluding(E1,T), R).
	
% diff on sets
opFundamental(diff(empty,BSET),BSET).

opFundamental(diff(bset(Elem,BSET),BSET1),BSET3):-
	opFundamental(equals_member(Elem,BSET1),true),
	opFundamental(excluding(Elem,BSET1),BSET2),
	opFundamental(diff(BSET,BSET2),BSET3).

opFundamental(diff(bset(Elem,BSET),BSET1),bset(Elem,BSET2)):-
	opFundamental(equals_member(Elem,BSET1),false),
	opFundamental(diff(BSET,BSET1),BSET2).
	
% insert on sets
opFundamental(insert(Elem, BSET),bset(Elem,BSET)):-
	opFundamental(equals_member(Elem,BSET),false).	

opFundamental(insert(Elem, BSET),BSET):-
	opFundamental(equals_member(Elem,BSET),true).

% union on sets
opFundamental(union(empty, BSET),BSET).

opFundamental(union(bset(Elem,BSET), BSET1),BSET3):-
	opFundamental(insert(Elem,BSET1),BSET2),
	opFundamental(union(BSET,BSET2),BSET3).

% intersection on sets
opFundamental(intersection(empty,BSET),empty).

opFundamental(intersection(bset(Elem,BSET),BSET1),bset(Elem,BSET2)):-
	opFundamental(equals_member(Elem,BSET1),true),
	opFundamental(intersection(BSET,BSET1),BSET2).

opFundamental(intersection(bset(Elem,BSET),BSET1),BSET2):-
	opFundamental(equals_member(Elem,BSET1),false),
	opFundamental(intersection(BSET,BSET1),BSET2).

% member using equals construct
opFundamental(equals_member(X,empty),false).
opFundamental(equals_member(X1,bset(X2,T)),true):-
	opFundamental(equals(X1,X2),true).
	
opFundamental(equals_member(X1,bset(X2,T)),R):-
	opFundamental(equals(X1,X2),false),
	opFundamental(equals_member(X1,T),R).

% transitionSystem
sort(transitionSystem).
gen(empty,transitionSystem).
gen(ts(Pre,Label,Pos),transitionSystem). 

equals(A,A).

opFundamental(equals(ts(Pre1,Label,Pos1),ts(Pre2,Label,Pos2)),true):-
	opFundamental(equals(Pre1,Pre2),true),
	opFundamental(equals(Pos1,Pos2),true).	

opFundamental(equals(ts(_,Label1,_),ts(_,Label2,_)),false):-
	not((Label1 = Label2)),!.	

opFundamental(equals(ts(Pre1,_,_),ts(Pre2,_,_)),false):-
	opFundamental(equals(Pre1,Pre2),false),!.	

opFundamental(equals(ts(_,_,Pos1),ts(_,_,Pos2)),false):-
	opFundamental(equals(Pos1,Pos2),false),!.

opFundamental(equals(X,Y),R):-
	op(equals(X,Y),R).

callReverseList([]).
callReverseList([H|T]):-
	callReverseList(T),
	call(H).	

evalList([]).
evalList([H|T]):- call(H),evalList(T).

eval(TS0,rule(knowing(TS0),pre(Pre),pos(Pos),know(Know)),know(Know)):-
	evalList(Pre), evalList(Pos).

eval_rec(TS0,[],TS0).
eval_rec(TS0,[R|T], TS2):-
	print('preparing evaluation..'),nl,
	findall(know(Know),eval(TS0,R,know(Know)),KnowList),
	insert_knowset(TS0,KnowList,TS1),
	print('collecting results..'),nl,
	eval_rec(TS1,T,TS2).

insert_knowset(TS,[],TS).
insert_knowset(TS0,[know(K)|Tail],TS2):-
	opFundamental(insert(K,TS0),TS1),
	insert_knowset(TS1,Tail,TS2).

rules(Rules):- findall(rule(PKnow,Pre,Pos,Know),rule(PKnow,Pre,Pos,Know),Rules).

getfixpoint(FIX):-
	once(fixpoint(empty,FIX)).	

fixpoint(TS0,FIX):-
	rules(Rules),
	eval_rec(TS0,Rules,TS),
	testfixpoint(TS0,TS,FIX).

testfixpoint(TS0,TS,FIX):-
	print('testing 1'),nl,	
	opFundamental(diff(TS0,TS),bset(_,_)),
	print('we learned something!'),nl,
	fixpoint(TS,FIX).

testfixpoint(TS0,FIX,FIX):-
	print('testing 2'),nl,	
	opFundamental(diff(TS0,FIX),empty),
	print('this is the end'),nl.

outputdot(FILE,NAME,TS):-
	concat(FILE,'.dot',FILENAME),
	open(FILENAME,write,Stream),
	write(Stream,'digraph '),write(Stream,NAME),write(Stream,' {'),
	nl(Stream),	
	processset(TS,NumList),
	printNumList(Stream,NumList),
	printLinks(Stream,NumList,TS),
	nl(Stream),
	write(Stream,'}'),
	close(Stream).

printLinks(_,_,empty).
printLinks(Stream,NumList,bset(ts(Pre1,Label,Pos1),T)):-
	member(p(KPre,Pre2),NumList),
	opFundamental(equals(Pre1,Pre2),true),
	member(p(KPos,Pos2),NumList),
	opFundamental(equals(Pos1,Pos2),true),	
	write(Stream,'\t'),
	write(Stream,'node'),
	write(Stream,KPre),
	write(Stream,' -> '),
	write(Stream,'node'),	
	write(Stream,KPos),
	write(Stream,'[label="'),
	write(Stream,Label),	
	write(Stream,'"];'),
	nl(Stream),
	printLinks(Stream,NumList,T).	


printNumList(_,[]).
printNumList(Stream,[p(K,H)|T]):-
	write(Stream,'\t'),
	write(Stream,'node'),
	write(Stream,K),
	write(Stream,'[label="'),
	write(Stream,H),	
	write(Stream,'"];'),
	nl(Stream),
	printNumList(Stream,T).

processNumList([],_,[]).
processNumList([H|T],K,[p(K,H)|R]):-
	K1 is K+1,
	processNumList(T,K1,R).

processset(BSET,NumList):-
	processsetPre(BSET,[],PreList),
	processsetPos(BSET,PreList,List),
	processNumList(List,0,NumList).


% member using equals construct
opFundamental(equals_member(X,[]),false).
opFundamental(equals_member(X1,[X2|T]),true):-
	opFundamental(equals(X1,X2),true).
	
opFundamental(equals_member(X1,[X2|T]),R):-
	opFundamental(equals(X1,X2),false),
	opFundamental(equals_member(X1,T),R).

processsetPre(empty,E,E).
processsetPre(bset(ts(PreState,_,_),T),Acc,Res):-
	opFundamental(equals_member(PreState,Acc),true),
	processsetPre(T,Acc,Res).

processsetPre(bset(ts(PreState,_,_),T),Acc,Res):-
	opFundamental(equals_member(PreState,Acc),false),
	processsetPre(T,[PreState|Acc],Res).	

processsetPos(empty,E,E).
processsetPos(bset(ts(_,_,PosState),T),Acc,Res):-
	opFundamental(equals_member(PosState,Acc),true),
	processsetPos(T,Acc,Res).

processsetPos(bset(ts(_,_,PosState),T),Acc,Res):-
	opFundamental(equals_member(PosState,Acc),false),
	processsetPos(T,[PosState|Acc],Res).

outputFixPoint(FILEPATH,FILENAME):- 
	getfixpoint(FIX),
	print(FIX),
	outputdot(FILEPATH,FILENAME,FIX).

% outputFixPoint('model_abc2'). 