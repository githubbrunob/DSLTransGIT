transformation('.\data\mprolog.ecore.dsltrans', 
[
	rules([
		graph(id([id61],'Fact'),
			[
				node(typeV(['NegativeMatchClass',mprolog,'Body']),
					[id193]
				),
				node(typeV(['AnyMatchClass',mprolog,'Clause']),
					[id194]
				),
				node(typeV(['AnyMatchClass',mprolog,'Head']),
					[id195]
				),
				node(typeV(['ApplyClass','Text','Block']),
					[id149]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id150]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id151]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedHead]),
					id281, [id194], [id195]
				),
				edge(typeE(['NegativeMatchAssociation',ownedBody]),
					id233, [id194], [id193]
				),
				edge(typeE(['ApplyAssociation',preLine]),
					id17, [id149], [id150]
				),
				edge(typeE(['ApplyAssociation',next]),
					id18, [id150], [id151]
				)
			]
		),
		graph(id([id62],'List'),
			[
				node(typeV(['AnyMatchClass',mprolog,'List']),
					[id196]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id152]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id153]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id154]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id155]
				)
			], [
				edge(typeE(['ApplyAssociation',content]),
					id19, [id152], [id153]
				),
				edge(typeE(['ApplyAssociation',content]),
					id20, [id153], [id154]
				),
				edge(typeE(['ApplyAssociation',next]),
					id21, [id153], [id155]
				)
			]
		),
		graph(id([id63],'QuotedAtom'),
			[
				node(typeV(['AnyMatchClass',mprolog,'QuotedAtom']),
					[id197]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id156]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id157]
				)
			], [
				edge(typeE(['ApplyAssociation',content]),
					id22, [id156], [id157]
				)
			]
		),
		graph(id([id64],'Model'),
			[
				node(typeV(['AnyMatchClass',mprolog,'Model']),
					[id198]
				),
				node(typeV(['ApplyClass','Text','Model']),
					[id158]
				),
				node(typeV(['ApplyClass','Text','Directory']),
					[id159]
				),
				node(typeV(['ApplyClass','Text','File']),
					[id160]
				)
			], [
				edge(typeE(['ApplyAssociation',directory]),
					id23, [id158], [id159]
				),
				edge(typeE(['ApplyAssociation',file]),
					id24, [id159], [id160]
				)
			]
		),
		graph(id([id65],'Clause'),
			[
				node(typeV(['AnyMatchClass',mprolog,'Clause']),
					[id199]
				),
				node(typeV(['AnyMatchClass',mprolog,'Head']),
					[id200]
				),
				node(typeV(['AnyMatchClass',mprolog,'Body']),
					[id201]
				),
				node(typeV(['ApplyClass','Text','Block']),
					[id161]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id162]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id163]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id164]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id165]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedHead]),
					id282, [id199], [id200]
				),
				edge(typeE(['PositiveMatchAssociation',ownedBody]),
					id283, [id199], [id201]
				),
				edge(typeE(['ApplyAssociation',preLine]),
					id25, [id161], [id162]
				),
				edge(typeE(['ApplyAssociation',next]),
					id26, [id162], [id163]
				),
				edge(typeE(['ApplyAssociation',postLine]),
					id27, [id161], [id164]
				),
				edge(typeE(['ApplyAssociation',next]),
					id28, [id164], [id165]
				)
			]
		),
		graph(id([id66],'Functor'),
			[
				node(typeV(['AnyMatchClass',mprolog,'Functor']),
					[id202]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id166]
				)
			], [
			]
		),
		graph(id([id67],'Variable'),
			[
				node(typeV(['AnyMatchClass',mprolog,'Variable']),
					[id203]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id167]
				)
			], [
			]
		),
		graph(id([id68],'InfixExpression'),
			[
				node(typeV(['AnyMatchClass',mprolog,'InfixExpression']),
					[id204]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id168]
				)
			], [
			]
		),
		graph(id([id69],'Operator'),
			[
				node(typeV(['AnyMatchClass',mprolog,'Operator']),
					[id205]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id169]
				)
			], [
			]
		)	])
