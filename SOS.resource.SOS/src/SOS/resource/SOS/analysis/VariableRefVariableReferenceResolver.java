/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.analysis;

public class VariableRefVariableReferenceResolver implements SOS.resource.SOS.ISOSReferenceResolver<SOS.adtmm.VariableRef, SOS.adtmm.Variable> {
	
	private SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.VariableRef, SOS.adtmm.Variable> delegate = new SOS.resource.SOS.analysis.SOSDefaultResolverDelegate<SOS.adtmm.VariableRef, SOS.adtmm.Variable>();
	
	public void resolve(String identifier, SOS.adtmm.VariableRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final SOS.resource.SOS.ISOSReferenceResolveResult<SOS.adtmm.Variable> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(SOS.adtmm.Variable element, SOS.adtmm.VariableRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
