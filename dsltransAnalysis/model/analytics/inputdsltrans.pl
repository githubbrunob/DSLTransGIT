mda('ownedHead', id0, id0, id1, id0).
mda('ownedHead', id1, id5, id6, id4).
mda('ownedBody', id2, id5, id7, id4).
mda('ownedFunctor', id3, id12, id13, id9).
mda('nextTerm', id4, id14, id15, id10).
mda('ownedHeadTerms', id5, id16, id17, id11).
mda('ownedTerm', id6, id18, id19, id12).
mda('ownedTerm', id7, id20, id21, id13).
mda('ownedClause', id8, id22, id23, id14).
mda('ownedTailTerms', id9, id24, id25, id15).
mda('leftTerm', id10, id26, id27, id16).
mda('rightTerm', id11, id26, id28, id16).
mda('ownedOperator', id12, id26, id29, id16).
ac('Text', 'Block', id0, id0).
ac('Text', 'Content', id1, id0).
ac('Text', 'Content', id2, id0).
ac('Text', 'Content', id3, id1).
ac('Text', 'Content', id4, id1).
ac('Text', 'Content', id5, id1).
ac('Text', 'Content', id6, id1).
ac('Text', 'Content', id7, id2).
ac('Text', 'Content', id8, id2).
ac('Text', 'Model', id9, id3).
ac('Text', 'Directory', id10, id3).
ac('Text', 'File', id11, id3).
ac('Text', 'Block', id12, id4).
ac('Text', 'Content', id13, id4).
ac('Text', 'Content', id14, id4).
ac('Text', 'Content', id15, id4).
ac('Text', 'Content', id16, id4).
ac('Text', 'Content', id17, id5).
ac('Text', 'Content', id18, id6).
ac('Text', 'Content', id19, id7).
ac('Text', 'Content', id20, id8).
ac('Text', 'Content', id21, id9).
ac('Text', 'Content', id22, id9).
ac('Text', 'Content', id23, id10).
ac('Text', 'Content', id24, id10).
ac('Text', 'Content', id25, id10).
ac('Text', 'Content', id26, id11).
ac('Text', 'Content', id27, id11).
ac('Text', 'Content', id28, id12).
ac('Text', 'Content', id29, id12).
ac('Text', 'Content', id30, id12).
ac('Text', 'Content', id31, id12).
ac('Text', 'Content', id32, id13).
ac('Text', 'Content', id33, id13).
ac('Text', 'File', id34, id14).
ac('Text', 'Block', id35, id14).
ac('Text', 'Content', id36, id15).
ac('Text', 'Content', id37, id15).
ac('Text', 'Content', id38, id15).
ac('Text', 'Content', id39, id16).
ac('Text', 'Content', id40, id16).
ac('Text', 'Content', id41, id16).
ac('Text', 'Content', id42, id16).
br(id0, id12, id21, id9).
br(id1, id13, id22, id9).
br(id2, id14, id23, id10).
br(id3, id15, id24, id10).
br(id4, id16, id26, id11).
br(id5, id17, id27, id11).
br(id6, id18, id28, id12).
br(id7, id19, id29, id12).
br(id8, id20, id32, id13).
br(id9, id21, id33, id13).
br(id10, id22, id34, id14).
br(id11, id23, id35, id14).
br(id12, id24, id36, id15).
br(id13, id25, id37, id15).
br(id14, id26, id39, id16).
br(id15, id27, id41, id16).
br(id16, id29, id42, id16).
br(id17, id28, id40, id16).
rule('Fact', id0, id0).
rule('List', id1, id0).
rule('QuotedAtom', id2, id0).
rule('Model', id3, id0).
rule('Clause', id4, id0).
rule('Functor', id5, id0).
rule('Variable', id6, id0).
rule('InfixExpression', id7, id0).
rule('Operator', id8, id0).
rule('ownedAtom', id9, id1).
rule('nextTerm', id10, id1).
rule('ownedHeadTerm', id11, id1).
rule('ownedTerm', id12, id1).
rule('ownedTerm', id13, id1).
rule('ownedClause', id14, id1).
rule('ownedTailTerm', id15, id1).
rule('leftright', id16, id1).
layer('Entities', id0, id0).
layer('Associations', id1, id0).
aa('preLine', id0, id0, id1, id0).
aa('next', id1, id1, id2, id0).
aa('content', id2, id3, id4, id1).
aa('content', id3, id4, id5, id1).
aa('next', id4, id4, id6, id1).
aa('content', id5, id7, id8, id2).
aa('directory', id6, id9, id10, id3).
aa('file', id7, id10, id11, id3).
aa('preLine', id8, id12, id13, id4).
aa('next', id9, id13, id14, id4).
aa('postLine', id10, id12, id15, id4).
aa('next', id11, id15, id16, id4).
aa('content', id12, id21, id22, id9).
aa('next', id13, id23, id25, id10).
aa('next', id14, id25, id24, id10).
aa('content', id15, id26, id27, id11).
aa('content', id16, id28, id30, id12).
aa('content', id17, id30, id29, id12).
aa('next', id18, id30, id31, id12).
aa('content', id19, id32, id33, id13).
aa('innerBlock', id20, id34, id35, id14).
aa('next', id21, id36, id38, id15).
aa('content', id22, id38, id37, id15).
aa('content', id23, id39, id41, id16).
aa('next', id24, id41, id42, id16).
aa('next', id25, id42, id40, id16).
mc('mprolog', 'Clause', id0, id0).
mc('mprolog', 'Head', id1, id0).
mc('mprolog', 'List', id2, id1).
mc('mprolog', 'QuotedAtom', id3, id2).
mc('mprolog', 'Model', id4, id3).
mc('mprolog', 'Clause', id5, id4).
mc('mprolog', 'Head', id6, id4).
mc('mprolog', 'Body', id7, id4).
mc('mprolog', 'Functor', id8, id5).
mc('mprolog', 'Variable', id9, id6).
mc('mprolog', 'InfixExpression', id10, id7).
mc('mprolog', 'Operator', id11, id8).
mc('mprolog', 'Head', id12, id9).
mc('mprolog', 'Functor', id13, id9).
mc('mprolog', 'Term', id14, id10).
mc('mprolog', 'Term', id15, id10).
mc('mprolog', 'List', id16, id11).
mc('mprolog', 'Term', id17, id11).
mc('mprolog', 'Functor', id18, id12).
mc('mprolog', 'Term', id19, id12).
mc('mprolog', 'Body', id20, id13).
mc('mprolog', 'Term', id21, id13).
mc('mprolog', 'Model', id22, id14).
mc('mprolog', 'Clause', id23, id14).
mc('mprolog', 'List', id24, id15).
mc('mprolog', 'Term', id25, id15).
mc('mprolog', 'InfixExpression', id26, id16).
mc('mprolog', 'Term', id27, id16).
mc('mprolog', 'Term', id28, id16).
mc('mprolog', 'Operator', id29, id16).
