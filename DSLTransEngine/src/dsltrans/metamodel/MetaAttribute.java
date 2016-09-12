package dsltrans.metamodel;


public interface MetaAttribute {
	
	public String getType();

	public MetaEntity getContainnerMetaEntity();

	public Object getDefaultValue();
	
	public String getDefaultValueString();
	
	public String getName();

	public boolean isInheritedFrom(MetaEntity me);
	
	public String print();
	
	public boolean isDSLTransType();
}
