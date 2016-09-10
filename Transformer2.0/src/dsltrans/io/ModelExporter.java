package dsltrans.io;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

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
	
}
