package dsltrans.metamodel;

import org.eclipse.emf.ecore.EReference;

public class MetaRelation extends AbstractRelation {
	private EReference _reference;
	
	public MetaRelation(MetaEntity source, EReference ref, MetaEntity target) {
		super(source,target);
		setReference(ref);
	}

	public boolean isSet() {
		return getReference().isMany();
	}
	
	public boolean isContainment() {
		return getReference().isContainment();
	}

	public void setReference(EReference _attribute) {
		this._reference = _attribute;
	}

	public EReference getReference() {
		return _reference;
	}
	
	public String getName() {
		return getReference().getName();		
	}

	@Override
	public String print() {
		if(getReference().isContainment())
			return getSource().print()+"<"+ getName() +">-->" + getTarget().print();
		return getSource().print()+"("+ getName() +")-->" + getTarget().print();
	}

	@Override
	public boolean isEqual(AbstractRelation ar) {
		if(ar instanceof MetaRelation) {
			MetaRelation mr = (MetaRelation) ar;
			return this.getSource() == mr.getSource() &&
					this.getTarget() == mr.getTarget() &&
					this.getReference() == mr.getReference();
		}
		return false;
	}
	
}
