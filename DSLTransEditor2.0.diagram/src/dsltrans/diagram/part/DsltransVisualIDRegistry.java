/*
 * 
 */
package dsltrans.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import dsltrans.DsltransPackage;
import dsltrans.TransformationModel;
import dsltrans.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DsltransVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "DSLTransEditor2.0.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TransformationModelEditPart.MODEL_ID.equals(view.getType())) {
				return TransformationModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dsltrans.diagram.part.DsltransVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DsltransDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsltransPackage.eINSTANCE.getTransformationModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TransformationModel) domainElement)) {
			return TransformationModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dsltrans.diagram.part.DsltransVisualIDRegistry
				.getModelID(containerView);
		if (!TransformationModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"dsltrans".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TransformationModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsltrans.diagram.part.DsltransVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TransformationModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TransformationModelEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getSequential().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getFilePort().isSuperTypeOf(
					domainElement.eClass())) {
				return FilePortEditPart.VISUAL_ID;
			}
			break;
		case SequentialSequentialMetaModelIdCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMetaModelIdentifier()
					.isSuperTypeOf(domainElement.eClass())) {
				return MetaModelIdentifierEditPart.VISUAL_ID;
			}
			break;
		case SequentialSequentialHasRuleCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getRule().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleEditPart.VISUAL_ID;
			}
			break;
		case RuleRuleMatchCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMatchModel().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchModelEditPart.VISUAL_ID;
			}
			break;
		case RuleRuleApplyCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getApplyModel().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplyModelEditPart.VISUAL_ID;
			}
			break;
		case MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getAnyMatchClass().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyMatchClassEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getExistsMatchClass().isSuperTypeOf(
					domainElement.eClass())) {
				return ExistsMatchClassEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getNegativeMatchClass()
					.isSuperTypeOf(domainElement.eClass())) {
				return NegativeMatchClassEditPart.VISUAL_ID;
			}
			break;
		case AnyMatchClassAnyMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMatchAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchAttributeEditPart.VISUAL_ID;
			}
			break;
		case MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getisNull().isSuperTypeOf(
					domainElement.eClass())) {
				return IsNullEditPart.VISUAL_ID;
			}
			break;
		case ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMatchAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchAttributeEditPart.VISUAL_ID;
			}
			break;
		case NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMatchAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MatchAttributeEditPart.VISUAL_ID;
			}
			break;
		case ApplyModelApplyModelClassCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getApplyClass().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplyClassEditPart.VISUAL_ID;
			}
			break;
		case ApplyClassApplyClassAttributeCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getApplyAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplyAttributeEditPart.VISUAL_ID;
			}
			break;
		case ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOfEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRefEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRefEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return ConcatEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return Wildcard3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequencer3EditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return WildcardEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return SequencerEditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatRightTermCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom4EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return Wildcard2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequencer2EditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return WildcardEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return SequencerEditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatRightTermCompartment2EditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom4EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return Wildcard2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequencer2EditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return WildcardEditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return SequencerEditPart.VISUAL_ID;
			}
			break;
		case ConcatConcatRightTermCompartment3EditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getTypeOf().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeOf3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return Atom4EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getAttributeRef().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getClassRef().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassRef3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getConcat().isSuperTypeOf(
					domainElement.eClass())) {
				return Concat3EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getWildcard().isSuperTypeOf(
					domainElement.eClass())) {
				return Wildcard2EditPart.VISUAL_ID;
			}
			if (DsltransPackage.eINSTANCE.getSequencer().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequencer2EditPart.VISUAL_ID;
			}
			break;
		case FilePortFilePortMetaModelIdCompartmentEditPart.VISUAL_ID:
			if (DsltransPackage.eINSTANCE.getMetaModelIdentifier()
					.isSuperTypeOf(domainElement.eClass())) {
				return MetaModelIdentifierEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dsltrans.diagram.part.DsltransVisualIDRegistry
				.getModelID(containerView);
		if (!TransformationModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"dsltrans".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TransformationModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsltrans.diagram.part.DsltransVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TransformationModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TransformationModelEditPart.VISUAL_ID:
			if (SequentialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialEditPart.VISUAL_ID:
			if (SequentialDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialSequentialMetaModelIdCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialSequentialHasRuleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilePortEditPart.VISUAL_ID:
			if (FilePortFilePathURIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilePortFilePortMetaModelIdCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetaModelIdentifierEditPart.VISUAL_ID:
			if (MetaModelIdentifierMetaModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleEditPart.VISUAL_ID:
			if (RuleDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleRuleMatchCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleRuleApplyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchModelEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyMatchClassEditPart.VISUAL_ID:
			if (AnyMatchClassClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyMatchClassAnyMatchClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchAttributeEditPart.VISUAL_ID:
			if (MatchAttributeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomEditPart.VISUAL_ID:
			if (AtomValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IsNullEditPart.VISUAL_ID:
			if (IsNullValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExistsMatchClassEditPart.VISUAL_ID:
			if (ExistsMatchClassClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NegativeMatchClassEditPart.VISUAL_ID:
			if (NegativeMatchClassClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyModelEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplyModelApplyModelClassCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyClassEditPart.VISUAL_ID:
			if (ApplyClassClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplyClassApplyClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyAttributeEditPart.VISUAL_ID:
			if (ApplyAttributeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeOfEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Atom2EditPart.VISUAL_ID:
			if (AtomValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeRefEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassRefEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatRightTermCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeOf2EditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeOf3EditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Atom3EditPart.VISUAL_ID:
			if (AtomValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeRef2EditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassRef2EditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Concat2EditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatRightTermCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Atom4EditPart.VISUAL_ID:
			if (AtomValue4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeRef3EditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassRef3EditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Concat3EditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatConcatRightTermCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WildcardEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequencerEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wildcard2EditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequencer2EditPart.VISUAL_ID:
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wildcard3EditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequencer3EditPart.VISUAL_ID:
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialSequentialMetaModelIdCompartmentEditPart.VISUAL_ID:
			if (MetaModelIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialSequentialHasRuleCompartmentEditPart.VISUAL_ID:
			if (RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleMatchCompartmentEditPart.VISUAL_ID:
			if (MatchModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleApplyCompartmentEditPart.VISUAL_ID:
			if (ApplyModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID:
			if (AnyMatchClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExistsMatchClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NegativeMatchClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyMatchClassAnyMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (MatchAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			if (AtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IsNullEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (MatchAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			if (MatchAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyModelApplyModelClassCompartmentEditPart.VISUAL_ID:
			if (ApplyClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyClassApplyClassAttributeCompartmentEditPart.VISUAL_ID:
			if (ApplyAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			if (TypeOfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConcatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wildcard3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequencer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID:
			if (TypeOf2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WildcardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequencerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatRightTermCompartmentEditPart.VISUAL_ID:
			if (TypeOf3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wildcard2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequencer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID:
			if (TypeOf2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WildcardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequencerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatRightTermCompartment2EditPart.VISUAL_ID:
			if (TypeOf3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wildcard2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequencer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID:
			if (TypeOf2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WildcardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequencerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcatConcatRightTermCompartment3EditPart.VISUAL_ID:
			if (TypeOf3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Atom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassRef3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Concat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wildcard2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequencer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilePortFilePortMetaModelIdCompartmentEditPart.VISUAL_ID:
			if (MetaModelIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			if (NegativeIndirectAssociationAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			if (PositiveMatchAssociationAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			if (NegativeMatchAssociationAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplyAssociationEditPart.VISUAL_ID:
			if (ApplyAssociationAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerPreviousSourceEditPart.VISUAL_ID:
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MatchModelExplicitSourceEditPart.VISUAL_ID:
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeRefAttributeRefEditPart.VISUAL_ID:
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassRefClassRefEditPart.VISUAL_ID:
			if (WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsltransPackage.eINSTANCE.getPositiveIndirectAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return PositiveIndirectAssociationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getNegativeIndirectAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return NegativeIndirectAssociationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getPositiveMatchAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return PositiveMatchAssociationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getNegativeMatchAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return NegativeMatchAssociationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getMatchMayBeSameRelation()
				.isSuperTypeOf(domainElement.eClass())) {
			return MatchMayBeSameRelationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getApplyMayBeSameRelation()
				.isSuperTypeOf(domainElement.eClass())) {
			return ApplyMayBeSameRelationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getApplyAssociation().isSuperTypeOf(
				domainElement.eClass())) {
			return ApplyAssociationEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getPositiveBackwardRestriction()
				.isSuperTypeOf(domainElement.eClass())) {
			return PositiveBackwardRestrictionEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getNegativeBackwardRestriction()
				.isSuperTypeOf(domainElement.eClass())) {
			return NegativeBackwardRestrictionEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getAttributeEquality().isSuperTypeOf(
				domainElement.eClass())) {
			return AttributeEqualityEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getAttributeInequality().isSuperTypeOf(
				domainElement.eClass())) {
			return AttributeInequalityEditPart.VISUAL_ID;
		}
		if (DsltransPackage.eINSTANCE.getImport().isSuperTypeOf(
				domainElement.eClass())) {
			return ImportEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TransformationModel element) {
		return true;
	}

}
