class('petrinet', 'OutArc', id0, [p('weight', '1')], [p('sourcePlace', id8)]).
class('petrinet', 'OutArc', id1, [p('weight', '1')], [p('sourcePlace', id9)]).
class('petrinet', 'InArc', id2, [p('weight', '1')], [p('targetPlace', id9)]).
class('petrinet', 'InArc', id3, [p('weight', '1')], [p('targetPlace', id10)]).
class('petrinet', 'PetriNet', id4, [], [p('places', id8), p('places', id9), p('places', id10), p('transitions', id5), p('transitions', id6)]).
class('petrinet', 'Transition', id5, [p('name', 't1')], [p('inArc', id2), p('outArc', id0)]).
class('petrinet', 'Transition', id6, [p('name', 't2')], [p('inArc', id3), p('outArc', id1)]).
class('petrinet', 'Place', id8, [p('name', 'a'), p('token', '1')],[]).
class('petrinet', 'Place', id9, [p('name', 'b'), p('token', '1')], []).
class('petrinet', 'Place', id10, [p('name', 'c'), p('token', '0')], []).
