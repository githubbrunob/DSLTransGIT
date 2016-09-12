package dsltrans.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import dsltrans.io.ModelLoader;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class GenericModelLoader implements ModelLoader {
	
	private MetaModelDatabase metamodelDatabase;
	private InstanceDatabase instanceDatabase;
	
	@Override
	public void loadInstances(String singleclassname, String url)
			throws ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException, UnsuportedMetamodelException {
		this.metamodelDatabase = new MetaModelDatabase();
	}

	@Override
	public void loadMetaModel(String mmPath) throws IOException {
		
		GenericMetaEntity classA = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassA", false);
		GenericMetaAttribute attrA = new GenericMetaAttribute("AttrA", classA, "java.lang.String", "");
		
		GenericMetaEntity classB = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassB", true);
		GenericMetaAttribute attrB = new GenericMetaAttribute("AttrB", classB, "java.lang.String", "");
		
		GenericMetaEntity classC = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassC", false);
		GenericMetaAttribute attrC = new GenericMetaAttribute("AttrC", classC, "java.lang.String", "");
		
		GenericMetaEntity classD = new GenericMetaEntity("samplenamespace", "samplepackage", "ClassD", false);
		
		classA.getSuperEntities().add(classC);
		
		GenericMetaRelation A_contains_B = new GenericMetaRelation("contains", classA, classB, true, true);
		GenericMetaRelation A_contains_C = new GenericMetaRelation("contains", classA, classC, true, true);
		GenericMetaRelation B_connects_D = new GenericMetaRelation("connects", classB, classD, true, false);
		GenericMetaRelation C_connects_B = new GenericMetaRelation("connects", classC, classB, true, false);
		
		this.metamodelDatabase.getMetaEntities().add(classA);
		this.metamodelDatabase.getMetaEntities().add(classB);
		this.metamodelDatabase.getMetaEntities().add(classC);
		this.metamodelDatabase.getMetaEntities().add(classD);
		
		this.metamodelDatabase.getMetaAttributes().add(attrA);
		this.metamodelDatabase.getMetaAttributes().add(attrB);
		this.metamodelDatabase.getMetaAttributes().add(attrC);
		
		this.metamodelDatabase.getMetaRelations().add(A_contains_B);
		this.metamodelDatabase.getMetaRelations().add(A_contains_C);
		this.metamodelDatabase.getMetaRelations().add(B_connects_D);
		this.metamodelDatabase.getMetaRelations().add(C_connects_B);
		
	}

	@Override
	public MetaModelDatabase getMetaModelDatabase() {
		return metamodelDatabase;
	}

	@Override
	public void setMetaModelDatabase(MetaModelDatabase metaModelDatabase) {
		this.metamodelDatabase = metaModelDatabase;
	}

	@Override
	public InstanceDatabase getInstanceDatabase() {
		return null;
	}

	@Override
	public void prepareInstanceDatabase() throws ClassNotFoundException,
			NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, MalformedURLException {
		
	}

}
