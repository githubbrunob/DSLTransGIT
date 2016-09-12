package dsltrans.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import dsltrans.io.ModelLoader;
import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class GenericModelLoader implements ModelLoader {
	
	private MetaModelDatabase metamodelDatabase;
	private InstanceDatabase instanceDatabase;
	
	@Override
	public void loadDatabase(String singleclassname, String url)
			throws ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException, UnsuportedMetamodelException {
		
	}

	@Override
	public void loadMetaModel(String mmPath) throws IOException {

	}

	@Override
	public MetaModelDatabase getMetaModelDatabase() {
		return null;
	}

	@Override
	public void setMetaModelDatabase(MetaModelDatabase metaModelDatabase) {
		
	}

	@Override
	public InstanceDatabase getDatabase() {
		return null;
	}

	@Override
	public void prepareDatabase() throws ClassNotFoundException,
			NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, MalformedURLException {
		
	}

}
