/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A basic implementation of the SOS.resource.SOS.ISOSURIMapping interface that
 * can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * SOS.resource.SOS.ISOSURIMapping.
 */
public class SOSURIMapping<ReferenceType> implements SOS.resource.SOS.ISOSURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public SOSURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
