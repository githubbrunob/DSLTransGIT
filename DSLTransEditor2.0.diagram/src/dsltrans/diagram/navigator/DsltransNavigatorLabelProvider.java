/*
 * 
 */
package dsltrans.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dsltrans.PositiveIndirectAssociation;
import dsltrans.diagram.edit.parts.AnyMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.AnyMatchClassEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeAttributeNameEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeEditPart;
import dsltrans.diagram.edit.parts.ApplyClassClassNameEditPart;
import dsltrans.diagram.edit.parts.ApplyClassEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.ApplyModelEditPart;
import dsltrans.diagram.edit.parts.Atom2EditPart;
import dsltrans.diagram.edit.parts.Atom3EditPart;
import dsltrans.diagram.edit.parts.Atom4EditPart;
import dsltrans.diagram.edit.parts.AtomEditPart;
import dsltrans.diagram.edit.parts.AtomValue2EditPart;
import dsltrans.diagram.edit.parts.AtomValue3EditPart;
import dsltrans.diagram.edit.parts.AtomValue4EditPart;
import dsltrans.diagram.edit.parts.AtomValueEditPart;
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
import dsltrans.diagram.edit.parts.ExistsMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassEditPart;
import dsltrans.diagram.edit.parts.FilePortEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePathURIEditPart;
import dsltrans.diagram.edit.parts.ImportEditPart;
import dsltrans.diagram.edit.parts.IsNullEditPart;
import dsltrans.diagram.edit.parts.IsNullValueEditPart;
import dsltrans.diagram.edit.parts.LayerPreviousSourceEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeAttributeNameEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.MatchModelEditPart;
import dsltrans.diagram.edit.parts.MatchModelExplicitSourceEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierMetaModelNameEditPart;
import dsltrans.diagram.edit.parts.NegativeBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassEditPart;
import dsltrans.diagram.edit.parts.PositiveBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.PositiveIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.RuleDescriptionEditPart;
import dsltrans.diagram.edit.parts.RuleEditPart;
import dsltrans.diagram.edit.parts.Sequencer2EditPart;
import dsltrans.diagram.edit.parts.Sequencer3EditPart;
import dsltrans.diagram.edit.parts.SequencerEditPart;
import dsltrans.diagram.edit.parts.SequentialDescriptionEditPart;
import dsltrans.diagram.edit.parts.SequentialEditPart;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.edit.parts.TypeOf2EditPart;
import dsltrans.diagram.edit.parts.TypeOf3EditPart;
import dsltrans.diagram.edit.parts.TypeOfEditPart;
import dsltrans.diagram.edit.parts.Wildcard2EditPart;
import dsltrans.diagram.edit.parts.Wildcard3EditPart;
import dsltrans.diagram.edit.parts.WildcardEditPart;
import dsltrans.diagram.part.DsltransDiagramEditorPlugin;
import dsltrans.diagram.part.DsltransVisualIDRegistry;
import dsltrans.diagram.providers.DsltransElementTypes;
import dsltrans.diagram.providers.DsltransParserProvider;

/**
 * @generated
 */
