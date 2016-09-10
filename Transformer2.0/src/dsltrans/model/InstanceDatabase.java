package dsltrans.model;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import dsltrans.metamodel.MetaEntity;

public abstract class InstanceDatabase {
	// data information
	private List<InstanceEntity> _loadedClasses;
	private List<InstanceAttribute> _loadedAttributes;
	private List<InstanceRelation> _loadedRelations;
	private InstanceEntity _rootElement = null;

	public InstanceDatabase() {
		_loadedClasses = new LinkedList<InstanceEntity>();
		_loadedAttributes = new LinkedList<InstanceAttribute>();
		_loadedRelations = new LinkedList<InstanceRelation>();
		
	}
	
	public List<InstanceEntity> getLoadedClasses() {
		return _loadedClasses;
	}

	public List<InstanceAttribute> getLoadedAttributes() {
		return _loadedAttributes;
	}	

	public List<InstanceRelation> getLoadedRelations() {
		return _loadedRelations;
	}
	
	public List<InstanceEntity> getElementsByMetaEntity(MetaEntity me) {
		List<InstanceEntity> list = new LinkedList<InstanceEntity>();
		for(InstanceEntity ie : getLoadedClasses()) {
			if(ie.getMetaEntity().getCurrentPackage().equals(me.getCurrentPackage()) && 
					ie.getMetaEntity().getName().equals(me.getName()))
				list.add(ie);
		}
		return list;
	}

	public List<InstanceAttribute> getAttributesByInstanceEntity(InstanceEntity e) {
		List<InstanceAttribute> elist = new LinkedList<InstanceAttribute>();
		for(InstanceAttribute ia : this.getLoadedAttributes()) {
			if(ia.getEntity() == e)
				elist.add(ia);
		}
		return elist;
	} 
	
	public abstract InstanceDatabase clone();
	
	public abstract InstanceEntity createInstance(MetaEntity me) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException;
	
	public void addEntity(InstanceEntity ie) {
		this.getLoadedClasses().add(ie);
	}

	public void addRelation(InstanceRelation ie) {
		this.getLoadedRelations().add(ie);
	}
	
	public void addAttribute(InstanceAttribute ie) {
		this.getLoadedAttributes().add(ie);
	}
	
	public List<InstanceRelation> getRelationsByInstanceEntity(InstanceEntity ie) {
		List<InstanceRelation> elist = new LinkedList<InstanceRelation>();
		for(InstanceRelation ir : this.getLoadedRelations()) {
			if(ir.getSource() == ie)
				elist.add(ir);
		}
		return elist;
	}

	public void union(InstanceDatabase database) {
		for(InstanceEntity ie: database.getLoadedClasses()) {
			if(!hasEntity(ie))
				this.addEntity(ie);
		}
		for(InstanceRelation ir: database.getLoadedRelations()) {
			if(!hasRelation(ir))
				this.addRelation(ir);			
		}
		for(InstanceAttribute ia: database.getLoadedAttributes()) {
			if(!hasAttribute(ia))
				this.addAttribute(ia);			
		}		
	}

	public boolean hasAttribute(InstanceAttribute ia) {
		for(InstanceAttribute attr: getLoadedAttributes()) {
			if(ia.hashCode() == attr.hashCode())
				return true;
		}
		return false;
	}

	public boolean hasRelation(InstanceRelation ir) {
		for(InstanceRelation relation: getLoadedRelations()) {
			if(ir.hashCode() == relation.hashCode())
				return true;
		}
		return false;
	}

	public boolean hasEntity(InstanceEntity ie) {
		for(InstanceEntity entity: getLoadedClasses()) {
			if(ie.hashCode() == entity.hashCode())
				return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return getLoadedClasses().isEmpty() && 
				getLoadedAttributes().isEmpty() && 
				getLoadedRelations().isEmpty();
	}

	public void createTemporalRelation(InstanceEntity imef, InstanceEntity iaef) {
		iaef.addTemporalParent(imef);
	}

	public void dump() {
		{
			System.out.println("printing loaded entities");
			for(InstanceEntity ie : getLoadedClasses()) {
				System.out.println(ie.print());
			}
		}{ 
			System.out.println("printing loaded attributes");
			for(InstanceAttribute ia : getLoadedAttributes()) {
				System.out.println(ia.print());
			}
		}{	
			System.out.println("printing loaded relations");
			for(InstanceRelation ir : getLoadedRelations()) {
				System.out.println(ir.print());
			}
		}
	}
	
	public void clean() {
		_loadedClasses = new LinkedList<InstanceEntity>();
		_loadedAttributes = new LinkedList<InstanceAttribute>();
		_loadedRelations = new LinkedList<InstanceRelation>();
	}

	public void createTransitiveGraph() {
		InstanceEntity ie = getRootElement();
		List<InstanceRelation> irList = getLoadedRelations();
		for(InstanceRelation ir : irList) {
			if(ir.getRelation().isContainment() && ir.getSource() == ie) {
				ir.getTarget().addParentHierarchy(ie);
				recurseTransitiveGraph(ir.getTarget());
			}
		}
	}

	private void recurseTransitiveGraph(InstanceEntity current) {
		List<InstanceRelation> irList = getLoadedRelations();
		for(InstanceRelation ir : irList) {
			if(ir.getRelation().isContainment() && ir.getSource() == current) {
				ir.getTarget().addParentHierarchy(current);
				recurseTransitiveGraph(ir.getTarget());
			}
		}
	}

	public void setRootElement(InstanceEntity instanceEntity) {
		_rootElement = instanceEntity;		
	}

	public InstanceEntity getRootElement() {
		return _rootElement;		
	}

	public void refreshTemporals() {
		for(InstanceEntity ie : this.getLoadedClasses()) {
			for(InstanceEntity iepast: ie.getTemporalParents()) {
				if(!iepast.getTemporalChildren().contains(ie))
					iepast.getTemporalChildren().add(ie);
			}
		}
	}

}
