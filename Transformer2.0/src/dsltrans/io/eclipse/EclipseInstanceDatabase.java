package dsltrans.io.eclipse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import dsltrans.metamodel.MetaEntity;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceEntity;

public class EclipseInstanceDatabase extends InstanceDatabase {

	private Map<String,Object> _factorys;
	private EclipseInstanceDatabaseManager manager;
	
	public EclipseInstanceDatabase(EclipseInstanceDatabaseManager eclipseInstanceDatabaseManager) {
		super();
		setFactorys(new Hashtable<String,Object>());
		this.manager = eclipseInstanceDatabaseManager;
	}
	
	public void setFactorys(Map<String,Object> _factorys) {
		this._factorys = _factorys;
	}

	public Map<String,Object> getFactorys() {
		return _factorys;
	}
	
	public Object getFactory(String classname) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		if(getFactorys().containsKey(classname)) {
			return getFactorys().get(classname);
		}
		throw new ClassNotFoundException();
	}
	
	@Override
	public InstanceEntity createInstance(MetaEntity me) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		String namespace = me.getNamespace();
		String currentPackage = me.getPackage().substring(1);
		currentPackage= Character.toUpperCase(me.getPackage().charAt(0)) + currentPackage;
		//String currentPackage = me.getCurrentPackage();
		String methodname = "create"+me.getName();
		String classname = namespace+"."+currentPackage+"Factory";

		Object factory = getFactory(classname);
		
		Method method = factory.getClass().getMethod(methodname);
		return new EclipseInstanceEntity((EObjectImpl)method.invoke(factory), me);
	}

	public void synchFactories() {
		assert this.manager.getFactorys() != null;
		this.setFactorys(this.manager.getFactorys());
	}

	@Override
	public InstanceDatabase createEmptyClone() {
		EclipseInstanceDatabase id = new EclipseInstanceDatabase(this.manager);
		id.setFactorys(this.getFactorys());
		return id;
	}
}
