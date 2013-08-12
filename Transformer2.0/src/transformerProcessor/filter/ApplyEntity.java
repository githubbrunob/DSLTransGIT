package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;

import transformerProcessor.TransformationRule;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import dsltrans.ApplyAttribute;
import dsltrans.ApplyClass;
import emfInterpreter.instance.InstanceAttribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.metamodel.DSLTransAttribute;
import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;

public class ApplyEntity extends ApplyEntityFilter {

	private boolean _pastEntity = false;
	
	public ApplyEntity(TransformationRule tr, ApplyClass mc, String id) {
		super(tr, mc, id);
	}

	public boolean performApply(InstanceDatabase database,
			MetaModelDatabase metamodel, InstanceDatabase matchmodel) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidLayerRequirement {
		
		if(getCurrentEntity() == null) {
			MetaEntity me = metamodel.getMetaEntityByName(
					this.getApplyClass().getPackageName(),
					this.getApplyClass().getClassName()
			);

			if(isImported()) {
				this.getTransformationRule().processImports(this,database,metamodel,matchmodel);
			} else {
				InstanceEntity ie = database.createInstance(me);
				setCurrentEntity(ie);
				database.addEntity(ie);
				System.out.println(": "+"i"+Integer.toString(ie.hashCode()));
				{
					for(ApplyAttributeFilter aaf : getFilterAttributes()) {
						if(aaf.getName().equals(DSLTransAttribute.DSLTRANS_DEFAULT)) {
							InstanceAttribute ia = new InstanceAttribute(ie,metamodel.getMetaAttributeByName(DSLTransAttribute.DSLTRANS_DEFAULT));
							database.addAttribute(ia);
							aaf.setCurrentAttribute(ia);
							break; // only one per instance
						}
					}
				}
				
				// create default attributes
				for(MetaAttribute ma : metamodel.getAttributesFromEntity(me)) {			
					database.addAttribute(new InstanceAttribute(ie,ma));
				}
				
				for(ApplyAttributeFilter aaf: this.getFilterAttributes()) {
					ApplyAttribute aa = aaf.getAttribute();
					for(InstanceAttribute ia : database.getAttributesByInstanceEntity(ie)) {
						if(ia.getMetaAttribute().getName().equals(aa.getAttributeName()))
							aaf.setCurrentAttribute(ia);
					}
				}
			}
		}
		return true;
	}

	public void setPastEntity(boolean _pastEntity) {
		this._pastEntity = _pastEntity;
	}

	public boolean isPastEntity() {
		return _pastEntity;
	}
}
