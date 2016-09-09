package emfInterpreter.instance;

import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaRelation;
import persistence.InstanceAttribute;
import persistence.InstanceDatabase;
import persistence.InstanceEntity;
import persistence.InstanceRelation;

public class EMFEclipseInstanceDatabase extends InstanceDatabase{

	public EMFEclipseInstanceDatabase() {
		super();
	}
	
	@Override
	public InstanceDatabase clone(){
		EMFEclipseInstanceDatabase id = new EMFEclipseInstanceDatabase();
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
	
}
