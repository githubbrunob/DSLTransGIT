/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			mprolog.MprologPackage.eINSTANCE.getModel(),
			mprolog.MprologPackage.eINSTANCE.getClause(),
			mprolog.MprologPackage.eINSTANCE.getHead(),
			mprolog.MprologPackage.eINSTANCE.getBody(),
			mprolog.MprologPackage.eINSTANCE.getVariable(),
			mprolog.MprologPackage.eINSTANCE.getParenthesis(),
			mprolog.MprologPackage.eINSTANCE.getFunctor(),
			mprolog.MprologPackage.eINSTANCE.getQuotedAtom(),
			mprolog.MprologPackage.eINSTANCE.getList(),
			mprolog.MprologPackage.eINSTANCE.getInfixExpression(),
			mprolog.MprologPackage.eINSTANCE.getOperator(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			mprolog.MprologPackage.eINSTANCE.getModel(),
		};
	}
	
}
