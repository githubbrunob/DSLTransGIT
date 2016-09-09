package transformerProcessor.filter;

import persistence.InstanceAttribute;
import persistence.InstanceDatabase;
import persistence.InstanceEntity;
import dsltrans.Atom;
import dsltrans.Attribute;
import dsltrans.MatchAttribute;
import dsltrans.MatchAttributeValue;
import dsltrans.isNull;
import emfInterpreter.metamodel.MetaAttribute;
import emfInterpreter.metamodel.MetaModelDatabase;

public class MatchAttributeFilter extends AbstractFilter {

	private final MatchAttribute _attribute;
	private MetaModelDatabase _metaModel;
	private InstanceAttribute _currentAttribute;
	private MatchEntityFilter _entity;
	
	public MatchAttributeFilter(MatchAttribute ma, String id, MatchEntityFilter mef) {
		super(id);
		_attribute = ma;
		setCurrentAttribute(null);
		setEntity(mef);
	}

	public boolean process(InstanceDatabase database, MetaModelDatabase metamodel)
	{
		setMetaModel(metamodel);
		boolean valueFound = false;
		if((getAttribute()!=null) && (getAttribute().getAttributeValue()!=null)) {
			MatchAttributeValue mav = getAttribute().getAttributeValue();
			for (InstanceAttribute ia : database.getAttributesByInstanceEntity(getEntity().getCurrentEntity())) {
				if (ia.getMetaAttribute().getName().equals(getAttribute().getAttributeName())) {
					if (mav instanceof isNull && ((isNull)mav).isValue())
						return false;					
					if (mav instanceof Atom) {
						if (!ia.getValue().toString().equals(((Atom)mav).getValue()))
							return false; //failed 1 attribute match, no need to continue
					}
					valueFound = true;
				}
			}
			if (mav instanceof isNull && !((isNull)mav).isValue())
				return valueFound;
		}
		return true;
	}

	private void setMetaModel(MetaModelDatabase metamodel) {
		_metaModel = metamodel;
	}
	
	private MetaModelDatabase getMetaModel() {
		return _metaModel;
	}

	public MatchAttribute getAttribute() {
		return _attribute;
	}

	public void setCurrentAttribute(InstanceAttribute _currentAttribute) {
		this._currentAttribute = _currentAttribute;
	}

	public InstanceAttribute getCurrentAttribute() {
		return _currentAttribute;
	}

	public void setCurrentByEntity(InstanceEntity ie) {
		for(InstanceAttribute ia: this.getFilterDatabase().getLoadedAttributes()) {
			if(ia.getEntity().hashCode() == ie.hashCode()) {
				setCurrentAttribute(ia);
				return;
			}
		}
		// not found.. so create a new one..
		for(MetaAttribute ma : getMetaModel().getAttributesFromEntity(ie.getMetaEntity()))
		{
			System.out.println("creating a new attribute for the filter: " + ma.toString());
			if(ma.getName().compareTo(getAttribute().getAttributeName())== 0) {
				setCurrentAttribute(new InstanceAttribute(ie,ma));
			}
		}
	}

	private void setEntity(MatchEntityFilter _entity) {
		this._entity = _entity;
	}

	public MatchEntityFilter getEntity() {
		return _entity;
	}
	
	public String getName() {
		return this.getAttribute().getAttributeName();
	}

	public boolean isAtomValue() {
		MatchAttributeValue mav = getAttribute().getAttributeValue();
		return mav instanceof Atom;
	}

	public String getAtomValue() {
		MatchAttributeValue mav = getAttribute().getAttributeValue();
		return "'"+((Atom)mav).getValue()+"'";
	}

	public boolean correspondsTo(Attribute a) {
		return getAttribute() == a;
	}
}
