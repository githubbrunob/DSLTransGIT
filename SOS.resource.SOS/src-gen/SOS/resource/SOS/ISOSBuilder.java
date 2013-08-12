/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

public interface ISOSBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(SOS.resource.SOS.mopp.SOSResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
