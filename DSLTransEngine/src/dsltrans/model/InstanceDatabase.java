package dsltrans.model;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import dsltrans.metamodel.MetaEntity;

public abstract class InstanceDatabase {
	// data information
	private List<InstanceEntity> _entities;
	private List<InstanceAttribute> _loadedAttributes;
	private List<InstanceRelation> _loadedRelations;
	private InstanceEntity _rootElement = null;

	public InstanceDatabase() {
		_entities = new LinkedList<InstanceEntity>();
		_loadedAttributes = new LinkedList<InstanceAttribute>();
		_loadedRelations = new LinkedList<InstanceRelation>();
		
	}
	
	public List<InstanceEntity> getInstanceEntities() {
		return _entities;
	}

	public List<InstanceAttribute> getInstanceAttributes() {
		return _loadedAttributes;
	}	

	public List<InstanceRelation> getInstanceRelations() {
		return _loadedRelations;
	}
	
	public List<InstanceEntity> getAllInstancesOf(MetaEntity me) {
		List<InstanceEntity> list = new LinkedList<InstanceEntity>();
		for(InstanceEntity ie : getInstanceEntities()) {
			if(ie.getMetaEntity().getCurrentPackage().equals(me.getCurrentPackage()) && 
					ie.getMetaEntity().getName().equals(me.getName()))
				list.add(ie);
		}
		return list;
	}

	public List<InstanceAttribute> getAllAttributesOf(InstanceEntity e) {
		List<InstanceAttribute> elist = new LinkedList<InstanceAttribute>();
		for(InstanceAttribute ia : this.getInstanceAttributes()) {
			if(ia.getEntity() == e)
				elist.add(ia);
		}
		return elist;
	} 
	
	public abstract InstanceDatabase clone();
	
	public abstract InstanceEntity createInstance(MetaEntity me) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException;
	
	public List<InstanceRelation> getRelationsLeaving(InstanceEntity ie) {
		List<InstanceRelation> elist = new LinkedList<InstanceRelation>();
		for(InstanceRelation ir : this.getInstanceRelations()) {
			if(ir.getSource() == ie)
				elist.add(ir);
		}
		return elist;
	}

	public void union(InstanceDatabase database) {
		for(InstanceEntity ie: database.getInstanceEntities()) {
			if(!hasEntity(ie))
				this.getInstanceEntities().add(ie);
		}
		for(InstanceRelation ir: database.getInstanceRelations()) {
			if(!hasRelation(ir))
				this.getInstanceRelations().add(ir);			
		}
		for(InstanceAttribute ia: database.getInstanceAttributes()) {
			if(!hasAttribute(ia))
				this.getInstanceAttributes().add(ia);			
		}		
	}

	public boolean hasAttribute(InstanceAttribute ia) {
		for(InstanceAttribute attr: getInstanceAttributes()) {
			if(ia.hashCode() == attr.hashCode())
				return true;
		}
		return false;
	}

	public boolean hasRelation(InstanceRelation ir) {
		for(InstanceRelation relation: getInstanceRelations()) {
			if(ir.hashCode() == relation.hashCode())
				return true;
		}
		return false;
	}

	public boolean hasEntity(InstanceEntity ie) {
		for(InstanceEntity entity: getInstanceEntities()) {
			if(ie.hashCode() == entity.hashCode())
				return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return getInstanceEntities().isEmpty() && 
				getInstanceAttributes().isEmpty() && 
				getInstanceRelations().isEmpty();
	}

	public void createTemporalRelation(InstanceEntity imef, InstanceEntity iaef) {
		iaef.addTemporalParent(imef);
	}

	public void dump() {
		{
			System.out.println("printing loaded entities");
			for(InstanceEntity ie : getInstanceEntities()) {
				System.out.println(ie.print());
			}
		}{ 
			System.out.println("printing loaded attributes");
			for(InstanceAttribute ia : getInstanceAttributes()) {
				System.out.println(ia.print());
			}
		}{	
			System.out.println("printing loaded relations");
			for(InstanceRelation ir : getInstanceRelations()) {
				System.out.println(ir.print());
			}
		}
	}
	
	public void clean() {
		_entities = new LinkedList<InstanceEntity>();
		_loadedAttributes = new LinkedList<InstanceAttribute>();
		_loadedRelations = new LinkedList<InstanceRelation>();
	}

	public void createTransitiveGraph() {
		InstanceEntity ie = getRootElement();
		List<InstanceRelation> irList = getInstanceRelations();
		for(InstanceRelation ir : irList) {
			if(ir.getRelation().isContainment() && ir.getSource() == ie) {
				ir.getTarget().addParentHierarchy(ie);
				recurseTransitiveGraph(ir.getTarget());
			}
		}
	}

	private void recurseTransitiveGraph(InstanceEntity current) {
		List<InstanceRelation> irList = getInstanceRelations();
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
		for(InstanceEntity ie : this.getInstanceEntities()) {
			for(InstanceEntity iepast: ie.getTemporalParents()) {
				if(!iepast.getTemporalChildren().contains(ie))
					iepast.getTemporalChildren().add(ie);
			}
		}
	}

}
