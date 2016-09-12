package dsltrans.tests;

import java.lang.reflect.InvocationTargetException;

import dsltrans.metamodel.MetaEntity;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceEntity;

public class GenericInstanceDatabase extends InstanceDatabase {

	public GenericInstanceDatabase(){
		
	}
	
	@Override
	public InstanceDatabase createEmptyClone() {
		return new GenericInstanceDatabase();
	}

	@Override
	public InstanceEntity createInstance(MetaEntity me)
			throws ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException {
		return new GenericInstanceEntity(me);
	}
	
}
