package emfInterpreter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import persistence.InstanceAttribute;
import persistence.InstanceDatabase;
import persistence.InstanceEntity;
import persistence.InstanceRelation;
import persistence.ModelExporter;
import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.instance.EMFEclipseInstanceDatabase;
import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;
import emfInterpreter.metamodel.MetaRelation;

public class EMFExporter extends EMFHandler implements ModelExporter {

	private EMFEclipseInstanceDatabase _outputInstanceDatabase = null;
	private MetaModelDatabase _metaModelDatabase=null;
	private Stack<String> _namespace;
	private MetaEntity _currentEntity;

	
	public EMFExporter(EclipseInstanceDatabaseManager instanceDatabaseManager) {
		this();
		_outputInstanceDatabase = (EMFEclipseInstanceDatabase) instanceDatabaseManager.createInstanceDatabase();
	}

	public EMFExporter() {
		setMetaModelDatabase(new MetaModelDatabase());
		_namespace = new Stack<String>();
		_currentEntity = null;
	}

	@Override
	public void setDatabases(MetaModelDatabase metaModelDatabase,
			InstanceDatabase database) {
		setInstanceDatabase(database);
		setMetaModelDatabase(metaModelDatabase);
	}

	@Override
	public void setInstanceDatabase(InstanceDatabase database) {
		_outputInstanceDatabase = (EMFEclipseInstanceDatabase) database;
	}

	@Override
	public InstanceDatabase getInstanceDatabase() {
		return _outputInstanceDatabase;
	}
	
	@Override
	public void setMetaModelDatabase(MetaModelDatabase _metaModelDatabase) {
		this._metaModelDatabase = _metaModelDatabase;
	}

	@Override
	public MetaModelDatabase getMetaModelDatabase() {
		return _metaModelDatabase;
	}
	
	@Override
	public void loadMetaModel(String classdir, String path) throws IOException {
		System.out.println("Loading metamodel...");
		
		System.out.println("classdir: " + classdir);
		System.out.println("path: " + path);
		
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		// Register the Ecore resource Factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		URI metamodelURI = createAbsoluteHierarchicalURI(classdir, path);
		
		Resource resource = resourceSet.getResource(metamodelURI, true);
		EList<EObject> list = resource.getContents();

		if (list.get(0) instanceof EPackageImpl)
			metaProcess((EPackageImpl) list.get(0));

		metaProcessForeignClasses();
		{// process relations
			Iterator<MetaEntity> iter = getMetaModelDatabase().getClasses().iterator();
			while (iter.hasNext()) {
				MetaEntity me = iter.next();
				metaRelationProcess(me);
			}
		}
		{// process class hierarchy
			Iterator<MetaEntity> iter = getMetaModelDatabase().getClasses().iterator();
			while (iter.hasNext()) {
				MetaEntity me = iter.next();
				metaSuperProcess(me);
			}
		}

		resourceSet.getPackageRegistry().clear();
		
		System.out.println("Loading metamodel... DONE");
		
		generateMetaModelClasses(classdir, path);
	}
	
	private void metaProcessForeignClasses() {
		List<EPackage> packs = new LinkedList<EPackage>();
		Iterator<MetaEntity> iter = getMetaModelDatabase().getClasses().iterator();
		while (iter.hasNext()) {
			MetaEntity me = iter.next();
			getPacks(me, packs);
		}
		for (EPackage pack : packs)
			metaProcess((EPackageImpl) pack);
	}

	private void getPacks(MetaEntity me, List<EPackage> packs) {
		EList<EReference> containments = me.getObject().getEAllReferences();
		Iterator<EReference> iter = containments.iterator();
		while (iter.hasNext()) {
			EReference c = iter.next();
			Iterator<MetaEntity> classiter = getMetaModelDatabase().getClasses().iterator();
			boolean found = false;
			while (classiter.hasNext()) {
				MetaEntity mnext = classiter.next();
				if (mnext.getObject() == c.getEType()) {
					found = true;
				}
			}
			if (!found && c.getEType() instanceof EClassImpl) {
				if (!packs.contains(((EClassifierImpl) c.getEType()).basicGetEPackage()))
					packs.add(((EClassifierImpl) c.getEType()).basicGetEPackage());
			}
		}
	}

	private void metaRelationProcess(MetaEntity me) {
		EList<EReference> containments = me.getObject().getEAllReferences();
		Iterator<EReference> iter = containments.iterator();
		while (iter.hasNext()) {
			EReference c = iter.next();
			Iterator<MetaEntity> classiter = getMetaModelDatabase().getClasses().iterator();
			@SuppressWarnings("unused")
			boolean found = false;
			while (classiter.hasNext()) {
				MetaEntity mnext = classiter.next();
				if (mnext.getObject() == c.getEType()) {
					found = true;
					MetaRelation mr = new MetaRelation(me, c, mnext);
					getMetaModelDatabase().getRelations().add(mr);
				}
			}
		}
	}

