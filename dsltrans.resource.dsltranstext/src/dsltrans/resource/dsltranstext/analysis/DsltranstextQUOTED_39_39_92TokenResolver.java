/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.analysis;

public class DsltranstextQUOTED_39_39_92TokenResolver implements dsltrans.resource.dsltranstext.IDsltranstextTokenResolver {
	
	private dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultTokenResolver defaultTokenResolver = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "'", "'", "\\");
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "'", "'", "\\");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}