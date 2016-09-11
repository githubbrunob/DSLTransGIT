package dsltrans.io;

import dsltrans.model.InstanceDatabaseManager;

public interface PersistenceLayer {
	ModelExporter buildModelExporter();
	ModelLoader buildModelLoader(InstanceDatabaseManager instanceDatabaseManager);
}
