/*
 * 
 */
package dsltrans.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import dsltrans.diagram.edit.commands.AttributeEqualityCreateCommand;
import dsltrans.diagram.edit.commands.AttributeEqualityReorientCommand;
import dsltrans.diagram.edit.commands.AttributeInequalityCreateCommand;
import dsltrans.diagram.edit.commands.AttributeInequalityReorientCommand;
import dsltrans.diagram.edit.commands.AttributeRefAttributeRefCreateCommand;
import dsltrans.diagram.edit.commands.AttributeRefAttributeRefReorientCommand;
import dsltrans.diagram.edit.parts.AtomEditPart;
import dsltrans.diagram.edit.parts.AttributeEqualityEditPart;
import dsltrans.diagram.edit.parts.AttributeInequalityEditPart;
import dsltrans.diagram.edit.parts.AttributeRefAttributeRefEditPart;
import dsltrans.diagram.edit.parts.IsNullEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeMatchAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.part.DsltransVisualIDRegistry;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class MatchAttributeItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchAttributeItemSemanticEditPolicy() {
		super(DsltransElementTypes.MatchAttribute_3005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == AttributeEqualityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == AttributeInequalityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == AttributeRefAttributeRefEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == AttributeEqualityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == AttributeInequalityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (DsltransVisualIDRegistry.getVisualID(node)) {
			case MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DsltransVisualIDRegistry.getVisualID(cnode)) {
					case AtomEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case IsNullEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DsltransElementTypes.AttributeEquality_4015 == req.getElementType()) {
			return getGEFWrapper(new AttributeEqualityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.AttributeInequality_4016 == req
				.getElementType()) {
			return getGEFWrapper(new AttributeInequalityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.AttributeRefAttributeRef_4013 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DsltransElementTypes.AttributeEquality_4015 == req.getElementType()) {
			return getGEFWrapper(new AttributeEqualityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.AttributeInequality_4016 == req
				.getElementType()) {
			return getGEFWrapper(new AttributeInequalityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.AttributeRefAttributeRef_4013 == req
				.getElementType()) {
			return getGEFWrapper(new AttributeRefAttributeRefCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AttributeEqualityEditPart.VISUAL_ID:
			return getGEFWrapper(new AttributeEqualityReorientCommand(req));
		case AttributeInequalityEditPart.VISUAL_ID:
			return getGEFWrapper(new AttributeInequalityReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AttributeRefAttributeRefEditPart.VISUAL_ID:
			return getGEFWrapper(new AttributeRefAttributeRefReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
