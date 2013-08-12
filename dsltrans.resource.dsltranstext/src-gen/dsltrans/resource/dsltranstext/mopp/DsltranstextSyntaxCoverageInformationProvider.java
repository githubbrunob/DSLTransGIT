/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			dsltrans.DsltransPackage.eINSTANCE.getTransformationModel(),
			dsltrans.DsltransPackage.eINSTANCE.getFilePort(),
			dsltrans.DsltransPackage.eINSTANCE.getMetaModelIdentifier(),
			dsltrans.DsltransPackage.eINSTANCE.getSequential(),
			dsltrans.DsltransPackage.eINSTANCE.getRule(),
			dsltrans.DsltransPackage.eINSTANCE.getMatchModel(),
			dsltrans.DsltransPackage.eINSTANCE.getApplyModel(),
			dsltrans.DsltransPackage.eINSTANCE.getAnyMatchClass(),
			dsltrans.DsltransPackage.eINSTANCE.getExistsMatchClass(),
			dsltrans.DsltransPackage.eINSTANCE.getNegativeMatchClass(),
			dsltrans.DsltransPackage.eINSTANCE.getApplyClass(),
			dsltrans.DsltransPackage.eINSTANCE.getPositiveMatchAssociation(),
			dsltrans.DsltransPackage.eINSTANCE.getNegativeMatchAssociation(),
			dsltrans.DsltransPackage.eINSTANCE.getPositiveIndirectAssociation(),
			dsltrans.DsltransPackage.eINSTANCE.getNegativeIndirectAssociation(),
			dsltrans.DsltransPackage.eINSTANCE.getApplyAssociation(),
			dsltrans.DsltransPackage.eINSTANCE.getMatchAttribute(),
			dsltrans.DsltransPackage.eINSTANCE.getApplyAttribute(),
			dsltrans.DsltransPackage.eINSTANCE.getPositiveBackwardRestriction(),
			dsltrans.DsltransPackage.eINSTANCE.getNegativeBackwardRestriction(),
			dsltrans.DsltransPackage.eINSTANCE.getImport(),
			dsltrans.DsltransPackage.eINSTANCE.getAtom(),
			dsltrans.DsltransPackage.eINSTANCE.getAttributeRef(),
			dsltrans.DsltransPackage.eINSTANCE.getClassRef(),
			dsltrans.DsltransPackage.eINSTANCE.getConcat(),
			dsltrans.DsltransPackage.eINSTANCE.getTypeOf(),
			dsltrans.DsltransPackage.eINSTANCE.getWildcard(),
			dsltrans.DsltransPackage.eINSTANCE.getisNull(),
			dsltrans.DsltransPackage.eINSTANCE.getSequencer(),
			dsltrans.DsltransPackage.eINSTANCE.getAttributeEquality(),
			dsltrans.DsltransPackage.eINSTANCE.getAttributeInequality(),
			dsltrans.DsltransPackage.eINSTANCE.getMatchMayBeSameRelation(),
			dsltrans.DsltransPackage.eINSTANCE.getApplyMayBeSameRelation(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			dsltrans.DsltransPackage.eINSTANCE.getTransformationModel(),
		};
	}
	
}
