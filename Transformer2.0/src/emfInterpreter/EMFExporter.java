package emfInterpreter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import post_processor.PostProcessor;
import post_processor.SequenceExpansionProcessor;
import post_processor.XMISchemaLocationPostProcessor;
import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.instance.InstanceAttribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.instance.InstanceRelation;
import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;
import emfInterpreter.metamodel.MetaRelation;

public class EMFExporter extends EMFHandler {

	private InstanceDatabase _instanceDatabase=null;
	private MetaModelDatabase _metaModelDatabase=null;

	public void setDatabases(MetaModelDatabase metaModelDatabase,
			InstanceDatabase database) {
		setInstanceDatabase(database);
		setMetaModelDatabase(metaModelDatabase);
	}

	public void setInstanceDatabase(InstanceDatabase database) {
		_instanceDatabase = database;
	}
	
	public InstanceDatabase getInstanceDatabase() {
		return _instanceDatabase;
	}

	private void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase) {
		this._metaModelDatabase = _metaModelDatabase;
	}

	public MetaModelDatabase getMetaModelDatabase() {
		return _metaModelDatabase;
	}
	
	public void saveTo(String classname, String path) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, IOException, InvocationTargetException, NoSuchMethodException, UnsuportedMetamodelException {
		if(getMetaModelDatabase() == null || getInstanceDatabase() == null)
			System.err.println("cannot save output without information databases");
	
		File outputfile = new File(path);
		exportTargetModel(outputfile);
	}

	private void exportTargetModel(File file) throws IOException, IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, UnsuportedMetamodelException{
		MetaEntity rootEntity = this.getMetaModelDatabase().getRootEntity();
		System.out.println("ROOTENTITY: "+rootEntity.getQualifiedName());

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		resourceSet.getPackageRegistry().clear();			
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl());		
		
		fillInAttributes(this.getInstanceDatabase());
		fillInRelations(this.getInstanceDatabase());
		
		//this.getInstanceDatabase().dump();
		
//		InstanceEntity instanceEntity = getRootElement(this.getInstanceDatabase(),rootEntity);
//		if(instanceEntity == null)
//			return; // nothing to output
//		EObject outputmodel = instanceEntity.getObject();

		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		
		Resource modelResource = resourceSet.createResource(fileURI);
		
		List<InstanceEntity> ielist = this.getInstanceDatabase().getElementsByMetaEntity(rootEntity);
//		for (InstanceEntity ie:ielist) {
//			if (ie.getMetaEntity().getName().equals("Inherit")) {
//				for (InstanceAttribute ia:this.getInstanceDatabase().getAttributesByInstanceEntity(ie)) 
//					if (ia.getMetaAttribute().getName().equals("description"))
//						System.out.println("!#$%&/(/&%$#!#$%&/Inherits: "+ia.getValue().toString());
//			}
//		}
		
//		for(InstanceEntity ie : ielist) {
//			EObject outputmodel = ie.getObject();
			modelResource.getContents().add(ielist.get(ielist.size()-1).getObject());
