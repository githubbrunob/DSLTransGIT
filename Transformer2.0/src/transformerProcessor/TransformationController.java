package transformerProcessor;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import persistence.PersistenceLayer;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationSourceException;
import transformerProcessor.exceptions.UnsuportedMetamodelException;
import dsltrans.AbstractSource;
import dsltrans.FilePort;
import dsltrans.Layer;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.metamodel.MetaModelDatabase;

public class TransformationController {
	private final List<TransformationLayer> _units;
	private final List<TransformationSource> _sources;
	private final Map<String, Object> _factorys;
	private final Map<String, Object> _metamodels;
	private final String _classdir;
	private final PersistenceLayer persistenceLayer;
	
	TransformationController(String classdir, PersistenceLayer persistenceL) {
		_units = new LinkedList<TransformationLayer>();
		_sources = new LinkedList<TransformationSource>();
		_factorys = new HashMap<String, Object>();
		_metamodels = new HashMap<String, Object>();		
		_classdir = classdir;
		persistenceLayer = persistenceL;
	}
	
	public void add(Layer l) {
		getUnits().add(new TransformationSequentialLayer(getClassdir(), this, l,persistenceLayer));
	}

	public void add(FilePort source) {
		getSources().add(new TransformationSource(getClassdir(),source));
	}

	public void Execute() throws Throwable {
		while(canProcess()) {
			for(TransformationLayer l:getUnits()) {
				if(!l.isProcessed() && l.isValid()) {
					boolean toExecute = true;
					List<TransformationUnit> unitlist = new LinkedList<TransformationUnit>();
					for(AbstractSource as: l.getRequirements()) {
						TransformationUnit unit;
						unit = resolve(as);
						if(!unit.isProcessed()) {
							toExecute = false;
							break;
						}
						if (l.getLayer().getPreviousSource().contains(as))
							unitlist.add(unit);
					}
					
					if(toExecute) {
						for(TransformationUnit unit:unitlist) {
							l.Execute( unit );
						}
						l.setRules(null);
						//releaseDatabases(getUnits());		
					}
				}
			}
		}
	}
	
	/*
	private void releaseDatabases(List<TransformationLayer> list) {
		for(TransformationLayer transformationLayer:list) {
			if(transformationLayer.isProcessed() && transformationLayer.getGroupName().isEmpty()
				&& !belongsToSomeRequirements(transformationLayer)) {
				
				transformationLayer.setMetaDatabase(null);
				transformationLayer.setDatabase(null);
			}
		}
	}
	*/
	/*
	private boolean belongsToSomeRequirements(
			TransformationLayer tl) {

		for(TransformationLayer transformationLayer:getUnits()) {
			if(tl != transformationLayer && 
				!transformationLayer.isProcessed()) {
		
				for(AbstractSource as: transformationLayer.getRequirements()) {
					for(TransformationLayer l:getUnits()) {
						if(l.getLayer() == as && l == tl) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	*/
	private TransformationUnit resolve(AbstractSource requirement) throws InvalidLayerRequirement, TransformationSourceException, IOException, UnsuportedMetamodelException {
		for(TransformationLayer l:getUnits()) {
			if(l.getLayer() == requirement && l.isValid())
				return l;
		}
		for(TransformationSource s:getSources()) {
			if(s.getPort() == requirement) {
				s.Load(_factorys,getMetamodels());
				s.Check();
				return s;
			}
		}
		throw new InvalidLayerRequirement("Cannot resolve source: " + requirement.toString());
	}

	private boolean canProcess() {
		for(TransformationLayer l:getUnits()) {
			if(!l.isProcessed() && l.isValid())
				return true;
		}
		return false;
	}

	public List<TransformationLayer> getUnits() {
		return _units;
	}

	public List<TransformationSource> getSources() {
		return _sources;
	}
	
	public TransformationSource getSource(FilePort as) {
		for (TransformationSource ts : getSources())
			if ((ts.getPort() == as))
				return ts;
		return null;
	}
	
//	public InstanceDatabase checkDatabase(String metaModelURI) {
//		for (TransformationSource ts: getSources()) {
//			if ((ts.getPort().getMetaModelId().getMetaModelURI().equals(metaModelURI)) && (ts.isProcessed()))
//				return ts.getDatabase();
//		}
//		return null;
//	}
	
	public Map<String, Object> getFactorys() {
		return _factorys;
	}

	public String getClassdir() {
		return _classdir;
	}

	public Map<String, Object> getMetamodels() {
		return _metamodels;
	}

	public InstanceDatabase getLastDatabase(MetaModelDatabase mmd, 
			TransformationLayer layer, String groupName) {

		{
			TransformationLayer ts = (TransformationLayer)layer.getPrecedingUnit();
			do {
				if(ts.getMetaDatabase() == mmd &&
						ts.getGroupName().equals(groupName))
						return ts.getDatabase();
				if(!(ts.getPrecedingUnit() instanceof TransformationLayer))
					break;
				ts = (TransformationLayer)ts.getPrecedingUnit();
			}
			while(ts instanceof TransformationLayer);
		}
		return layer.getDatabase();
	}
}
