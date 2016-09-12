package dsltrans.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import dsltrans.io.ModelLoader;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceAttribute;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceRelation;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class GenericModelLoader implements ModelLoader {
	
	private MetaModelDatabase metamodelDatabase;
	private InstanceDatabase instanceDatabase;
	
	public GenericModelLoader() {
		this.metamodelDatabase = new MetaModelDatabase();
		this.instanceDatabase = new GenericInstanceDatabase();
	}
	
	@Override
	public void loadInstances(String singleclassname, String url)
			throws ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException, UnsuportedMetamodelException, InvalidLayerRequirement {
		
		GenericMetaEntity classA = (GenericMetaEntity) this.metamodelDatabase.getMetaEntityByName("samplenamespace", "ClassA");
		
		GenericMetaAttribute attrA = (GenericMetaAttribute) metamodelDatabase.getMetaAttributesFromEntityByName(classA, "AttrA");
		
		GenericInstanceEntity obj_A =  (GenericInstanceEntity) instanceDatabase.createInstance(classA);
		
		InstanceAttribute instance_attrA = new InstanceAttribute(obj_A, attrA, "value_attr_A");
		
		GenericMetaEntity classC = (GenericMetaEntity) this.metamodelDatabase.getMetaEntityByName("samplenamespace", "ClassC");
		
		GenericMetaAttribute attrC = (GenericMetaAttribute) metamodelDatabase.getMetaAttributesFromEntityByName(classC, "AttrC");
		
		GenericInstanceEntity obj_C =  (GenericInstanceEntity) instanceDatabase.createInstance(classC);
		
		InstanceAttribute instance_attrC = new InstanceAttribute(obj_C, attrC, "value_attr_C");
		
		GenericMetaEntity classD = (GenericMetaEntity) this.metamodelDatabase.getMetaEntityByName("samplenamespace", "ClassD");
		
		GenericInstanceEntity obj_D = (GenericInstanceEntity) instanceDatabase.createInstance(classD);
		
		GenericMetaRelation A_contains_C = (GenericMetaRelation) metamodelDatabase.getMetaRelationByName("contains", classA, classC);
		
		InstanceRelation obj_A__connects__obj_C = new InstanceRelation(obj_A, A_contains_C, obj_C);
		
		instanceDatabase.getInstanceEntities().add(obj_A);
		instanceDatabase.getInstanceEntities().add(obj_C);
		instanceDatabase.getInstanceEntities().add(obj_D);
		
		instanceDatabase.getInstanceAttributes().add(instance_attrA);
		instanceDatabase.getInstanceAttributes().add(instance_attrC);

		instanceDatabase.getInstanceRelations().add(obj_A__connects__obj_C);

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
		return instanceDatabase;
	}

	@Override
	public void prepareInstanceDatabase() throws ClassNotFoundException,
			NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, MalformedURLException {
		
	}

}
