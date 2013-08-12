mda('nextTerm', id0, id1, id0, id0).
mda('ownedHead', id1, id3, id2, id0).
mda('ownedBody', id2, id3, id4, id0).
mda('ownedFunctor', id3, id2, id1, id0).
ac('Text', 'Content', id0, id0).
ac('Text', 'Content', id1, id0).
ac('Text', 'Content', id2, id0).
ac('Text', 'Content', id3, id0).
ac('Text', 'Content', id4, id0).
ac('Text', 'Content', id5, id0).
ac('Text', 'Block', id6, id0).
ac('Text', 'Content', id7, id0).
br(id0, id0, id1, id0).
br(id1, id1, id0, id0).
br(id2, id2, id3, id0).
br(id3, id4, id5, id0).
br(id4, id3, id5, id0).
br(id5, id2, id5, id0).
br(id6, id4, id6, id0).
br(id7, id3, id6, id0).
br(id8, id2, id6, id0).
rule('head with two terms', id0, idProperty).
layer('Property', idProperty, idProperty).
aa('next', id0, id0, id2, id0).
aa('next', id1, id2, id1, id0).
aa('preLine', id2, id6, id3, id0).
aa('next', id3, id3, id7, id0).
aa('next', id4, id5, id4, id0).
aa('postLine', id5, id6, id5, id0).
mc('mprolog', 'Term', id0, id0).
mc('mprolog', 'Functor', id1, id0).
mc('mprolog', 'Head', id2, id0).
mc('mprolog', 'Clause', id3, id0).
mc('mprolog', 'Body', id4, id0).
