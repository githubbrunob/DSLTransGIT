/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.analysis;

public class ClassRefClassRefReferenceResolver implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<dsltrans.ClassRef, dsltrans.AbstractClass> {
	
	private dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.ClassRef, dsltrans.AbstractClass> delegate = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.ClassRef, dsltrans.AbstractClass>();
	
	public void resolve(String identifier, dsltrans.ClassRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<dsltrans.AbstractClass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(dsltrans.AbstractClass element, dsltrans.ClassRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
