layer('Entities', id0, [
	rule('Fact', id8, match_apply(
		graph([
			mc('mprolog', 'Clause', id11), 
			mc('mprolog', 'Head', id10)
		      ], 
		      [
		        mda('ownedHead', id11, id10)
		      ]), 
		graph([
			ac('Text', 'Block', id20), 
			ac('Text', 'Content', id19), 
			ac('Text', 'Content', id18)
		      ], 
		      [
		      	aa('preLine', id20, id19), 
		      	aa('next', id19, id18)]))), 
	rule('List', id7, match_apply(
		graph([
			mc('mprolog', 'List', id9)
		      ], 
		      []), 
		graph([
			ac('Text', 'Content', id17), 
			ac('Text', 'Content', id16), 
			ac('Text', 'Content', id15), 
			ac('Text', 'Content', id14)
		      ], 
		      [
		        aa('content', id17, id16), 
		        aa('content', id16, id15), 
		        aa('next', id16, id14)]))), 
	rule('QuotedAtom', id6, match_apply(graph([mc('mprolog', 'QuotedAtom', id8)], []), graph([ac('Text', 'Content', id13), ac('Text', 'Content', id12)], [aa('content', id13, id12)]))), 
	rule('Model', id5, match_apply(graph([mc('mprolog', 'Model', id7)], []), graph([ac('Text', 'Model', id11), ac('Text', 'Directory', id10), ac('Text', 'File', id9)], [aa('directory', id11, id10), aa('file', id10, id9)]))), 
	rule('Clause', id4, match_apply(graph([mc('mprolog', 'Clause', id6), mc('mprolog', 'Head', id5), mc('mprolog', 'Body', id4)], [mda('ownedHead', id6, id5), mda('ownedBody', id6, id4)]), graph([ac('Text', 'Block', id8), ac('Text', 'Content', id7), ac('Text', 'Content', id6), ac('Text', 'Content', id5), ac('Text', 'Content', id4)], [aa('preLine', id8, id7), aa('next', id7, id6), aa('postLine', id8, id5), aa('next', id5, id4)]))), 
	rule('Functor', id3, match_apply(graph([mc('mprolog', 'Functor', id3)], []), graph([ac('Text', 'Content', id3)], []))), 
	rule('Variable', id2, match_apply(graph([mc('mprolog', 'Variable', id2)], []), graph([ac('Text', 'Content', id2)], []))), 
	rule('InfixExpression', id1, match_apply(graph([mc('mprolog', 'InfixExpression', id1)], []), graph([ac('Text', 'Content', id1)], []))), 
	rule('Operator', id0, match_apply(graph([mc('mprolog', 'Operator', id0)], []), graph([ac('Text', 'Content', id0)], [])))], id0).

layer('Associations', id1, [
	rule('ownedAtom', id16, match_apply(
		graph([
			mc('mprolog', 'Head', id29), 
			mc('mprolog', 'Functor', id28)], 
		      [
		      	br('_', id29, id42), 
		      	br('_', id28, id41), 
		      	mda('ownedFunctor', id29, id28)]), graph([ac('Text', 'Content', id42), ac('Text', 'Content', id41)], [aa('content', id42, id41)]))), rule('nextTerm', id15, match_apply(graph([mc('mprolog', 'Term', id27), mc('mprolog', 'Term', id26)], [br('_', id27, id40), br('_', id26, id39), mda('nextTerm', id27, id26)]), graph([ac('Text', 'Content', id40), ac('Text', 'Content', id39), ac('Text', 'Content', id38)], [aa('next', id40, id38), aa('next', id38, id39)]))), rule('ownedHeadTerm', id14, match_apply(graph([mc('mprolog', 'List', id25), mc('mprolog', 'Term', id24)], [br('_', id25, id37), br('_', id24, id36), mda('ownedHeadTerms', id25, id24)]), graph([ac('Text', 'Content', id37), ac('Text', 'Content', id36)], [aa('content', id37, id36)]))), rule('ownedTerm', id13, match_apply(graph([mc('mprolog', 'Functor', id23), mc('mprolog', 'Term', id22)], [br('_', id23, id35), br('_', id22, id34), mda('ownedTerm', id23, id22)]), graph([ac('Text', 'Content', id35), ac('Text', 'Content', id34), ac('Text', 'Content', id33), ac('Text', 'Content', id32)], [aa('content', id35, id33), aa('content', id33, id34), aa('next', id33, id32)]))), rule('ownedTerm', id12, match_apply(graph([mc('mprolog', 'Body', id21), mc('mprolog', 'Term', id20)], [br('_', id21, id31), br('_', id20, id30), mda('ownedTerm', id21, id20)]), graph([ac('Text', 'Content', id31), ac('Text', 'Content', id30)], [aa('content', id31, id30)]))), rule('ownedClause', id11, match_apply(graph([mc('mprolog', 'Model', id19), mc('mprolog', 'Clause', id18)], [br('_', id19, id29), br('_', id18, id28), mda('ownedClause', id19, id18)]), graph([ac('Text', 'File', id29), ac('Text', 'Block', id28)], [aa('innerBlock', id29, id28)]))), rule('ownedTailTerm', id10, match_apply(graph([mc('mprolog', 'List', id17), mc('mprolog', 'Term', id16)], [br('_', id17, id27), br('_', id16, id26), mda('ownedTailTerms', id17, id16)]), graph([ac('Text', 'Content', id27), ac('Text', 'Content', id26), ac('Text', 'Content', id25)], [aa('next', id27, id25), aa('content', id25, id26)]))), rule('leftright', id9, match_apply(graph([mc('mprolog', 'InfixExpression', id15), mc('mprolog', 'Term', id14), mc('mprolog', 'Term', id13), mc('mprolog', 'Operator', id12)], [br('_', id15, id24), br('_', id14, id22), br('_', id12, id21), br('_', id13, id23), mda('leftTerm', id15, id14), mda('rightTerm', id15, id13), mda('ownedOperator', id15, id12)]), graph([ac('Text', 'Content', id24), ac('Text', 'Content', id23), ac('Text', 'Content', id22), ac('Text', 'Content', id21)], [aa('content', id24, id22), aa('next', id22, id21), aa('next', id21, id23)])))], id0).
