/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.analysis;

public class SOSQUOTED_34_34TokenResolver implements SOS.resource.SOS.ISOSTokenResolver {
	
	private SOS.resource.SOS.analysis.SOSDefaultTokenResolver defaultTokenResolver = new SOS.resource.SOS.analysis.SOSDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "\"", "\"", null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, SOS.resource.SOS.ISOSTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "\"", "\"", null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
