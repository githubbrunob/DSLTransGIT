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

import dsltrans.MatchClass;
import dsltrans.MatchModel;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.diagram.edit.policies.DsltransBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NegativeIndirectAssociationReorientCommand extends
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
	public NegativeIndirectAssociationReorientCommand(
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
		if (false == getElementToEdit() instanceof NegativeIndirectAssociation) {
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
		if (!(oldEnd instanceof MatchClass && newEnd instanceof MatchClass)) {
			return false;
		}
		MatchClass target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MatchModel)) {
			return false;
		}
		MatchModel container = (MatchModel) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNegativeIndirectAssociation_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MatchClass && newEnd instanceof MatchClass)) {
			return false;
		}
		MatchClass source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MatchModel)) {
			return false;
		}
		MatchModel container = (MatchModel) getLink().eContainer();
		return DsltransBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNegativeIndirectAssociation_4002(container, getLink(),
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
	protected NegativeIndirectAssociation getLink() {
		return (NegativeIndirectAssociation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MatchClass getOldSource() {
		return (MatchClass) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MatchClass getNewSource() {
		return (MatchClass) newEnd;
	}

	/**
	 * @generated
	 */
	protected MatchClass getOldTarget() {
		return (MatchClass) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MatchClass getNewTarget() {
		return (MatchClass) newEnd;
	}
}
