package dsltrans.metamodel;

import java.util.List;

public interface MetaEntity {
	
	public String getNamespace();

	public String getDotNotation();
	
	public String getQualifiedName();
	
	public String getName();

	public boolean isAbstract();
	
	public List<MetaEntity> getSuperEntities();
	
	public boolean isSubTypeOf(MetaEntity me);

	public String print();

	public String getPackage();

}
