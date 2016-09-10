package persistence;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.metamodel.MetaModelDatabase;

public interface ModelLoader {
	
	public void loadDatabase(String singleclassname, String url, String classpath) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	IllegalAccessException, NoSuchMethodException, InvocationTargetException, UnsuportedMetamodelException;

	public void loadMetaModel(String classDir, String mmPath) throws IOException;

	public MetaModelDatabase getMetaModelDatabase();

	public void setMetaModelDatabase(MetaModelDatabase metaModelDatabase);

	public InstanceDatabase getDatabase();
	
}
