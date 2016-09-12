package dsltrans.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import dsltrans.io.ModelExporter;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class GenericModelExporter implements ModelExporter {
	
	private InstanceDatabase instanceDatabase;
	private MetaModelDatabase metamodelDatabase;
	
	@Override
	public void setInstanceDatabase(InstanceDatabase database) {
		instanceDatabase = database;
	}

	@Override
	public void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase) {
		metamodelDatabase = _metaModelDatabase;
	}

	@Override
	public void saveTo(String path) throws SecurityException,
			IllegalArgumentException, ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException, IOException,
			InvocationTargetException, NoSuchMethodException,
			UnsuportedMetamodelException {
		assert instanceDatabase != null;
		assert metamodelDatabase != null;
	}

}
