/*
 * 
 */
package dsltrans.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dsltrans.Attribute;
import dsltrans.AttributeInequality;
import dsltrans.Rule;
import dsltrans.diagram.edit.policies.DsltransBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AttributeInequalityReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AttributeInequalityReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AttributeInequality) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof Attribute)) {
			return false;
		}
		Attribute target = getLink().getTargetAttribute();
		if (!(getLink().eContainer() instanceof Rule)) {
			return false;
		}
		Rule container = (Rule) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttributeInequality_4016(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof Attribute)) {
			return false;
		}
		Attribute source = getLink().getSourceAttribute();
		if (!(getLink().eContainer() instanceof Rule)) {
			return false;
		}
		Rule container = (Rule) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttributeInequality_4016(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSourceAttribute(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetAttribute(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AttributeInequality getLink() {
		return (AttributeInequality) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Attribute getOldSource() {
		return (Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute getNewSource() {
		return (Attribute) newEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute getOldTarget() {
		return (Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute getNewTarget() {
		return (Attribute) newEnd;
	}
}