,
	rules([
		graph(id([id70],ownedAtom),
			[
				node(typeV(['AnyMatchClass',mprolog,'Head']),
					[id206]
				),
				node(typeV(['AnyMatchClass',mprolog,'Functor']),
					[id207]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id170]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id171]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedFunctor]),
					id284, [id206], [id207]
				),
				edge(typeE(['ApplyAssociation',content]),
					id29, [id170], [id171]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id43, [id206], [id170]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id44, [id207], [id171]
				)
			]
		),
		graph(id([id71],nextTerm),
			[
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id208]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id209]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id172]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id173]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id174]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',nextTerm]),
					id285, [id208], [id209]
				),
				edge(typeE(['ApplyAssociation',next]),
					id30, [id172], [id174]
				),
				edge(typeE(['ApplyAssociation',next]),
					id31, [id174], [id173]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id45, [id208], [id172]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id46, [id209], [id173]
				)
			]
		),
		graph(id([id72],ownedHeadTerm),
			[
				node(typeV(['AnyMatchClass',mprolog,'List']),
					[id210]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id211]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id175]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id176]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedHeadTerms]),
					id286, [id210], [id211]
				),
				edge(typeE(['ApplyAssociation',content]),
					id32, [id175], [id176]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id47, [id210], [id175]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id48, [id211], [id176]
				)
			]
		),
		graph(id([id73],ownedTerm),
			[
				node(typeV(['AnyMatchClass',mprolog,'Functor']),
					[id212]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id213]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id177]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id178]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id179]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id180]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedTerm]),
					id287, [id212], [id213]
				),
				edge(typeE(['ApplyAssociation',content]),
					id33, [id177], [id179]
				),
				edge(typeE(['ApplyAssociation',content]),
					id34, [id179], [id178]
				),
				edge(typeE(['ApplyAssociation',next]),
					id35, [id179], [id180]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id49, [id212], [id177]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id50, [id213], [id178]
				)
			]
		),
		graph(id([id74],ownedTerm),
			[
				node(typeV(['AnyMatchClass',mprolog,'Body']),
					[id214]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id215]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id181]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id182]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedTerm]),
					id288, [id214], [id215]
				),
				edge(typeE(['ApplyAssociation',content]),
					id36, [id181], [id182]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id51, [id214], [id181]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id52, [id215], [id182]
				)
			]
		),
		graph(id([id75],ownedClause),
			[
				node(typeV(['AnyMatchClass',mprolog,'Model']),
					[id216]
				),
				node(typeV(['AnyMatchClass',mprolog,'Clause']),
					[id217]
				),
				node(typeV(['ApplyClass','Text','File']),
					[id183]
				),
				node(typeV(['ApplyClass','Text','Block']),
					[id184]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedClause]),
					id289, [id216], [id217]
				),
				edge(typeE(['ApplyAssociation',innerBlock]),
					id37, [id183], [id184]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id53, [id216], [id183]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id54, [id217], [id184]
				)
			]
		),
		graph(id([id76],ownedTailTerm),
			[
				node(typeV(['AnyMatchClass',mprolog,'List']),
					[id218]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id219]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id185]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id186]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id187]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedTailTerms]),
					id290, [id218], [id219]
				),
				edge(typeE(['ApplyAssociation',next]),
					id38, [id185], [id187]
				),
				edge(typeE(['ApplyAssociation',content]),
					id39, [id187], [id186]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id55, [id218], [id185]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id56, [id219], [id186]
				)
			]
		),
		graph(id([id77],leftright),
			[
				node(typeV(['AnyMatchClass',mprolog,'InfixExpression']),
					[id220]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id221]
				),
				node(typeV(['AnyMatchClass',mprolog,'Term']),
					[id222]
				),
				node(typeV(['AnyMatchClass',mprolog,'Operator']),
					[id223]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id188]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id189]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id190]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id191]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',leftTerm]),
					id291, [id220], [id221]
				),
				edge(typeE(['PositiveMatchAssociation',rightTerm]),
					id292, [id220], [id222]
				),
				edge(typeE(['PositiveMatchAssociation',ownedOperator]),
					id293, [id220], [id223]
				),
				edge(typeE(['ApplyAssociation',content]),
					id40, [id188], [id190]
				),
				edge(typeE(['ApplyAssociation',next]),
					id41, [id190], [id191]
				),
				edge(typeE(['ApplyAssociation',next]),
					id42, [id191], [id189]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id57, [id220], [id188]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id58, [id221], [id190]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id59, [id223], [id191]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id60, [id222], [id189]
				)
			]
		)	])

]).
