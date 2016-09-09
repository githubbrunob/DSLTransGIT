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
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.instance.InstanceAttribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.instance.InstanceRelation;
import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;
import emfInterpreter.metamodel.MetaRelation;

public class EMFLoader extends EMFHandler {

	// meta information
	private MetaModelDatabase _metamodeldatabase;
	private Stack<String> _namespace;
	private MetaEntity _currentEntity;

	// instance model
	private InstanceDatabase _database;

	public EMFLoader() {
		setMetaModelDatabase(new MetaModelDatabase());
		_namespace = new Stack<String>();
		_currentEntity = null;
		_database = new InstanceDatabase();
	}

	public InstanceDatabase getDatabase() {
		return _database;
	}

	public void print() {
		System.out.println();
		{
			Iterator<MetaEntity> it = getMetaModelDatabase().getClasses().iterator();
			System.out.println("printing meta entities: ");
			while (it.hasNext()) {
				MetaEntity me = it.next();
				System.out.println(me.print());
			}
		}
		System.out.println();
		{
			Iterator<MetaRelation> it = getMetaModelDatabase().getRelations().iterator();
			System.out.println("printing meta relations: ");
			while (it.hasNext()) {
				MetaRelation me = it.next();
				System.out.println(me.print());
			}
		}
		System.out.println();
		{
			Iterator<MetaAttribute> it = getMetaModelDatabase().getAttributes().iterator();
			System.out.println("printing meta attributes: ");
			while (it.hasNext()) {
				MetaAttribute me = it.next();
				System.out.println(me.print());
			}
		}
		System.out.println();
		{
			Iterator<InstanceEntity> it = getDatabase().getLoadedClasses().iterator();
			System.out.println("printing instance entities: ");
			while (it.hasNext()) {
				InstanceEntity me = it.next();
				System.out.println(me.print());
			}
		}
		System.out.println();
		{
			Iterator<InstanceRelation> it = getDatabase().getLoadedRelations().iterator();
			System.out.println("printing instance relations: ");
			while (it.hasNext()) {
				InstanceRelation me = it.next();
				System.out.println(me.print());
			}
		}
		System.out.println();
		{
			Iterator<InstanceAttribute> it = getDatabase().getLoadedAttributes().iterator();
			System.out.println("printing instance attributes: ");
			while (it.hasNext()) {
				InstanceAttribute me = it.next();
				System.out.println(me.print());
			}
		}
	}

