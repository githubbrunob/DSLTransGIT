package dsltrans.io.eclipse;

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

import dsltrans.io.ModelExporter;
import dsltrans.metamodel.MetaAttribute;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceAttribute;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceEntity;
import dsltrans.model.InstanceRelation;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class EclipseExporter extends EclipseHandler implements ModelExporter {

	private EclipseInstanceDatabase _outputInstanceDatabase = null;
	private MetaModelDatabase _metaModelDatabase=null;
	private final String classDir;
	
	public EclipseExporter(String classDir) {
		this.classDir = classDir;
		setMetaModelDatabase(new MetaModelDatabase());
	}

	@Override
	public void setInstanceDatabase(InstanceDatabase database) {
		_outputInstanceDatabase = (EclipseInstanceDatabase) database;
	}

	public InstanceDatabase getInstanceDatabase() {
		return _outputInstanceDatabase;
	}
	
	@Override
	public void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase) {
		this._metaModelDatabase = _metaModelDatabase;
	}

	public MetaModelDatabase getMetaModelDatabase() {
		return _metaModelDatabase;
	}
	
	@Override
	public void saveTo(String outputpath) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, IOException, InvocationTargetException, NoSuchMethodException, UnsuportedMetamodelException {
		if(getMetaModelDatabase() == null || getInstanceDatabase() == null)
			System.err.println("cannot save output without information databases");
		
		URI mmPathURI = URI.createURI(outputpath);
		
		if(mmPathURI.isRelative())
				outputpath = classDir +"/"+ outputpath;
		
		File outputfile = new File(outputpath);
		exportTargetModel(outputfile);
	}

	private void exportTargetModel(File file) throws IOException, IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, UnsuportedMetamodelException{
		EclipseMetaEntity rootEntity = (EclipseMetaEntity) this.getMetaModelDatabase().getRootMetaEntity();
		System.out.println("ROOTENTITY: "+rootEntity.getQualifiedName());

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		resourceSet.getPackageRegistry().clear();			
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl());		
		
		fillInAttributes(this._outputInstanceDatabase);
		fillInRelations(this._outputInstanceDatabase);
		
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		
		Resource modelResource = resourceSet.createResource(fileURI);
		
		List<InstanceEntity> ielist = this.getInstanceDatabase().getAllInstancesOf(rootEntity);

		modelResource.getContents().add(((EclipseInstanceEntity) ielist.get(ielist.size()-1)).getObject());

		modelResource.save(null);
		
		// Add schemaLocationAttr
		EPackage rootPackage = rootEntity.getObject().getEPackage();
		Resource rootResource = rootPackage.eResource();
		URI rootURI = rootResource.getURI();
		URI rootNsUri = URI.createURI(rootPackage.getNsURI());
		PostProcessor postProcessor = new EclipseXMISchemaLocationPostProcessor(rootURI, rootNsUri);
		postProcessor.process(fileURI);
		
		
		expandSequences(fileURI);
		
	}

	private void expandSequences(URI fileURI) {
		PostProcessor postProcessor = new EclipseSequenceExpansionProcessor();
		postProcessor.process(fileURI);
	}

	private void fillInAttributes(EclipseInstanceDatabase instancedatabase) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, SecurityException, NoSuchMethodException {
		for(InstanceEntity instanceEntity: instancedatabase.getInstanceEntities()) {
			EclipseInstanceEntity ie = (EclipseInstanceEntity) instanceEntity;
			for(InstanceAttribute ia : instancedatabase.getAllAttributesOf(ie)) {
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
	private void fillInRelations(EclipseInstanceDatabase instancedatabase) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
		int i=0;
		while (i++<2)
		for(InstanceEntity instanceEntity: instancedatabase.getInstanceEntities()) {
			EclipseInstanceEntity ie = (EclipseInstanceEntity) instanceEntity;
			for(InstanceRelation ir : instancedatabase.getRelationsLeaving(ie)) {
				EclipseMetaRelation mr = (EclipseMetaRelation)ir.getRelation();
				if ((i==1 && !mr.isContainment()) || (i==2 && mr.isContainment()))
					continue;
				EObjectImpl sourceobject = ie.getObject();
				EObjectImpl targetobject = ((EclipseInstanceEntity) ir.getTarget()).getObject();
				String name = mr.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Class<?> sourceclasstype = sourceobject.getClass();
				if(mr.isSet()) {
					String methodName = "get" + first.toUpperCase()+remainder+(((first.toUpperCase()+remainder).equals("Class"))?"_":"");
					Method method=null;
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
					
				}
			}
		}
	}
}
