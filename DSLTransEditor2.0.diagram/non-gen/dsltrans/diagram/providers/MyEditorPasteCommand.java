package dsltrans.diagram.providers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

public class MyEditorPasteCommand extends AbstractCommand {

	EObject targetElement;

	private PasteTransactionalCommand pasteCmd;

	private IGraphicalEditPart targetGraphic;
	
	public MyEditorPasteCommand(String label, IGraphicalEditPart target) {
        super(label);
        this.targetElement = target.resolveSemanticElement();
        this.targetGraphic = target;
    }
	
	@Override
	protected CommandResult doExecuteWithResult(
			IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		
		TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(targetElement);
		this.pasteCmd = new PasteTransactionalCommand(domain, targetElement, this);
		
		this.pasteCmd.execute(progressMonitor, info);
		
		refreshDiagram();
		
		return CommandResult.newOKCommandResult();
	}

	private void refreshDiagram() {
		RootEditPart root = this.targetGraphic.getRoot();
		EditPart diagramEditPart = root.getContents();
		if (diagramEditPart.getModel() instanceof View) {
			EObject modelElement = ((View) diagramEditPart.getModel()).getElement();
			List editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(modelElement);
			for (Iterator it = editPolicies.iterator(); it.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
				nextEditPolicy.refresh();
			}
		}
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {
		
		return null;
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {
		
		return null;
	}

}
