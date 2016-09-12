package dsltrans.io.eclipse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaRelation;
import dsltrans.model.InstanceAttribute;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceEntity;
import dsltrans.model.InstanceRelation;

public class EclipseInstanceDatabase extends InstanceDatabase {

	private Map<String,Object> _factorys;
	private EclipseInstanceDatabaseManager manager;
	
	public EclipseInstanceDatabase(EclipseInstanceDatabaseManager eclipseInstanceDatabaseManager) {
		super();
		setFactorys(new Hashtable<String,Object>());
		this.manager = eclipseInstanceDatabaseManager;
	}
	
	public void setFactorys(Map<String,Object> _factorys) {
		this._factorys = _factorys;
	}

	public Map<String,Object> getFactorys() {
		return _factorys;
	}
	
	public Object getFactory(String classname) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		if(getFactorys().containsKey(classname)) {
			return getFactorys().get(classname);
		}
		throw new ClassNotFoundException();
	}
	
	@Override
	public InstanceDatabase clone(){
		EclipseInstanceDatabase id = new EclipseInstanceDatabase(this.manager);
		id.setFactorys(this.getFactorys()); // share factories
		Map<InstanceEntity,InstanceEntity> entitymap = new HashMap<InstanceEntity,InstanceEntity>();
		{{
			for(InstanceEntity ie : getInstanceEntities()) {
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
		}}{
			for(InstanceEntity ie : getInstanceEntities()) {
				Enumeration<MetaRelation> mrelations = ie.getLastRelations();
				while(mrelations.hasMoreElements()) {
					MetaRelation mr=mrelations.nextElement();
					InstanceEntity last=ie.getLast(mr);
					((InstanceEntity)entitymap.get(ie)).setLast(mr,
							(InstanceEntity)entitymap.get(last));
				}
		}}{
			for(InstanceAttribute ia : getInstanceAttributes()) {
				InstanceAttribute cloned = 
					new InstanceAttribute(
							(InstanceEntity)entitymap.get(ia.getEntity()),
							ia.getMetaAttribute(),
							ia.getValue()
					);
				id.getInstanceAttributes().add(cloned);
		}}{
			for(InstanceRelation ir : getInstanceRelations()) {
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
				id.getInstanceRelations().add(cloned);
		}}}
		{
			if(this.getRootElement() != null) {
				MetaEntity rootEntity = this.getRootElement().getMetaEntity();
				List<InstanceEntity> ielist = id.getAllInstancesOf(rootEntity);
				id.setRootElement(ielist.get(0));
				//id.createTransitiveGraph();
			}
		}
		return id;
	}
	
	private InstanceEntity cloneEntity(InstanceEntity entity) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
		return createInstance(entity.getMetaEntity());
	}
	
	@Override
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

	public void synchFactories() {
		assert this.manager.getFactorys() != null;
		this.setFactorys(this.manager.getFactorys());
	}
}