	private void metaSuperProcess(MetaEntity me) {
		EList<EClass> superlist = me.getObject().getEAllSuperTypes();
		Iterator<EClass> iter = superlist.iterator();
		while (iter.hasNext()) {
			EClass c = iter.next();
			Iterator<MetaEntity> classiter = getMetaModelDatabase().getClasses().iterator();
			while (classiter.hasNext()) {
				MetaEntity mnext = classiter.next();
				if (mnext.getObject() == c)
					me.addSuperEntity(mnext);
			}
		}
	}

	private void metaProcess(EPackageImpl obj) {
		EPackageImpl pack = (EPackageImpl) obj;

		_namespace.push(pack.getName());
		EList<EObject> list = obj.eContents();
		Iterator<EObject> iterator = list.iterator();
		while (iterator.hasNext()) {
			EObject objnext = iterator.next();
			if (objnext instanceof EPackageImpl)
				metaProcess((EPackageImpl) objnext);
			else if (objnext instanceof EClassImpl)
				metaProcess((EClassImpl) objnext, getMetaModelDatabase().getClasses());
		}
		_namespace.pop();

		// debug
		// System.out.println("package: "+pack.getName());
	}

	private void metaProcess(EClassImpl obj, List<MetaEntity> classes) {
		MetaEntity tempEntity = new MetaEntity(obj, _namespace.lastElement(), serialize(_namespace));

		for (MetaEntity me : classes) {
			if (me.getNamespace().equals(tempEntity.getNamespace()) && me.getName().equals(tempEntity.getName()))
				return;
		}
		_currentEntity = tempEntity;
		classes.add(_currentEntity);

		EList<EAttribute> attrlist = obj.getEAttributes();
		Iterator<EAttribute> iterator = attrlist.iterator();
		while (iterator.hasNext())
			metaProcess(iterator.next());

	}

	private void metaProcess(EAttribute obj) {
		MetaAttribute a = new MetaAttribute(_currentEntity, obj);
		getMetaModelDatabase().getAttributes().add(a);
	}
	
	private String serialize(Stack<String> x) {
		Iterator<String> iterator = x.iterator();
		String result = "";
		while (iterator.hasNext()) {
			result += iterator.next();
			if (iterator.hasNext())
				result += ".";
		}
		return result;
	}
	
	@Override
	public void prepareDatabase(String classpath) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException{
		for (MetaEntity me : this.getMetaModelDatabase().getClasses()) {	
			this.prepareDatabase(me, classpath);
		}
	}
	
	public void prepareDatabase(MetaEntity me, String classpath) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException{
		this._outputInstanceDatabase.synchFactories();
		
		String packageName = me.getCurrentPackage().substring(1);
		packageName = Character.toUpperCase(me.getCurrentPackage().charAt(0)) + packageName;
		String className = me.getNamespace()+"."+packageName+"Package";
		
		URL[] urlPath = {};
		List<URL> urlList = new LinkedList<URL>();
		urlList.add(new File(classpath+"/tempClasses").toURI().toURL());
		urlPath = urlList.toArray(urlPath);

		URLClassLoader customLoader = new URLClassLoader(urlPath,this.getClass().getClassLoader());	
		Map<String, Object> knownFactories = ((EMFEclipseInstanceDatabase)this.getInstanceDatabase()).getFactorys();
		if(!knownFactories.containsKey(className)) {
			Object factory = null;
			Class<?> cc = Class.forName(className,false,customLoader);
			Field f2 = cc.getField("eINSTANCE");
			factory = (Object)f2.get(cc);
			knownFactories.put(className, factory);
			
			String factoryName = me.getNamespace()+"."+packageName+"Factory";
			if (!((EMFEclipseInstanceDatabase)this.getInstanceDatabase()).getFactorys().containsKey(factoryName)) {
				Object factory1 = null;
				Class<?> cc1 = Class.forName(factoryName,false,customLoader);
				Field f21 = cc1.getField("eINSTANCE");
				factory1 = (Object)f21.get(cc1);
				knownFactories.put(factoryName, factory1);
			}
		}
		
	}
	
	@Override
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
		
		fillInAttributes(this._outputInstanceDatabase);
		fillInRelations(this._outputInstanceDatabase);
		
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		
		Resource modelResource = resourceSet.createResource(fileURI);
		
		List<InstanceEntity> ielist = this.getInstanceDatabase().getElementsByMetaEntity(rootEntity);

		modelResource.getContents().add(ielist.get(ielist.size()-1).getObject());

		
		modelResource.save(null);
		
		// Add schemaLocationAttr
		EPackage rootPackage = rootEntity.getObject().getEPackage();
		Resource rootResource = rootPackage.eResource();
		URI rootURI = rootResource.getURI();
		URI rootNsUri = URI.createURI(rootPackage.getNsURI());
		EMFPostProcessor postProcessor = new EMFXMISchemaLocationPostProcessor(rootURI, rootNsUri);
		postProcessor.process(fileURI);
		
		
		expandSequences(fileURI);
		
	}

	private void expandSequences(URI fileURI) {
		EMFPostProcessor postProcessor = new EMFSequenceExpansionProcessor();
		postProcessor.process(fileURI);
	}

	private void fillInAttributes(EMFEclipseInstanceDatabase instancedatabase) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, SecurityException, NoSuchMethodException {
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
	private void fillInRelations(EMFEclipseInstanceDatabase instancedatabase) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
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
