/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.analysis;

public class AtomicSortDeclarationReferenceResolver implements SOS.resource.SOS.ISOSReferenceResolver<SOS.adtmm.AtomicSort, SOS.adtmm.SortDeclaration> {
	
	private SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.AtomicSort, SOS.adtmm.SortDeclaration> delegate = new SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.AtomicSort, SOS.adtmm.SortDeclaration>();
	
	public void resolve(String identifier, SOS.adtmm.AtomicSort container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final SOS.resource.SOS.ISOSReferenceResolveResult<SOS.adtmm.SortDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(SOS.adtmm.SortDeclaration element, SOS.adtmm.AtomicSort container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
