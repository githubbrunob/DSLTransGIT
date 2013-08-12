package dsltransanalysis.popup.actions;

import java.io.File;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;

import mprolog.methods.Methods;

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

import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;

public class DSLTransAnalyser implements IObjectActionDelegate {
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
		final String filename = _selectedFile.getName();
//		System.out.println("filepath: "+filepath);
		final File tempdir = new File(projectPath+"/tempClasses");
		tempdir.mkdir();

		
		final Job job = new Job("Generating relational model for analysis...") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				PrintStream out = System.out;
				PrintStream err = System.err;
		        System.setOut(getConsole().getOutStream());
		        System.setErr(getConsole().getErrStream());

				new ClassPathManager().update();
				
				String outfilepath = transformToMPrologTermReference(projectPath, filepath);				
				Methods.genIds(outfilepath+".mprologTR");
				serialize(projectPath, 
						transformToText(
								projectPath,
								transformToMProlog(
										projectPath, 
										outfilepath+".mprologTR"
								)
						)
				);
		        System.setOut(out);
		        System.setErr(err);

		        return Status.OK_STATUS;
			}

			private String transformToMPrologTermReference(
					final String projectPath, final String filepath) {
				URL transformationurl = this.getClass().getResource("/model/DSLTrans.ecore.dsltrans");
				URL sourceurl = this.getClass().getResource("/model/DSLTrans.ecore");
				URL targeturl = this.getClass().getResource("/model/mprologTermReference.ecore");	
				String outfilepath = filepath + ".mprologTR";
				try {
					System.out.println("Generating intermediate files..."+" "+transformationurl.toURI().toASCIIString()+" "+filepath+" "+outfilepath);
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				TransformerProcessor tP = new TransformerProcessor(projectPath);
				try {
					tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
					tP.setFileURI("inputModel", filepath);
					tP.setMetaModelURI("inputModel", sourceurl.toURI().toASCIIString());
					tP.setMetaModelURI("Model", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("Entities", targeturl.toURI().toASCIIString());						
					tP.setMetaModelURI("Associations", targeturl.toURI().toASCIIString());
					tP.setMetaModelURI("AssociationsFinal", targeturl.toURI().toASCIIString());
					tP.setFileURI("Model", "");
					tP.setFileURI("Entities", "");
					tP.setFileURI("Associations", "");
					tP.setFileURI("AssociationsFinal", outfilepath);
					tP.Execute();
					
				} catch (InvalidLayerRequirement e) {
					e.printStackTrace();
				} catch (TransformationSourceException e) {
					e.printStackTrace();
				} catch (TransformationLayerException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return outfilepath;
			}
			
			private String transformToMProlog(
					final String projectPath, final String filepath) {
				return new mprolog.methods.Methods().transformToMProlog(
						projectPath, filepath);
			}

			private String transformToText(
					final String projectPath, final String filepath) {
				return new mprolog.methods.Methods().transformToText(projectPath, filepath);
			}
			
		};

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {

			}
		});
		job.schedule();

		
		
	}

	protected void serialize(String projectPath, String outfilepath) {
		new Text.methods.Serializer(projectPath,outfilepath).Output();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		Object obj = ((IStructuredSelection) selection).getFirstElement();
		if (obj instanceof IFile){
			if (((IFile)obj).getName().endsWith(".dsltrans"))
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
