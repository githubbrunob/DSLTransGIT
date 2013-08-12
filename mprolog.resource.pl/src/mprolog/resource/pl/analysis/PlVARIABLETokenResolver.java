/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.analysis;

public class PlVARIABLETokenResolver implements mprolog.resource.pl.IPlTokenResolver {
	
	private mprolog.resource.pl.analysis.PlDefaultTokenResolver defaultTokenResolver = new mprolog.resource.pl.analysis.PlDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, mprolog.resource.pl.IPlTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
