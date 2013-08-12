package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.metamodel.MetaModelDatabase;

public abstract class AbstractFilter {
	private final String _id;
	private final InstanceDatabase _FilterDatabase;
	
	public AbstractFilter(String id) {
		_id = id;
		_FilterDatabase = new InstanceDatabase();
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
