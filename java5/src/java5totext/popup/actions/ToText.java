package java5totext.popup.actions;

import java.io.File;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

public class ToText implements IObjectActionDelegate {
	private MyConsole _myConsole = new MyConsole("Java5 to Text Output");

	private List<Object> _selectedFiles = new ArrayList<Object>();
	private IWorkbenchPage _page;

	private IConsoleView _view;
	/**
	 * Constructor for Action1.
	 */
	public ToText() {
		super();
	}

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
		IProject project = ((IFile) (_selectedFiles.get(0))).getProject();
		final String projectPath = project.getLocation().toString();
		final String filepath=((IFile) (_selectedFiles.get(0))).getLocation().toString();
		final File tempdir = new File(projectPath+"/tempClasses");
		tempdir.mkdir();
		
		Job job = new Job("Building Java5 model") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {		
				PrintStream out = System.out;
				PrintStream err = System.err;
		        System.setOut(getConsole().getOutStream());
		        System.setErr(getConsole().getErrStream());
				
				new ClassPathManager().update();		
		
				URL transformationurl = this.getClass().getResource("/model/java5.dsltrans");
				URL sourceurl = this.getClass().getResource("/model/java5.ecore");
				URL targeturl = this.getClass().getResource("/model/text.ecore");	
				
				TransformerProcessor tP = new TransformerProcessor(projectPath);
				try {
					tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
					tP.setFileURI("inputModel", filepath);
					tP.setMetaModelURI("inputModel", sourceurl.toURI().toASCIIString());
					tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output5", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output6", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output7", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output8", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("output9", targeturl.toURI().toASCIIString());
					tP.setFileURI("output1", "");
					tP.setFileURI("output2", "");
					tP.setFileURI("output3", "");
					tP.setFileURI("output4", "");
					tP.setFileURI("output5", "");
					tP.setFileURI("output6", "");
					tP.setFileURI("output7", "");					
					tP.setFileURI("output8", "");
					tP.setFileURI("output9", filepath+".text");
					tP.Execute();			
				} catch (URISyntaxException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (InvalidLayerRequirement e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TransformationSourceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TransformationLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		//triggers opening of the j2se5 model as soon as it is saved
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				new Text.methods.Serializer(projectPath,filepath+".text").Output();
				tempdir.delete();
			}
		});
		job.schedule();
		
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		_selectedFiles.clear();
		Iterator<?> theSet = ((IStructuredSelection) selection).iterator();
		while (theSet.hasNext()) {
			Object obj = theSet.next();
			if (obj instanceof IFile) {
				_selectedFiles.add(obj);
			}
		}
	}

	private void setConsole(MyConsole _myConsole) {
		this._myConsole = _myConsole;
	}

	private MyConsole getConsole() {
		return _myConsole;
	}	
	
}
