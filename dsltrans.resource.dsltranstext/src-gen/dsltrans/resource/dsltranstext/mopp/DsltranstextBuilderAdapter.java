/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextBuilderAdapter extends org.eclipse.core.resources.IncrementalProjectBuilder {
	
	/**
	 * the ID of the default, generated builder
	 */
	public final static String BUILDER_ID = "dsltrans.resource.dsltranstext.builder";
	
	private dsltrans.resource.dsltranstext.IDsltranstextBuilder builder = new dsltrans.resource.dsltranstext.mopp.DsltranstextBuilder();
	
	public org.eclipse.core.resources.IProject[] build(int kind, @SuppressWarnings("rawtypes") java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
		return build(kind, args, monitor, builder, getProject());
	}
	
	public org.eclipse.core.resources.IProject[] build(int kind, java.util.Map<?,?> args, final org.eclipse.core.runtime.IProgressMonitor monitor, final dsltrans.resource.dsltranstext.IDsltranstextBuilder builder, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
		org.eclipse.core.resources.IResourceDelta delta = getDelta(project);
		if (delta == null) {
			return null;
		}
		delta.accept(new org.eclipse.core.resources.IResourceDeltaVisitor() {
			public boolean visit(org.eclipse.core.resources.IResourceDelta delta) throws org.eclipse.core.runtime.CoreException {
				if (delta.getKind() == org.eclipse.core.resources.IResourceDelta.REMOVED) {
					return false;
				}
				org.eclipse.core.resources.IResource resource = delta.getResource();
				if (resource instanceof org.eclipse.core.resources.IFile && resource.getName().endsWith("." + "dsltranstext")) {
					org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
					if (builder.isBuildingNeeded(uri)) {
						dsltrans.resource.dsltranstext.mopp.DsltranstextResource customResource = (dsltrans.resource.dsltranstext.mopp.DsltranstextResource) new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().getResource(uri, true);
						dsltrans.resource.dsltranstext.mopp.DsltranstextMarkerHelper.unmark(customResource, dsltrans.resource.dsltranstext.DsltranstextEProblemType.BUILDER_ERROR);
						builder.build(customResource, monitor);
					}
					return false;
				}
				return true;
			}
		});
		return null;
	}
	
}
