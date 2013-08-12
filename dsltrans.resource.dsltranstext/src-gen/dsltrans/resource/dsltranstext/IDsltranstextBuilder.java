/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext;

public interface IDsltranstextBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(dsltrans.resource.dsltranstext.mopp.DsltranstextResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
