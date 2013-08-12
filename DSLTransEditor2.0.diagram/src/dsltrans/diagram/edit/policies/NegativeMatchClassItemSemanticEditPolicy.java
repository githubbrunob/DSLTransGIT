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

import dsltrans.diagram.edit.commands.ClassRefClassRefCreateCommand;
import dsltrans.diagram.edit.commands.ClassRefClassRefReorientCommand;
import dsltrans.diagram.edit.commands.MatchMayBeSameRelationCreateCommand;
import dsltrans.diagram.edit.commands.MatchMayBeSameRelationReorientCommand;
import dsltrans.diagram.edit.commands.NegativeIndirectAssociationCreateCommand;
import dsltrans.diagram.edit.commands.NegativeIndirectAssociationReorientCommand;
import dsltrans.diagram.edit.commands.NegativeMatchAssociationCreateCommand;
import dsltrans.diagram.edit.commands.NegativeMatchAssociationReorientCommand;
import dsltrans.diagram.edit.commands.PositiveIndirectAssociationCreateCommand;
import dsltrans.diagram.edit.commands.PositiveIndirectAssociationReorientCommand;
import dsltrans.diagram.edit.commands.PositiveMatchAssociationCreateCommand;
import dsltrans.diagram.edit.commands.PositiveMatchAssociationReorientCommand;
import dsltrans.diagram.edit.parts.AttributeEqualityEditPart;
import dsltrans.diagram.edit.parts.AttributeInequalityEditPart;
import dsltrans.diagram.edit.parts.AttributeRefAttributeRefEditPart;
import dsltrans.diagram.edit.parts.ClassRefClassRefEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.PositiveIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationEditPart;
import dsltrans.diagram.part.DsltransVisualIDRegistry;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class NegativeMatchClassItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NegativeMatchClassItemSemanticEditPolicy() {
		super(DsltransElementTypes.NegativeMatchClass_3009);
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
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == PositiveIndirectAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == NegativeIndirectAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == PositiveMatchAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == NegativeMatchAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == MatchMayBeSameRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(incomingLink) == ClassRefClassRefEditPart.VISUAL_ID) {
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
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == PositiveIndirectAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == NegativeIndirectAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == PositiveMatchAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == NegativeMatchAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsltransVisualIDRegistry.getVisualID(outgoingLink) == MatchMayBeSameRelationEditPart.VISUAL_ID) {
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
			case NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DsltransVisualIDRegistry.getVisualID(cnode)) {
					case MatchAttributeEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (DsltransVisualIDRegistry
									.getVisualID(incomingLink) == AttributeEqualityEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (DsltransVisualIDRegistry
									.getVisualID(incomingLink) == AttributeInequalityEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (DsltransVisualIDRegistry
									.getVisualID(incomingLink) == AttributeRefAttributeRefEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (DsltransVisualIDRegistry
									.getVisualID(outgoingLink) == AttributeEqualityEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (DsltransVisualIDRegistry
									.getVisualID(outgoingLink) == AttributeInequalityEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
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
		if (DsltransElementTypes.PositiveIndirectAssociation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PositiveIndirectAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.NegativeIndirectAssociation_4002 == req
				.getElementType()) {
			return getGEFWrapper(new NegativeIndirectAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.PositiveMatchAssociation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new PositiveMatchAssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.NegativeMatchAssociation_4004 == req
				.getElementType()) {
			return getGEFWrapper(new NegativeMatchAssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.MatchMayBeSameRelation_4017 == req
				.getElementType()) {
			return getGEFWrapper(new MatchMayBeSameRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.ClassRefClassRef_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DsltransElementTypes.PositiveIndirectAssociation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PositiveIndirectAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.NegativeIndirectAssociation_4002 == req
				.getElementType()) {
			return getGEFWrapper(new NegativeIndirectAssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.PositiveMatchAssociation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new PositiveMatchAssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.NegativeMatchAssociation_4004 == req
				.getElementType()) {
			return getGEFWrapper(new NegativeMatchAssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.MatchMayBeSameRelation_4017 == req
				.getElementType()) {
			return getGEFWrapper(new MatchMayBeSameRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsltransElementTypes.ClassRefClassRef_4014 == req.getElementType()) {
			return getGEFWrapper(new ClassRefClassRefCreateCommand(req,
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
		case PositiveIndirectAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new PositiveIndirectAssociationReorientCommand(
					req));
		case NegativeIndirectAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new NegativeIndirectAssociationReorientCommand(
					req));
		case PositiveMatchAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new PositiveMatchAssociationReorientCommand(
					req));
		case NegativeMatchAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new NegativeMatchAssociationReorientCommand(
					req));
		case MatchMayBeSameRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new MatchMayBeSameRelationReorientCommand(req));
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
		case ClassRefClassRefEditPart.VISUAL_ID:
			return getGEFWrapper(new ClassRefClassRefReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
