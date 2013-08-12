package emfInterpreter.metamodel;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EClassImpl;

public class MetaEntity {
	private EClassImpl _object;
	private String _namespace;
	private String _currPackage;
	private List<MetaEntity> _superEntities;
	
	public MetaEntity(EClassImpl object, String currpackage, String namespace) {
		setObject(object);
		setCurrentPackage(currpackage);
		setNamespace(namespace);
		_superEntities = new LinkedList<MetaEntity>();
	}

	public void setNamespace(String namespace) {
		this._namespace = namespace;
	}

	public String getNamespace() {
		return _namespace;
	}

	public void setObject(EClassImpl object) {
		this._object = object;
	}

	public EClassImpl getObject() {
		return _object;
	}
	
	public String getDotNotation() {
		return "'"+getObject().getName()+"'";
	}
	
	public String getQualifiedName() {
		return getNamespace()+"."+getObject().getName();
	}
	
	public String getName() {
		return getObject().getName();
	}
	
	public boolean isMetaTypeOf(EObject obj) {
		return 
			obj.getClass().getCanonicalName().compareTo
			(
				this.getNamespace()+".impl."+this.getName()+"Impl"
			) == 0;
	}

	public List<MetaEntity> getSuperEntities() {
		return this._superEntities;
	}
	
	public void addSuperEntity(MetaEntity mnext) {
		this._superEntities.add(mnext);
	}

	public boolean isSubTypeOf(MetaEntity me) {
		if(this == me) return true;
		Iterator<MetaEntity> iter = this._superEntities.iterator();
		while(iter.hasNext())
		{
			MetaEntity meta = iter.next();
			if(meta == me)
				return true;
		}
		return false;
	}

	public String print() {
		return getQualifiedName();
	}

	public void setCurrentPackage(String currPackage) {
		this._currPackage = currPackage;
	}

	public String getCurrentPackage() {
		return _currPackage;
	}
}
