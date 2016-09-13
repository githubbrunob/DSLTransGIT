package dsltrans.transformer;

import java.io.IOException;
import java.util.Map;

import dsltrans.Layer;
import dsltrans.io.ModelLoader;
import dsltrans.io.PersistenceLayer;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;

public class TransformationSequentialLayer extends TransformationLayer {

	TransformationSequentialLayer(TransformationController tc, Layer l, PersistenceLayer persistenceL) {
			super(tc, l, persistenceL);
	}

	protected void prepareInputModel() {
		TransformationSource ts = getTransformationSource(this.getPrecedingUnit());
		setMatchMetaModel(ts.getMetaDatabase());
		setMatchModel(ts.getOutputModelDatabase());
	}
	
	protected void prepareOutputModel(TransformationController control) throws Throwable {
		Map<String, Object> metamodels = control.getMetamodels();
		String mmName = this.getMetamodelIdentifier();

		if(this.getPrecedingUnit() instanceof TransformationLayer
				&& metamodels.containsKey(mmName)) {
			
			MetaModelDatabase mmd = (MetaModelDatabase) metamodels.get(mmName);
			InstanceDatabase id = control.getLastOutputModelDatabase(mmd,this,this.getGroupName());
			if(id != this.getOutputModelDatabase()) {
				this.setOutputModelDatabase(id.clone()); // this.getPrecedingUnit().getDatabase() forward the previous database
				this.setMetaDatabase(mmd);
				return; // we're set here...
			}
		}
		
		// create a new one			
		InstanceDatabaseManager instanceDatabaseManager = control.getDatabaseManager();
		
		String mmPath = this.getLayer().getMetaModelId().getMetaModelURI();
		ModelLoader loader = this.persistenceLayer.buildModelLoader(instanceDatabaseManager);
		MetaModelDatabase loadedMetamodelDatabase = null;
		
		// Optimization: avoid loading a metamodel database again.
		if(!metamodels.containsKey(mmName)) {
			loader.loadMetaModel(mmPath);
			loadedMetamodelDatabase = loader.getMetaModelDatabase();
			metamodels.put(mmName,loader.getMetaModelDatabase());
		} else {
			loadedMetamodelDatabase = (MetaModelDatabase) metamodels.get(mmName);
			loader.setMetaModelDatabase(loadedMetamodelDatabase);
		}

		loader.prepareInstanceDatabase();
		
		this.setMetaDatabase(loadedMetamodelDatabase);
		
		this.setOutputModelDatabase(loader.getInstanceDatabase());
		
	}

}