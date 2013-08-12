/*
 * 
 */
package dsltrans.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import dsltrans.diagram.edit.parts.AnyMatchClassAnyMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.AnyMatchClassEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeEditPart;
import dsltrans.diagram.edit.parts.ApplyClassApplyClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyClassEditPart;
import dsltrans.diagram.edit.parts.ApplyModelApplyModelClassCompartmentEditPart;
import dsltrans.diagram.edit.parts.AttributeRef2EditPart;
import dsltrans.diagram.edit.parts.AttributeRef3EditPart;
import dsltrans.diagram.edit.parts.AttributeRefEditPart;
import dsltrans.diagram.edit.parts.ClassRef2EditPart;
import dsltrans.diagram.edit.parts.ClassRef3EditPart;
import dsltrans.diagram.edit.parts.ClassRefEditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.FilePortEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePortMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeMatchAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.MatchModelEditPart;
import dsltrans.diagram.edit.parts.MatchModelMatchModelClassCompartmentEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.RuleRuleApplyCompartmentEditPart;
import dsltrans.diagram.edit.parts.RuleRuleMatchCompartmentEditPart;
import dsltrans.diagram.edit.parts.SequentialEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialHasRuleCompartmentEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.edit.parts.TypeOf2EditPart;
import dsltrans.diagram.edit.parts.TypeOf3EditPart;
import dsltrans.diagram.edit.parts.TypeOfEditPart;
import dsltrans.diagram.part.DsltransDiagramEditorPlugin;
import dsltrans.diagram.part.Messages;

/**
 * @generated
 */
