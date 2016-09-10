package persistence;

public interface PersistenceLayer {
	ModelExporter buildModelExporter();
	ModelLoader buildModelLoader(InstanceDatabaseManager instanceDatabaseManager);
	ModelExporter buildModelExporter(InstanceDatabaseManager instanceDatabaseManager);
}
