%Obtain a list with the id of all ADT in the model
findAllAdts(ADTS):-findall(ADT_ID, entity('SATEL.APN.adtmm','ADT', ADT_ID,_),ADTS).
%Obtain a list with the id of all Generators of the ADT with id = ADTID.
findGenerators(ADTID, GENS):-findall(GENID,relation('ownedGenerators', ADTID, GENID),GENS).

findOperation



%criar modelo hierarquico
start(LIST):-entity('SATEL','Model',ID,no_parent_available), go(ID, LIST). 



go(ID,Func):-findall(X,relation(X,ID,Y),R), LIST)
goWithRel(Relation, 
