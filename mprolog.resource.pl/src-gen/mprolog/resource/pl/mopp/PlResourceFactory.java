/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public PlResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new mprolog.resource.pl.mopp.PlResource(uri);
	}
	
}
