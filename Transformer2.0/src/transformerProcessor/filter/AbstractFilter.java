package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;

import persistence.InstanceDatabase;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import emfInterpreter.instance.EMFEclipseInstanceDatabase;
import emfInterpreter.metamodel.MetaModelDatabase;

public abstract class AbstractFilter {
	private final String _id;
	private final InstanceDatabase _FilterDatabase;
	
	public AbstractFilter(String id) {
		_id = id;
		// TODO: This cannot be done here. It should create either a normal instance database, without factories, or it should asks someone else to create it.
		_FilterDatabase = new EMFEclipseInstanceDatabase();
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
