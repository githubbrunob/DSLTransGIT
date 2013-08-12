/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

public interface IPlBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(mprolog.resource.pl.mopp.PlResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
