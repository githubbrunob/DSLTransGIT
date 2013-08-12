property(
[rule('head with two terms', id0, match_apply(
graph([
mc('mprolog', 'Functor', id3), 
mc('mprolog', 'Head', id2), 
mc('mprolog', 'Clause', id1), 
mc('mprolog', 'Body', id0)], 
[
br('_', id0, id3),
br('_', id0, id2),
br('_', id0, id0),
br('_', id1, id0),
br('_', id1, id3),
br('_', id1, id2),
br('_', id2, id4), 
br('_', id2, id3), 
br('_', id2, id2), 
br('_', id2, id0), 
br('_', id3, id5), 
mda('ownedHead', id1, id2), 
mda('ownedBody', id1, id0), 
mda('ownedFunctor', id2, id3)]), 
graph([
ac('Text', 'Content', id5), 
ac('Text', 'Content', id4), 
ac('Text', 'Content', id3), 
ac('Text', 'Block', id2), 
ac('Text', 'Content', id1), 
ac('Text', 'Content', id0)], 
[aa('preLine', id2, id4), 
aa('next', id4, id1), 
aa('postLine', id2, id3), 
aa('content', id4, id5), 
aa('next', id3, id0)])))]).

