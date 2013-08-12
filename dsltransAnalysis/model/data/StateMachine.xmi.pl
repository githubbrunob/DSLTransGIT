class('statemachine', 'Transition', id0, [p('name', 't1')], [p('source', id2), p('target', id3)]).
class('statemachine', 'Transition', id1, [p('name', 't2')], [p('source', id3), p('target', id4)]).
class('statemachine', 'Initial', id2, [p('name', 'a')], []).
class('statemachine', 'State', id3, [p('name', 'b')], []).
class('statemachine', 'State', id4, [p('name', 'c')], []).
class('statemachine', 'StateMachine', id5, [], [p('transitions', id0), p('transitions', id1), p('states', id2), p('states', id3), p('states', id4)]).
