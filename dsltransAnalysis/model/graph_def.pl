%graph([
%	vertex(typeV(['AnyMatchClass','mprolog','Clause']),[id6,id1])
%], [
%	edge(typeE(['PositiveMatchAssociation','ownedHead'],[id6,id1],[id5,id4])
%]).

%%%%%%%%%%%%%%%%%%%%% build facilities
%%%%%%%%%%% build a list of layers
%%%%% each layer is a list of graphs
%%%%% transformation(File,[layer])

get_pvalue(Set,Name,nullValue):-
	not(member(p(Name,_),Set)).
get_pvalue(Set,Name,Value):-
	member(p(Name,Value),Set).

buildGraph(File,transformation(File,LayerList)):-
	consult(File),
	get_layerlist(LayerList).


get_layerlist(LayerList):-
	findall(layer(Id,Prev,RuleList),
		get_layer(Id,Prev,RuleList),
		PreLayerList),
	normalize_layer(PreLayerList,LayerList).
	
get_layer(Id,Prev,RuleList):-
	class('dsltrans','Sequential',Id,_,Rels),
		(
			member(p('previousSource',Prev),Rels),
			class('dsltrans','Sequential',Prev,_,_)			
		),
	findall(IdRule,member(p('hasRule', IdRule),Rels),RuleList).
	
get_layer(Id,null,RuleList):-
	class('dsltrans','Sequential',Id,_,Rels),
		not((
			member(p('previousSource',Prev),Rels),
			class('dsltrans','Sequential',Prev,_,_)			
		)),
	findall(IdRule,member(p('hasRule', IdRule),Rels),RuleList).
	

normalize_layer(A,B):- normalize_layer(A,null,B).
  
normalize_layer([],_,[]).
normalize_layer(A,K,[rules(RL1)|B]):-
	member(layer(Id,K,RL),A),
	list_remove(layer(Id,K,RL),A,A1),
	get_rules(RL,RL1),
	normalize_layer(A1,Id,B).	

get_rules([],[]).

get_rules([Id|K],[graph(id([Id],Name),V,E)|Z]):-
	once(class('dsltrans','Rule',Id,Attr,Rels)),
	get_rule_name(Attr,Name),
	get_rule_nodes(Rels,V),
	get_rule_edges(Rels,E),
	get_rules(K,Z).
	
get_rule_name(Attr,'_noname'):- not(member(p('description',_),Attr)).
get_rule_name(Attr,Name):- once(member(p('description',Name),Attr)).

get_rule_nodes(Rels,V):-
	once(member(p('match',IdMatch),Rels)),
	once(member(p('apply',IdApply),Rels)),
	once(class('dsltrans','MatchModel',IdMatch,_,MatchRels)),
	once(class('dsltrans','ApplyModel',IdApply,_,ApplyRels)),
	get_nodes(MatchRels,V1),
	get_nodes(ApplyRels,V2),
	concatenate(V1,V2,V).

get_nodes(Rels,V):-
	findall(
		node(typeV([DSLTransClass,PackageName,ClassName]),[IdClass]),
		(
			member(p('class',IdClass),Rels),
			once(class('dsltrans',DSLTransClass,IdClass,ClassAttrs,_)),
			get_pvalue(ClassAttrs,'packageName',PackageName),
			get_pvalue(ClassAttrs,'className',ClassName)
		),V).

get_rule_edges(Rels,E):-
	once(member(p('match',IdMatch),Rels)),
	once(member(p('apply',IdApply),Rels)),
	once(class('dsltrans','MatchModel',IdMatch,_,MatchRels)),
	once(class('dsltrans','ApplyModel',IdApply,_,ApplyRels)),
	get_assoc_edges(MatchRels,E1),
	get_assoc_edges(ApplyRels,E2),
	get_backward_edges(Rels,B),
	concatenate(E1,E2,E3),
	concatenate(E3,B,E).

get_assoc_edges(Rels,E):-
	findall(
		edge(typeE([DSLTransClass,AssocName]),IdAssociation,[Source],[Target]),
		(
			member(p('association',IdAssociation),Rels),
			once(class('dsltrans',DSLTransClass,IdAssociation,AssociationAttrs,AssociationRels)),
			get_pvalue(AssociationAttrs,'associationName',AssocName),
			get_pvalue(AssociationRels,'source',Source),
			get_pvalue(AssociationRels,'target',Target)			
		),E).

get_backward_edges(Rels,E):- 
	findall(
		edge(typeE([DSLTransClass]),IdAssociation,[Source],[Target]),
		(
			member(p('backwards',IdAssociation),Rels),
			once(class('dsltrans',DSLTransClass,IdAssociation,_,AssociationRels)),
			get_pvalue(AssociationRels,'sourceClass',Source),
			get_pvalue(AssociationRels,'targetClass',Target)			
		),E).

%%%%%%%%%%%%%%%%%%%%% printing facilities
print_Trans(transformation(File,LayerList),Out):-
	write(Out,'transformation(\''), write(Out,File), write(Out,'\', '),nl(Out),
	write(Out,'['),
	print_Layer(LayerList,Out),
	write(Out,']).'),nl(Out).
	
print_Transformation(Trans,in(File)):-
	open(File, write, Graphs),
	print_Trans(Trans,Graphs),
	close(Graphs).
	
print_Layer([],Out):- nl(Out).
print_Layer([H],Out):- nl(Out),
	print_Rule(H,Out),nl(Out).

print_Layer([H,L|T],Out):- nl(Out),
	print_Rule(H,Out),
	write(Out,','),
	print_Layer([L|T],Out).
	
print_Rule(rules(H),Out):-
	write(Out,'\trules(['),
	print_Graphs(H,Out),
	write(Out,'\t])'), nl(Out).
	
print_Graphs([],Out):- nl(Out).
print_Graphs([graph(N,V,E)],Out):- nl(Out),
	write(Out,'\t\tgraph('),write_term(Out,N,[quoted(true)]),write(Out,','),nl(Out),
	write(Out,'\t\t\t['),
	print_Nodes(V,Out),
	write(Out,'\t\t\t], ['),	
	print_Edges(E,Out),
	write(Out,'\t\t\t]'),nl(Out),
	write(Out,'\t\t)').


print_Graphs([graph(N,V,E),L|T],Out):- nl(Out),
	write(Out,'\t\tgraph('),write_term(Out,N,[quoted(true)]),write(Out,','),nl(Out),
	write(Out,'\t\t\t['),
	print_Nodes(V,Out),
	write(Out,'\t\t\t], ['),
	print_Edges(E,Out),
	write(Out,'\t\t\t]'),nl(Out),
	write(Out,'\t\t),'),
	print_Graphs([L|T],Out).
	
print_Nodes([],Out):- nl(Out).
print_Nodes([node(Type,Ids)],Out):- nl(Out),
	write(Out,'\t\t\t\tnode('),write_term(Out,Type,[quoted(true)]),write(Out,','), nl(Out),
	write(Out,'\t\t\t\t\t'),write(Out,Ids),nl(Out),
	write(Out,'\t\t\t\t)'), nl(Out).

print_Nodes([node(Type,Ids),L|T],Out):- nl(Out),
	write(Out,'\t\t\t\tnode('),write_term(Out,Type,[quoted(true)]),write(Out,','), nl(Out),
	write(Out,'\t\t\t\t\t'),write(Out,Ids),nl(Out),
	write(Out,'\t\t\t\t),'),
	print_Nodes([L|T],Out).

print_Edges([],Out):- nl(Out).
print_Edges([edge(Type,Ids,Source,Target)],Out):- nl(Out),
	write(Out,'\t\t\t\tedge('),write_term(Out,Type,[quoted(true)]),write(Out,','), nl(Out),
	write(Out,'\t\t\t\t\t'),write(Out,Ids),write(Out,', '),write(Out,Source),write(Out,', '),write(Out,Target),nl(Out),
	write(Out,'\t\t\t\t)'), nl(Out).

print_Edges([edge(Type,Ids,Source,Target),L|T],Out):- nl(Out),
	write(Out,'\t\t\t\tedge('),write_term(Out,Type,[quoted(true)]),write(Out,','), nl(Out),
	write(Out,'\t\t\t\t\t'),write(Out,Ids),write(Out,', '),write(Out,Source),write(Out,', '),write(Out,Target),nl(Out),
	write(Out,'\t\t\t\t),'),
	print_Edges([L|T],Out).
