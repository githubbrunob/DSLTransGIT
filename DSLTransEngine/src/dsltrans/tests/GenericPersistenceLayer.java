package dsltrans.tests;

import dsltrans.io.ModelExporter;
import dsltrans.io.ModelLoader;
import dsltrans.io.PersistenceLayer;
import dsltrans.model.InstanceDatabaseManager;

public class GenericPersistenceLayer implements PersistenceLayer {

	@Override
	public ModelExporter buildModelExporter() {
		return null;
	}

	@Override
	public ModelLoader buildModelLoader(
			InstanceDatabaseManager instanceDatabaseManager) {
		return null;
	}

}