public class DsltransModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof TransformationModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(DsltransElementTypes.Sequential_2001);
			types.add(DsltransElementTypes.FilePort_2002);
			return types;
		}
		if (editPart instanceof SequentialSequentialMetaModelIdCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MetaModelIdentifier_3001);
			return types;
		}
		if (editPart instanceof SequentialSequentialHasRuleCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.Rule_3002);
			return types;
		}
		if (editPart instanceof RuleRuleMatchCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MatchModel_3003);
			return types;
		}
		if (editPart instanceof RuleRuleApplyCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.ApplyModel_3010);
			return types;
		}
		if (editPart instanceof MatchModelMatchModelClassCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(DsltransElementTypes.AnyMatchClass_3004);
			types.add(DsltransElementTypes.ExistsMatchClass_3008);
			types.add(DsltransElementTypes.NegativeMatchClass_3009);
			return types;
		}
		if (editPart instanceof AnyMatchClassAnyMatchClassAttributeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MatchAttribute_3005);
			return types;
		}
		if (editPart instanceof MatchAttributeMatchAttributeAttributeValueCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(DsltransElementTypes.Atom_3006);
			types.add(DsltransElementTypes.IsNull_3007);
			return types;
		}
		if (editPart instanceof ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MatchAttribute_3005);
			return types;
		}
		if (editPart instanceof NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MatchAttribute_3005);
			return types;
		}
		if (editPart instanceof ApplyModelApplyModelClassCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.ApplyClass_3011);
			return types;
		}
		if (editPart instanceof ApplyClassApplyClassAttributeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.ApplyAttribute_3012);
			return types;
		}
		if (editPart instanceof ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3013);
			types.add(DsltransElementTypes.Atom_3014);
			types.add(DsltransElementTypes.AttributeRef_3015);
			types.add(DsltransElementTypes.ClassRef_3016);
			types.add(DsltransElementTypes.Concat_3017);
			types.add(DsltransElementTypes.Wildcard_3032);
			types.add(DsltransElementTypes.Sequencer_3033);
			return types;
		}
		if (editPart instanceof ConcatConcatLeftTermCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3018);
			types.add(DsltransElementTypes.Atom_3020);
			types.add(DsltransElementTypes.AttributeRef_3021);
			types.add(DsltransElementTypes.ClassRef_3022);
			types.add(DsltransElementTypes.Concat_3023);
			types.add(DsltransElementTypes.Wildcard_3028);
			types.add(DsltransElementTypes.Sequencer_3029);
			return types;
		}
		if (editPart instanceof ConcatConcatRightTermCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3019);
			types.add(DsltransElementTypes.Atom_3024);
			types.add(DsltransElementTypes.AttributeRef_3025);
			types.add(DsltransElementTypes.ClassRef_3026);
			types.add(DsltransElementTypes.Concat_3027);
			types.add(DsltransElementTypes.Wildcard_3030);
			types.add(DsltransElementTypes.Sequencer_3031);
			return types;
		}
		if (editPart instanceof ConcatConcatLeftTermCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3018);
			types.add(DsltransElementTypes.Atom_3020);
			types.add(DsltransElementTypes.AttributeRef_3021);
			types.add(DsltransElementTypes.ClassRef_3022);
			types.add(DsltransElementTypes.Concat_3023);
			types.add(DsltransElementTypes.Wildcard_3028);
			types.add(DsltransElementTypes.Sequencer_3029);
			return types;
		}
		if (editPart instanceof ConcatConcatRightTermCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3019);
			types.add(DsltransElementTypes.Atom_3024);
			types.add(DsltransElementTypes.AttributeRef_3025);
			types.add(DsltransElementTypes.ClassRef_3026);
			types.add(DsltransElementTypes.Concat_3027);
			types.add(DsltransElementTypes.Wildcard_3030);
			types.add(DsltransElementTypes.Sequencer_3031);
			return types;
		}
		if (editPart instanceof ConcatConcatLeftTermCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3018);
			types.add(DsltransElementTypes.Atom_3020);
			types.add(DsltransElementTypes.AttributeRef_3021);
			types.add(DsltransElementTypes.ClassRef_3022);
			types.add(DsltransElementTypes.Concat_3023);
			types.add(DsltransElementTypes.Wildcard_3028);
			types.add(DsltransElementTypes.Sequencer_3029);
			return types;
		}
		if (editPart instanceof ConcatConcatRightTermCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(DsltransElementTypes.TypeOf_3019);
			types.add(DsltransElementTypes.Atom_3024);
			types.add(DsltransElementTypes.AttributeRef_3025);
			types.add(DsltransElementTypes.ClassRef_3026);
			types.add(DsltransElementTypes.Concat_3027);
			types.add(DsltransElementTypes.Wildcard_3030);
			types.add(DsltransElementTypes.Sequencer_3031);
			return types;
		}
		if (editPart instanceof FilePortFilePortMetaModelIdCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DsltransElementTypes.MetaModelIdentifier_3001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SequentialEditPart) {
			return ((SequentialEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MatchModelEditPart) {
			return ((MatchModelEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AnyMatchClassEditPart) {
			return ((AnyMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MatchAttributeEditPart) {
			return ((MatchAttributeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExistsMatchClassEditPart) {
			return ((ExistsMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NegativeMatchClassEditPart) {
			return ((NegativeMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ApplyClassEditPart) {
			return ((ApplyClassEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ApplyAttributeEditPart) {
			return ((ApplyAttributeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TypeOfEditPart) {
			return ((TypeOfEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AttributeRefEditPart) {
			return ((AttributeRefEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassRefEditPart) {
			return ((ClassRefEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TypeOf2EditPart) {
			return ((TypeOf2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TypeOf3EditPart) {
			return ((TypeOf3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AttributeRef2EditPart) {
			return ((AttributeRef2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassRef2EditPart) {
			return ((ClassRef2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AttributeRef3EditPart) {
			return ((AttributeRef3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassRef3EditPart) {
			return ((ClassRef3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SequentialEditPart) {
			return ((SequentialEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FilePortEditPart) {
			return ((FilePortEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AnyMatchClassEditPart) {
			return ((AnyMatchClassEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MatchAttributeEditPart) {
			return ((MatchAttributeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExistsMatchClassEditPart) {
			return ((ExistsMatchClassEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NegativeMatchClassEditPart) {
			return ((NegativeMatchClassEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ApplyClassEditPart) {
			return ((ApplyClassEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ApplyAttributeEditPart) {
			return ((ApplyAttributeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SequentialEditPart) {
			return ((SequentialEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MatchModelEditPart) {
			return ((MatchModelEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AnyMatchClassEditPart) {
			return ((AnyMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MatchAttributeEditPart) {
			return ((MatchAttributeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExistsMatchClassEditPart) {
			return ((ExistsMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NegativeMatchClassEditPart) {
			return ((NegativeMatchClassEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ApplyClassEditPart) {
			return ((ApplyClassEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ApplyAttributeEditPart) {
			return ((ApplyAttributeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TypeOfEditPart) {
			return ((TypeOfEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AttributeRefEditPart) {
			return ((AttributeRefEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassRefEditPart) {
			return ((ClassRefEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TypeOf2EditPart) {
			return ((TypeOf2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TypeOf3EditPart) {
			return ((TypeOf3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AttributeRef2EditPart) {
			return ((AttributeRef2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassRef2EditPart) {
			return ((ClassRef2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AttributeRef3EditPart) {
			return ((AttributeRef3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassRef3EditPart) {
			return ((ClassRef3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SequentialEditPart) {
			return ((SequentialEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FilePortEditPart) {
			return ((FilePortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AnyMatchClassEditPart) {
			return ((AnyMatchClassEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MatchAttributeEditPart) {
			return ((MatchAttributeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExistsMatchClassEditPart) {
			return ((ExistsMatchClassEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NegativeMatchClassEditPart) {
			return ((NegativeMatchClassEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ApplyClassEditPart) {
			return ((ApplyClassEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ApplyAttributeEditPart) {
			return ((ApplyAttributeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SequentialEditPart) {
			return ((SequentialEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MatchModelEditPart) {
			return ((MatchModelEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AnyMatchClassEditPart) {
			return ((AnyMatchClassEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MatchAttributeEditPart) {
			return ((MatchAttributeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExistsMatchClassEditPart) {
			return ((ExistsMatchClassEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NegativeMatchClassEditPart) {
			return ((NegativeMatchClassEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ApplyClassEditPart) {
			return ((ApplyClassEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ApplyAttributeEditPart) {
			return ((ApplyAttributeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TypeOfEditPart) {
			return ((TypeOfEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AttributeRefEditPart) {
			return ((AttributeRefEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassRefEditPart) {
			return ((ClassRefEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TypeOf2EditPart) {
			return ((TypeOf2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TypeOf3EditPart) {
			return ((TypeOf3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AttributeRef2EditPart) {
			return ((AttributeRef2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassRef2EditPart) {
			return ((ClassRef2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AttributeRef3EditPart) {
			return ((AttributeRef3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassRef3EditPart) {
			return ((ClassRef3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				DsltransDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.DsltransModelingAssistantProviderMessage);
		dialog.setTitle(Messages.DsltransModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
