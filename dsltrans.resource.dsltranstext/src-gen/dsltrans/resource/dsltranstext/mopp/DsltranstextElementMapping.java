/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A basic implementation of the
 * dsltrans.resource.dsltranstext.IDsltranstextElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class DsltranstextElementMapping<ReferenceType> implements dsltrans.resource.dsltranstext.IDsltranstextElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public DsltranstextElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
