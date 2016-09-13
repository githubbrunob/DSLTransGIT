package dsltrans.tests;

import dsltrans.io.ModelExporter;
import dsltrans.io.ModelLoader;
import dsltrans.io.PersistenceLayer;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabaseManager;

public class GenericPersistenceLayer implements PersistenceLayer {
	
	public GenericInstanceDatabase inputModel,outputModel;
	public MetaModelDatabase inputMetamodel,outputMetamodel;
	
	@Override
	public ModelExporter buildModelExporter() {
		return new GenericModelExporter(this);
	}

	@Override
	public ModelLoader buildModelLoader(
			InstanceDatabaseManager instanceDatabaseManager) {
		return new GenericModelLoader(this);
	}

}
