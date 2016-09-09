package emfInterpreter;

import java.util.HashMap;
import java.util.Map;

import persistence.InstanceDatabase;
import persistence.InstanceDatabaseManager;
import emfInterpreter.instance.EMFEclipseInstanceDatabase;

public class EclipseInstanceDatabaseManager implements InstanceDatabaseManager {
	
	private final Map<String, Object> _factorys;
	
	public EclipseInstanceDatabaseManager(){
		_factorys = new HashMap<String, Object>();
	}
	

	public Map<String, Object> getFactorys() {
		return _factorys;
	}

	@Override
	public InstanceDatabase createInstanceDatabase() {
		return new EMFEclipseInstanceDatabase();
	}

}
