/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SOSResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new SOS.resource.SOS.mopp.SOSResource(uri);
	}
	
}
