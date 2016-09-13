package dsltrans.io;

import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;

public interface ModelExporter {
	
	public void setInstanceDatabase(InstanceDatabase database);

	public void setMetaModelDatabase(MetaModelDatabase metamodelDatabase);

	public void saveTo(String location) throws Throwable;
	
}
