transformation('.\data\SM2PN.dsltrans', 
[
	rules([
		graph(id([id109],'Transition'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				)
			], [
			]
		),
		graph(id([id110],'State'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				)
			], [
			]
		),
		graph(id([id111],'StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				)
			], [
			]
		),
		graph(id([id112],'Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
			]
		)	])
,
	rules([
		graph(id([id113],'source State'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id26], [id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id5]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id92, [id26], [id4]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id93, [id27], [id5]
				)
			]
		),
		graph(id([id114],'target State'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id28], [id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id94, [id28], [id7]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id95, [id29], [id8]
				)
			]
		),
		graph(id([id115],'states State'),
			[
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id30], [id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id10], [id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id96, [id30], [id10]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id97, [id31], [id11]
				)
			]
		),
		graph(id([id116],transitions),
			[
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id32], [id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id12], [id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id98, [id32], [id12]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id99, [id33], [id13]
				)
			]
		),
		graph(id([id117],'source Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id34], [id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id100, [id34], [id14]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id101, [id35], [id15]
				)
			]
		),
		graph(id([id118],'target Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id36], [id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id102, [id36], [id17]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id103, [id37], [id18]
				)
			]
		),
		graph(id([id119],'states Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id38], [id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id20], [id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id104, [id38], [id20]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id105, [id39], [id21]
				)
			]
		)	])

]).
