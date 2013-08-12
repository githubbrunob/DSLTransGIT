/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A basic implementation of the SOS.resource.SOS.ISOSElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class SOSElementMapping<ReferenceType> implements SOS.resource.SOS.ISOSElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public SOSElementMapping(String identifier, ReferenceType target, String warning) {
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
