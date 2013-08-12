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

import dsltrans.ApplyClass;
import dsltrans.ApplyMayBeSameRelation;
import dsltrans.ApplyModel;
import dsltrans.diagram.edit.policies.DsltransBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ApplyMayBeSameRelationReorientCommand extends EditElementCommand {

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
	public ApplyMayBeSameRelationReorientCommand(
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
		if (false == getElementToEdit() instanceof ApplyMayBeSameRelation) {
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
		if (!(oldEnd instanceof ApplyClass && newEnd instanceof ApplyClass)) {
			return false;
		}
		ApplyClass target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ApplyModel)) {
			return false;
		}
		ApplyModel container = (ApplyModel) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistApplyMayBeSameRelation_4018(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ApplyClass && newEnd instanceof ApplyClass)) {
			return false;
		}
		ApplyClass source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ApplyModel)) {
			return false;
		}
		ApplyModel container = (ApplyModel) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistApplyMayBeSameRelation_4018(container, getLink(),
						source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ApplyMayBeSameRelation getLink() {
		return (ApplyMayBeSameRelation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ApplyClass getOldSource() {
		return (ApplyClass) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ApplyClass getNewSource() {
		return (ApplyClass) newEnd;
	}

	/**
	 * @generated
	 */
	protected ApplyClass getOldTarget() {
		return (ApplyClass) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ApplyClass getNewTarget() {
		return (ApplyClass) newEnd;
	}
}
