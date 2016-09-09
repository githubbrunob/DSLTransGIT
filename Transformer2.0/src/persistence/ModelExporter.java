package persistence;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.metamodel.MetaModelDatabase;

public interface ModelExporter {
	
	public void setDatabases(MetaModelDatabase metaModelDatabase,
			InstanceDatabase database);
	
	public void setInstanceDatabase(InstanceDatabase database);
	
	public InstanceDatabase getInstanceDatabase();
	
	public MetaModelDatabase getMetaModelDatabase();
	
	public void saveTo(String classname, String path) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, IOException, InvocationTargetException, NoSuchMethodException, UnsuportedMetamodelException;
	
}
