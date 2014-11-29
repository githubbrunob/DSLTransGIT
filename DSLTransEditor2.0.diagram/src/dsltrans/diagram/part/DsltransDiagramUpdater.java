/*
 * 
 */
package dsltrans.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import dsltrans.AbstractClass;
import dsltrans.AbstractSource;
import dsltrans.AnyMatchClass;
import dsltrans.ApplyAssociation;
import dsltrans.ApplyAttribute;
import dsltrans.ApplyClass;
import dsltrans.ApplyMayBeSameRelation;
import dsltrans.ApplyModel;
import dsltrans.Attribute;
import dsltrans.AttributeEquality;
import dsltrans.AttributeInequality;
import dsltrans.AttributeRef;
import dsltrans.ClassRef;
import dsltrans.Concat;
import dsltrans.DsltransPackage;
import dsltrans.ExistsMatchClass;
import dsltrans.FilePort;
import dsltrans.Import;
import dsltrans.Layer;
import dsltrans.MatchAttribute;
import dsltrans.MatchAttributeValue;
import dsltrans.MatchClass;
import dsltrans.MatchMayBeSameRelation;
import dsltrans.MatchModel;
import dsltrans.MetaModelIdentifier;
import dsltrans.NegativeBackwardRestriction;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.NegativeMatchAssociation;
import dsltrans.NegativeMatchClass;
import dsltrans.PositiveBackwardRestriction;
import dsltrans.PositiveIndirectAssociation;
import dsltrans.PositiveMatchAssociation;
import dsltrans.PositiveMatchClass;
import dsltrans.Rule;
import dsltrans.Sequential;
import dsltrans.Term;
import dsltrans.TransformationModel;
import dsltrans.TypeOf;
import dsltrans.diagram.edit.parts.AnyMatchClassAnyMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.AnyMatchClassEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeEditPart;
import dsltrans.diagram.edit.parts.ApplyClassApplyClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyClassEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.ApplyModelApplyModelClassCompartmentEditPart;
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
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ConcatEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.FilePortEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePortMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.ImportEditPart;
import dsltrans.diagram.edit.parts.IsNullEditPart;
import dsltrans.diagram.edit.parts.LayerPreviousSourceEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeMatchAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.MatchModelEditPart;
import dsltrans.diagram.edit.parts.MatchModelExplicitSourceEditPart;
import dsltrans.diagram.edit.parts.MatchModelMatchModelClassCompartmentEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierEditPart;
import dsltrans.diagram.edit.parts.NegativeBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.PositiveBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.PositiveIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.RuleEditPart;
import dsltrans.diagram.edit.parts.RuleRuleApplyCompartmentEditPart;
import dsltrans.diagram.edit.parts.RuleRuleMatchCompartmentEditPart;
import dsltrans.diagram.edit.parts.Sequencer2EditPart;
import dsltrans.diagram.edit.parts.Sequencer3EditPart;
import dsltrans.diagram.edit.parts.SequencerEditPart;
import dsltrans.diagram.edit.parts.SequentialEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialHasRuleCompartmentEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.edit.parts.TypeOf2EditPart;
import dsltrans.diagram.edit.parts.TypeOf3EditPart;
import dsltrans.diagram.edit.parts.TypeOfEditPart;
import dsltrans.diagram.edit.parts.Wildcard2EditPart;
import dsltrans.diagram.edit.parts.Wildcard3EditPart;
import dsltrans.diagram.edit.parts.WildcardEditPart;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class DsltransDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getSemanticChildren(View view) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case TransformationModelEditPart.VISUAL_ID:
			return getTransformationModel_1000SemanticChildren(view);
		case SequentialSequentialMetaModelIdCompartmentEditPart.VISUAL_ID:
			return getSequentialSequentialMetaModelIdCompartment_7001SemanticChildren(view);
		case SequentialSequentialHasRuleCompartmentEditPart.VISUAL_ID:
			return getSequentialSequentialHasRuleCompartment_7002SemanticChildren(view);
		case RuleRuleMatchCompartmentEditPart.VISUAL_ID:
			return getRuleRuleMatchCompartment_7003SemanticChildren(view);
		case RuleRuleApplyCompartmentEditPart.VISUAL_ID:
			return getRuleRuleApplyCompartment_7004SemanticChildren(view);
		case MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID:
			return getMatchModelMatchModelClassCompartment_7005SemanticChildren(view);
		case AnyMatchClassAnyMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			return getAnyMatchClassAnyMatchClassAttributeCompartment_7006SemanticChildren(view);
		case MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			return getMatchAttributeMatchAttributeAttributeValueCompartment_7007SemanticChildren(view);
		case ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			return getExistsMatchClassExistsMatchClassAttributeCompartment_7008SemanticChildren(view);
		case NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID:
			return getNegativeMatchClassNegativeMatchClassAttributeCompartment_7009SemanticChildren(view);
		case ApplyModelApplyModelClassCompartmentEditPart.VISUAL_ID:
			return getApplyModelApplyModelClassCompartment_7010SemanticChildren(view);
		case ApplyClassApplyClassAttributeCompartmentEditPart.VISUAL_ID:
			return getApplyClassApplyClassAttributeCompartment_7011SemanticChildren(view);
		case ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
			return getApplyAttributeApplyAttributeAttributeValueCompartment_7012SemanticChildren(view);
		case ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID:
			return getConcatConcatLeftTermCompartment_7013SemanticChildren(view);
		case ConcatConcatRightTermCompartmentEditPart.VISUAL_ID:
			return getConcatConcatRightTermCompartment_7014SemanticChildren(view);
		case ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID:
			return getConcatConcatLeftTermCompartment_7015SemanticChildren(view);
		case ConcatConcatRightTermCompartment2EditPart.VISUAL_ID:
			return getConcatConcatRightTermCompartment_7016SemanticChildren(view);
		case ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID:
			return getConcatConcatLeftTermCompartment_7017SemanticChildren(view);
		case ConcatConcatRightTermCompartment3EditPart.VISUAL_ID:
			return getConcatConcatRightTermCompartment_7018SemanticChildren(view);
		case FilePortFilePortMetaModelIdCompartmentEditPart.VISUAL_ID:
			return getFilePortFilePortMetaModelIdCompartment_7019SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getTransformationModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TransformationModel modelElement = (TransformationModel) view
				.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSource().iterator(); it.hasNext();) {
			AbstractSource childElement = (AbstractSource) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequentialEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilePortEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getSequentialSequentialMetaModelIdCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Sequential modelElement = (Sequential) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			MetaModelIdentifier childElement = modelElement.getMetaModelId();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MetaModelIdentifierEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getSequentialSequentialHasRuleCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Sequential modelElement = (Sequential) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasRule().iterator(); it
				.hasNext();) {
			Rule childElement = (Rule) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getRuleRuleMatchCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Rule modelElement = (Rule) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMatch().iterator(); it.hasNext();) {
			MatchModel childElement = (MatchModel) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MatchModelEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getRuleRuleApplyCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Rule modelElement = (Rule) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			ApplyModel childElement = modelElement.getApply();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplyModelEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getMatchModelMatchModelClassCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchModel modelElement = (MatchModel) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClass_().iterator(); it.hasNext();) {
			MatchClass childElement = (MatchClass) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnyMatchClassEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExistsMatchClassEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NegativeMatchClassEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getAnyMatchClassAnyMatchClassAttributeCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnyMatchClass modelElement = (AnyMatchClass) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			MatchAttribute childElement = (MatchAttribute) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MatchAttributeEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getMatchAttributeMatchAttributeAttributeValueCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MatchAttribute modelElement = (MatchAttribute) containerView
				.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			MatchAttributeValue childElement = modelElement.getAttributeValue();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == IsNullEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getExistsMatchClassExistsMatchClassAttributeCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ExistsMatchClass modelElement = (ExistsMatchClass) containerView
				.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			MatchAttribute childElement = (MatchAttribute) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MatchAttributeEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getNegativeMatchClassNegativeMatchClassAttributeCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NegativeMatchClass modelElement = (NegativeMatchClass) containerView
				.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			MatchAttribute childElement = (MatchAttribute) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MatchAttributeEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getApplyModelApplyModelClassCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplyModel modelElement = (ApplyModel) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClass_().iterator(); it.hasNext();) {
			ApplyClass childElement = (ApplyClass) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplyClassEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getApplyClassApplyClassAttributeCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplyClass modelElement = (ApplyClass) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			ApplyAttribute childElement = (ApplyAttribute) it.next();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplyAttributeEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getApplyAttributeApplyAttributeAttributeValueCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplyAttribute modelElement = (ApplyAttribute) containerView
				.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getAttributeValue();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOfEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRefEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRefEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConcatEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wildcard3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequencer3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatLeftTermCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getLeftTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == WildcardEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequencerEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatRightTermCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getRightTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom4EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wildcard2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequencer2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatLeftTermCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getLeftTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == WildcardEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequencerEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatRightTermCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getRightTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom4EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wildcard2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequencer2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatLeftTermCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getLeftTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == WildcardEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequencerEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getConcatConcatRightTermCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concat modelElement = (Concat) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			Term childElement = modelElement.getRightTerm();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeOf3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Atom4EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == AttributeRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == ClassRef3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Concat3EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Wildcard2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
			if (visualID == Sequencer2EditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransNodeDescriptor> getFilePortFilePortMetaModelIdCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FilePort modelElement = (FilePort) containerView.getElement();
		LinkedList<DsltransNodeDescriptor> result = new LinkedList<DsltransNodeDescriptor>();
		{
			MetaModelIdentifier childElement = modelElement.getMetaModelId();
			int visualID = DsltransVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MetaModelIdentifierEditPart.VISUAL_ID) {
				result.add(new DsltransNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getContainedLinks(View view) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case TransformationModelEditPart.VISUAL_ID:
			return getTransformationModel_1000ContainedLinks(view);
		case SequentialEditPart.VISUAL_ID:
			return getSequential_2001ContainedLinks(view);
		case FilePortEditPart.VISUAL_ID:
			return getFilePort_2002ContainedLinks(view);
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return getMetaModelIdentifier_3001ContainedLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_3002ContainedLinks(view);
		case MatchModelEditPart.VISUAL_ID:
			return getMatchModel_3003ContainedLinks(view);
		case AnyMatchClassEditPart.VISUAL_ID:
			return getAnyMatchClass_3004ContainedLinks(view);
		case MatchAttributeEditPart.VISUAL_ID:
			return getMatchAttribute_3005ContainedLinks(view);
		case AtomEditPart.VISUAL_ID:
			return getAtom_3006ContainedLinks(view);
		case IsNullEditPart.VISUAL_ID:
			return getIsNull_3007ContainedLinks(view);
		case ExistsMatchClassEditPart.VISUAL_ID:
			return getExistsMatchClass_3008ContainedLinks(view);
		case NegativeMatchClassEditPart.VISUAL_ID:
			return getNegativeMatchClass_3009ContainedLinks(view);
		case ApplyModelEditPart.VISUAL_ID:
			return getApplyModel_3010ContainedLinks(view);
		case ApplyClassEditPart.VISUAL_ID:
			return getApplyClass_3011ContainedLinks(view);
		case ApplyAttributeEditPart.VISUAL_ID:
			return getApplyAttribute_3012ContainedLinks(view);
		case TypeOfEditPart.VISUAL_ID:
			return getTypeOf_3013ContainedLinks(view);
		case Atom2EditPart.VISUAL_ID:
			return getAtom_3014ContainedLinks(view);
		case AttributeRefEditPart.VISUAL_ID:
			return getAttributeRef_3015ContainedLinks(view);
		case ClassRefEditPart.VISUAL_ID:
			return getClassRef_3016ContainedLinks(view);
		case ConcatEditPart.VISUAL_ID:
			return getConcat_3017ContainedLinks(view);
		case TypeOf2EditPart.VISUAL_ID:
			return getTypeOf_3018ContainedLinks(view);
		case TypeOf3EditPart.VISUAL_ID:
			return getTypeOf_3019ContainedLinks(view);
		case Atom3EditPart.VISUAL_ID:
			return getAtom_3020ContainedLinks(view);
		case AttributeRef2EditPart.VISUAL_ID:
			return getAttributeRef_3021ContainedLinks(view);
		case ClassRef2EditPart.VISUAL_ID:
			return getClassRef_3022ContainedLinks(view);
		case Concat2EditPart.VISUAL_ID:
			return getConcat_3023ContainedLinks(view);
		case Atom4EditPart.VISUAL_ID:
			return getAtom_3024ContainedLinks(view);
		case AttributeRef3EditPart.VISUAL_ID:
			return getAttributeRef_3025ContainedLinks(view);
		case ClassRef3EditPart.VISUAL_ID:
			return getClassRef_3026ContainedLinks(view);
		case Concat3EditPart.VISUAL_ID:
			return getConcat_3027ContainedLinks(view);
		case WildcardEditPart.VISUAL_ID:
			return getWildcard_3028ContainedLinks(view);
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_3029ContainedLinks(view);
		case Wildcard2EditPart.VISUAL_ID:
			return getWildcard_3030ContainedLinks(view);
		case Sequencer2EditPart.VISUAL_ID:
			return getSequencer_3031ContainedLinks(view);
		case Wildcard3EditPart.VISUAL_ID:
			return getWildcard_3032ContainedLinks(view);
		case Sequencer3EditPart.VISUAL_ID:
			return getSequencer_3033ContainedLinks(view);
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getPositiveIndirectAssociation_4001ContainedLinks(view);
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getNegativeIndirectAssociation_4002ContainedLinks(view);
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getPositiveMatchAssociation_4003ContainedLinks(view);
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getNegativeMatchAssociation_4004ContainedLinks(view);
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getMatchMayBeSameRelation_4017ContainedLinks(view);
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return getApplyMayBeSameRelation_4018ContainedLinks(view);
		case ApplyAssociationEditPart.VISUAL_ID:
			return getApplyAssociation_4005ContainedLinks(view);
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return getPositiveBackwardRestriction_4006ContainedLinks(view);
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return getNegativeBackwardRestriction_4007ContainedLinks(view);
		case AttributeEqualityEditPart.VISUAL_ID:
			return getAttributeEquality_4015ContainedLinks(view);
		case AttributeInequalityEditPart.VISUAL_ID:
			return getAttributeInequality_4016ContainedLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_4010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getIncomingLinks(View view) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case SequentialEditPart.VISUAL_ID:
			return getSequential_2001IncomingLinks(view);
		case FilePortEditPart.VISUAL_ID:
			return getFilePort_2002IncomingLinks(view);
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return getMetaModelIdentifier_3001IncomingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_3002IncomingLinks(view);
		case MatchModelEditPart.VISUAL_ID:
			return getMatchModel_3003IncomingLinks(view);
		case AnyMatchClassEditPart.VISUAL_ID:
			return getAnyMatchClass_3004IncomingLinks(view);
		case MatchAttributeEditPart.VISUAL_ID:
			return getMatchAttribute_3005IncomingLinks(view);
		case AtomEditPart.VISUAL_ID:
			return getAtom_3006IncomingLinks(view);
		case IsNullEditPart.VISUAL_ID:
			return getIsNull_3007IncomingLinks(view);
		case ExistsMatchClassEditPart.VISUAL_ID:
			return getExistsMatchClass_3008IncomingLinks(view);
		case NegativeMatchClassEditPart.VISUAL_ID:
			return getNegativeMatchClass_3009IncomingLinks(view);
		case ApplyModelEditPart.VISUAL_ID:
			return getApplyModel_3010IncomingLinks(view);
		case ApplyClassEditPart.VISUAL_ID:
			return getApplyClass_3011IncomingLinks(view);
		case ApplyAttributeEditPart.VISUAL_ID:
			return getApplyAttribute_3012IncomingLinks(view);
		case TypeOfEditPart.VISUAL_ID:
			return getTypeOf_3013IncomingLinks(view);
		case Atom2EditPart.VISUAL_ID:
			return getAtom_3014IncomingLinks(view);
		case AttributeRefEditPart.VISUAL_ID:
			return getAttributeRef_3015IncomingLinks(view);
		case ClassRefEditPart.VISUAL_ID:
			return getClassRef_3016IncomingLinks(view);
		case ConcatEditPart.VISUAL_ID:
			return getConcat_3017IncomingLinks(view);
		case TypeOf2EditPart.VISUAL_ID:
			return getTypeOf_3018IncomingLinks(view);
		case TypeOf3EditPart.VISUAL_ID:
			return getTypeOf_3019IncomingLinks(view);
		case Atom3EditPart.VISUAL_ID:
			return getAtom_3020IncomingLinks(view);
		case AttributeRef2EditPart.VISUAL_ID:
			return getAttributeRef_3021IncomingLinks(view);
		case ClassRef2EditPart.VISUAL_ID:
			return getClassRef_3022IncomingLinks(view);
		case Concat2EditPart.VISUAL_ID:
			return getConcat_3023IncomingLinks(view);
		case Atom4EditPart.VISUAL_ID:
			return getAtom_3024IncomingLinks(view);
		case AttributeRef3EditPart.VISUAL_ID:
			return getAttributeRef_3025IncomingLinks(view);
		case ClassRef3EditPart.VISUAL_ID:
			return getClassRef_3026IncomingLinks(view);
		case Concat3EditPart.VISUAL_ID:
			return getConcat_3027IncomingLinks(view);
		case WildcardEditPart.VISUAL_ID:
			return getWildcard_3028IncomingLinks(view);
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_3029IncomingLinks(view);
		case Wildcard2EditPart.VISUAL_ID:
			return getWildcard_3030IncomingLinks(view);
		case Sequencer2EditPart.VISUAL_ID:
			return getSequencer_3031IncomingLinks(view);
		case Wildcard3EditPart.VISUAL_ID:
			return getWildcard_3032IncomingLinks(view);
		case Sequencer3EditPart.VISUAL_ID:
			return getSequencer_3033IncomingLinks(view);
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getPositiveIndirectAssociation_4001IncomingLinks(view);
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getNegativeIndirectAssociation_4002IncomingLinks(view);
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getPositiveMatchAssociation_4003IncomingLinks(view);
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getNegativeMatchAssociation_4004IncomingLinks(view);
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getMatchMayBeSameRelation_4017IncomingLinks(view);
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return getApplyMayBeSameRelation_4018IncomingLinks(view);
		case ApplyAssociationEditPart.VISUAL_ID:
			return getApplyAssociation_4005IncomingLinks(view);
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return getPositiveBackwardRestriction_4006IncomingLinks(view);
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return getNegativeBackwardRestriction_4007IncomingLinks(view);
		case AttributeEqualityEditPart.VISUAL_ID:
			return getAttributeEquality_4015IncomingLinks(view);
		case AttributeInequalityEditPart.VISUAL_ID:
			return getAttributeInequality_4016IncomingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_4010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getOutgoingLinks(View view) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case SequentialEditPart.VISUAL_ID:
			return getSequential_2001OutgoingLinks(view);
		case FilePortEditPart.VISUAL_ID:
			return getFilePort_2002OutgoingLinks(view);
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return getMetaModelIdentifier_3001OutgoingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_3002OutgoingLinks(view);
		case MatchModelEditPart.VISUAL_ID:
			return getMatchModel_3003OutgoingLinks(view);
		case AnyMatchClassEditPart.VISUAL_ID:
			return getAnyMatchClass_3004OutgoingLinks(view);
		case MatchAttributeEditPart.VISUAL_ID:
			return getMatchAttribute_3005OutgoingLinks(view);
		case AtomEditPart.VISUAL_ID:
			return getAtom_3006OutgoingLinks(view);
		case IsNullEditPart.VISUAL_ID:
			return getIsNull_3007OutgoingLinks(view);
		case ExistsMatchClassEditPart.VISUAL_ID:
			return getExistsMatchClass_3008OutgoingLinks(view);
		case NegativeMatchClassEditPart.VISUAL_ID:
			return getNegativeMatchClass_3009OutgoingLinks(view);
		case ApplyModelEditPart.VISUAL_ID:
			return getApplyModel_3010OutgoingLinks(view);
		case ApplyClassEditPart.VISUAL_ID:
			return getApplyClass_3011OutgoingLinks(view);
		case ApplyAttributeEditPart.VISUAL_ID:
			return getApplyAttribute_3012OutgoingLinks(view);
		case TypeOfEditPart.VISUAL_ID:
			return getTypeOf_3013OutgoingLinks(view);
		case Atom2EditPart.VISUAL_ID:
			return getAtom_3014OutgoingLinks(view);
		case AttributeRefEditPart.VISUAL_ID:
			return getAttributeRef_3015OutgoingLinks(view);
		case ClassRefEditPart.VISUAL_ID:
			return getClassRef_3016OutgoingLinks(view);
		case ConcatEditPart.VISUAL_ID:
			return getConcat_3017OutgoingLinks(view);
		case TypeOf2EditPart.VISUAL_ID:
			return getTypeOf_3018OutgoingLinks(view);
		case TypeOf3EditPart.VISUAL_ID:
			return getTypeOf_3019OutgoingLinks(view);
		case Atom3EditPart.VISUAL_ID:
			return getAtom_3020OutgoingLinks(view);
		case AttributeRef2EditPart.VISUAL_ID:
			return getAttributeRef_3021OutgoingLinks(view);
		case ClassRef2EditPart.VISUAL_ID:
			return getClassRef_3022OutgoingLinks(view);
		case Concat2EditPart.VISUAL_ID:
			return getConcat_3023OutgoingLinks(view);
		case Atom4EditPart.VISUAL_ID:
			return getAtom_3024OutgoingLinks(view);
		case AttributeRef3EditPart.VISUAL_ID:
			return getAttributeRef_3025OutgoingLinks(view);
		case ClassRef3EditPart.VISUAL_ID:
			return getClassRef_3026OutgoingLinks(view);
		case Concat3EditPart.VISUAL_ID:
			return getConcat_3027OutgoingLinks(view);
		case WildcardEditPart.VISUAL_ID:
			return getWildcard_3028OutgoingLinks(view);
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_3029OutgoingLinks(view);
		case Wildcard2EditPart.VISUAL_ID:
			return getWildcard_3030OutgoingLinks(view);
		case Sequencer2EditPart.VISUAL_ID:
			return getSequencer_3031OutgoingLinks(view);
		case Wildcard3EditPart.VISUAL_ID:
			return getWildcard_3032OutgoingLinks(view);
		case Sequencer3EditPart.VISUAL_ID:
			return getSequencer_3033OutgoingLinks(view);
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getPositiveIndirectAssociation_4001OutgoingLinks(view);
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getNegativeIndirectAssociation_4002OutgoingLinks(view);
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getPositiveMatchAssociation_4003OutgoingLinks(view);
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getNegativeMatchAssociation_4004OutgoingLinks(view);
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getMatchMayBeSameRelation_4017OutgoingLinks(view);
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return getApplyMayBeSameRelation_4018OutgoingLinks(view);
		case ApplyAssociationEditPart.VISUAL_ID:
			return getApplyAssociation_4005OutgoingLinks(view);
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return getPositiveBackwardRestriction_4006OutgoingLinks(view);
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return getNegativeBackwardRestriction_4007OutgoingLinks(view);
		case AttributeEqualityEditPart.VISUAL_ID:
			return getAttributeEquality_4015OutgoingLinks(view);
		case AttributeInequalityEditPart.VISUAL_ID:
			return getAttributeInequality_4016OutgoingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_4010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTransformationModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequential_2001ContainedLinks(
			View view) {
		Sequential modelElement = (Sequential) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Layer_PreviousSource_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getFilePort_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMetaModelIdentifier_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getRule_3002ContainedLinks(
			View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PositiveBackwardRestriction_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NegativeBackwardRestriction_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AttributeEquality_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AttributeInequality_4016(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Import_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchModel_3003ContainedLinks(
			View view) {
		MatchModel modelElement = (MatchModel) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PositiveIndirectAssociation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NegativeIndirectAssociation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PositiveMatchAssociation_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NegativeMatchAssociation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MatchMayBeSameRelation_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MatchModel_ExplicitSource_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAnyMatchClass_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchAttribute_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getIsNull_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getExistsMatchClass_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchClass_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyModel_3010ContainedLinks(
			View view) {
		ApplyModel modelElement = (ApplyModel) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ApplyMayBeSameRelation_4018(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ApplyAssociation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyClass_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAttribute_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3013ContainedLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3015ContainedLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3016ContainedLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3018ContainedLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3019ContainedLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3021ContainedLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3022ContainedLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3025ContainedLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3026ContainedLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveIndirectAssociation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeIndirectAssociation_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveMatchAssociation_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchAssociation_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchMayBeSameRelation_4017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyMayBeSameRelation_4018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAssociation_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveBackwardRestriction_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeBackwardRestriction_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeEquality_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeInequality_4016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getImport_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequential_2001IncomingLinks(
			View view) {
		Sequential modelElement = (Sequential) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Layer_PreviousSource_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getFilePort_2002IncomingLinks(
			View view) {
		FilePort modelElement = (FilePort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Layer_PreviousSource_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MatchModel_ExplicitSource_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMetaModelIdentifier_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getRule_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchModel_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAnyMatchClass_3004IncomingLinks(
			View view) {
		AnyMatchClass modelElement = (AnyMatchClass) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PositiveIndirectAssociation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeIndirectAssociation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PositiveMatchAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeMatchAssociation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MatchMayBeSameRelation_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchAttribute_3005IncomingLinks(
			View view) {
		MatchAttribute modelElement = (MatchAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AttributeEquality_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AttributeInequality_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getIsNull_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getExistsMatchClass_3008IncomingLinks(
			View view) {
		ExistsMatchClass modelElement = (ExistsMatchClass) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PositiveIndirectAssociation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeIndirectAssociation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PositiveMatchAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeMatchAssociation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MatchMayBeSameRelation_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchClass_3009IncomingLinks(
			View view) {
		NegativeMatchClass modelElement = (NegativeMatchClass) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PositiveIndirectAssociation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeIndirectAssociation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PositiveMatchAssociation_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeMatchAssociation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MatchMayBeSameRelation_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyModel_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyClass_3011IncomingLinks(
			View view) {
		ApplyClass modelElement = (ApplyClass) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ApplyMayBeSameRelation_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ApplyAssociation_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PositiveBackwardRestriction_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NegativeBackwardRestriction_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Import_4010(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAttribute_3012IncomingLinks(
			View view) {
		ApplyAttribute modelElement = (ApplyAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AttributeEquality_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AttributeInequality_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3027IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3031IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3032IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveIndirectAssociation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeIndirectAssociation_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveMatchAssociation_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchAssociation_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchMayBeSameRelation_4017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyMayBeSameRelation_4018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAssociation_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveBackwardRestriction_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeBackwardRestriction_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeEquality_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeInequality_4016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getImport_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequential_2001OutgoingLinks(
			View view) {
		Sequential modelElement = (Sequential) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Layer_PreviousSource_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getFilePort_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMetaModelIdentifier_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getRule_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchModel_3003OutgoingLinks(
			View view) {
		MatchModel modelElement = (MatchModel) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MatchModel_ExplicitSource_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAnyMatchClass_3004OutgoingLinks(
			View view) {
		AnyMatchClass modelElement = (AnyMatchClass) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveIndirectAssociation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeIndirectAssociation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveMatchAssociation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeMatchAssociation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MatchMayBeSameRelation_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveBackwardRestriction_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeBackwardRestriction_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Import_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchAttribute_3005OutgoingLinks(
			View view) {
		MatchAttribute modelElement = (MatchAttribute) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AttributeEquality_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AttributeInequality_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getIsNull_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getExistsMatchClass_3008OutgoingLinks(
			View view) {
		ExistsMatchClass modelElement = (ExistsMatchClass) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveIndirectAssociation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeIndirectAssociation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveMatchAssociation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeMatchAssociation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MatchMayBeSameRelation_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveBackwardRestriction_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeBackwardRestriction_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Import_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchClass_3009OutgoingLinks(
			View view) {
		NegativeMatchClass modelElement = (NegativeMatchClass) view
				.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveIndirectAssociation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeIndirectAssociation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PositiveMatchAssociation_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NegativeMatchAssociation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MatchMayBeSameRelation_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyModel_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyClass_3011OutgoingLinks(
			View view) {
		ApplyClass modelElement = (ApplyClass) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ApplyMayBeSameRelation_4018(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ApplyAssociation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAttribute_3012OutgoingLinks(
			View view) {
		ApplyAttribute modelElement = (ApplyAttribute) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AttributeEquality_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AttributeInequality_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3013OutgoingLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3015OutgoingLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3016OutgoingLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3018OutgoingLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getTypeOf_3019OutgoingLinks(
			View view) {
		TypeOf modelElement = (TypeOf) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3021OutgoingLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3022OutgoingLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAtom_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeRef_3025OutgoingLinks(
			View view) {
		AttributeRef modelElement = (AttributeRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getClassRef_3026OutgoingLinks(
			View view) {
		ClassRef modelElement = (ClassRef) view.getElement();
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getConcat_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3031OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getWildcard_3032OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getSequencer_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveIndirectAssociation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeIndirectAssociation_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveMatchAssociation_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeMatchAssociation_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getMatchMayBeSameRelation_4017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyMayBeSameRelation_4018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getApplyAssociation_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getPositiveBackwardRestriction_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getNegativeBackwardRestriction_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeEquality_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getAttributeInequality_4016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsltransLinkDescriptor> getImport_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_PositiveIndirectAssociation_4001(
			MatchModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveIndirectAssociation) {
				continue;
			}
			PositiveIndirectAssociation link = (PositiveIndirectAssociation) linkObject;
			if (PositiveIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveIndirectAssociation_4001,
					PositiveIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_NegativeIndirectAssociation_4002(
			MatchModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeIndirectAssociation) {
				continue;
			}
			NegativeIndirectAssociation link = (NegativeIndirectAssociation) linkObject;
			if (NegativeIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeIndirectAssociation_4002,
					NegativeIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_PositiveMatchAssociation_4003(
			MatchModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveMatchAssociation) {
				continue;
			}
			PositiveMatchAssociation link = (PositiveMatchAssociation) linkObject;
			if (PositiveMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveMatchAssociation_4003,
					PositiveMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_NegativeMatchAssociation_4004(
			MatchModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeMatchAssociation) {
				continue;
			}
			NegativeMatchAssociation link = (NegativeMatchAssociation) linkObject;
			if (NegativeMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeMatchAssociation_4004,
					NegativeMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_MatchMayBeSameRelation_4017(
			MatchModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MatchMayBeSameRelation) {
				continue;
			}
			MatchMayBeSameRelation link = (MatchMayBeSameRelation) linkObject;
			if (MatchMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.MatchMayBeSameRelation_4017,
					MatchMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_ApplyMayBeSameRelation_4018(
			ApplyModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ApplyMayBeSameRelation) {
				continue;
			}
			ApplyMayBeSameRelation link = (ApplyMayBeSameRelation) linkObject;
			if (ApplyMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			ApplyClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.ApplyMayBeSameRelation_4018,
					ApplyMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_ApplyAssociation_4005(
			ApplyModel container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ApplyAssociation) {
				continue;
			}
			ApplyAssociation link = (ApplyAssociation) linkObject;
			if (ApplyAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			ApplyClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.ApplyAssociation_4005,
					ApplyAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_PositiveBackwardRestriction_4006(
			Rule container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getBackwards().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveBackwardRestriction) {
				continue;
			}
			PositiveBackwardRestriction link = (PositiveBackwardRestriction) linkObject;
			if (PositiveBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTargetClass();
			PositiveMatchClass src = link.getSourceClass();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveBackwardRestriction_4006,
					PositiveBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_NegativeBackwardRestriction_4007(
			Rule container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getBackwards().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeBackwardRestriction) {
				continue;
			}
			NegativeBackwardRestriction link = (NegativeBackwardRestriction) linkObject;
			if (NegativeBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTargetClass();
			PositiveMatchClass src = link.getSourceClass();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeBackwardRestriction_4007,
					NegativeBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_AttributeEquality_4015(
			Rule container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAttributeRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AttributeEquality) {
				continue;
			}
			AttributeEquality link = (AttributeEquality) linkObject;
			if (AttributeEqualityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTargetAttribute();
			Attribute src = link.getSourceAttribute();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.AttributeEquality_4015,
					AttributeEqualityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_AttributeInequality_4016(
			Rule container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAttributeRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AttributeInequality) {
				continue;
			}
			AttributeInequality link = (AttributeInequality) linkObject;
			if (AttributeInequalityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTargetAttribute();
			Attribute src = link.getSourceAttribute();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.AttributeInequality_4016,
					AttributeInequalityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getContainedTypeModelFacetLinks_Import_4010(
			Rule container) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getImports().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Import) {
				continue;
			}
			Import link = (Import) linkObject;
			if (ImportEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			PositiveMatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.Import_4010, ImportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_PositiveIndirectAssociation_4001(
			MatchClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getMatchAssociation_Target()
					|| false == setting.getEObject() instanceof PositiveIndirectAssociation) {
				continue;
			}
			PositiveIndirectAssociation link = (PositiveIndirectAssociation) setting
					.getEObject();
			if (PositiveIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.PositiveIndirectAssociation_4001,
					PositiveIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_NegativeIndirectAssociation_4002(
			MatchClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getMatchAssociation_Target()
					|| false == setting.getEObject() instanceof NegativeIndirectAssociation) {
				continue;
			}
			NegativeIndirectAssociation link = (NegativeIndirectAssociation) setting
					.getEObject();
			if (NegativeIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.NegativeIndirectAssociation_4002,
					NegativeIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_PositiveMatchAssociation_4003(
			MatchClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getMatchAssociation_Target()
					|| false == setting.getEObject() instanceof PositiveMatchAssociation) {
				continue;
			}
			PositiveMatchAssociation link = (PositiveMatchAssociation) setting
					.getEObject();
			if (PositiveMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.PositiveMatchAssociation_4003,
					PositiveMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_NegativeMatchAssociation_4004(
			MatchClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getMatchAssociation_Target()
					|| false == setting.getEObject() instanceof NegativeMatchAssociation) {
				continue;
			}
			NegativeMatchAssociation link = (NegativeMatchAssociation) setting
					.getEObject();
			if (NegativeMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.NegativeMatchAssociation_4004,
					NegativeMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_MatchMayBeSameRelation_4017(
			MatchClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getMatchAssociation_Target()
					|| false == setting.getEObject() instanceof MatchMayBeSameRelation) {
				continue;
			}
			MatchMayBeSameRelation link = (MatchMayBeSameRelation) setting
					.getEObject();
			if (MatchMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.MatchMayBeSameRelation_4017,
					MatchMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_ApplyMayBeSameRelation_4018(
			ApplyClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getApplyAssociation_Target()
					|| false == setting.getEObject() instanceof ApplyMayBeSameRelation) {
				continue;
			}
			ApplyMayBeSameRelation link = (ApplyMayBeSameRelation) setting
					.getEObject();
			if (ApplyMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.ApplyMayBeSameRelation_4018,
					ApplyMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_ApplyAssociation_4005(
			ApplyClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getApplyAssociation_Target()
					|| false == setting.getEObject() instanceof ApplyAssociation) {
				continue;
			}
			ApplyAssociation link = (ApplyAssociation) setting.getEObject();
			if (ApplyAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.ApplyAssociation_4005,
					ApplyAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_PositiveBackwardRestriction_4006(
			ApplyClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getAbstractTemporalRelation_TargetClass()
					|| false == setting.getEObject() instanceof PositiveBackwardRestriction) {
				continue;
			}
			PositiveBackwardRestriction link = (PositiveBackwardRestriction) setting
					.getEObject();
			if (PositiveBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PositiveMatchClass src = link.getSourceClass();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.PositiveBackwardRestriction_4006,
					PositiveBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_NegativeBackwardRestriction_4007(
			ApplyClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getAbstractTemporalRelation_TargetClass()
					|| false == setting.getEObject() instanceof NegativeBackwardRestriction) {
				continue;
			}
			NegativeBackwardRestriction link = (NegativeBackwardRestriction) setting
					.getEObject();
			if (NegativeBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PositiveMatchClass src = link.getSourceClass();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.NegativeBackwardRestriction_4007,
					NegativeBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_AttributeEquality_4015(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getAbstractAttributeRelation_TargetAttribute()
					|| false == setting.getEObject() instanceof AttributeEquality) {
				continue;
			}
			AttributeEquality link = (AttributeEquality) setting.getEObject();
			if (AttributeEqualityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute src = link.getSourceAttribute();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.AttributeEquality_4015,
					AttributeEqualityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_AttributeInequality_4016(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getAbstractAttributeRelation_TargetAttribute()
					|| false == setting.getEObject() instanceof AttributeInequality) {
				continue;
			}
			AttributeInequality link = (AttributeInequality) setting
					.getEObject();
			if (AttributeInequalityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute src = link.getSourceAttribute();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.AttributeInequality_4016,
					AttributeInequalityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingTypeModelFacetLinks_Import_4010(
			ApplyClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsltransPackage.eINSTANCE
					.getImport_Target()
					|| false == setting.getEObject() instanceof Import) {
				continue;
			}
			Import link = (Import) setting.getEObject();
			if (ImportEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PositiveMatchClass src = link.getSource();
			result.add(new DsltransLinkDescriptor(src, target, link,
					DsltransElementTypes.Import_4010, ImportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingFeatureModelFacetLinks_Layer_PreviousSource_4011(
			AbstractSource target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DsltransPackage.eINSTANCE
					.getLayer_PreviousSource()) {
				result.add(new DsltransLinkDescriptor(setting.getEObject(),
						target, DsltransElementTypes.LayerPreviousSource_4011,
						LayerPreviousSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingFeatureModelFacetLinks_MatchModel_ExplicitSource_4012(
			FilePort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DsltransPackage.eINSTANCE
					.getMatchModel_ExplicitSource()) {
				result.add(new DsltransLinkDescriptor(setting.getEObject(),
						target,
						DsltransElementTypes.MatchModelExplicitSource_4012,
						MatchModelExplicitSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DsltransPackage.eINSTANCE
					.getAttributeRef_AttributeRef()) {
				result.add(new DsltransLinkDescriptor(setting.getEObject(),
						target,
						DsltransElementTypes.AttributeRefAttributeRef_4013,
						AttributeRefAttributeRefEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getIncomingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
			AbstractClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DsltransPackage.eINSTANCE
					.getClassRef_ClassRef()) {
				result.add(new DsltransLinkDescriptor(setting.getEObject(),
						target, DsltransElementTypes.ClassRefClassRef_4014,
						ClassRefClassRefEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_PositiveIndirectAssociation_4001(
			MatchClass source) {
		MatchModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MatchModel) {
				container = (MatchModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveIndirectAssociation) {
				continue;
			}
			PositiveIndirectAssociation link = (PositiveIndirectAssociation) linkObject;
			if (PositiveIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveIndirectAssociation_4001,
					PositiveIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_NegativeIndirectAssociation_4002(
			MatchClass source) {
		MatchModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MatchModel) {
				container = (MatchModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeIndirectAssociation) {
				continue;
			}
			NegativeIndirectAssociation link = (NegativeIndirectAssociation) linkObject;
			if (NegativeIndirectAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeIndirectAssociation_4002,
					NegativeIndirectAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_PositiveMatchAssociation_4003(
			MatchClass source) {
		MatchModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MatchModel) {
				container = (MatchModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveMatchAssociation) {
				continue;
			}
			PositiveMatchAssociation link = (PositiveMatchAssociation) linkObject;
			if (PositiveMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveMatchAssociation_4003,
					PositiveMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_NegativeMatchAssociation_4004(
			MatchClass source) {
		MatchModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MatchModel) {
				container = (MatchModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeMatchAssociation) {
				continue;
			}
			NegativeMatchAssociation link = (NegativeMatchAssociation) linkObject;
			if (NegativeMatchAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeMatchAssociation_4004,
					NegativeMatchAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_MatchMayBeSameRelation_4017(
			MatchClass source) {
		MatchModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MatchModel) {
				container = (MatchModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MatchMayBeSameRelation) {
				continue;
			}
			MatchMayBeSameRelation link = (MatchMayBeSameRelation) linkObject;
			if (MatchMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MatchClass dst = link.getTarget();
			MatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.MatchMayBeSameRelation_4017,
					MatchMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_ApplyMayBeSameRelation_4018(
			ApplyClass source) {
		ApplyModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ApplyModel) {
				container = (ApplyModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ApplyMayBeSameRelation) {
				continue;
			}
			ApplyMayBeSameRelation link = (ApplyMayBeSameRelation) linkObject;
			if (ApplyMayBeSameRelationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			ApplyClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.ApplyMayBeSameRelation_4018,
					ApplyMayBeSameRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_ApplyAssociation_4005(
			ApplyClass source) {
		ApplyModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ApplyModel) {
				container = (ApplyModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ApplyAssociation) {
				continue;
			}
			ApplyAssociation link = (ApplyAssociation) linkObject;
			if (ApplyAssociationEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			ApplyClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.ApplyAssociation_4005,
					ApplyAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_PositiveBackwardRestriction_4006(
			PositiveMatchClass source) {
		Rule container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Rule) {
				container = (Rule) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getBackwards().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PositiveBackwardRestriction) {
				continue;
			}
			PositiveBackwardRestriction link = (PositiveBackwardRestriction) linkObject;
			if (PositiveBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTargetClass();
			PositiveMatchClass src = link.getSourceClass();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.PositiveBackwardRestriction_4006,
					PositiveBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_NegativeBackwardRestriction_4007(
			PositiveMatchClass source) {
		Rule container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Rule) {
				container = (Rule) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getBackwards().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NegativeBackwardRestriction) {
				continue;
			}
			NegativeBackwardRestriction link = (NegativeBackwardRestriction) linkObject;
			if (NegativeBackwardRestrictionEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTargetClass();
			PositiveMatchClass src = link.getSourceClass();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.NegativeBackwardRestriction_4007,
					NegativeBackwardRestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_AttributeEquality_4015(
			Attribute source) {
		Rule container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Rule) {
				container = (Rule) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAttributeRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AttributeEquality) {
				continue;
			}
			AttributeEquality link = (AttributeEquality) linkObject;
			if (AttributeEqualityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTargetAttribute();
			Attribute src = link.getSourceAttribute();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.AttributeEquality_4015,
					AttributeEqualityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_AttributeInequality_4016(
			Attribute source) {
		Rule container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Rule) {
				container = (Rule) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getAttributeRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AttributeInequality) {
				continue;
			}
			AttributeInequality link = (AttributeInequality) linkObject;
			if (AttributeInequalityEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTargetAttribute();
			Attribute src = link.getSourceAttribute();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.AttributeInequality_4016,
					AttributeInequalityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingTypeModelFacetLinks_Import_4010(
			PositiveMatchClass source) {
		Rule container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Rule) {
				container = (Rule) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> links = container.getImports().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Import) {
				continue;
			}
			Import link = (Import) linkObject;
			if (ImportEditPart.VISUAL_ID != DsltransVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ApplyClass dst = link.getTarget();
			PositiveMatchClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsltransLinkDescriptor(src, dst, link,
					DsltransElementTypes.Import_4010, ImportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingFeatureModelFacetLinks_Layer_PreviousSource_4011(
			Layer source) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		for (Iterator<?> destinations = source.getPreviousSource().iterator(); destinations
				.hasNext();) {
			AbstractSource destination = (AbstractSource) destinations.next();
			result.add(new DsltransLinkDescriptor(source, destination,
					DsltransElementTypes.LayerPreviousSource_4011,
					LayerPreviousSourceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingFeatureModelFacetLinks_MatchModel_ExplicitSource_4012(
			MatchModel source) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		FilePort destination = source.getExplicitSource();
		if (destination == null) {
			return result;
		}
		result.add(new DsltransLinkDescriptor(source, destination,
				DsltransElementTypes.MatchModelExplicitSource_4012,
				MatchModelExplicitSourceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingFeatureModelFacetLinks_AttributeRef_AttributeRef_4013(
			AttributeRef source) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		Attribute destination = source.getAttributeRef();
		if (destination == null) {
			return result;
		}
		result.add(new DsltransLinkDescriptor(source, destination,
				DsltransElementTypes.AttributeRefAttributeRef_4013,
				AttributeRefAttributeRefEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsltransLinkDescriptor> getOutgoingFeatureModelFacetLinks_ClassRef_ClassRef_4014(
			ClassRef source) {
		LinkedList<DsltransLinkDescriptor> result = new LinkedList<DsltransLinkDescriptor>();
		AbstractClass destination = source.getClassRef();
		if (destination == null) {
			return result;
		}
		result.add(new DsltransLinkDescriptor(source, destination,
				DsltransElementTypes.ClassRefClassRef_4014,
				ClassRefClassRefEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DsltransNodeDescriptor> getSemanticChildren(View view) {
			return DsltransDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsltransLinkDescriptor> getContainedLinks(View view) {
			return DsltransDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsltransLinkDescriptor> getIncomingLinks(View view) {
			return DsltransDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsltransLinkDescriptor> getOutgoingLinks(View view) {
			return DsltransDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
