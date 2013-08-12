class('petrinet', 'OutArc', id0, [p('weight', '1')], [p('sourcePlace', id8)]).
class('petrinet', 'InArc', id2, [p('weight', '1')], [p('targetPlace', id8)]).
class('petrinet', 'PetriNet', id4, [], [p('places', id8), p('transitions', id5)]).
class('petrinet', 'Transition', id5, [p('name', 't1')], [p('inArc', id2), p('outArc', id0)]).
class('petrinet', 'Place', id8, [p('name', 'a'), p('token', '1')],[]).
