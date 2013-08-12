/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSReferenceResolverSwitch implements SOS.resource.SOS.ISOSReferenceResolverSwitch {
	
	protected SOS.resource.SOS.analysis.VariableRefVariableReferenceResolver variableRefVariableReferenceResolver = new SOS.resource.SOS.analysis.VariableRefVariableReferenceResolver();
	protected SOS.resource.SOS.analysis.CTermOpReferenceResolver cTermOpReferenceResolver = new SOS.resource.SOS.analysis.CTermOpReferenceResolver();
	protected SOS.resource.SOS.analysis.AtomicSortDeclarationReferenceResolver atomicSortDeclarationReferenceResolver = new SOS.resource.SOS.analysis.AtomicSortDeclarationReferenceResolver();
	
	public SOS.resource.SOS.analysis.VariableRefVariableReferenceResolver getVariableRefVariableReferenceResolver() {
		return variableRefVariableReferenceResolver;
	}
	
	public SOS.resource.SOS.analysis.CTermOpReferenceResolver getCTermOpReferenceResolver() {
		return cTermOpReferenceResolver;
	}
	
	public SOS.resource.SOS.analysis.AtomicSortDeclarationReferenceResolver getAtomicSortDeclarationReferenceResolver() {
		return atomicSortDeclarationReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		variableRefVariableReferenceResolver.setOptions(options);
		cTermOpReferenceResolver.setOptions(options);
		atomicSortDeclarationReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, SOS.resource.SOS.ISOSReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (SOS.adtmm.AdtmmPackage.eINSTANCE.getVariableRef().isInstance(container)) {
			SOSFuzzyResolveResult<SOS.adtmm.Variable> frr = new SOSFuzzyResolveResult<SOS.adtmm.Variable>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("variable")) {
				variableRefVariableReferenceResolver.resolve(identifier, (SOS.adtmm.VariableRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm().isInstance(container)) {
			SOSFuzzyResolveResult<SOS.adtmm.Operation> frr = new SOSFuzzyResolveResult<SOS.adtmm.Operation>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("op")) {
				cTermOpReferenceResolver.resolve(identifier, (SOS.adtmm.CTerm) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (SOS.adtmm.AdtmmPackage.eINSTANCE.getAtomicSort().isInstance(container)) {
			SOSFuzzyResolveResult<SOS.adtmm.SortDeclaration> frr = new SOSFuzzyResolveResult<SOS.adtmm.SortDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("declaration")) {
				atomicSortDeclarationReferenceResolver.resolve(identifier, (SOS.adtmm.AtomicSort) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public SOS.resource.SOS.ISOSReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == SOS.adtmm.AdtmmPackage.eINSTANCE.getVariableRef_Variable()) {
			return variableRefVariableReferenceResolver;
		}
		if (reference == SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm_Op()) {
			return cTermOpReferenceResolver;
		}
		if (reference == SOS.adtmm.AdtmmPackage.eINSTANCE.getAtomicSort_Declaration()) {
			return atomicSortDeclarationReferenceResolver;
		}
		return null;
	}
	
}
