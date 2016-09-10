package dsltrans.io.eclipse;

import dsltrans.io.ModelExporter;
import dsltrans.io.ModelLoader;
import dsltrans.io.PersistenceLayer;
import dsltrans.model.InstanceDatabaseManager;

public class EclipsePersistenceLayer implements PersistenceLayer {

	@Override
	public ModelExporter buildModelExporter() {
		return new EclipseExporter();
	}

	@Override
	public ModelExporter buildModelExporter(InstanceDatabaseManager instanceDatabaseManager) {
		return new EclipseExporter((EclipseInstanceDatabaseManager)instanceDatabaseManager);
	}
	
	@Override
	public ModelLoader buildModelLoader(InstanceDatabaseManager instanceDatabaseManager) {
		return new EclipseLoader((EclipseInstanceDatabaseManager)instanceDatabaseManager);
	}
	
}
