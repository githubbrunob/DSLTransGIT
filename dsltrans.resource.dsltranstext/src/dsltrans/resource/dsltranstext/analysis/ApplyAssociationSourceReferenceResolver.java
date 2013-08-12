/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.analysis;

public class ApplyAssociationSourceReferenceResolver implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<dsltrans.ApplyAssociation, dsltrans.ApplyClass> {
	
	private dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.ApplyAssociation, dsltrans.ApplyClass> delegate = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.ApplyAssociation, dsltrans.ApplyClass>();
	
	public void resolve(String identifier, dsltrans.ApplyAssociation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<dsltrans.ApplyClass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(dsltrans.ApplyClass element, dsltrans.ApplyAssociation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
