package dsltrans.tests;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import dsltrans.metamodel.MetaEntity;

public class GenericMetaEntity implements MetaEntity {
	
	private String namespace;
	private String name;
	private boolean isAbstract;
	private String packageName;

	private List<MetaEntity> superEntities;
	
	public GenericMetaEntity(String namespace, String packageName, String name, boolean isAbstract) {
		this.namespace = namespace;
		this.name = name;
		this.isAbstract = isAbstract;
		this.packageName = packageName;
		this.superEntities = new LinkedList<MetaEntity>();
	}
	
	@Override
	public String getNamespace() {
		return namespace;
	}

	@Override
	public String getDotNotation() {
		return packageName + '.' + name;
	}

	@Override
	public String getQualifiedName() {
		return namespace + '.' + packageName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isAbstract() {
		return isAbstract;
	}

	@Override
	public List<MetaEntity> getSuperEntities() {
		return superEntities;
	}

	@Override
	public boolean isSubTypeOf(MetaEntity me) {
		if(this == me) return true;
		Iterator<MetaEntity> iter = this.superEntities.iterator();
		while(iter.hasNext())
		{
			MetaEntity meta = iter.next();
			if(meta == me)
				return true;
		}
		return false;
	}

	@Override
	public String print() {
		return getQualifiedName();
	}

	@Override
	public String getPackage() {
		return this.packageName;
	}

}
