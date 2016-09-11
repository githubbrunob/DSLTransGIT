package dsltrans.io.eclipse;

import dsltrans.io.ModelExporter;
import dsltrans.io.ModelLoader;
import dsltrans.io.PersistenceLayer;
import dsltrans.model.InstanceDatabaseManager;

public class EclipsePersistenceLayer implements PersistenceLayer {
	
	private final String classDir;
	
	public EclipsePersistenceLayer(String classDir){
		this.classDir = classDir;
	}
	
	@Override
	public ModelExporter buildModelExporter() {
		return new EclipseExporter(classDir);
	}

	@Override
	public ModelLoader buildModelLoader(InstanceDatabaseManager instanceDatabaseManager) {
		return new EclipseLoader((EclipseInstanceDatabaseManager)instanceDatabaseManager, classDir);
	}
	
}
