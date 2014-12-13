package dsltrans.diagram.providers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.clipboard.core.ClipboardSupportUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

public class PasteTransactionalCommand extends AbstractTransactionalCommand {

	private EObject targetElement;
	private MyEditorPasteCommand enclosingPasteCmd;

	public PasteTransactionalCommand(TransactionalEditingDomain domain, EObject targetElement,
			MyEditorPasteCommand pasteCmd) {

		super(domain, PasteTransactionalCommand.class.getName(),
				getWorkspaceFiles(MyEditorCopyCommand.objectToCopySingleton));
		this.targetElement = targetElement;
		this.enclosingPasteCmd = pasteCmd;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		// Remove elements whose container is getting copied.
		ClipboardSupportUtil
				.getCopyElements(MyEditorCopyCommand.objectToCopySingleton);

		// Perform the copy and update the references.
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		copier.copyAll(MyEditorCopyCommand.objectToCopySingleton);
		copier.copyReferences();

		// Add the duplicates to the original's container.
		for (Object originalObj : MyEditorCopyCommand.objectToCopySingleton) {
			EObject original = (EObject) originalObj;
			EObject duplicate = copier.get(original);

			EReference reference = original.eContainmentFeature();
			if (reference != null
					&& FeatureMapUtil.isMany(this.targetElement, reference)
					&& ClipboardSupportUtil.isOkToAppendEObjectAt(
							this.targetElement, reference, duplicate)) {
				ClipboardSupportUtil.appendEObjectAt(this.targetElement,
						reference, duplicate);
			}
		}

		return CommandResult.newOKCommandResult();
	}

	public void addContext(IUndoContext context) {
		super.addContext(context);
		this.enclosingPasteCmd.addContext(context);
	}
}
