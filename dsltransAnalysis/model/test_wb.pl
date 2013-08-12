:- ['collapse_def'].

graphgen(1,
		graph(id([id61a],'Facta'),
			[
				node(typeV(['NegativeMatchClass',mprolog,'Body']),
					[id193a]
				),
				node(typeV(['AnyMatchClass',mprolog,'Clause']),
					[id194a]
				),
				node(typeV(['AnyMatchClass',mprolog,'Head']),
					[id195a]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id149a]
				),
				node(typeV(['ApplyClass','Text','Content']),
					[id150a]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',ownedHead]),
					id281a, [id194a], [id195a]
				),
				edge(typeE(['NegativeMatchAssociation',ownedBody]),
					id233a, [id194a], [id193a]
				),
				edge(typeE(['ApplyAssociation',next]),
					id17a, [id149a], [id150a]
				)
			]
		)).
graphgen(2,	
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
		)
	).
	
graphgen(3,
	graph(id([id007],'test'),
	[
		node(typeV(['AnyMatchClass',mprolog,'A']),
			[id01]
		),
		node(typeV(['AnyMatchClass',mprolog,'B']),
			[id02]
		),
		node(typeV(['ApplyClass','Text','C']),
			[id03]
		),
		node(typeV(['ApplyClass','Text','C']),
			[id04]
		),
		node(typeV(['ApplyClass','Text','D']),
			[id05]
		),
		node(typeV(['AnyMatchClass',mprolog,'X']),
			[id99]
		)		
	],[
		edge(typeE(['PositiveMatchAssociation',ba]),
			id300, [id02], [id01]
		),
		edge(typeE(['ApplyAssociation',dc]),
			id301, [id05], [id03]
		),
		edge(typeE(['ApplyAssociation',dc]),
			id302, [id05], [id04]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id303, [id01], [id04]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id304, [id01], [id03]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id305, [id02], [id05]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id306, [id99], [id05]
		)
	])
).


graphgen(4,
	graph(id([id008],'testpatt'),
	[
		node(typeV(['AnyMatchClass',mprolog,'X']),
			[id06]
		),
		node(typeV(['AnyMatchClass',mprolog,'A']),
			[id07]
		),
		node(typeV(['AnyMatchClass',mprolog,'B']),
			[id08]
		),
		node(typeV(['AnyMatchClass',mprolog,'X']),
			[id09]
		),
		node(typeV(['ApplyClass','Text','C']),
			[id10]
		),
		node(typeV(['ApplyClass','Text','E']),
			[id11]
		),
		node(typeV(['ApplyClass','Text','D']),
			[id12]
		)
	],[
		edge(typeE(['PositiveMatchAssociation',xa]),
			id306, [id06], [id07]
		),
		edge(typeE(['PositiveMatchAssociation',ab]),
			id307, [id07], [id08]
		),
		edge(typeE(['PositiveMatchAssociation',bx]),
			id308, [id08], [id09]
		),
		edge(typeE(['ApplyAssociation',ce]),
			id309, [id10], [id11]
		),
		edge(typeE(['ApplyAssociation',cd]),
			id309, [id10], [id12]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id310, [id07], [id10]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id311, [id08], [id12]
		)
	])
).


graphgen(5,
	graph(id([id0070],'testisomorph'),
	[
		node(typeV(['AnyMatchClass',mprolog,'A']),
			[id010]
		),
		node(typeV(['ApplyClass','Text','C']),
			[id030]
		),
		node(typeV(['ApplyClass','Text','C']),
			[id040]
		),
		node(typeV(['AnyMatchClass',mprolog,'B']),
			[id020]
		),
		node(typeV(['ApplyClass','Text','D']),
			[id050]
		),
		node(typeV(['AnyMatchClass',mprolog,'X']),
			[id990]
		)		
	],[
		edge(typeE(['PositiveMatchAssociation',ba]),
			id3000, [id020], [id010]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id3030, [id010], [id040]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id3040, [id010], [id030]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id3050, [id020], [id050]
		),
		edge(typeE(['ApplyAssociation',dc]),
			id3010, [id050], [id030]
		),
		edge(typeE(['ApplyAssociation',dc]),
			id3020, [id050], [id040]
		),
		edge(typeE(['PositiveBackwardRestriction']),
			id3060, [id990], [id050]
		)
	])
).

try0(XL):- 
	graphgen(4,X), 
	graphgen(3,Y),
	splitbackwards(X,X_1,_),
	splitbackwards(Y,Y_1,_),
	findall(XY,
		(
			subgraph_isomorphism(X_1,Y_1,XYmap),
			merge(XYmap,X,Y,XY)
		),
		XL
	),
	open('.\\data\\out.pl',write,Out),
	print_Graphs(XL,Out),
	close(Out). 
	
try1(XYmap):-
	graphgen(4,X), 
	graphgen(3,Y),
	splitbackwards(X,X_1,_),
	splitbackwards(Y,Y_1,_),
	subgraph_isomorphism(X_1,Y_1,XYmap).
	
%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% 
% 
try:- buildGraph('.\\experiment2\\RPG.ecore.dsltrans',Trans0), 
	print_Transformation(Trans0,in('.\\experiment2\\graphs.pl')),
	collapse(Trans0,Trans1),
	print_Transformation(Trans1,in('.\\experiment2\\analysed_graphs.pl')).

	
	