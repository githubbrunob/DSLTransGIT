package dsltranslator.popup.actions;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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

import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;

public class GenIdentityAction implements IObjectActionDelegate {

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
	
	public void run(IAction action) {
		if (_selectedFile == null)
			return;
		final IProject project = _selectedFile.getProject();
		final String projectPath = project.getLocation().toString();
		final String filepath=_selectedFile.getLocation().toString();
//		System.out.println("filepath: "+filepath);
		final File tempdir = new File(projectPath+"/tempClasses");
		tempdir.mkdir();

		Job job = new Job("Generate Identity Transformation") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {		
				PrintStream out = System.out;
				PrintStream err = System.err;
		        System.setOut(getConsole().getOutStream());
		        System.setErr(getConsole().getErrStream());
				new ClassPathManager().update();
		
				URL transformationurl = this.getClass().getResource("/model/GenIdentity.dsltrans");
				URL sourceurl = this.getClass().getResource("/model/Ecore.ecore");
				URL targeturl = this.getClass().getResource("/model/DSLTrans.ecore");				
				TransformerProcessor tP = new TransformerProcessor(projectPath);
				try {
					tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
					tP.setFileURI("input", filepath);
					tP.setMetaModelURI("input", sourceurl.toURI().toASCIIString());
					tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());					
					
					tP.setFileURI("output4", filepath+".dsltrans");
					tP.Execute();			
				} catch (Throwable e) {
					e.printStackTrace();
					System.err.println(e.getMessage());
				}
		        System.setOut(out);
		        System.setErr(err);
				return Status.OK_STATUS;
			}
		};
		//triggers opening of the j2se5 model as soon as it is saved
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				tempdir.delete();
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
			if (((IFile)obj).getName().endsWith(".ecore"))
				_selectedFile = (IFile)obj;
			else
				_selectedFile = null;
		}
		else
			_selectedFile = null;
	}

	private MyConsole getConsole() {
		return _myConsole;
	}

}
