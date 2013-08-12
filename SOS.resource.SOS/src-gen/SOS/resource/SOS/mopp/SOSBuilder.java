/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSBuilder implements SOS.resource.SOS.ISOSBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		// change this to return true to enable building of all resources
		return false;
	}
	
	public org.eclipse.core.runtime.IStatus build(SOS.resource.SOS.mopp.SOSResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// set option overrideBuilder to 'false' and then perform build here
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
}
