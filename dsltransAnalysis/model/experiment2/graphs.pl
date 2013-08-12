transformation('.\experiment2\RPG.ecore.dsltrans', 
[
	rules([
		graph(id([id312],'Cell Free'),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id79]
				),
				node(typeV(['AnyMatchClass',rpg,'Hero']),
					[id80]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id4]
				)
			], [
				edge(typeE(['NegativeMatchAssociation',occupies]),
					id267, [id80], [id79]
				)
			]
		),
		graph(id([id313],'Key'),
			[
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id81]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id5]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id6]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id7]
				)
			], [
				edge(typeE(['ApplyAssociation',targetPlace]),
					id356, [id7], [id5]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id357, [id6], [id7]
				)
			]
		),
		graph(id([id314],'RPG'),
			[
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id82]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id8]
				)
			], [
			]
		),
		graph(id([id315],'Cell Occupied'),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id83]
				),
				node(typeV(['AnyMatchClass',rpg,'Hero']),
					[id84]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id9]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id330, [id84], [id83]
				)
			]
		)	])
,
	rules([
		graph(id([id316],hasCell),
			[
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id85]
				),
				node(typeV(['AnyMatchClass',rpg,'WorldMap']),
					[id86]
				),
				node(typeV(['AnyMatchClass',rpg,'Scene']),
					[id87]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id88]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id10]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id11]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',hasWorldMap]),
					id331, [id85], [id86]
				),
				edge(typeE(['PositiveMatchAssociation',hasScene]),
					id332, [id86], [id87]
				),
				edge(typeE(['PositiveMatchAssociation',hasCell]),
					id333, [id87], [id88]
				),
				edge(typeE(['ApplyAssociation',places]),
					id358, [id10], [id11]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id272, [id85], [id10]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id273, [id88], [id11]
				)
			]
		),
		graph(id([id317],hasObject),
			[
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id89]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id90]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id12]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id13]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id14]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',hasObject]),
					id334, [id89], [id90]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id359, [id12], [id13]
				),
				edge(typeE(['ApplyAssociation',places]),
					id360, [id12], [id14]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id274, [id89], [id12]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id275, [id90], [id13]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id276, [id90], [id14]
				)
			]
		),
		graph(id([id318],left),
			[
				node(typeV(['NegativeMatchClass',rpg,'Door']),
					[id175]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id91]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id92]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id93]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id15]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id16]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id17]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id18]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id19]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id20]
				)
			], [
				edge(typeE(['NegativeMatchAssociation',occupies]),
					id268, [id175], [id92]
				),
				edge(typeE(['PositiveMatchAssociation',left]),
					id335, [id91], [id92]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id361, [id19], [id15]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id362, [id18], [id16]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id363, [id17], [id18]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id364, [id17], [id19]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id365, [id20], [id17]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id277, [id91], [id15]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id278, [id92], [id16]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id279, [id93], [id20]
				)
			]
		),
		graph(id([id319],right),
			[
				node(typeV(['NegativeMatchClass',rpg,'Door']),
					[id176]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id94]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id95]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id96]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id21]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id22]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id23]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id24]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id25]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id26]
				)
			], [
				edge(typeE(['NegativeMatchAssociation',occupies]),
					id269, [id176], [id95]
				),
				edge(typeE(['PositiveMatchAssociation',right]),
					id336, [id94], [id95]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id366, [id25], [id21]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id367, [id24], [id22]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id368, [id23], [id24]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id369, [id23], [id25]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id370, [id26], [id23]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id280, [id94], [id21]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id281, [id95], [id22]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id282, [id96], [id26]
				)
			]
		),
		graph(id([id320],top),
			[
				node(typeV(['NegativeMatchClass',rpg,'Door']),
					[id177]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id97]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id98]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id99]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id27]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id28]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id29]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id30]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id31]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id32]
				)
			], [
				edge(typeE(['NegativeMatchAssociation',occupies]),
					id270, [id177], [id98]
				),
				edge(typeE(['PositiveMatchAssociation',top]),
					id337, [id97], [id98]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id371, [id31], [id27]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id372, [id30], [id28]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id373, [id29], [id30]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id374, [id29], [id31]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id375, [id32], [id29]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id283, [id97], [id27]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id284, [id98], [id28]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id285, [id99], [id32]
				)
			]
		),
		graph(id([id321],bottom),
			[
				node(typeV(['NegativeMatchClass',rpg,'Door']),
					[id178]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id100]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id101]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id102]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id33]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id34]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id35]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id36]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id37]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id38]
				)
			], [
				edge(typeE(['NegativeMatchAssociation',occupies]),
					id271, [id178], [id101]
				),
				edge(typeE(['PositiveMatchAssociation',bottom]),
					id338, [id100], [id101]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id376, [id37], [id33]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id377, [id36], [id34]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id378, [id35], [id36]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id379, [id35], [id37]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id380, [id38], [id35]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id286, [id100], [id33]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id287, [id101], [id34]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id288, [id102], [id38]
				)
			]
		),
		graph(id([id322],leftDoor),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id103]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id104]
				),
				node(typeV(['AnyMatchClass',rpg,'Door']),
					[id105]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id106]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id107]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id108]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id39]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id40]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id41]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id42]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id43]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id44]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id45]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id46]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id47]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',left]),
					id339, [id103], [id104]
				),
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id340, [id105], [id104]
				),
				edge(typeE(['PositiveMatchAssociation',exit]),
					id341, [id105], [id106]
				),
				edge(typeE(['PositiveMatchAssociation',opens]),
					id342, [id107], [id105]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id381, [id43], [id39]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id382, [id42], [id40]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id383, [id41], [id42]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id384, [id41], [id43]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id385, [id46], [id44]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id386, [id45], [id44]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id387, [id41], [id46]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id388, [id41], [id45]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id389, [id47], [id41]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id289, [id103], [id39]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id290, [id106], [id40]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id291, [id107], [id44]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id292, [id108], [id47]
				)
			]
		),
		graph(id([id323],rightDoor),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id109]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id110]
				),
				node(typeV(['AnyMatchClass',rpg,'Door']),
					[id111]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id112]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id113]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id114]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id48]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id49]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id50]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id51]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id52]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id53]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id54]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id55]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id56]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',right]),
					id343, [id109], [id110]
				),
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id344, [id111], [id110]
				),
				edge(typeE(['PositiveMatchAssociation',exit]),
					id345, [id111], [id112]
				),
				edge(typeE(['PositiveMatchAssociation',opens]),
					id346, [id113], [id111]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id390, [id52], [id48]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id391, [id51], [id49]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id392, [id50], [id51]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id393, [id50], [id52]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id394, [id55], [id53]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id395, [id54], [id53]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id396, [id50], [id55]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id397, [id50], [id54]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id398, [id56], [id50]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id293, [id109], [id48]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id294, [id112], [id49]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id295, [id111], [id50]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id296, [id113], [id53]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id297, [id114], [id56]
				)
			]
		),
		graph(id([id324],topDoor),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id115]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id116]
				),
				node(typeV(['AnyMatchClass',rpg,'Door']),
					[id117]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id118]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id119]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id120]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id57]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id58]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id59]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id60]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id61]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id62]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id63]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id64]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id65]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',top]),
					id347, [id115], [id116]
				),
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id348, [id117], [id116]
				),
				edge(typeE(['PositiveMatchAssociation',exit]),
					id349, [id117], [id118]
				),
				edge(typeE(['PositiveMatchAssociation',opens]),
					id350, [id119], [id117]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id399, [id61], [id57]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id400, [id60], [id58]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id401, [id59], [id60]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id402, [id59], [id61]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id403, [id64], [id62]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id404, [id63], [id62]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id405, [id59], [id64]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id406, [id59], [id63]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id407, [id65], [id59]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id298, [id115], [id57]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id299, [id118], [id58]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id300, [id117], [id59]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id301, [id119], [id62]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id302, [id120], [id65]
				)
			]
		),
		graph(id([id325],bottomDoor),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id121]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id122]
				),
				node(typeV(['AnyMatchClass',rpg,'Door']),
					[id123]
				),
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id124]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id125]
				),
				node(typeV(['AnyMatchClass',rpg,'RPG']),
					[id126]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id66]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id67]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id68]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id69]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id70]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id71]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id72]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id73]
				),
				node(typeV(['ApplyClass',petrinet,'PetriNet']),
					[id74]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',bottom]),
					id351, [id121], [id122]
				),
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id352, [id123], [id122]
				),
				edge(typeE(['PositiveMatchAssociation',exit]),
					id353, [id123], [id124]
				),
				edge(typeE(['PositiveMatchAssociation',opens]),
					id354, [id125], [id123]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id408, [id70], [id66]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id409, [id69], [id67]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id410, [id68], [id69]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id411, [id68], [id70]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id412, [id73], [id71]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id413, [id72], [id71]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id414, [id68], [id73]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id415, [id68], [id72]
				),
				edge(typeE(['ApplyAssociation',transitions]),
					id416, [id74], [id68]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id303, [id121], [id66]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id304, [id124], [id67]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id305, [id125], [id71]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id306, [id126], [id74]
				)
			]
		),
		graph(id([id326],getKey),
			[
				node(typeV(['AnyMatchClass',rpg,'Cell']),
					[id127]
				),
				node(typeV(['AnyMatchClass',rpg,'Key']),
					[id128]
				),
				node(typeV(['ApplyClass',petrinet,'Place']),
					[id75]
				),
				node(typeV(['ApplyClass',petrinet,'Transition']),
					[id76]
				),
				node(typeV(['ApplyClass',petrinet,'InArc']),
					[id77]
				),
				node(typeV(['ApplyClass',petrinet,'OutArc']),
					[id78]
				)
			], [
				edge(typeE(['PositiveMatchAssociation',occupies]),
					id355, [id128], [id127]
				),
				edge(typeE(['ApplyAssociation',sourcePlace]),
					id417, [id78], [id75]
				),
				edge(typeE(['ApplyAssociation',targetPlace]),
					id418, [id77], [id75]
				),
				edge(typeE(['ApplyAssociation',inArc]),
					id419, [id76], [id77]
				),
				edge(typeE(['ApplyAssociation',outArc]),
					id420, [id76], [id78]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id307, [id127], [id75]
				),
				edge(typeE(['PositiveBackwardRestriction']),
					id308, [id128], [id76]
				)
			]
		)	])

]).
