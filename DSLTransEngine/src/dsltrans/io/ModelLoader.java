package dsltrans.io;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public interface ModelLoader {
	
	public void loadDatabase(String singleclassname, String url) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	IllegalAccessException, NoSuchMethodException, InvocationTargetException, UnsuportedMetamodelException;

	public void loadMetaModel(String mmPath) throws IOException;

	public MetaModelDatabase getMetaModelDatabase();

	public void setMetaModelDatabase(MetaModelDatabase metaModelDatabase);

	public InstanceDatabase getDatabase();
	
	public void prepareDatabase() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException;
	
}
