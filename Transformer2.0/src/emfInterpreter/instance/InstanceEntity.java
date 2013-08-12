package emfInterpreter.instance;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaRelation;

public class InstanceEntity {
	private EObjectImpl _object=null;
	private EModelElementImpl _objectmeta=null; // EClassImpl, EAttributeImpl, EReferenceImpl
	private MetaEntity _metaentity;
	private List<MetaRelation> _loadedmetarelations;
	private List<MetaAttribute> _loadedmetaattributes;
	private List<InstanceEntity> _parents;
	private String _dotnotation;
	private List<InstanceEntity> _temporalParents;
	private List<InstanceEntity> _temporalChildren;	
	private boolean _fresh = true;
	private Hashtable<MetaRelation,InstanceEntity> _lastPerRelation;
	
	public InstanceEntity(EModelElementImpl object, MetaEntity entity) {
		setObject(object);
		setMetaEntity(entity);
		_parents = new LinkedList<InstanceEntity>();
		_temporalParents = new LinkedList<InstanceEntity>();		
		_temporalChildren = new LinkedList<InstanceEntity>();		
		_loadedmetarelations = new LinkedList<MetaRelation>();
		_lastPerRelation = new Hashtable<MetaRelation,InstanceEntity>();
		setLoadedMetaAttributes(new LinkedList<MetaAttribute>());
		setDotNotation(getMetaEntity().getDotNotation());
	}

	public InstanceEntity(EObjectImpl object, MetaEntity entity) {
		setObject(object);
		setMetaEntity(entity);
		_parents = new LinkedList<InstanceEntity>();
		_temporalParents = new LinkedList<InstanceEntity>();		
		_temporalChildren = new LinkedList<InstanceEntity>();		
		_loadedmetarelations = new LinkedList<MetaRelation>();
		_lastPerRelation = new Hashtable<MetaRelation,InstanceEntity>();
		setLoadedMetaAttributes(new LinkedList<MetaAttribute>());
		setDotNotation(getMetaEntity().getDotNotation());
	}
	
	
	public void setMetaEntity(MetaEntity namespace) {
		this._metaentity = namespace;
	}
	
	public MetaEntity getMetaEntity() {
		return _metaentity;
	}

	public void setObject(EObjectImpl object) {
		this._object = object;
	}

	public EObjectImpl getObject() {
		return _object;
	}

	public void setObject(EModelElementImpl object) {
		this._objectmeta = object;
	}

	public EModelElementImpl getObjectMeta() {
		return _objectmeta;
	}	
	
	public boolean hasLoadedRelation(MetaRelation mr) {
		// TODO Auto-generated method stub
		
		Iterator<MetaRelation> iter = this._loadedmetarelations.iterator();
		while(iter.hasNext())
		{
			MetaRelation meta = iter.next();
			if(meta.getName() == mr.getName())
				return true;
		}
		return false;
	}

	public void addRelation(MetaRelation ma) {
		if(hasLoadedRelation(ma)) return;
		_loadedmetarelations.add(ma);
	}

	public void addAttribute(MetaAttribute ma) {
		if(hasLoadedAttribute(ma)) return;
		getLoadedMetaAttributes().add(ma);
	}

	public boolean hasLoadedAttribute(MetaAttribute ma) {
		Iterator<MetaAttribute> iter = this.getLoadedMetaAttributes().iterator();
		while(iter.hasNext())
		{
			MetaAttribute meta = iter.next();
			if(meta.getName() == ma.getName() && meta.getType() == ma.getType())
				return true;
		}
		return false;
	}
	
	public String print() {
		return getObject().toString()+"["+Integer.toString(this.hashCode())+"]";	
	}

	public boolean isEqual(InstanceEntity source) {
		return this.getObject()==source.getObject();
	}

	public void setDotNotation(String _dotnotation) {
		this._dotnotation = _dotnotation;
	}
	
	public String getDotNotation() {
		return _dotnotation;
	}

	public void setParents(List<InstanceEntity> _parents) {
		this._parents = _parents;
	}

	public List<InstanceEntity> getParents() {
		return _parents;
	}

	public void addParentHierarchy(InstanceEntity ie) {
		setParents(new LinkedList<InstanceEntity>(ie.getParents()));
		getParents().add(ie);
	}

	public void addTemporalParent(InstanceEntity imef) {
		_temporalParents.add(imef);
	}	
	
	public List<InstanceEntity> getTemporalParents() {
		return _temporalParents;
	}

	public List<InstanceEntity> getTemporalChildren() {
		return _temporalChildren;
	}
	
	
	public void setFreshness(boolean _fresh) {
		this._fresh = _fresh;
	}

	public boolean isFresh() {
		return _fresh;
	}

	public void setLoadedMetaAttributes(List<MetaAttribute> _loadedmetaattributes) {
		this._loadedmetaattributes = _loadedmetaattributes;
	}

	public List<MetaAttribute> getLoadedMetaAttributes() {
		return _loadedmetaattributes;
	}

	public void setLast(MetaRelation mr, InstanceEntity target) {
		_lastPerRelation.put(mr,target);
	}

	public InstanceEntity getLast(MetaRelation mr) {
		return _lastPerRelation.get(mr);
	}

	public Enumeration<MetaRelation> getLastRelations() {
		// TODO Auto-generated method stub
		return _lastPerRelation.keys();
	}
}
