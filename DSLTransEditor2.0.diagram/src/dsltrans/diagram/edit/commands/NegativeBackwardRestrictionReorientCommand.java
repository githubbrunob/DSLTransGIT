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
import dsltrans.NegativeBackwardRestriction;
import dsltrans.PositiveMatchClass;
import dsltrans.Rule;
import dsltrans.diagram.edit.policies.DsltransBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NegativeBackwardRestrictionReorientCommand extends
		EditElementCommand {

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
	public NegativeBackwardRestrictionReorientCommand(
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
		if (false == getElementToEdit() instanceof NegativeBackwardRestriction) {
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
		if (!(oldEnd instanceof PositiveMatchClass && newEnd instanceof PositiveMatchClass)) {
			return false;
		}
		ApplyClass target = getLink().getTargetClass();
		if (!(getLink().eContainer() instanceof Rule)) {
			return false;
		}
		Rule container = (Rule) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNegativeBackwardRestriction_4007(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ApplyClass && newEnd instanceof ApplyClass)) {
			return false;
		}
		PositiveMatchClass source = getLink().getSourceClass();
		if (!(getLink().eContainer() instanceof Rule)) {
			return false;
		}
		Rule container = (Rule) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNegativeBackwardRestriction_4007(container, getLink(),
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
		getLink().setSourceClass(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetClass(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected NegativeBackwardRestriction getLink() {
		return (NegativeBackwardRestriction) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PositiveMatchClass getOldSource() {
		return (PositiveMatchClass) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PositiveMatchClass getNewSource() {
		return (PositiveMatchClass) newEnd;
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
