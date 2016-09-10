package emfInterpreter;

import persistence.InstanceDatabaseManager;
import persistence.ModelExporter;
import persistence.ModelLoader;
import persistence.PersistenceLayer;

public class EMFPersistenceLayer implements PersistenceLayer {

	@Override
	public ModelExporter buildModelExporter() {
		return new EMFExporter();
	}

	@Override
	public ModelExporter buildModelExporter(InstanceDatabaseManager instanceDatabaseManager) {
		return new EMFExporter((EclipseInstanceDatabaseManager)instanceDatabaseManager);
	}
	
	@Override
	public ModelLoader buildModelLoader(InstanceDatabaseManager instanceDatabaseManager) {
		return new EMFLoader((EclipseInstanceDatabaseManager)instanceDatabaseManager);
	}
	
}
