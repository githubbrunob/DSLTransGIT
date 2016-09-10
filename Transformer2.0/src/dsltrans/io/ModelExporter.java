package dsltrans.io;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public interface ModelExporter {
	
	/*
	 * Ideal API: 
	 * 	Set Metamodel Database
	 * 	Set Instance Database
	 * 	SaveTo
	 */
	
	public void setInstanceDatabase(InstanceDatabase database);

	public void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase);

	public void saveTo(String classname, String path) throws SecurityException,
			IllegalArgumentException, ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException, IOException,
			InvocationTargetException, NoSuchMethodException,
			UnsuportedMetamodelException;
	
	// TODO This has to go away, and should be done in the Model Loader.
	public void loadMetaModel(String classDir, String mmPath)
			throws IOException;
	
	// TODO This has to go away
	public InstanceDatabase getInstanceDatabase();

	// TODO This has to go away
	public MetaModelDatabase getMetaModelDatabase();
	
	// TODO This has to go away
	public void prepareDatabase(String classpath)
			throws ClassNotFoundException, NoSuchFieldException,
			SecurityException, IllegalArgumentException,
			IllegalAccessException, MalformedURLException;
}
