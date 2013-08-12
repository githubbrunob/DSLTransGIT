/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A basic implementation of the
 * dsltrans.resource.dsltranstext.IDsltranstextURIMapping interface that can map
 * identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * dsltrans.resource.dsltranstext.IDsltranstextURIMapping.
 */
public class DsltranstextURIMapping<ReferenceType> implements dsltrans.resource.dsltranstext.IDsltranstextURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public DsltranstextURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
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