	public boolean loadDatabase(String singleclassname, String url, String classpath) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException, UnsuportedMetamodelException {
		// debug
		System.out.println("LOADING database");
		boolean resultstatus = true;

		if (singleclassname.equals("ecore.Ecore"))
			singleclassname = "org.eclipse.emf.ecore.Ecore";
		String classname = singleclassname + "Package";
		String factoryname = singleclassname + "Factory";

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		URL[] urlPath = {};
		List<URL> urlList = new LinkedList<URL>();
		try {
			urlList.add(new File(classpath + "/tempClasses").toURI().toURL());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		urlPath = urlList.toArray(urlPath);

		System.out.println("loading classname: " + classname);
		// DEBUG
		// for(String fact : getDatabase().getFactorys().keySet()) {
		// System.out.println("Factory: "+fact);
		// }
		if (!getDatabase().getFactorys().containsKey(classname)) {
			this.getClass().getClassLoader().clearAssertionStatus();
			ClassLoader customLoader = new URLClassLoader(urlPath, this.getClass().getClassLoader());
			{
				Class<?> cc = Class.forName(classname, false, customLoader);
				Field f1 = cc.getField("eNS_URI");
				f1.getType().cast(f1.get(cc));
				Field f2 = cc.getField("eINSTANCE");
				f2.getType().cast(f2.get(cc));
				Object factory = f2.get(cc);
				resourceSet.getPackageRegistry().put((String) f1.get(cc), factory);
				getDatabase().getFactorys().put(classname, factory);
			}
			{
				Class<?> cc = Class.forName(factoryname, true, customLoader);
				Field f2 = cc.getField("eINSTANCE");
				Object factory = (Object) f2.get(cc);
				getDatabase().getFactorys().put(factoryname, factory);
			}
		} else {
			Object factory = getDatabase().getFactorys().get(classname);
			resourceSet.getPackageRegistry().put(classname, factory);
		}

		URI URIurl = URI.createURI(url);
		Resource resource = null;
		if (URIurl.isRelative())
			resource = resourceSet.getResource(URI.createFileURI(classpath + "/" + url), true);
		else
			resource = resourceSet.getResource(URI.createFileURI(url), true);
		// Resource resource =
		// resourceSet.getResource(URI.createFileURI(classpath+"/"+url),true);
		// EList<EObject> list = resource.getContents();

		TreeIterator<EObject> titer = resource.getAllContents();
		while (titer.hasNext()) { // process class instances and containment
									// relations
			EObject obj = (EObject) titer.next();
			if (obj instanceof EObjectImpl) {
				process((EObjectImpl) obj);
			} else if (obj instanceof EModelElementImpl) {
				processEModel((EModelElementImpl) obj);
			}
		}
		{// process relations
			Iterator<InstanceEntity> iter = getDatabase().getLoadedClasses().iterator();
			while (iter.hasNext()) {
				InstanceEntity me = iter.next();
				processNonContainments(me);
			}
		}

		processRootElement();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		resourceSet.getPackageRegistry().clear();

		return resultstatus;
	}

	private InstanceEntity processEModel(EModelElementImpl objinstance) throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException,
			ClassNotFoundException {

		{ // we do not want to process the same class two times
			Iterator<InstanceEntity> it = getDatabase().getLoadedClasses().iterator();
			while (it.hasNext()) {
				InstanceEntity me = it.next();
				if (me.getObjectMeta() == objinstance)
					return me;
			}
		}
		{ // ok now we can proceed
			Iterator<MetaEntity> it = getMetaModelDatabase().getClasses().iterator();
			while (it.hasNext()) {
				MetaEntity me = it.next();
				if (objinstance.getClass().getCanonicalName().equals("org.eclipse.emf." + me.getNamespace() + ".impl." + me.getName() + "Impl")) {
					InstanceEntity instanceEntity = new InstanceEntity(objinstance, me);
					getDatabase().addEntity(instanceEntity);
					processModelAttributes(instanceEntity);
					processModelContainments(instanceEntity);
					return instanceEntity;
				}
			}
		}
		return null;
	}

	private void processModelContainments(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException,
			ClassNotFoundException {
		MetaEntity me = instanceEntity.getMetaEntity();
		EModelElementImpl obj = instanceEntity.getObjectMeta();
		Iterator<MetaRelation> iter = getMetaModelDatabase().getRelations().iterator();
		while (iter.hasNext()) {
			MetaRelation ma = iter.next();
			if (ma.isContainment() && me.isSubTypeOf(ma.getSource()) && !instanceEntity.hasLoadedRelation(ma)) {
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				Object value = method.invoke(obj);

				if (value == null)
					continue; // no further processing here..
				InstanceEntity ie = null;
				if (ma.isSet()) {
					Class<?> elistclass = Class.forName("org.eclipse.emf.common.util.EList");
					EList<?> list = (EList<?>) elistclass.cast(value);
					Iterator<?> iterator = list.iterator();
					while (iterator.hasNext()) {
						Object objx = iterator.next();
						if (objx instanceof EModelElementImpl) {
							EModelElementImpl objimpl = (EModelElementImpl) objx;
							ie = processEModel(objimpl);
							if (ie != null) {
								InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
								instanceEntity.addRelation(ma);
								getDatabase().addRelation(ir);
							}
						}
					}
				} else if (value instanceof EModelElementImpl) {
					ie = processEModel((EModelElementImpl) value);
					if (ie != null) {
						InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
						instanceEntity.addRelation(ma);
						getDatabase().addRelation(ir);
					}
				}
			}
		}
	}

	private void processModelAttributes(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		MetaEntity me = instanceEntity.getMetaEntity();

		EModelElementImpl obj = instanceEntity.getObjectMeta();
		Iterator<MetaAttribute> iter = getMetaModelDatabase().getAttributes().iterator();
		while (iter.hasNext()) {
			MetaAttribute ma = iter.next();
			if (ma.isSubTypeOf(me) && !instanceEntity.hasLoadedAttribute(ma)) {
				String type = ma.getType();
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = null;
				if (type == null || type.compareTo("boolean") != 0) {
					method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				} else {
					method = obj.getClass().getMethod("is" + first.toUpperCase() + remainder);
				}
				Object value = method.invoke(obj);
				if (value != null) {
					InstanceAttribute ia = new InstanceAttribute(instanceEntity, ma, value);
					instanceEntity.addAttribute(ma);
					getDatabase().addAttribute(ia);
				}
			}
		}
	}

	public void processRootElement() throws UnsuportedMetamodelException {
		MetaEntity rootEntity = this.getMetaModelDatabase().getRootEntity();
		List<InstanceEntity> ielist = this.getDatabase().getElementsByMetaEntity(rootEntity);

		this.getDatabase().setRootElement(ielist.get(0));

	}

	private void processNonContainments(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (instanceEntity.getObject() != null) {
			processRegularNonContainments(instanceEntity);
			return;
		}
		if (instanceEntity.getObjectMeta() != null) {
			processMetaNonContainments(instanceEntity);
			return;
		}
	}

	private void processMetaNonContainments(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, ClassNotFoundException {
		MetaEntity me = instanceEntity.getMetaEntity();
		EModelElementImpl obj = instanceEntity.getObjectMeta();
		Iterator<MetaRelation> iter = getMetaModelDatabase().getRelations().iterator();
		while (iter.hasNext()) {
			MetaRelation ma = iter.next();
			if (!ma.isContainment() && me.isSubTypeOf(ma.getSource()) && !instanceEntity.hasLoadedRelation(ma)) {
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				Object value = method.invoke(obj);

				if (value == null)
					continue; // no further processing here..
				InstanceEntity ie = null;
				if (ma.isSet()) {
					Class<?> elistclass = Class.forName("org.eclipse.emf.common.util.EList");
					EList<?> list = (EList<?>) elistclass.cast(value);
					Iterator<?> iterator = list.iterator();
					while (iterator.hasNext()) {
						Object objx = iterator.next();
						if (objx instanceof EModelElementImpl) {
							EModelElementImpl objimpl = (EModelElementImpl) objx;
							ie = getInstanceEntity(objimpl);
							if (ie != null) {
								InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
								instanceEntity.addRelation(ma);
								getDatabase().addRelation(ir);
							}
						}
					}
				} else if (value instanceof EModelElementImpl) {
					ie = getInstanceEntity((EModelElementImpl) value);
					if (ie != null) {
						InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
						instanceEntity.addRelation(ma);
						getDatabase().addRelation(ir);
					}
				}
			}
		}
	}

	private void processRegularNonContainments(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {

		MetaEntity me = instanceEntity.getMetaEntity();
		EObjectImpl obj = instanceEntity.getObject();
		Iterator<MetaRelation> iter = getMetaModelDatabase().getRelations().iterator();
		while (iter.hasNext()) {
			MetaRelation ma = iter.next();
			if (!ma.isContainment() && me.isSubTypeOf(ma.getSource()) && !instanceEntity.hasLoadedRelation(ma)) {
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				Object value = method.invoke(obj);

				if (value == null)
					continue; // no further processing here..
				InstanceEntity ie = null;
				if (ma.isSet()) {
					Class<?> elistclass = Class.forName("org.eclipse.emf.common.util.EList");
					EList<?> list = (EList<?>) elistclass.cast(value);
					Iterator<?> iterator = list.iterator();
					while (iterator.hasNext()) {
						EObjectImpl objimpl = (EObjectImpl) iterator.next();
						ie = getInstanceEntity(objimpl);
						if (ie != null) {
							InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
							instanceEntity.addRelation(ma);
							getDatabase().addRelation(ir);
						}
					}
				} else {
					ie = getInstanceEntity((EObjectImpl) value);
					if (ie != null) {
						InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
						instanceEntity.addRelation(ma);
						getDatabase().addRelation(ir);
					}
				}
			}
		}
	}

	private InstanceEntity getInstanceEntity(EModelElementImpl value) {
		Iterator<InstanceEntity> it = getDatabase().getLoadedClasses().iterator();
		while (it.hasNext()) {
			InstanceEntity me = it.next();
			if (me.getObjectMeta() == value)
				return me;
		}
		return null;
	}

	private InstanceEntity getInstanceEntity(EObjectImpl value) {
		Iterator<InstanceEntity> it = getDatabase().getLoadedClasses().iterator();
		while (it.hasNext()) {
			InstanceEntity me = it.next();
			if (me.getObject() == value)
				return me;
		}
		return null;
	}

	private void processContainments(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {

		MetaEntity me = instanceEntity.getMetaEntity();
		EObjectImpl obj = instanceEntity.getObject();
		Iterator<MetaRelation> iter = getMetaModelDatabase().getRelations().iterator();
		while (iter.hasNext()) {
			MetaRelation ma = iter.next();
			if (ma.isContainment() && me.isSubTypeOf(ma.getSource()) && !instanceEntity.hasLoadedRelation(ma)) {
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				Object value = method.invoke(obj);

				if (value == null)
					continue; // no further processing here..
				InstanceEntity ie = null;
				if (ma.isSet()) {
					Class<?> elistclass = Class.forName("org.eclipse.emf.common.util.EList");
					EList<?> list = (EList<?>) elistclass.cast(value);
					Iterator<?> iterator = list.iterator();
					while (iterator.hasNext()) {
						EObjectImpl objimpl = (EObjectImpl) iterator.next();
						ie = process(objimpl);
						if (ie != null) {
							InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
							instanceEntity.addRelation(ma);
							getDatabase().addRelation(ir);
						}
					}
				} else {
					ie = process((EObjectImpl) value);
					if (ie != null) {
						InstanceRelation ir = new InstanceRelation(instanceEntity, ma, ie);
						instanceEntity.addRelation(ma);
						getDatabase().addRelation(ir);
					}
				}
			}
		}
	}

	private InstanceEntity process(EObjectImpl objinstance) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {

		{ // we do not want to process the same class two times
			Iterator<InstanceEntity> it = getDatabase().getLoadedClasses().iterator();
			while (it.hasNext()) {
				InstanceEntity me = it.next();
				if (me.getObject() == objinstance)
					return me;
			}
		}
		{ // ok now we can proceed
			Iterator<MetaEntity> it = getMetaModelDatabase().getClasses().iterator();
			while (it.hasNext()) {
				MetaEntity me = it.next();
				if (me.isMetaTypeOf(objinstance)) {
					InstanceEntity instanceEntity = new InstanceEntity(objinstance, me);
					getDatabase().addEntity(instanceEntity);
					processAttributes(instanceEntity);
					processContainments(instanceEntity);
					return instanceEntity;
				}
			}
		}
		return null;
	}

	private void processAttributes(InstanceEntity instanceEntity) throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		MetaEntity me = instanceEntity.getMetaEntity();

		EObjectImpl obj = instanceEntity.getObject();
		Iterator<MetaAttribute> iter = getMetaModelDatabase().getAttributes().iterator();
		while (iter.hasNext()) {
			MetaAttribute ma = iter.next();
			if (ma.isSubTypeOf(me) && !instanceEntity.hasLoadedAttribute(ma)) {
				String type = ma.getType();
				String name = ma.getName();
				String first = name.substring(0, 1);
				String remainder = name.substring(1, name.length());
				Method method = null;
				if (type == null || type.compareTo("boolean") != 0) {
					method = obj.getClass().getMethod("get" + first.toUpperCase() + remainder + (((first.toUpperCase() + remainder).equals("Class")) ? "_" : ""));
				} else {
					method = obj.getClass().getMethod("is" + first.toUpperCase() + remainder);
				}
				Object value = method.invoke(obj);
				if (value != null) {
					InstanceAttribute ia = new InstanceAttribute(instanceEntity, ma, value);
					instanceEntity.addAttribute(ma);
					getDatabase().addAttribute(ia);
				}
			}
		}
	}

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

	public URI tryToFindModel(URI uri) {
		return uri;
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

	public void setMetaModelDatabase(MetaModelDatabase _metamodeldatabase) {
		this._metamodeldatabase = _metamodeldatabase;
	}

	public MetaModelDatabase getMetaModelDatabase() {
		return _metamodeldatabase;
	}
}
