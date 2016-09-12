package dsltrans.metamodel;


public class DSLTransAttribute implements MetaAttribute {

	public static final String DSLTRANS_DEFAULT = "__dsltrans_default";
	
	
	public DSLTransAttribute() {
	}

	@Override
	public boolean isDSLTransType() {
		return true;
	}

	@Override
	public String getType() {
		return "java.lang.String";
	}

	@Override
	public MetaEntity getContainnerMetaEntity() {
		return null;
	}

	@Override
	public Object getDefaultValue() {
		return new String(DSLTRANS_DEFAULT);
	}

	@Override
	public String getDefaultValueString() {
		return new String(DSLTRANS_DEFAULT);
	}

	@Override
	public String getName() {
		return DSLTRANS_DEFAULT;
	}

	@Override
	public boolean isInheritedFrom(MetaEntity me) {
		return false;
	}

	@Override
	public String print() {
		return DSLTRANS_DEFAULT;
	}
	
}
