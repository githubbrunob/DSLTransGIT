package dsltrans.metamodel;

public interface MetaRelation {
	
	public MetaEntity getSource();
	
	public MetaEntity getTarget();
	
	public boolean isEqual(MetaRelation ar);
	
	public boolean isSet();
	
	public boolean isContainment();
	
	public String getName();

	public String print();
	
}
