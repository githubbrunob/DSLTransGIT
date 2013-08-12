package mprolog.popup.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
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

import Text.methods.Serializer;

import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;

public class Serialize implements IObjectActionDelegate {
	private Shell shell;
	private IFile _selectedFile;
	private MyConsole _myConsole = new MyConsole(MyConsole.CONSOLE_NAME);
	private IWorkbenchPage _page = null;
	private IConsoleView _view=null;

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		_page = targetPart.getSite().getPage();
		ConsolePlugin plugin = ConsolePlugin.getDefault();
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

	public String transformToText(
			final String projectPath, final String filepath) {
		return new mprolog.methods.Methods().transformToText(projectPath, filepath);
	}

	public void serializeToFiles(String projectPath, String outfilepath) {
		new Text.methods.Serializer(projectPath,outfilepath).Output();
	}

	

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
//		MessageDialog.openInformation(
//			shell,
//			"DlstransAnalysis",
//			"Analyse was executed.");
		if (_selectedFile == null)
			return;
		final IProject project = _selectedFile.getProject();
		final String projectPath = project.getLocation().toString();
//		System.out.println("projectpath: "+projectPath);
		final String filepath=_selectedFile.getLocation().toString();
//		System.out.println("filepath: "+filepath);
		final File tempdir = new File(projectPath+"/tempClasses");
		tempdir.mkdir();

		
		final Job job = new Job("Writing .pl file...") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				PrintStream out = System.out;
				PrintStream err = System.err;
		        System.setOut(getConsole().getOutStream());
		        System.setErr(getConsole().getErrStream());

				new ClassPathManager().update();
				
				String outfilepath = transformToText(projectPath, filepath);				
				serializeToFiles(projectPath, outfilepath);
		        System.setOut(out);
		        System.setErr(err);

		        return Status.OK_STATUS;
			}
		};

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {

			}
		});
		job.schedule();

		
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		Object obj = ((IStructuredSelection) selection).getFirstElement();
		if (obj instanceof IFile){
			if (((IFile)obj).getName().endsWith(".mprolog"))
				_selectedFile = (IFile)obj;
			else
				_selectedFile = null;
		}
		else
			_selectedFile = null;
	}

	private void setConsole(MyConsole _myConsole) {
		this._myConsole = _myConsole;
	}

	private MyConsole getConsole() {
		return _myConsole;
	}
}
