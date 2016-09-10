package dsltrans.transformer;

import java.io.IOException;
import java.util.Map;

import dsltrans.Layer;
import dsltrans.io.ModelExporter;
import dsltrans.io.PersistenceLayer;
import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;

public class TransformationSequentialLayer extends TransformationLayer {

	TransformationSequentialLayer(String classdir, TransformationController tc, Layer l, PersistenceLayer persistenceL) {
			super(classdir, tc, l, persistenceL);
	}

	protected void prepareInputModel() {
		TransformationSource ts = getTransformationSource(this.getPrecedingUnit());
		setMatchMetaModel(ts.getMetaDatabase());
		setMatchModel(ts.getOutputModelDatabase());
	}
	
	protected void prepareOutputModel(TransformationController control, String classpath) throws IOException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Map<String, Object> metamodels = control.getMetamodels();
		String mmName = this.getMetamodelIdentifier();

		if(this.getPrecedingUnit() instanceof TransformationLayer
				&& metamodels.containsKey(mmName)) {
			
			MetaModelDatabase mmd = (MetaModelDatabase) metamodels.get(mmName);
			InstanceDatabase id = control.getLastOutputModelDatabase(mmd,this,this.getGroupName());
			if(id != this.getOutputModelDatabase()) {
				this.setOutputModelDatabase(id.clone()); // this.getPrecedingUnit().getDatabase() forward the previous database
				this.setMetaDatabase(mmd);
				return; // we're set here...
			}
		}
		
		// create a new one			
		InstanceDatabaseManager instanceDatabaseManager = control.getDatabaseManager();
		
		String mmPath = this.getLayer().getMetaModelId().getMetaModelURI();
		ModelExporter exporter = this.persistenceLayer.buildModelExporter(instanceDatabaseManager);
		if(!metamodels.containsKey(mmName)) {
			String classDir = getClassdir();
			exporter.loadMetaModel(classDir, mmPath);
			metamodels.put(mmName,exporter.getMetaModelDatabase());
		} else {
			exporter.setMetaModelDatabase((MetaModelDatabase) metamodels.get(mmName));
		}
		
		this.setMetaDatabase(exporter.getMetaModelDatabase());
		
		this.setOutputModelDatabase(exporter.getInstanceDatabase());
		
		exporter.prepareDatabase(classpath);
		
		/*URL[] urlPath = {};
		List<URL> urlList = new LinkedList<URL>();
		urlList.add(new File(classpath+"/tempClasses").toURI().toURL());
		urlPath = urlList.toArray(urlPath);

		URLClassLoader customLoader = new URLClassLoader(urlPath,this.getClass().getClassLoader());	
		
		for (MetaEntity me : loader.getMetaModelDatabase().getClasses()) {
			String packageName = me.getCurrentPackage().substring(1);
			packageName = Character.toUpperCase(me.getCurrentPackage().charAt(0)) + packageName;
			String className = me.getNamespace()+"."+packageName+"Package";
			if(!((EMFEclipseInstanceDatabase)this.getDatabase()).getFactorys().containsKey(className)) {
				Object factory = null;
				Class<?> cc = Class.forName(className,false,customLoader);
				Field f2 = cc.getField("eINSTANCE");
				factory = (Object)f2.get(cc);
				((EMFEclipseInstanceDatabase)this.getDatabase()).getFactorys().put(className, factory);
				
				String factoryName = me.getNamespace()+"."+packageName+"Factory";
				if (!((EMFEclipseInstanceDatabase)this.getDatabase()).getFactorys().containsKey(factoryName)) {
					Object factory1 = null;
					Class<?> cc1 = Class.forName(factoryName,false,customLoader);
					Field f21 = cc1.getField("eINSTANCE");
					factory1 = (Object)f21.get(cc1);
					((EMFEclipseInstanceDatabase)this.getDatabase()).getFactorys().put(factoryName, factory1);
				}
			}
		}
		if (factorys != null)
			factorys.putAll(((EMFEclipseInstanceDatabase)this.getDatabase()).getFactorys());*/
	}

}