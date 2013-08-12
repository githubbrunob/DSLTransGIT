/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.analysis;

public class MatchAssociationSourceReferenceResolver implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<dsltrans.MatchAssociation, dsltrans.MatchClass> {
	
	private dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.MatchAssociation, dsltrans.MatchClass> delegate = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.MatchAssociation, dsltrans.MatchClass>();
	
	public void resolve(String identifier, dsltrans.MatchAssociation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<dsltrans.MatchClass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(dsltrans.MatchClass element, dsltrans.MatchAssociation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
