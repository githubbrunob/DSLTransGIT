package emfInterpreter.instance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaRelation;

public class InstanceDatabase {
	// data information
	private List<InstanceEntity> _loadedClasses;
	private List<InstanceAttribute> _loadedAttributes;
	private List<InstanceRelation> _loadedRelations;
	private Map<String,Object> _factorys;
	private InstanceEntity _rootElement = null;
		
	public InstanceDatabase() {
		_loadedClasses = new LinkedList<InstanceEntity>();
		_loadedAttributes = new LinkedList<InstanceAttribute>();
		_loadedRelations = new LinkedList<InstanceRelation>();
		setFactorys(new Hashtable<String,Object>());
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
	
	public Object getFactory(String classname) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		if(getFactorys().containsKey(classname)) {
			return getFactorys().get(classname);
		}
		throw new ClassNotFoundException();
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
	
	public InstanceDatabase clone(){
		InstanceDatabase id = new InstanceDatabase();
		id.setFactorys(this.getFactorys()); // share factories
		Map<InstanceEntity,InstanceEntity> entitymap = new HashMap<InstanceEntity,InstanceEntity>();
		{{
			for(InstanceEntity ie : getLoadedClasses()) {
				InstanceEntity cloned;
				try {
					cloned = cloneEntity(ie);
					System.out.println("cloning: "+"i"+Integer.toString(ie.hashCode())+" to i"+ Integer.toString(cloned.hashCode()));
					entitymap.put(ie, cloned);
					cloned.setFreshness(ie.isFresh());
					for(InstanceEntity iepast: ie.getTemporalParents()) {
						cloned.addTemporalParent(iepast);
						if(iepast.getTemporalChildren().contains(ie))
							iepast.getTemporalChildren().remove(ie);
						iepast.getTemporalChildren().add(cloned);
					}
					id.addEntity(cloned);
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
		}}{
			for(InstanceEntity ie : getLoadedClasses()) {
				Enumeration<MetaRelation> mrelations = ie.getLastRelations();
				while(mrelations.hasMoreElements()) {
					MetaRelation mr=mrelations.nextElement();
					InstanceEntity last=ie.getLast(mr);
					((InstanceEntity)entitymap.get(ie)).setLast(mr,
							(InstanceEntity)entitymap.get(last));
				}
		}}{
			for(InstanceAttribute ia : getLoadedAttributes()) {
				InstanceAttribute cloned = 
					new InstanceAttribute(
							(InstanceEntity)entitymap.get(ia.getEntity()),
							ia.getMetaAttribute(),
							ia.getValue()
					);
				id.addAttribute(cloned);
		}}{
			for(InstanceRelation ir : getLoadedRelations()) {
				InstanceEntity itarget = null;
				if(ir.getTarget() != null &&
				(InstanceEntity)entitymap.get(ir.getTarget()) == null)
					itarget = ir.getTarget();
				else
					itarget = (InstanceEntity)entitymap.get(ir.getTarget());
				InstanceRelation cloned = 
					new InstanceRelation(
						(InstanceEntity)entitymap.get(ir.getSource()),
						ir.getRelation(),
						itarget
					);
				id.addRelation(cloned);
		}}}
		{
			if(this.getRootElement() != null) {
				MetaEntity rootEntity = this.getRootElement().getMetaEntity();
				List<InstanceEntity> ielist = id.getElementsByMetaEntity(rootEntity);
				id.setRootElement(ielist.get(0));
				//id.createTransitiveGraph();
			}
		}
		return id;
	}
	
	private InstanceEntity cloneEntity(InstanceEntity entity) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
		return createInstance(entity.getMetaEntity());
	}

	public InstanceEntity createInstance(MetaEntity me) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		String namespace = me.getNamespace();
		String currentPackage = me.getCurrentPackage().substring(1);
		currentPackage= Character.toUpperCase(me.getCurrentPackage().charAt(0)) + currentPackage;
		//String currentPackage = me.getCurrentPackage();
		String methodname = "create"+me.getName();
		String classname = namespace+"."+currentPackage+"Factory";

		Object factory = getFactory(classname);
		
		Method method = factory.getClass().getMethod(methodname);
		return new InstanceEntity((EObjectImpl)method.invoke(factory), me);
	}
	
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

	public void setFactorys(Map<String,Object> _factorys) {
		this._factorys = _factorys;
	}

	public Map<String,Object> getFactorys() {
		return _factorys;
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

	public void recurseTransitiveGraph(InstanceEntity current) {
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
	
	/*public void remove(InstanceDatabase filterDatabase) {
		for (InstanceEntity ie : filterDatabase.getLoadedClasses()) {
			getLoadedClasses().remove(ie);
			if (hasEntity(ie))
			for (InstanceRelation ir : filterDatabase.getRelationsByInstanceEntity(ie)) {
								
			}
		}
		
		for (InstanceRelation ir : filterDatabase.getLoadedRelations()) {
			getLoadedRelations().remove(ir);
		}
		
		for (InstanceAttribute ia : filterDatabase.getLoadedAttributes()) {
			getLoadedAttributes().remove(ia);
		}
	}*/

}
