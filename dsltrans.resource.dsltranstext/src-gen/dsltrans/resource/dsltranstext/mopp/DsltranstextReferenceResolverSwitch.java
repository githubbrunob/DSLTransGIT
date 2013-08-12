/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextReferenceResolverSwitch implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolverSwitch {
	
	protected dsltrans.resource.dsltranstext.analysis.LayerPreviousSourceReferenceResolver layerPreviousSourceReferenceResolver = new dsltrans.resource.dsltranstext.analysis.LayerPreviousSourceReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.MatchModelExplicitSourceReferenceResolver matchModelExplicitSourceReferenceResolver = new dsltrans.resource.dsltranstext.analysis.MatchModelExplicitSourceReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.MatchAssociationSourceReferenceResolver matchAssociationSourceReferenceResolver = new dsltrans.resource.dsltranstext.analysis.MatchAssociationSourceReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.MatchAssociationTargetReferenceResolver matchAssociationTargetReferenceResolver = new dsltrans.resource.dsltranstext.analysis.MatchAssociationTargetReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.ApplyAssociationSourceReferenceResolver applyAssociationSourceReferenceResolver = new dsltrans.resource.dsltranstext.analysis.ApplyAssociationSourceReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.ApplyAssociationTargetReferenceResolver applyAssociationTargetReferenceResolver = new dsltrans.resource.dsltranstext.analysis.ApplyAssociationTargetReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationTargetClassReferenceResolver abstractTemporalRelationTargetClassReferenceResolver = new dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationTargetClassReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationSourceClassReferenceResolver abstractTemporalRelationSourceClassReferenceResolver = new dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationSourceClassReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.ImportTargetReferenceResolver importTargetReferenceResolver = new dsltrans.resource.dsltranstext.analysis.ImportTargetReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.ImportSourceReferenceResolver importSourceReferenceResolver = new dsltrans.resource.dsltranstext.analysis.ImportSourceReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.AttributeRefAttributeRefReferenceResolver attributeRefAttributeRefReferenceResolver = new dsltrans.resource.dsltranstext.analysis.AttributeRefAttributeRefReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.ClassRefClassRefReferenceResolver classRefClassRefReferenceResolver = new dsltrans.resource.dsltranstext.analysis.ClassRefClassRefReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationSourceAttributeReferenceResolver abstractAttributeRelationSourceAttributeReferenceResolver = new dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationSourceAttributeReferenceResolver();
	protected dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationTargetAttributeReferenceResolver abstractAttributeRelationTargetAttributeReferenceResolver = new dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationTargetAttributeReferenceResolver();
	
	public dsltrans.resource.dsltranstext.analysis.LayerPreviousSourceReferenceResolver getLayerPreviousSourceReferenceResolver() {
		return layerPreviousSourceReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.MatchModelExplicitSourceReferenceResolver getMatchModelExplicitSourceReferenceResolver() {
		return matchModelExplicitSourceReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.MatchAssociationSourceReferenceResolver getMatchAssociationSourceReferenceResolver() {
		return matchAssociationSourceReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.MatchAssociationTargetReferenceResolver getMatchAssociationTargetReferenceResolver() {
		return matchAssociationTargetReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.ApplyAssociationSourceReferenceResolver getApplyAssociationSourceReferenceResolver() {
		return applyAssociationSourceReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.ApplyAssociationTargetReferenceResolver getApplyAssociationTargetReferenceResolver() {
		return applyAssociationTargetReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationTargetClassReferenceResolver getAbstractTemporalRelationTargetClassReferenceResolver() {
		return abstractTemporalRelationTargetClassReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.AbstractTemporalRelationSourceClassReferenceResolver getAbstractTemporalRelationSourceClassReferenceResolver() {
		return abstractTemporalRelationSourceClassReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.ImportTargetReferenceResolver getImportTargetReferenceResolver() {
		return importTargetReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.ImportSourceReferenceResolver getImportSourceReferenceResolver() {
		return importSourceReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.AttributeRefAttributeRefReferenceResolver getAttributeRefAttributeRefReferenceResolver() {
		return attributeRefAttributeRefReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.ClassRefClassRefReferenceResolver getClassRefClassRefReferenceResolver() {
		return classRefClassRefReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationSourceAttributeReferenceResolver getAbstractAttributeRelationSourceAttributeReferenceResolver() {
		return abstractAttributeRelationSourceAttributeReferenceResolver;
	}
	
	public dsltrans.resource.dsltranstext.analysis.AbstractAttributeRelationTargetAttributeReferenceResolver getAbstractAttributeRelationTargetAttributeReferenceResolver() {
		return abstractAttributeRelationTargetAttributeReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		layerPreviousSourceReferenceResolver.setOptions(options);
		matchModelExplicitSourceReferenceResolver.setOptions(options);
		matchAssociationSourceReferenceResolver.setOptions(options);
		matchAssociationTargetReferenceResolver.setOptions(options);
		applyAssociationSourceReferenceResolver.setOptions(options);
		applyAssociationTargetReferenceResolver.setOptions(options);
		abstractTemporalRelationTargetClassReferenceResolver.setOptions(options);
		abstractTemporalRelationSourceClassReferenceResolver.setOptions(options);
		importTargetReferenceResolver.setOptions(options);
		importSourceReferenceResolver.setOptions(options);
		attributeRefAttributeRefReferenceResolver.setOptions(options);
		classRefClassRefReferenceResolver.setOptions(options);
		abstractAttributeRelationSourceAttributeReferenceResolver.setOptions(options);
		abstractAttributeRelationTargetAttributeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getLayer().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.AbstractSource> frr = new DsltranstextFuzzyResolveResult<dsltrans.AbstractSource>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("previousSource")) {
				layerPreviousSourceReferenceResolver.resolve(identifier, (dsltrans.Layer) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getMatchModel().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.FilePort> frr = new DsltranstextFuzzyResolveResult<dsltrans.FilePort>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("explicitSource")) {
				matchModelExplicitSourceReferenceResolver.resolve(identifier, (dsltrans.MatchModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getMatchAssociation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.MatchClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.MatchClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				matchAssociationSourceReferenceResolver.resolve(identifier, (dsltrans.MatchAssociation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getMatchAssociation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.MatchClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.MatchClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				matchAssociationTargetReferenceResolver.resolve(identifier, (dsltrans.MatchAssociation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getApplyAssociation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.ApplyClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.ApplyClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				applyAssociationSourceReferenceResolver.resolve(identifier, (dsltrans.ApplyAssociation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getApplyAssociation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.ApplyClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.ApplyClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				applyAssociationTargetReferenceResolver.resolve(identifier, (dsltrans.ApplyAssociation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getAbstractTemporalRelation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.ApplyClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.ApplyClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("targetClass")) {
				abstractTemporalRelationTargetClassReferenceResolver.resolve(identifier, (dsltrans.AbstractTemporalRelation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getAbstractTemporalRelation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.PositiveMatchClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.PositiveMatchClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("sourceClass")) {
				abstractTemporalRelationSourceClassReferenceResolver.resolve(identifier, (dsltrans.AbstractTemporalRelation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getImport().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.ApplyClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.ApplyClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				importTargetReferenceResolver.resolve(identifier, (dsltrans.Import) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getImport().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.PositiveMatchClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.PositiveMatchClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				importSourceReferenceResolver.resolve(identifier, (dsltrans.Import) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getAttributeRef().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.Attribute> frr = new DsltranstextFuzzyResolveResult<dsltrans.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attributeRef")) {
				attributeRefAttributeRefReferenceResolver.resolve(identifier, (dsltrans.AttributeRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getClassRef().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.AbstractClass> frr = new DsltranstextFuzzyResolveResult<dsltrans.AbstractClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("classRef")) {
				classRefClassRefReferenceResolver.resolve(identifier, (dsltrans.ClassRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getAbstractAttributeRelation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.Attribute> frr = new DsltranstextFuzzyResolveResult<dsltrans.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("sourceAttribute")) {
				abstractAttributeRelationSourceAttributeReferenceResolver.resolve(identifier, (dsltrans.AbstractAttributeRelation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (dsltrans.DsltransPackage.eINSTANCE.getAbstractAttributeRelation().isInstance(container)) {
			DsltranstextFuzzyResolveResult<dsltrans.Attribute> frr = new DsltranstextFuzzyResolveResult<dsltrans.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("targetAttribute")) {
				abstractAttributeRelationTargetAttributeReferenceResolver.resolve(identifier, (dsltrans.AbstractAttributeRelation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getLayer_PreviousSource()) {
			return layerPreviousSourceReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getMatchModel_ExplicitSource()) {
			return matchModelExplicitSourceReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getMatchAssociation_Source()) {
			return matchAssociationSourceReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getMatchAssociation_Target()) {
			return matchAssociationTargetReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getApplyAssociation_Source()) {
			return applyAssociationSourceReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getApplyAssociation_Target()) {
			return applyAssociationTargetReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getAbstractTemporalRelation_TargetClass()) {
			return abstractTemporalRelationTargetClassReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getAbstractTemporalRelation_SourceClass()) {
			return abstractTemporalRelationSourceClassReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getImport_Target()) {
			return importTargetReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getImport_Source()) {
			return importSourceReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getAttributeRef_AttributeRef()) {
			return attributeRefAttributeRefReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getClassRef_ClassRef()) {
			return classRefClassRefReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getAbstractAttributeRelation_SourceAttribute()) {
			return abstractAttributeRelationSourceAttributeReferenceResolver;
		}
		if (reference == dsltrans.DsltransPackage.eINSTANCE.getAbstractAttributeRelation_TargetAttribute()) {
			return abstractAttributeRelationTargetAttributeReferenceResolver;
		}
		return null;
	}
	
}
