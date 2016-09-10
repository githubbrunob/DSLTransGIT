package dsltrans.io.eclipse;

import java.util.HashMap;
import java.util.Map;

import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;

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
		return new EclipseInstanceDatabase(this);
	}

}