//		}
		
		modelResource.save(null);
		
		// Add schemaLocationAttr
		EPackage rootPackage = rootEntity.getObject().getEPackage();
		Resource rootResource = rootPackage.eResource();
		URI rootURI = rootResource.getURI();
		URI rootNsUri = URI.createURI(rootPackage.getNsURI());
		PostProcessor postProcessor = new XMISchemaLocationPostProcessor(rootURI, rootNsUri);
		postProcessor.process(fileURI);
		
		
		expandSequences(fileURI);
		
	}

	private void expandSequences(URI fileURI) {
		PostProcessor postProcessor = new SequenceExpansionProcessor();
		postProcessor.process(fileURI);
	}

	private void fillInAttributes(InstanceDatabase instancedatabase) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, SecurityException, NoSuchMethodException {
		for(InstanceEntity ie: instancedatabase.getLoadedClasses()) {
			for(InstanceAttribute ia : instancedatabase.getAttributesByInstanceEntity(ie)) {
				MetaAttribute ma = ia.getMetaAttribute();
				if(ma.isDSLTransType())
					continue; // lets just ignore
				EObjectImpl object = ie.getObject();
				String type = ma.getType();

				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());	
				Class<?> classtype = null;
				if(type.compareTo("boolean") == 0) {
					classtype = boolean.class;
				} else if(type.compareTo("int") == 0) {
					classtype = int.class;
				} else {
					classtype = Class.forName(type);
				}
				Method method = object.getClass().getMethod("set" + first.toUpperCase()+remainder,classtype);
//				System.out.println("DEBUG: "+ia.getValue());
//				System.out.println("DEBUG type: "+ia.getMetaAttribute().getType());
//				System.out.println("DEBUG type: "+ma.getType());
//				if (ia.getValue()!=null)
//				System.out.println("DEBUG: "+ia.getValue().getClass().getCanonicalName());
//				System.out.println("DEBUG: "+method.getName());
//				System.out.println("DEBUG: "+classtype);
//				for (Class<?> classt : method.getParameterTypes()) {
//					System.out.println("DEBUG :"+classt.getCanonicalName());
//				}
				if (type.equals("boolean"))
					method.invoke(object, Boolean.valueOf(ia.getValue().toString()));
				else if (type.equals("int"))
					method.invoke(object, Integer.valueOf(ia.getValue().toString()));
				else
					method.invoke(object, ia.getValue());
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private void fillInRelations(InstanceDatabase instancedatabase) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
		int i=0;
		while (i++<2)
		for(InstanceEntity ie: instancedatabase.getLoadedClasses()) {
			for(InstanceRelation ir : instancedatabase.getRelationsByInstanceEntity(ie)) {
				MetaRelation mr = (MetaRelation)ir.getRelation();
				if ((i==1 && !mr.isContainment()) || (i==2 && mr.isContainment()))
					continue;
				EObjectImpl sourceobject = ie.getObject();
				EObjectImpl targetobject = ir.getTarget().getObject();
				String name = mr.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Class<?> sourceclasstype = sourceobject.getClass();
				if(mr.isSet()) {
//DEBUG
//System.out.println("DEBUG METHODS :"+"get" + first.toUpperCase()+remainder);
//System.out.println("--- " + sourceclasstype.getCanonicalName());
//System.out.println(ie.getMetaEntity().getName());
//for (Method m : sourceclasstype.getDeclaredMethods()) {
//	System.out.println("DEBUG METHODS: "+m.getName());
//}
//if (sourceclasstype.getSuperclass() != null) {
//	for (Method m : sourceclasstype.getSuperclass().getDeclaredMethods())
//		System.out.println("DEBUG ENCLOSING METHODS: "+m.getName());
//	System.out.println(sourceclasstype.getSuperclass().toString());
//}
//else
//	System.out.println("ENCLOSING NULL");
					String methodName = "get" + first.toUpperCase()+remainder+(((first.toUpperCase()+remainder).equals("Class"))?"_":"");
					Method method=null;
//					try {
//						method = sourceclasstype.getDeclaredMethod(methodName);
//					} catch(Exception e) {
//						method = sourceclasstype.getSuperclass().getDeclaredMethod(methodName);
//					}					
					Method[] methods = sourceclasstype.getMethods();
					for(Method meth:methods) {
						if(meth.getName().equals(methodName)) {
							method = meth;
							break;
						}
					}
					if(method == null)
						return;
					Object value = method.invoke(sourceobject);
					Class<?> elistclass = Class.forName("org.eclipse.emf.common.util.EList");
					EList<EObjectImpl> list = (EList<EObjectImpl>) elistclass.cast(value);
					list.add(targetobject);
				} else {
					Method[] methods = sourceclasstype.getMethods();
					for(Method method:methods) {
						if(method.getName().equals("set" + first.toUpperCase()+remainder)) {
							Class<?>[] partypes = method.getParameterTypes();
							if(partypes.length == 1 && partypes[0].getCanonicalName().equals(ir.getRelation().getTarget().getQualifiedName())) {
								try{
									method.invoke(sourceobject, targetobject);
								} catch(Exception e) {}
								break;
							}
						}
					}
					
					//getDeclaredMethod("set" + first.toUpperCase()+remainder,classtype);
				}
			}
		}
	}
}
