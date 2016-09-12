package dsltrans.model;

import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaRelation;

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
	
	private InstanceEntity cloneEntity(InstanceEntity entity) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
		return createInstance(entity.getMetaEntity());
	}
	
	public abstract InstanceDatabase createEmptyClone();
	
	public InstanceDatabase clone(){
		InstanceDatabase id = createEmptyClone();
		
		Map<InstanceEntity, InstanceEntity> entitymap = new HashMap<InstanceEntity, InstanceEntity>();

		for (InstanceEntity ie : getInstanceEntities()) {
			InstanceEntity cloned;
			try {
				cloned = cloneEntity(ie);
				entitymap.put(ie, cloned);
				cloned.setFreshness(ie.isFresh());
				for (InstanceEntity iepast : ie.getTemporalParents()) {
					cloned.addTemporalParent(iepast);
					if (iepast.getTemporalChildren().contains(ie))
						iepast.getTemporalChildren().remove(ie);
					iepast.getTemporalChildren().add(cloned);
				}
				id.getInstanceEntities().add(cloned);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}

		for (InstanceEntity ie : getInstanceEntities()) {
			Enumeration<MetaRelation> mrelations = ie.getLastRelations();
			while (mrelations.hasMoreElements()) {
				MetaRelation mr = mrelations.nextElement();
				InstanceEntity last = ie.getLast(mr);
				((InstanceEntity) entitymap.get(ie)).setLast(mr,
						(InstanceEntity) entitymap.get(last));
			}
		}

		for (InstanceAttribute ia : getInstanceAttributes()) {
			InstanceAttribute cloned = new InstanceAttribute(
					(InstanceEntity) entitymap.get(ia.getEntity()),
					ia.getMetaAttribute(), ia.getValue());
			id.getInstanceAttributes().add(cloned);
		}

		for (InstanceRelation ir : getInstanceRelations()) {
			InstanceEntity itarget = null;
			if (ir.getTarget() != null
					&& (InstanceEntity) entitymap.get(ir.getTarget()) == null)
				itarget = ir.getTarget();
			else
				itarget = (InstanceEntity) entitymap.get(ir.getTarget());
			InstanceRelation cloned = new InstanceRelation(
					(InstanceEntity) entitymap.get(ir.getSource()),
					ir.getRelation(), itarget);
			id.getInstanceRelations().add(cloned);
		}

		if (this.getRootElement() != null) {
			MetaEntity rootEntity = this.getRootElement().getMetaEntity();
			List<InstanceEntity> ielist = id.getAllInstancesOf(rootEntity);
			id.setRootElement(ielist.get(0));
		}
		return id;
	}
	
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
