class('petrinet', 'InArc', id2, [p('weight', '1')], [p('targetPlace', id9)]).
class('petrinet', 'PetriNet', id4, [], [p('places', id9), p('transitions', id5)]).
class('petrinet', 'Transition', id5, [p('name', 't1')], [p('inArc', id2)]).
class('petrinet', 'Place', id9, [p('name', 'b'), p('token', '0')], []).
