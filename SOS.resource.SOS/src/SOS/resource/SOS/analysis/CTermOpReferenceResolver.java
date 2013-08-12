/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.analysis;

public class CTermOpReferenceResolver implements SOS.resource.SOS.ISOSReferenceResolver<SOS.adtmm.CTerm, SOS.adtmm.Operation> {
	
	private SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.CTerm, SOS.adtmm.Operation> delegate = new SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.CTerm, SOS.adtmm.Operation>();
	
	public void resolve(String identifier, SOS.adtmm.CTerm container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final SOS.resource.SOS.ISOSReferenceResolveResult<SOS.adtmm.Operation> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(SOS.adtmm.Operation element, SOS.adtmm.CTerm container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
