transformation('.\data\SM2PN.dsltrans', 
[
	rules([
		graph(id([id112],'Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
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
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				)
			]
		),
		graph(id([id111,id112],'StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
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
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				)
			]
		),
		graph(id([id110,id112],'State + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		),
		graph(id([id110,id111],'State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				)
			]
		),
		graph(id([id110,id111,id112],'State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		),
		graph(id([id109],'Transition'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				)
			]
		),
		graph(id([id109,id112],'Transition + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		),
		graph(id([id109,id111],'Transition + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				)
			]
		),
		graph(id([id109,id111,id112],'Transition + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		),
		graph(id([id109,id110],'Transition + State'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				)
			]
		),
		graph(id([id109,id110,id112],'Transition + State + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		),
		graph(id([id109,id110,id111],'Transition + State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				)
			]
		),
		graph(id([id109,id110,id111,id112],'Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				)
			], [
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				)
			]
		)	])
,
	rules([
		graph(id([id119,id111,id112],'states Initial + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				)
			]
		),
		graph(id([id119,id110,id111,id112],'states Initial + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				)
			]
		),
		graph(id([id119,id109,id111,id112],'states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				)
			]
		),
		graph(id([id119,id109,id110,id111,id112],'states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				)
			]
		),
		graph(id([id118,id109,id112],'target Initial + Transition + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id118,id109,id111,id112],'target Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id118,id109,id110,id112],'target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id118,id109,id110,id111,id112],'target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id118,id119,id109,id111,id112],'target Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id118,id119,id109,id110,id111,id112],'target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				)
			]
		),
		graph(id([id117,id109,id112],'source Initial + Transition + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id109,id111,id112],'source Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id109,id110,id112],'source Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id109,id110,id111,id112],'source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id119,id109,id111,id112],'source Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id119,id109,id110,id111,id112],'source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				)
			]
		),
		graph(id([id117,id118,id109,id112],'source Initial + target Initial + Transition + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id117,id118,id109,id111,id112],'source Initial + target Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id117,id118,id109,id110,id112],'source Initial + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id117,id118,id109,id110,id111,id112],'source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id117,id118,id119,id109,id111,id112],'source Initial + target Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id117,id118,id119,id109,id110,id111,id112],'source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				)
			]
		),
		graph(id([id116,id109,id111],'transitions + Transition + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id109,id111,id112],'transitions + Transition + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id109,id110,id111],'transitions + Transition + State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id109,id110,id111,id112],'transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id119,id109,id111,id112],'transitions + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				)
			]
		),
		graph(id([id116,id119,id109,id110,id111,id112],'transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				)
			]
		),
		graph(id([id116,id118,id109,id111,id112],'transitions + target Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id118,id109,id110,id111,id112],'transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id118,id119,id109,id111,id112],'transitions + target Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				)
			]
		),
		graph(id([id116,id118,id119,id109,id110,id111,id112],'transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				)
			]
		),
		graph(id([id116,id117,id109,id111,id112],'transitions + source Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id117,id109,id110,id111,id112],'transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id117,id119,id109,id111,id112],'transitions + source Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				)
			]
		),
		graph(id([id116,id117,id119,id109,id110,id111,id112],'transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				)
			]
		),
		graph(id([id116,id117,id118,id109,id111,id112],'transitions + source Initial + target Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id117,id118,id109,id110,id111,id112],'transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				)
			]
		),
		graph(id([id116,id117,id118,id119,id109,id111,id112],'transitions + source Initial + target Initial + states Initial + Transition + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				)
			]
		),
		graph(id([id116,id117,id118,id119,id109,id110,id111,id112],'transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id23], [id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				)
			]
		),
		graph(id([id115,id110,id111],'states State + State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id110,id111,id112],'states State + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id109,id110,id111],'states State + Transition + State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id109,id110,id111,id112],'states State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id119,id110,id111,id112],'states State + states Initial + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id119,id109,id110,id111,id112],'states State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id22], [id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id118,id109,id110,id111,id112],'states State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id118,id119,id109,id110,id111,id112],'states State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id36,id22], [id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id117,id109,id110,id111,id112],'states State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id117,id119,id109,id110,id111,id112],'states State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id22], [id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id117,id118,id109,id110,id111,id112],'states State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id115,id117,id118,id119,id109,id110,id111,id112],'states State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id34,id36,id22], [id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id109,id110,id111],'states State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id109,id110,id111,id112],'states State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id119,id109,id110,id111,id112],'states State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id22], [id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id118,id109,id110,id111,id112],'states State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id118,id119,id109,id110,id111,id112],'states State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id36,id22], [id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id117,id109,id110,id111,id112],'states State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id117,id119,id109,id110,id111,id112],'states State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id22], [id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id117,id118,id109,id110,id111,id112],'states State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id115,id116,id117,id118,id119,id109,id110,id111,id112],'states State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id33,id34,id36,id22], [id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id31,id23], [id11,id1]
				)
			]
		),
		graph(id([id114,id109,id110],'target State + Transition + State'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id109,id110,id112],'target State + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id109,id110,id111],'target State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id109,id110,id111,id112],'target State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id119,id109,id110,id111,id112],'target State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id118,id109,id110,id112],'target State + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id118,id109,id110,id111,id112],'target State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id118,id119,id109,id110,id111,id112],'target State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id109,id110,id112],'target State + source Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id109,id110,id111,id112],'target State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id119,id109,id110,id111,id112],'target State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id118,id109,id110,id112],'target State + source Initial + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id118,id109,id110,id111,id112],'target State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id117,id118,id119,id109,id110,id111,id112],'target State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id109,id110,id111],'target State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id109,id110,id111,id112],'target State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id119,id109,id110,id111,id112],'target State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id118,id109,id110,id111,id112],'target State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id118,id119,id109,id110,id111,id112],'target State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id117,id109,id110,id111,id112],'target State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id117,id119,id109,id110,id111,id112],'target State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id117,id118,id109,id110,id111,id112],'target State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id116,id117,id118,id119,id109,id110,id111,id112],'target State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id36,id28], [id23,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id23], [id8,id1]
				)
			]
		),
		graph(id([id114,id115,id109,id110,id111],'target State + states State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id115,id109,id110,id111,id112],'target State + states State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id115,id119,id109,id110,id111,id112],'target State + states State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id22], [id7,id0]
				)
			]
		),
		graph(id([id114,id115,id118,id109,id110,id111,id112],'target State + states State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id114,id115,id118,id119,id109,id110,id111,id112],'target State + states State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id117,id109,id110,id111,id112],'target State + states State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id114,id115,id117,id119,id109,id110,id111,id112],'target State + states State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id117,id118,id109,id110,id111,id112],'target State + states State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id114,id115,id117,id118,id119,id109,id110,id111,id112],'target State + states State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id34,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id34,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id109,id110,id111],'target State + states State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id109,id110,id111,id112],'target State + states State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id119,id109,id110,id111,id112],'target State + states State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id7,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id118,id109,id110,id111,id112],'target State + states State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id118,id119,id109,id110,id111,id112],'target State + states State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id117,id109,id110,id111,id112],'target State + states State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id117,id119,id109,id110,id111,id112],'target State + states State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id117,id118,id109,id110,id111,id112],'target State + states State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id114,id115,id116,id117,id118,id119,id109,id110,id111,id112],'target State + states State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id33,id34,id36,id28], [id23,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id28,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id28,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id28,id33,id34,id36,id22], [id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id29,id31,id23], [id8,id11,id1]
				)
			]
		),
		graph(id([id113,id109,id110],'source State + Transition + State'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id109,id110,id112],'source State + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id109,id110,id111],'source State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id109,id110,id111,id112],'source State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id119,id109,id110,id111,id112],'source State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id118,id109,id110,id112],'source State + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id118,id109,id110,id111,id112],'source State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id118,id119,id109,id110,id111,id112],'source State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id109,id110,id112],'source State + source Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id109,id110,id111,id112],'source State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id119,id109,id110,id111,id112],'source State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id118,id109,id110,id112],'source State + source Initial + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id118,id109,id110,id111,id112],'source State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id117,id118,id119,id109,id110,id111,id112],'source State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id109,id110,id111],'source State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id109,id110,id111,id112],'source State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id119,id109,id110,id111,id112],'source State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id118,id109,id110,id111,id112],'source State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id118,id119,id109,id110,id111,id112],'source State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id117,id109,id110,id111,id112],'source State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id117,id119,id109,id110,id111,id112],'source State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id117,id118,id109,id110,id111,id112],'source State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id116,id117,id118,id119,id109,id110,id111,id112],'source State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id36,id26], [id23,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id5]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id5,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id23], [id5,id1]
				)
			]
		),
		graph(id([id113,id115,id109,id110,id111],'source State + states State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id115,id109,id110,id111,id112],'source State + states State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id115,id119,id109,id110,id111,id112],'source State + states State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id22], [id4,id0]
				)
			]
		),
		graph(id([id113,id115,id118,id109,id110,id111,id112],'source State + states State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id115,id118,id119,id109,id110,id111,id112],'source State + states State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id117,id109,id110,id111,id112],'source State + states State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id115,id117,id119,id109,id110,id111,id112],'source State + states State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id117,id118,id109,id110,id111,id112],'source State + states State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id115,id117,id118,id119,id109,id110,id111,id112],'source State + states State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id34,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id34,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id109,id110,id111],'source State + states State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id109,id110,id111,id112],'source State + states State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id119,id109,id110,id111,id112],'source State + states State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id118,id109,id110,id111,id112],'source State + states State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id118,id119,id109,id110,id111,id112],'source State + states State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id117,id109,id110,id111,id112],'source State + states State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id117,id119,id109,id110,id111,id112],'source State + states State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id117,id118,id109,id110,id111,id112],'source State + states State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id115,id116,id117,id118,id119,id109,id110,id111,id112],'source State + states State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id33,id34,id36,id26], [id23,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id33,id34,id36,id22], [id5,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id4,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id31,id23], [id5,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id109,id110],'source State + target State + Transition + State'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id109,id110,id112],'source State + target State + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id109,id110,id111],'source State + target State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id109,id110,id111,id112],'source State + target State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id119,id109,id110,id111,id112],'source State + target State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id118,id109,id110,id112],'source State + target State + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id118,id109,id110,id111,id112],'source State + target State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id118,id119,id109,id110,id111,id112],'source State + target State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id109,id110,id112],'source State + target State + source Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id109,id110,id111,id112],'source State + target State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id119,id109,id110,id111,id112],'source State + target State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id118,id109,id110,id112],'source State + target State + source Initial + target Initial + Transition + State + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id118,id109,id110,id111,id112],'source State + target State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id24], [id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id117,id118,id119,id109,id110,id111,id112],'source State + target State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id38,id24], [id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id109,id110,id111],'source State + target State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id109,id110,id111,id112],'source State + target State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id119,id109,id110,id111,id112],'source State + target State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id118,id109,id110,id111,id112],'source State + target State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id118,id119,id109,id110,id111,id112],'source State + target State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id117,id109,id110,id111,id112],'source State + target State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id117,id119,id109,id110,id111,id112],'source State + target State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id117,id118,id109,id110,id111,id112],'source State + target State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id32], [id22,id26,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id12], [id0,id4,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id24], [id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id116,id117,id118,id119,id109,id110,id111,id112],'source State + target State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id36,id26], [id23,id29,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id36,id28], [id23,id27,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id38,id32], [id22,id26,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id20,id12], [id0,id4,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id32,id38,id24], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id5,id8,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id23], [id5,id8,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id109,id110,id111],'source State + target State + states State + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id115,id109,id110,id111,id112],'source State + target State + states State + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id115,id119,id109,id110,id111,id112],'source State + target State + states State + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id0]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id22], [id4,id7,id0]
				)
			]
		),
		graph(id([id113,id114,id115,id118,id109,id110,id111,id112],'source State + target State + states State + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id114,id115,id118,id119,id109,id110,id111,id112],'source State + target State + states State + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id117,id109,id110,id111,id112],'source State + target State + states State + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id114,id115,id117,id119,id109,id110,id111,id112],'source State + target State + states State + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id117,id118,id109,id110,id111,id112],'source State + target State + states State + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id2]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id24], [id10,id2]
				)
			]
		),
		graph(id([id113,id114,id115,id117,id118,id119,id109,id110,id111,id112],'source State + target State + states State + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id34,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id34,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id34,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id109,id110,id111],'source State + target State + states State + transitions + Transition + State + StateMachine'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id109,id110,id111,id112],'source State + target State + states State + transitions + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id25], [id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id119,id109,id110,id111,id112],'source State + target State + states State + transitions + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id28,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id7,id13]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id118,id109,id110,id111,id112],'source State + target State + states State + transitions + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id36], [id25,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id25], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id118,id119,id109,id110,id111,id112],'source State + target State + states State + transitions + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id28,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id7,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id36], [id25,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id37,id39,id25], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id117,id109,id110,id111,id112],'source State + target State + states State + transitions + source Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id34], [id25,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id25], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id15,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id117,id119,id109,id110,id111,id112],'source State + target State + states State + transitions + source Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id28,id34,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id7,id14,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id34], [id25,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id39,id25], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id15,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id14,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id117,id118,id109,id110,id111,id112],'source State + target State + states State + transitions + source Initial + target Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id32], [id22,id26,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id12], [id0,id4,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id36,id34], [id25,id37,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id34,id36], [id25,id35,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id25], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id15,id18,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		),
		graph(id([id113,id114,id115,id116,id117,id118,id119,id109,id110,id111,id112],'source State + target State + states State + transitions + source Initial + target Initial + states Initial + Transition + State + StateMachine + Initial'),
			[
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id9]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id19]
				),
				node(typeV(['AnyMatchClass',statemachine,'Initial']),
					[id35,id37,id39,id25]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15,id18,id21,id3]
				),
				node(typeV(['AnyMatchClass',statemachine,'StateMachine']),
					[id30,id32,id38,id24]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10,id12,id20,id2]
				),
				node(typeV(['AnyMatchClass',statemachine,'Transition']),
					[id26,id28,id33,id34,id36,id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id4,id7,id13,id14,id17,id0]
				),
				node(typeV(['AnyMatchClass',statemachine,'State']),
					[id27,id29,id31,id23]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5,id8,id11,id1]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',source]),
					id123, [id22,id28,id33,id34,id36,id26], [id23,id29,id31,id27]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id130, [id0,id7,id13,id14,id17,id4], [id6]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id131, [id6], [id1,id8,id11,id5]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id124, [id22,id26,id33,id34,id36,id28], [id23,id27,id31,id29]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id132, [id9], [id1,id5,id11,id8]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id133, [id0,id4,id13,id14,id17,id7], [id9]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id125, [id24,id32,id38,id30], [id23,id27,id29,id31]
				),
				edge(typeE(['ApplyAssociation',places]),
					id134, [id2,id12,id20,id10], [id1,id5,id8,id11]
				),
				edge(typeE(['PositiveMatchAssociation',transitions]),
					id126, [id24,id30,id38,id32], [id22,id26,id28,id34,id36,id33]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id135, [id2,id10,id20,id12], [id0,id4,id7,id14,id17,id13]
				),
				edge(typeE(['PositiveMatchAssociation',source]),
					id127, [id22,id26,id28,id33,id36,id34], [id25,id37,id39,id35]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id136, [id0,id4,id7,id13,id17,id14], [id16]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id137, [id16], [id3,id18,id21,id15]
				),
				edge(typeE(['PositiveMatchAssociation',target]),
					id128, [id22,id26,id28,id33,id34,id36], [id25,id35,id39,id37]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id138, [id19], [id3,id15,id21,id18]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id139, [id0,id4,id7,id13,id14,id17], [id19]
				),
				edge(typeE(['PositiveMatchAssociation',states]),
					id129, [id24,id30,id32,id38], [id25,id35,id37,id39]
				),
				edge(typeE(['ApplyAssociation',places]),
					id140, [id2,id10,id12,id20], [id3,id15,id18,id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id35,id37,id39,id25], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id30,id32,id38,id24], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id19]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id15,id18,id21,id3]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id26,id28,id33,id34,id36,id22], [id5,id8,id11,id1]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id6]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id9]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id10,id12,id20,id2]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id4,id7,id13,id14,id17,id0]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					new, [id27,id29,id31,id23], [id5,id8,id11,id1]
				)
			]
		)	])

]).
