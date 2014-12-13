package dsltrans.diagram.providers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

public class MyEditorClipboardSupportGlobalActionHandler extends
		DiagramGlobalActionHandler {

	@Override
	protected boolean canPaste(IGlobalActionContext cntxt) {
		boolean onlyOneTarget = onlyOneElementIsSelected(cntxt);
		
		/*
		if (onlyOneTarget){
			if (MyEditorCopyCommand.objectToCopySingleton != null){
				EObject elementToPaste = (EObject) MyEditorCopyCommand.objectToCopySingleton.get(0);
				EObject elementToPastIn = (EObject) this.getSelectedElements(cntxt.getSelection()).get(0);
				
				if (elementToPastIn instanceof Layer) {
					if (elementToPaste instanceof Rule){
						result = true;
					}
				}
			}
		}
		*/
		
		return onlyOneTarget;
	}
	
	@Override
	protected boolean canCopy(IGlobalActionContext cntxt) {
		
		boolean precondition = super.canCopy(cntxt) && onlyOneElementIsSelected(cntxt);
		
		/*
		if (precondition){
			EObject elementToCopy = (EObject) this.getSelectedElements(cntxt.getSelection()).get(0);
			if (elementToCopy instanceof Layer 
					|| elementToCopy instanceof Rule
					|| elementToCopy instanceof MatchClass
					|| elementToCopy instanceof ApplyClass){
				result = true;
			}
		}
		*/
		
		return precondition;
	}

	private boolean onlyOneElementIsSelected(IGlobalActionContext cntxt) {
		return this.getSelectedElements(cntxt.getSelection()).size() == 1;
	}

	public ICommand getCommand(IGlobalActionContext cntxt) {
		IWorkbenchPart part = cntxt.getActivePart();
		if (!(part instanceof IDiagramWorkbenchPart)) {
			return null;
		}
		IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) part;
		org.eclipse.gmf.runtime.common.core.command.ICommand command = null;
		String actionId = cntxt.getActionId();
		if (actionId.equals(GlobalActionId.DELETE)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.COPY)) {
			command = getCopyCommand(cntxt, diagramPart, false);
		} else if (actionId.equals(GlobalActionId.OPEN)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PASTE)) {
			command = getPasteCommand(cntxt, diagramPart);
		} else if (actionId.equals(GlobalActionId.SAVE)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PROPERTIES)) {
			super.getCommand(cntxt);
		}
		return command;
	}

	protected ICommand getCopyCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart, final boolean isUndoable) {
		List toCopyElements = this.getSelectedElements(cntxt.getSelection());
		MyEditorCopyCommand copyCmd = new MyEditorCopyCommand("Copy", toCopyElements);
		return copyCmd;
	}

	private ICommand getPasteCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart) {
		return new MyEditorPasteCommand("Paste",
				(IGraphicalEditPart) ((StructuredSelection) cntxt
						.getSelection()).getFirstElement());
	}

	// These are 2 utilitary methods:
	protected List getSelectedElements(ISelection selection) {
		List results = new LinkedList();
		if (selection == null || selection.isEmpty())
			return results;
		Iterator iterator = ((IStructuredSelection) selection).iterator();
		while (iterator.hasNext()) {
			Object selectedElement = iterator.next();
			EObject element = (EObject) ((EditPart) selectedElement)
					.getAdapter(EObject.class);
			results.add(element);
		}
		return results;
	}

	private List getSelectedEditParts(ISelection selection)

	{
		List results = new LinkedList();
		Iterator iterator = ((IStructuredSelection) selection).iterator();
		while (iterator.hasNext()) {
			Object selectedElement = iterator.next();
			results.add((EditPart) selectedElement);
		}
		return results;
	}

}
