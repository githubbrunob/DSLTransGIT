package dsltrans.io.eclipse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EClassImpl;

import dsltrans.metamodel.MetaEntity;

public class EclipseMetaEntity implements MetaEntity {
	private EClassImpl _object;
	private String _namespace;
	private String _currPackage;
	private List<MetaEntity> _superEntities;
	
	public EclipseMetaEntity(EClassImpl object, String currpackage, String namespace) {
		this._object = object;
		this._currPackage = currpackage;
		this._namespace = namespace;
		_superEntities = new LinkedList<MetaEntity>();
	}

	public String getNamespace() {
		return _namespace;
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

	public boolean isAbstract() {
		return this.getObject().isAbstract();
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

	public String getCurrentPackage() {
		return _currPackage;
	}
}
