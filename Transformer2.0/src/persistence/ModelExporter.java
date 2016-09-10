package persistence;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.metamodel.MetaModelDatabase;

public interface ModelExporter {

	public void setDatabases(MetaModelDatabase metaModelDatabase,
			InstanceDatabase database);

	public void setInstanceDatabase(InstanceDatabase database);

	public void loadMetaModel(String classDir, String mmPath)
			throws IOException;

	public void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase);

	public InstanceDatabase getInstanceDatabase();

	public MetaModelDatabase getMetaModelDatabase();

	public void saveTo(String classname, String path) throws SecurityException,
			IllegalArgumentException, ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException, IOException,
			InvocationTargetException, NoSuchMethodException,
			UnsuportedMetamodelException;

	public void prepareDatabase(String classpath)
			throws ClassNotFoundException, NoSuchFieldException,
			SecurityException, IllegalArgumentException,
			IllegalAccessException, MalformedURLException;
}
