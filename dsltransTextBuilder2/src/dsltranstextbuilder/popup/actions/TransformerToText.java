package dsltranstextbuilder.popup.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;

import util.MyConsole;

public class TransformerToText implements IObjectActionDelegate {

	private Shell shell;
	private IFile selection;
	private MyConsole _myConsole = new MyConsole(MyConsole.CONSOLE_NAME);
	private IWorkbenchPage _page = null;
	private IConsoleView _view=null;

	
	/**
	 * Constructor for Action1.
	 */
	public TransformerToText() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		_page = targetPart.getSite().getPage();
		ConsolePlugin	 plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		conMan.addConsoles(new IConsole[]{getConsole()});
		showConsole();

	}

	private void showConsole() {
		try {
			_view = (IConsoleView) _page.showView(IConsoleConstants.ID_CONSOLE_VIEW);
			_view.display(getConsole());			
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
        System.setOut(getConsole().getOutStream());
        System.setErr(getConsole().getErrStream());
    	String projectPath = selection.getProject().getLocation().toString();
    	String fileName = selection.getName();
		String tempPath = new util.PreProcessor(projectPath, fileName).perform();
		
		try {
			
			String dsltranstextFileName = new util.TransformerToText(projectPath, tempPath, fileName).perform();
			new util.PosProcessor(projectPath,dsltranstextFileName).perform();
			
			new File(tempPath).delete();
			
			try {
				selection.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				System.err.println("Couldn't refresh the project. Refresh it manually, please.");
			}	
			
			MessageDialog.openInformation(
					shell,
					"DsltransTextBuilder",
					"Transformation to Textual Syntax Concluded.");
			
		} catch (IOException e) {
			System.err.println("Fatal error.");
		}
		
		System.out.flush();
		System.err.flush();
		
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
		if (selectedObject instanceof IFile &&
				((IFile)selectedObject).getName().endsWith(".dsltrans"))
				this.selection = (IFile)selectedObject;
			else
				this.selection = null;
	}

	private MyConsole getConsole() {
		return _myConsole;
	}

	
}
