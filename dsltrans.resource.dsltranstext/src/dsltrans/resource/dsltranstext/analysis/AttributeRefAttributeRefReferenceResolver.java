/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.analysis;

public class AttributeRefAttributeRefReferenceResolver implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<dsltrans.AttributeRef, dsltrans.Attribute> {
	
	private dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.AttributeRef, dsltrans.Attribute> delegate = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultResolverDelegate<dsltrans.AttributeRef, dsltrans.Attribute>();
	
	public void resolve(String identifier, dsltrans.AttributeRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<dsltrans.Attribute> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(dsltrans.Attribute element, dsltrans.AttributeRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
