package dsltrans.tests;

import dsltrans.metamodel.MetaEntity;
import dsltrans.model.InstanceEntity;

public class GenericInstanceEntity extends InstanceEntity {

	public GenericInstanceEntity(MetaEntity entity) {
		super(entity);
	}

	@Override
	public String print() {
		return this.toString();
	}

	@Override
	public boolean isEqual(InstanceEntity o) {
		// self check
	    if (this == o)
	        return true;
	    // null check
	    if (o == null)
	        return false;
	    // type check and cast
	    if (getClass() != o.getClass())
	        return false;

	    // Field comparison (Not applicable for this example)
	    return false;
	}

}
