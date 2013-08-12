/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public DsltranstextResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextResource(uri);
	}
	
}
