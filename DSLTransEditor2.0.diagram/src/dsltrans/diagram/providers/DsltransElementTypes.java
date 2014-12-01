/*
 * 
 */
package dsltrans.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import dsltrans.DsltransPackage;
import dsltrans.diagram.edit.parts.AnyMatchClassEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeEditPart;
import dsltrans.diagram.edit.parts.ApplyClassEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.ApplyModelEditPart;
import dsltrans.diagram.edit.parts.Atom2EditPart;
import dsltrans.diagram.edit.parts.Atom3EditPart;
import dsltrans.diagram.edit.parts.Atom4EditPart;
import dsltrans.diagram.edit.parts.AtomEditPart;
import dsltrans.diagram.edit.parts.AttributeEqualityEditPart;
import dsltrans.diagram.edit.parts.AttributeInequalityEditPart;
import dsltrans.diagram.edit.parts.AttributeRef2EditPart;
import dsltrans.diagram.edit.parts.AttributeRef3EditPart;
import dsltrans.diagram.edit.parts.AttributeRefAttributeRefEditPart;
import dsltrans.diagram.edit.parts.AttributeRefEditPart;
import dsltrans.diagram.edit.parts.ClassRef2EditPart;
import dsltrans.diagram.edit.parts.ClassRef3EditPart;
import dsltrans.diagram.edit.parts.ClassRefClassRefEditPart;
import dsltrans.diagram.edit.parts.ClassRefEditPart;
import dsltrans.diagram.edit.parts.Concat2EditPart;
import dsltrans.diagram.edit.parts.Concat3EditPart;
import dsltrans.diagram.edit.parts.ConcatEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassEditPart;
import dsltrans.diagram.edit.parts.FilePortEditPart;
import dsltrans.diagram.edit.parts.ImportEditPart;
import dsltrans.diagram.edit.parts.IsNullEditPart;
import dsltrans.diagram.edit.parts.LayerPreviousSourceEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.MatchModelEditPart;
import dsltrans.diagram.edit.parts.MatchModelExplicitSourceEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierEditPart;
import dsltrans.diagram.edit.parts.NegativeBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassEditPart;
import dsltrans.diagram.edit.parts.PositiveBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.PositiveIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.RuleEditPart;
import dsltrans.diagram.edit.parts.Sequencer2EditPart;
import dsltrans.diagram.edit.parts.Sequencer3EditPart;
import dsltrans.diagram.edit.parts.SequencerEditPart;
import dsltrans.diagram.edit.parts.SequentialEditPart;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.edit.parts.TypeOf2EditPart;
import dsltrans.diagram.edit.parts.TypeOf3EditPart;
import dsltrans.diagram.edit.parts.TypeOfEditPart;
import dsltrans.diagram.edit.parts.Wildcard2EditPart;
import dsltrans.diagram.edit.parts.Wildcard3EditPart;
import dsltrans.diagram.edit.parts.WildcardEditPart;
import dsltrans.diagram.part.DsltransDiagramEditorPlugin;

/**
 * @generated
 */
public class DsltransElementTypes {

