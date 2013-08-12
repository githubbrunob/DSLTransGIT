class('petrinet', 'OutArc', id0, [p('weight', '1')], [p('sourcePlace', id2)]).
class('petrinet', 'OutArc', id1, [p('weight', '1')], [p('sourcePlace', id3)]).
class('petrinet', 'Place', id2, [p('token', '1'), p('name', 'a')], []).
class('petrinet', 'Place', id3, [p('token', '0'), p('name', 'b')], []).
class('petrinet', 'Place', id4, [p('token', '0'), p('name', 'c')], []).
class('petrinet', 'InArc', id5, [p('weight', '1')], [p('targetPlace', id3)]).
class('petrinet', 'InArc', id6, [p('weight', '1')], [p('targetPlace', id4)]).
class('petrinet', 'Transition', id7, [p('name', 't1')], [p('inArc', id5), p('outArc', id0)]).
class('petrinet', 'Transition', id8, [p('name', 't2')], [p('inArc', id6), p('outArc', id1)]).
class('petrinet', 'PetriNet', id9, [], [p('places', id2), p('places', id3), p('places', id4), p('transitions', id7), p('transitions', id8)]).