public class DsltransNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DsltransDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DsltransDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DsltransNavigatorItem
				&& !isOwnView(((DsltransNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DsltransNavigatorGroup) {
			DsltransNavigatorGroup group = (DsltransNavigatorGroup) element;
			return DsltransDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DsltransNavigatorItem) {
			DsltransNavigatorItem navigatorItem = (DsltransNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case TransformationModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://dsltrans/2.0?TransformationModel", DsltransElementTypes.TransformationModel_1000); //$NON-NLS-1$
		case SequentialEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dsltrans/2.0?Sequential", DsltransElementTypes.Sequential_2001); //$NON-NLS-1$
		case FilePortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dsltrans/2.0?FilePort", DsltransElementTypes.FilePort_2002); //$NON-NLS-1$
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?MetaModelIdentifier", DsltransElementTypes.MetaModelIdentifier_3001); //$NON-NLS-1$
		case RuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Rule", DsltransElementTypes.Rule_3002); //$NON-NLS-1$
		case MatchModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?MatchModel", DsltransElementTypes.MatchModel_3003); //$NON-NLS-1$
		case AnyMatchClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?AnyMatchClass", DsltransElementTypes.AnyMatchClass_3004); //$NON-NLS-1$
		case MatchAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?MatchAttribute", DsltransElementTypes.MatchAttribute_3005); //$NON-NLS-1$
		case AtomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Atom", DsltransElementTypes.Atom_3006); //$NON-NLS-1$
		case IsNullEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?isNull", DsltransElementTypes.IsNull_3007); //$NON-NLS-1$
		case ExistsMatchClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ExistsMatchClass", DsltransElementTypes.ExistsMatchClass_3008); //$NON-NLS-1$
		case NegativeMatchClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?NegativeMatchClass", DsltransElementTypes.NegativeMatchClass_3009); //$NON-NLS-1$
		case ApplyModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ApplyModel", DsltransElementTypes.ApplyModel_3010); //$NON-NLS-1$
		case ApplyClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ApplyClass", DsltransElementTypes.ApplyClass_3011); //$NON-NLS-1$
		case ApplyAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ApplyAttribute", DsltransElementTypes.ApplyAttribute_3012); //$NON-NLS-1$
		case TypeOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?TypeOf", DsltransElementTypes.TypeOf_3013); //$NON-NLS-1$
		case Atom2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Atom", DsltransElementTypes.Atom_3014); //$NON-NLS-1$
		case AttributeRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?AttributeRef", DsltransElementTypes.AttributeRef_3015); //$NON-NLS-1$
		case ClassRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ClassRef", DsltransElementTypes.ClassRef_3016); //$NON-NLS-1$
		case ConcatEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Concat", DsltransElementTypes.Concat_3017); //$NON-NLS-1$
		case TypeOf2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?TypeOf", DsltransElementTypes.TypeOf_3018); //$NON-NLS-1$
		case TypeOf3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?TypeOf", DsltransElementTypes.TypeOf_3019); //$NON-NLS-1$
		case Atom3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Atom", DsltransElementTypes.Atom_3020); //$NON-NLS-1$
		case AttributeRef2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?AttributeRef", DsltransElementTypes.AttributeRef_3021); //$NON-NLS-1$
		case ClassRef2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ClassRef", DsltransElementTypes.ClassRef_3022); //$NON-NLS-1$
		case Concat2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Concat", DsltransElementTypes.Concat_3023); //$NON-NLS-1$
		case Atom4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Atom", DsltransElementTypes.Atom_3024); //$NON-NLS-1$
		case AttributeRef3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?AttributeRef", DsltransElementTypes.AttributeRef_3025); //$NON-NLS-1$
		case ClassRef3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?ClassRef", DsltransElementTypes.ClassRef_3026); //$NON-NLS-1$
		case Concat3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Concat", DsltransElementTypes.Concat_3027); //$NON-NLS-1$
		case WildcardEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Wildcard", DsltransElementTypes.Wildcard_3028); //$NON-NLS-1$
		case SequencerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Sequencer", DsltransElementTypes.Sequencer_3029); //$NON-NLS-1$
		case Wildcard2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Wildcard", DsltransElementTypes.Wildcard_3030); //$NON-NLS-1$
		case Sequencer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Sequencer", DsltransElementTypes.Sequencer_3031); //$NON-NLS-1$
		case Wildcard3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Wildcard", DsltransElementTypes.Wildcard_3032); //$NON-NLS-1$
		case Sequencer3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dsltrans/2.0?Sequencer", DsltransElementTypes.Sequencer_3033); //$NON-NLS-1$
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?PositiveIndirectAssociation", DsltransElementTypes.PositiveIndirectAssociation_4001); //$NON-NLS-1$
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?NegativeIndirectAssociation", DsltransElementTypes.NegativeIndirectAssociation_4002); //$NON-NLS-1$
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?PositiveMatchAssociation", DsltransElementTypes.PositiveMatchAssociation_4003); //$NON-NLS-1$
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?NegativeMatchAssociation", DsltransElementTypes.NegativeMatchAssociation_4004); //$NON-NLS-1$
		case ApplyAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?ApplyAssociation", DsltransElementTypes.ApplyAssociation_4005); //$NON-NLS-1$
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?PositiveBackwardRestriction", DsltransElementTypes.PositiveBackwardRestriction_4006); //$NON-NLS-1$
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?NegativeBackwardRestriction", DsltransElementTypes.NegativeBackwardRestriction_4007); //$NON-NLS-1$
		case ImportEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?Import", DsltransElementTypes.Import_4010); //$NON-NLS-1$
		case LayerPreviousSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?Layer?previousSource", DsltransElementTypes.LayerPreviousSource_4011); //$NON-NLS-1$
		case MatchModelExplicitSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?MatchModel?explicitSource", DsltransElementTypes.MatchModelExplicitSource_4012); //$NON-NLS-1$
		case AttributeRefAttributeRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?AttributeRef?attributeRef", DsltransElementTypes.AttributeRefAttributeRef_4013); //$NON-NLS-1$
		case ClassRefClassRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?ClassRef?classRef", DsltransElementTypes.ClassRefClassRef_4014); //$NON-NLS-1$
		case AttributeEqualityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?AttributeEquality", DsltransElementTypes.AttributeEquality_4015); //$NON-NLS-1$
		case AttributeInequalityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?AttributeInequality", DsltransElementTypes.AttributeInequality_4016); //$NON-NLS-1$
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?MatchMayBeSameRelation", DsltransElementTypes.MatchMayBeSameRelation_4017); //$NON-NLS-1$
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dsltrans/2.0?ApplyMayBeSameRelation", DsltransElementTypes.ApplyMayBeSameRelation_4018); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DsltransDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DsltransElementTypes.isKnownElementType(elementType)) {
			image = DsltransElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DsltransNavigatorGroup) {
			DsltransNavigatorGroup group = (DsltransNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DsltransNavigatorItem) {
			DsltransNavigatorItem navigatorItem = (DsltransNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DsltransVisualIDRegistry.getVisualID(view)) {
		case TransformationModelEditPart.VISUAL_ID:
			return getTransformationModel_1000Text(view);
		case SequentialEditPart.VISUAL_ID:
			return getSequential_2001Text(view);
		case FilePortEditPart.VISUAL_ID:
			return getFilePort_2002Text(view);
		case MetaModelIdentifierEditPart.VISUAL_ID:
			return getMetaModelIdentifier_3001Text(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_3002Text(view);
		case MatchModelEditPart.VISUAL_ID:
			return getMatchModel_3003Text(view);
		case AnyMatchClassEditPart.VISUAL_ID:
			return getAnyMatchClass_3004Text(view);
		case MatchAttributeEditPart.VISUAL_ID:
			return getMatchAttribute_3005Text(view);
		case AtomEditPart.VISUAL_ID:
			return getAtom_3006Text(view);
		case IsNullEditPart.VISUAL_ID:
			return getIsNull_3007Text(view);
		case ExistsMatchClassEditPart.VISUAL_ID:
			return getExistsMatchClass_3008Text(view);
		case NegativeMatchClassEditPart.VISUAL_ID:
			return getNegativeMatchClass_3009Text(view);
		case ApplyModelEditPart.VISUAL_ID:
			return getApplyModel_3010Text(view);
		case ApplyClassEditPart.VISUAL_ID:
			return getApplyClass_3011Text(view);
		case ApplyAttributeEditPart.VISUAL_ID:
			return getApplyAttribute_3012Text(view);
		case TypeOfEditPart.VISUAL_ID:
			return getTypeOf_3013Text(view);
		case Atom2EditPart.VISUAL_ID:
			return getAtom_3014Text(view);
		case AttributeRefEditPart.VISUAL_ID:
			return getAttributeRef_3015Text(view);
		case ClassRefEditPart.VISUAL_ID:
			return getClassRef_3016Text(view);
		case ConcatEditPart.VISUAL_ID:
			return getConcat_3017Text(view);
		case TypeOf2EditPart.VISUAL_ID:
			return getTypeOf_3018Text(view);
		case TypeOf3EditPart.VISUAL_ID:
			return getTypeOf_3019Text(view);
		case Atom3EditPart.VISUAL_ID:
			return getAtom_3020Text(view);
		case AttributeRef2EditPart.VISUAL_ID:
			return getAttributeRef_3021Text(view);
		case ClassRef2EditPart.VISUAL_ID:
			return getClassRef_3022Text(view);
		case Concat2EditPart.VISUAL_ID:
			return getConcat_3023Text(view);
		case Atom4EditPart.VISUAL_ID:
			return getAtom_3024Text(view);
		case AttributeRef3EditPart.VISUAL_ID:
			return getAttributeRef_3025Text(view);
		case ClassRef3EditPart.VISUAL_ID:
			return getClassRef_3026Text(view);
		case Concat3EditPart.VISUAL_ID:
			return getConcat_3027Text(view);
		case WildcardEditPart.VISUAL_ID:
			return getWildcard_3028Text(view);
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_3029Text(view);
		case Wildcard2EditPart.VISUAL_ID:
			return getWildcard_3030Text(view);
		case Sequencer2EditPart.VISUAL_ID:
			return getSequencer_3031Text(view);
		case Wildcard3EditPart.VISUAL_ID:
			return getWildcard_3032Text(view);
		case Sequencer3EditPart.VISUAL_ID:
			return getSequencer_3033Text(view);
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getPositiveIndirectAssociation_4001Text(view);
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getNegativeIndirectAssociation_4002Text(view);
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getPositiveMatchAssociation_4003Text(view);
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getNegativeMatchAssociation_4004Text(view);
		case ApplyAssociationEditPart.VISUAL_ID:
			return getApplyAssociation_4005Text(view);
		case PositiveBackwardRestrictionEditPart.VISUAL_ID:
			return getPositiveBackwardRestriction_4006Text(view);
		case NegativeBackwardRestrictionEditPart.VISUAL_ID:
			return getNegativeBackwardRestriction_4007Text(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_4010Text(view);
		case LayerPreviousSourceEditPart.VISUAL_ID:
			return getLayerPreviousSource_4011Text(view);
		case MatchModelExplicitSourceEditPart.VISUAL_ID:
			return getMatchModelExplicitSource_4012Text(view);
		case AttributeRefAttributeRefEditPart.VISUAL_ID:
			return getAttributeRefAttributeRef_4013Text(view);
		case ClassRefClassRefEditPart.VISUAL_ID:
			return getClassRefClassRef_4014Text(view);
		case AttributeEqualityEditPart.VISUAL_ID:
			return getAttributeEquality_4015Text(view);
		case AttributeInequalityEditPart.VISUAL_ID:
			return getAttributeInequality_4016Text(view);
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getMatchMayBeSameRelation_4017Text(view);
		case ApplyMayBeSameRelationEditPart.VISUAL_ID:
			return getApplyMayBeSameRelation_4018Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTransformationModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequential_2001Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Sequential_2001,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(SequentialDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilePort_2002Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.FilePort_2002,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(FilePortFilePathURIEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetaModelIdentifier_3001Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.MetaModelIdentifier_3001,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(MetaModelIdentifierMetaModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRule_3002Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Rule_3002,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(RuleDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchModel_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAnyMatchClass_3004Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.AnyMatchClass_3004,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(AnyMatchClassClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchAttribute_3005Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.MatchAttribute_3005,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(MatchAttributeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtom_3006Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Atom_3006,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry.getType(AtomValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIsNull_3007Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(DsltransElementTypes.IsNull_3007,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(IsNullValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExistsMatchClass_3008Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.ExistsMatchClass_3008,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(ExistsMatchClassClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNegativeMatchClass_3009Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.NegativeMatchClass_3009,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(NegativeMatchClassClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplyModel_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getApplyClass_3011Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.ApplyClass_3011,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry
						.getType(ApplyClassClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplyAttribute_3012Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.ApplyAttribute_3012,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(ApplyAttributeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeOf_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtom_3014Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Atom_3014,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry.getType(AtomValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeRef_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassRef_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConcat_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTypeOf_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTypeOf_3019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtom_3020Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Atom_3020,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry.getType(AtomValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeRef_3021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassRef_3022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConcat_3023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtom_3024Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.Atom_3024,
				view.getElement() != null ? view.getElement() : view,
				DsltransVisualIDRegistry.getType(AtomValue4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeRef_3025Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassRef_3026Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConcat_3027Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWildcard_3028Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequencer_3029Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWildcard_3030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequencer_3031Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWildcard_3032Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequencer_3033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPositiveIndirectAssociation_4001Text(View view) {
		PositiveIndirectAssociation domainModelElement = (PositiveIndirectAssociation) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getAssociationName();
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNegativeIndirectAssociation_4002Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.NegativeIndirectAssociation_4002,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(NegativeIndirectAssociationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPositiveMatchAssociation_4003Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.PositiveMatchAssociation_4003,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(PositiveMatchAssociationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNegativeMatchAssociation_4004Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.NegativeMatchAssociation_4004,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(NegativeMatchAssociationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplyAssociation_4005Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.ApplyAssociation_4005,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(ApplyAssociationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPositiveBackwardRestriction_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNegativeBackwardRestriction_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getImport_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLayerPreviousSource_4011Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.LayerPreviousSource_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchModelExplicitSource_4012Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.MatchModelExplicitSource_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeRefAttributeRef_4013Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.AttributeRefAttributeRef_4013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassRefClassRef_4014Text(View view) {
		IParser parser = DsltransParserProvider.getParser(
				DsltransElementTypes.ClassRefClassRef_4014,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeEquality_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAttributeInequality_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMatchMayBeSameRelation_4017Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.MatchMayBeSameRelation_4017,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(MatchMayBeSameRelationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplyMayBeSameRelation_4018Text(View view) {
		IParser parser = DsltransParserProvider
				.getParser(
						DsltransElementTypes.ApplyMayBeSameRelation_4018,
						view.getElement() != null ? view.getElement() : view,
						DsltransVisualIDRegistry
								.getType(ApplyMayBeSameRelationAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsltransDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TransformationModelEditPart.MODEL_ID
				.equals(DsltransVisualIDRegistry.getModelID(view));
	}

}