	/**
	 * @generated
	 */
	private DsltransElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DsltransDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TransformationModel_1000 = getElementType("DSLTransEditor2.0.diagram.TransformationModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequential_2001 = getElementType("DSLTransEditor2.0.diagram.Sequential_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FilePort_2002 = getElementType("DSLTransEditor2.0.diagram.FilePort_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MetaModelIdentifier_3001 = getElementType("DSLTransEditor2.0.diagram.MetaModelIdentifier_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rule_3002 = getElementType("DSLTransEditor2.0.diagram.Rule_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchModel_3003 = getElementType("DSLTransEditor2.0.diagram.MatchModel_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyMatchClass_3004 = getElementType("DSLTransEditor2.0.diagram.AnyMatchClass_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchAttribute_3005 = getElementType("DSLTransEditor2.0.diagram.MatchAttribute_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atom_3006 = getElementType("DSLTransEditor2.0.diagram.Atom_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsNull_3007 = getElementType("DSLTransEditor2.0.diagram.IsNull_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExistsMatchClass_3008 = getElementType("DSLTransEditor2.0.diagram.ExistsMatchClass_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NegativeMatchClass_3009 = getElementType("DSLTransEditor2.0.diagram.NegativeMatchClass_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplyModel_3010 = getElementType("DSLTransEditor2.0.diagram.ApplyModel_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplyClass_3011 = getElementType("DSLTransEditor2.0.diagram.ApplyClass_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplyAttribute_3012 = getElementType("DSLTransEditor2.0.diagram.ApplyAttribute_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeOf_3013 = getElementType("DSLTransEditor2.0.diagram.TypeOf_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atom_3014 = getElementType("DSLTransEditor2.0.diagram.Atom_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeRef_3015 = getElementType("DSLTransEditor2.0.diagram.AttributeRef_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassRef_3016 = getElementType("DSLTransEditor2.0.diagram.ClassRef_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Concat_3017 = getElementType("DSLTransEditor2.0.diagram.Concat_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeOf_3018 = getElementType("DSLTransEditor2.0.diagram.TypeOf_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeOf_3019 = getElementType("DSLTransEditor2.0.diagram.TypeOf_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atom_3020 = getElementType("DSLTransEditor2.0.diagram.Atom_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeRef_3021 = getElementType("DSLTransEditor2.0.diagram.AttributeRef_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassRef_3022 = getElementType("DSLTransEditor2.0.diagram.ClassRef_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Concat_3023 = getElementType("DSLTransEditor2.0.diagram.Concat_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atom_3024 = getElementType("DSLTransEditor2.0.diagram.Atom_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeRef_3025 = getElementType("DSLTransEditor2.0.diagram.AttributeRef_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassRef_3026 = getElementType("DSLTransEditor2.0.diagram.ClassRef_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Concat_3027 = getElementType("DSLTransEditor2.0.diagram.Concat_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wildcard_3028 = getElementType("DSLTransEditor2.0.diagram.Wildcard_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequencer_3029 = getElementType("DSLTransEditor2.0.diagram.Sequencer_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wildcard_3030 = getElementType("DSLTransEditor2.0.diagram.Wildcard_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequencer_3031 = getElementType("DSLTransEditor2.0.diagram.Sequencer_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Wildcard_3032 = getElementType("DSLTransEditor2.0.diagram.Wildcard_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequencer_3033 = getElementType("DSLTransEditor2.0.diagram.Sequencer_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PositiveIndirectAssociation_4001 = getElementType("DSLTransEditor2.0.diagram.PositiveIndirectAssociation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NegativeIndirectAssociation_4002 = getElementType("DSLTransEditor2.0.diagram.NegativeIndirectAssociation_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PositiveMatchAssociation_4003 = getElementType("DSLTransEditor2.0.diagram.PositiveMatchAssociation_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NegativeMatchAssociation_4004 = getElementType("DSLTransEditor2.0.diagram.NegativeMatchAssociation_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchMayBeSameRelation_4017 = getElementType("DSLTransEditor2.0.diagram.MatchMayBeSameRelation_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplyMayBeSameRelation_4018 = getElementType("DSLTransEditor2.0.diagram.ApplyMayBeSameRelation_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplyAssociation_4005 = getElementType("DSLTransEditor2.0.diagram.ApplyAssociation_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PositiveBackwardRestriction_4006 = getElementType("DSLTransEditor2.0.diagram.PositiveBackwardRestriction_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NegativeBackwardRestriction_4007 = getElementType("DSLTransEditor2.0.diagram.NegativeBackwardRestriction_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeEquality_4015 = getElementType("DSLTransEditor2.0.diagram.AttributeEquality_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeInequality_4016 = getElementType("DSLTransEditor2.0.diagram.AttributeInequality_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Import_4010 = getElementType("DSLTransEditor2.0.diagram.Import_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayerPreviousSource_4011 = getElementType("DSLTransEditor2.0.diagram.LayerPreviousSource_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MatchModelExplicitSource_4012 = getElementType("DSLTransEditor2.0.diagram.MatchModelExplicitSource_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeRefAttributeRef_4013 = getElementType("DSLTransEditor2.0.diagram.AttributeRefAttributeRef_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassRefClassRef_4014 = getElementType("DSLTransEditor2.0.diagram.ClassRefClassRef_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(TransformationModel_1000,
					DsltransPackage.eINSTANCE.getTransformationModel());

			elements.put(Sequential_2001,
					DsltransPackage.eINSTANCE.getSequential());

			elements.put(FilePort_2002, DsltransPackage.eINSTANCE.getFilePort());

			elements.put(MetaModelIdentifier_3001,
					DsltransPackage.eINSTANCE.getMetaModelIdentifier());

			elements.put(Rule_3002, DsltransPackage.eINSTANCE.getRule());

			elements.put(MatchModel_3003,
					DsltransPackage.eINSTANCE.getMatchModel());

			elements.put(AnyMatchClass_3004,
					DsltransPackage.eINSTANCE.getAnyMatchClass());

			elements.put(MatchAttribute_3005,
					DsltransPackage.eINSTANCE.getMatchAttribute());

			elements.put(Atom_3006, DsltransPackage.eINSTANCE.getAtom());

			elements.put(IsNull_3007, DsltransPackage.eINSTANCE.getisNull());

			elements.put(ExistsMatchClass_3008,
					DsltransPackage.eINSTANCE.getExistsMatchClass());

			elements.put(NegativeMatchClass_3009,
					DsltransPackage.eINSTANCE.getNegativeMatchClass());

			elements.put(ApplyModel_3010,
					DsltransPackage.eINSTANCE.getApplyModel());

			elements.put(ApplyClass_3011,
					DsltransPackage.eINSTANCE.getApplyClass());

			elements.put(ApplyAttribute_3012,
					DsltransPackage.eINSTANCE.getApplyAttribute());

			elements.put(TypeOf_3013, DsltransPackage.eINSTANCE.getTypeOf());

			elements.put(Atom_3014, DsltransPackage.eINSTANCE.getAtom());

			elements.put(AttributeRef_3015,
					DsltransPackage.eINSTANCE.getAttributeRef());

			elements.put(ClassRef_3016, DsltransPackage.eINSTANCE.getClassRef());

			elements.put(Concat_3017, DsltransPackage.eINSTANCE.getConcat());

			elements.put(TypeOf_3018, DsltransPackage.eINSTANCE.getTypeOf());

			elements.put(TypeOf_3019, DsltransPackage.eINSTANCE.getTypeOf());

			elements.put(Atom_3020, DsltransPackage.eINSTANCE.getAtom());

			elements.put(AttributeRef_3021,
					DsltransPackage.eINSTANCE.getAttributeRef());

			elements.put(ClassRef_3022, DsltransPackage.eINSTANCE.getClassRef());

			elements.put(Concat_3023, DsltransPackage.eINSTANCE.getConcat());

			elements.put(Atom_3024, DsltransPackage.eINSTANCE.getAtom());

			elements.put(AttributeRef_3025,
					DsltransPackage.eINSTANCE.getAttributeRef());

			elements.put(ClassRef_3026, DsltransPackage.eINSTANCE.getClassRef());

			elements.put(Concat_3027, DsltransPackage.eINSTANCE.getConcat());

			elements.put(Wildcard_3028, DsltransPackage.eINSTANCE.getWildcard());

			elements.put(Sequencer_3029,
					DsltransPackage.eINSTANCE.getSequencer());

			elements.put(Wildcard_3030, DsltransPackage.eINSTANCE.getWildcard());

			elements.put(Sequencer_3031,
					DsltransPackage.eINSTANCE.getSequencer());

			elements.put(Wildcard_3032, DsltransPackage.eINSTANCE.getWildcard());

			elements.put(Sequencer_3033,
					DsltransPackage.eINSTANCE.getSequencer());

			elements.put(PositiveIndirectAssociation_4001,
					DsltransPackage.eINSTANCE.getPositiveIndirectAssociation());

			elements.put(NegativeIndirectAssociation_4002,
					DsltransPackage.eINSTANCE.getNegativeIndirectAssociation());

			elements.put(PositiveMatchAssociation_4003,
					DsltransPackage.eINSTANCE.getPositiveMatchAssociation());

			elements.put(NegativeMatchAssociation_4004,
					DsltransPackage.eINSTANCE.getNegativeMatchAssociation());

			elements.put(MatchMayBeSameRelation_4017,
					DsltransPackage.eINSTANCE.getMatchMayBeSameRelation());

			elements.put(ApplyMayBeSameRelation_4018,
					DsltransPackage.eINSTANCE.getApplyMayBeSameRelation());

			elements.put(ApplyAssociation_4005,
					DsltransPackage.eINSTANCE.getApplyAssociation());

			elements.put(PositiveBackwardRestriction_4006,
					DsltransPackage.eINSTANCE.getPositiveBackwardRestriction());

			elements.put(NegativeBackwardRestriction_4007,
					DsltransPackage.eINSTANCE.getNegativeBackwardRestriction());

			elements.put(AttributeEquality_4015,
					DsltransPackage.eINSTANCE.getAttributeEquality());

			elements.put(AttributeInequality_4016,
					DsltransPackage.eINSTANCE.getAttributeInequality());

			elements.put(Import_4010, DsltransPackage.eINSTANCE.getImport());

			elements.put(LayerPreviousSource_4011,
					DsltransPackage.eINSTANCE.getLayer_PreviousSource());

			elements.put(MatchModelExplicitSource_4012,
					DsltransPackage.eINSTANCE.getMatchModel_ExplicitSource());

			elements.put(AttributeRefAttributeRef_4013,
					DsltransPackage.eINSTANCE.getAttributeRef_AttributeRef());

			elements.put(ClassRefClassRef_4014,
					DsltransPackage.eINSTANCE.getClassRef_ClassRef());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(TransformationModel_1000);
			KNOWN_ELEMENT_TYPES.add(Sequential_2001);
			KNOWN_ELEMENT_TYPES.add(FilePort_2002);
			KNOWN_ELEMENT_TYPES.add(MetaModelIdentifier_3001);
			KNOWN_ELEMENT_TYPES.add(Rule_3002);
			KNOWN_ELEMENT_TYPES.add(MatchModel_3003);
			KNOWN_ELEMENT_TYPES.add(AnyMatchClass_3004);
			KNOWN_ELEMENT_TYPES.add(MatchAttribute_3005);
			KNOWN_ELEMENT_TYPES.add(Atom_3006);
			KNOWN_ELEMENT_TYPES.add(IsNull_3007);
			KNOWN_ELEMENT_TYPES.add(ExistsMatchClass_3008);
			KNOWN_ELEMENT_TYPES.add(NegativeMatchClass_3009);
			KNOWN_ELEMENT_TYPES.add(ApplyModel_3010);
			KNOWN_ELEMENT_TYPES.add(ApplyClass_3011);
			KNOWN_ELEMENT_TYPES.add(ApplyAttribute_3012);
			KNOWN_ELEMENT_TYPES.add(TypeOf_3013);
			KNOWN_ELEMENT_TYPES.add(Atom_3014);
			KNOWN_ELEMENT_TYPES.add(AttributeRef_3015);
			KNOWN_ELEMENT_TYPES.add(ClassRef_3016);
			KNOWN_ELEMENT_TYPES.add(Concat_3017);
			KNOWN_ELEMENT_TYPES.add(TypeOf_3018);
			KNOWN_ELEMENT_TYPES.add(TypeOf_3019);
			KNOWN_ELEMENT_TYPES.add(Atom_3020);
			KNOWN_ELEMENT_TYPES.add(AttributeRef_3021);
			KNOWN_ELEMENT_TYPES.add(ClassRef_3022);
			KNOWN_ELEMENT_TYPES.add(Concat_3023);
			KNOWN_ELEMENT_TYPES.add(Atom_3024);
			KNOWN_ELEMENT_TYPES.add(AttributeRef_3025);
			KNOWN_ELEMENT_TYPES.add(ClassRef_3026);
			KNOWN_ELEMENT_TYPES.add(Concat_3027);
			KNOWN_ELEMENT_TYPES.add(Wildcard_3028);
			KNOWN_ELEMENT_TYPES.add(Sequencer_3029);
			KNOWN_ELEMENT_TYPES.add(Wildcard_3030);
			KNOWN_ELEMENT_TYPES.add(Sequencer_3031);
			KNOWN_ELEMENT_TYPES.add(Wildcard_3032);
			KNOWN_ELEMENT_TYPES.add(Sequencer_3033);
			KNOWN_ELEMENT_TYPES.add(PositiveIndirectAssociation_4001);
			KNOWN_ELEMENT_TYPES.add(NegativeIndirectAssociation_4002);
			KNOWN_ELEMENT_TYPES.add(PositiveMatchAssociation_4003);
			KNOWN_ELEMENT_TYPES.add(NegativeMatchAssociation_4004);
			KNOWN_ELEMENT_TYPES.add(MatchMayBeSameRelation_4017);
			KNOWN_ELEMENT_TYPES.add(ApplyMayBeSameRelation_4018);
			KNOWN_ELEMENT_TYPES.add(ApplyAssociation_4005);
			KNOWN_ELEMENT_TYPES.add(PositiveBackwardRestriction_4006);
			KNOWN_ELEMENT_TYPES.add(NegativeBackwardRestriction_4007);
			KNOWN_ELEMENT_TYPES.add(AttributeEquality_4015);
			KNOWN_ELEMENT_TYPES.add(AttributeInequality_4016);
			KNOWN_ELEMENT_TYPES.add(Import_4010);
			KNOWN_ELEMENT_TYPES.add(LayerPreviousSource_4011);
			KNOWN_ELEMENT_TYPES.add(MatchModelExplicitSource_4012);
			KNOWN_ELEMENT_TYPES.add(AttributeRefAttributeRef_4013);
			KNOWN_ELEMENT_TYPES.add(ClassRefClassRef_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TransformationModelEditPart.VISUAL_ID:
			return TransformationModel_1000;
		case SequentialEditPart.VISUAL_ID:
			return Sequential_2001;
		case FilePortEditPart.VISUAL_ID:
			return FilePort_2002;
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return MetaModelIdentifier_3001;
		case RuleEditPart.VISUAL_ID:
			return Rule_3002;
		case MatchModelEditPart.VISUAL_ID:
			return MatchModel_3003;
		case AnyMatchClassEditPart.VISUAL_ID:
			return AnyMatchClass_3004;
		case MatchAttributeEditPart.VISUAL_ID:
			return MatchAttribute_3005;
		case AtomEditPart.VISUAL_ID:
			return Atom_3006;
		case IsNullEditPart.VISUAL_ID:
			return IsNull_3007;
		case ExistsMatchClassEditPart.VISUAL_ID:
			return ExistsMatchClass_3008;
		case NegativeMatchClassEditPart.VISUAL_ID:
			return NegativeMatchClass_3009;
		case ApplyModelEditPart.VISUAL_ID:
			return ApplyModel_3010;
		case ApplyClassEditPart.VISUAL_ID:
			return ApplyClass_3011;
		case ApplyAttributeEditPart.VISUAL_ID:
			return ApplyAttribute_3012;
		case TypeOfEditPart.VISUAL_ID:
			return TypeOf_3013;
		case Atom2EditPart.VISUAL_ID:
			return Atom_3014;
		case AttributeRefEditPart.VISUAL_ID:
			return AttributeRef_3015;
		case ClassRefEditPart.VISUAL_ID:
			return ClassRef_3016;
		case ConcatEditPart.VISUAL_ID:
			return Concat_3017;
		case TypeOf2EditPart.VISUAL_ID:
			return TypeOf_3018;
		case TypeOf3EditPart.VISUAL_ID:
			return TypeOf_3019;
		case Atom3EditPart.VISUAL_ID:
			return Atom_3020;
		case AttributeRef2EditPart.VISUAL_ID:
			return AttributeRef_3021;
		case ClassRef2EditPart.VISUAL_ID:
			return ClassRef_3022;
		case Concat2EditPart.VISUAL_ID:
			return Concat_3023;
		case Atom4EditPart.VISUAL_ID:
			return Atom_3024;
		case AttributeRef3EditPart.VISUAL_ID:
			return AttributeRef_3025;
		case ClassRef3EditPart.VISUAL_ID:
			return ClassRef_3026;
		case Concat3EditPart.VISUAL_ID:
			return Concat_3027;
		case WildcardEditPart.VISUAL_ID:
			return Wildcard_3028;
		case SequencerEditPart.VISUAL_ID:
			return Sequencer_3029;
		case Wildcard2EditPart.VISUAL_ID:
			return Wildcard_3030;
		case Sequencer2EditPart.VISUAL_ID:
			return Sequencer_3031;
		case Wildcard3EditPart.VISUAL_ID:
			return Wildcard_3032;
		case Sequencer3EditPart.VISUAL_ID:
			return Sequencer_3033;
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return PositiveIndirectAssociation_4001;
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return NegativeIndirectAssociation_4002;
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return PositiveMatchAssociation_4003;
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return NegativeMatchAssociation_4004;
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return MatchMayBeSameRelation_4017;
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return ApplyMayBeSameRelation_4018;
		case ApplyAssociationEditPart.VISUAL_ID:
			return ApplyAssociation_4005;
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return PositiveBackwardRestriction_4006;
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return NegativeBackwardRestriction_4007;
		case AttributeEqualityEditPart.VISUAL_ID:
			return AttributeEquality_4015;
		case AttributeInequalityEditPart.VISUAL_ID:
			return AttributeInequality_4016;
		case ImportEditPart.VISUAL_ID:
			return Import_4010;
		case LayerPreviousSourceEditPart.VISUAL_ID:
			return LayerPreviousSource_4011;
		case MatchModelExplicitSourceEditPart.VISUAL_ID:
			return MatchModelExplicitSource_4012;
		case AttributeRefAttributeRefEditPart.VISUAL_ID:
			return AttributeRefAttributeRef_4013;
		case ClassRefClassRefEditPart.VISUAL_ID:
			return ClassRefClassRef_4014;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return dsltrans.diagram.providers.DsltransElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return dsltrans.diagram.providers.DsltransElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return dsltrans.diagram.providers.DsltransElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
