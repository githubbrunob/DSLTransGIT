package dsltrans.transformer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dsltrans.AbstractSource;
import dsltrans.FilePort;
import dsltrans.Layer;
import dsltrans.io.PersistenceLayer;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;

public class TransformationController {
	private final List<TransformationLayer> _units;
	private final List<TransformationSource> _sources;
	private final Map<String, Object> _metamodels;
	private final PersistenceLayer persistenceLayer;
	private final InstanceDatabaseManager instanceDatabaseManager;
	
	TransformationController(PersistenceLayer persistenceL, InstanceDatabaseManager databaseManager) {
		_units = new LinkedList<TransformationLayer>();
		_sources = new LinkedList<TransformationSource>();
		_metamodels = new HashMap<String, Object>();		
		persistenceLayer = persistenceL;
		instanceDatabaseManager = databaseManager;
	}
	
	public InstanceDatabaseManager getDatabaseManager(){
		return instanceDatabaseManager;
	}
	
	public void add(Layer l) {
		getUnits().add(new TransformationSequentialLayer(this, l, persistenceLayer));
	}

	public void add(FilePort source) {
		getSources().add(new TransformationSource(source));
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
					}
				}
			}
		}
	}
	
	private TransformationUnit resolve(AbstractSource requirement) throws Throwable {
		for(TransformationLayer l:getUnits()) {
			if(l.getLayer() == requirement && l.isValid())
				return l;
		}
		for(TransformationSource s:getSources()) {
			if(s.getPort() == requirement) {
				s.Load(persistenceLayer.buildModelLoader(instanceDatabaseManager), getMetamodels());
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
	
	public Map<String, Object> getMetamodels() {
		return _metamodels;
	}

	public InstanceDatabase getLastOutputModelDatabase(MetaModelDatabase mmd, 
			TransformationLayer layer, String groupName) {

		{
			TransformationLayer ts = (TransformationLayer)layer.getPrecedingUnit();
			do {
				if(ts.getMetaDatabase() == mmd &&
						ts.getGroupName().equals(groupName))
						return ts.getOutputModelDatabase();
				if(!(ts.getPrecedingUnit() instanceof TransformationLayer))
					break;
				ts = (TransformationLayer)ts.getPrecedingUnit();
			}
			while(ts instanceof TransformationLayer);
		}
		return layer.getOutputModelDatabase();
	}
}
