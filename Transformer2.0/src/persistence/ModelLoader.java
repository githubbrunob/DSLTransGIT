package persistence;

import java.lang.reflect.InvocationTargetException;

import transformerProcessor.exceptions.UnsuportedMetamodelException;

public interface ModelLoader {
	
	//TODO: This method does not make much sense...
	public void loadDatabase(String singleclassname, String url, String classpath) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	IllegalAccessException, NoSuchMethodException, InvocationTargetException, UnsuportedMetamodelException;
}
