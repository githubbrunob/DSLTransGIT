/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			SOS.SOSPackage.eINSTANCE.getSemantics(),
			SOS.SOSPackage.eINSTANCE.getRule(),
			SOS.SOSPackage.eINSTANCE.getPremisseList(),
			SOS.SOSPackage.eINSTANCE.getAlgebraicConditionList(),
			SOS.SOSPackage.eINSTANCE.getConclusion(),
			SOS.SOSPackage.eINSTANCE.getTransition(),
			SOS.SOSPackage.eINSTANCE.getTypeJudment(),
			SOS.SOSPackage.eINSTANCE.getAlgebraicCondition(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getADT(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getOperation(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getVariable(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getCondEquation(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getVariableRef(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getEquation(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getInequation(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getAtomicSort(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getSortDeclaration(),
			SOS.set.SetPackage.eINSTANCE.getSet(),
			SOS.set.SetPackage.eINSTANCE.getModelSet(),
			SOS.set.SetPackage.eINSTANCE.getSetConstructor(),
			SOS.set.SetPackage.eINSTANCE.getForAllIn(),
			SOS.set.SetPackage.eINSTANCE.getExistsIn(),
			SOS.set.SetPackage.eINSTANCE.getUnion(),
			SOS.set.SetPackage.eINSTANCE.getExcluding(),
			SOS.set.SetPackage.eINSTANCE.getIntersection(),
			SOS.set.SetPackage.eINSTANCE.getModelRelation(),
			SOS.set.SetPackage.eINSTANCE.getModelClassAttribute(),
			SOS.set.SetPackage.eINSTANCE.getModelSort(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			SOS.SOSPackage.eINSTANCE.getSemantics(),
			SOS.adtmm.AdtmmPackage.eINSTANCE.getADT(),
		};
	}
	
}
