/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlReferenceResolverSwitch implements mprolog.resource.pl.IPlReferenceResolverSwitch {
	
	
	public void setOptions(java.util.Map<?, ?> options) {
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, mprolog.resource.pl.IPlReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public mprolog.resource.pl.IPlReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
}
