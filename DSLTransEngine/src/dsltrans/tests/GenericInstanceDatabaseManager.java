package dsltrans.tests;

import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;

public class GenericInstanceDatabaseManager implements InstanceDatabaseManager {
	
	InstanceDatabase outputInstanceDatabase;
	
	@Override
	public InstanceDatabase createInstanceDatabase() {
		return new GenericInstanceDatabase();
	}

}
