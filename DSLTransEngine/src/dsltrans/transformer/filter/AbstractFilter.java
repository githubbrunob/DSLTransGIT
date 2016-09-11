package dsltrans.transformer.filter;

import java.lang.reflect.InvocationTargetException;

import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;

public abstract class AbstractFilter {
	private final String _id;
	private final InstanceDatabase _FilterDatabase;
	
	public AbstractFilter(String id, InstanceDatabaseManager instanceDatabaseManager) {
		_id = id;
		_FilterDatabase = instanceDatabaseManager.createInstanceDatabase();
	}

	public String getId() {
		return _id;
	}
	
	public InstanceDatabase getFilterDatabase() {
		return _FilterDatabase;
	}

	public abstract boolean process(InstanceDatabase model, MetaModelDatabase mmodel)
			throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidLayerRequirement;
}
