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
		this.metamodelDatabase = new MetaModelDatabase();
	}

	@Override
	public void loadMetaModel(String mmPath) throws IOException {
		
		GenericMetaEntity classA = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassA", false);
		GenericMetaEntity classB = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassB", true);
		GenericMetaEntity classC = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassC", false);
		GenericMetaEntity classD = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassD", false);
		
		this.metamodelDatabase.getMetaEntities().add(classA);
		this.metamodelDatabase.getMetaEntities().add(classB);
		this.metamodelDatabase.getMetaEntities().add(classC);
		this.metamodelDatabase.getMetaEntities().add(classD);
		
		
		
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
