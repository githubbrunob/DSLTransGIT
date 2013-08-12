package sosbuilder.popup.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

import jpl.Query;
import jpl.Util;

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

import com.sun.tools.javac.util.Pair;

public class GetTransitionSystem implements IObjectActionDelegate {

	private Shell shell;
	private IFile _selectedInputFile = null;
	private IFile _selectedSOSFile = null;
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
	 * Constructor for Action1.
	 */
	public GetTransitionSystem() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (_selectedSOSFile == null || _selectedInputFile == null)
			return;
		final IProject project = _selectedSOSFile.getProject();
		final String projectPath = project.getLocation().toString();

		final String SOSfilepath=_selectedSOSFile.getLocation().toString();
		final String SOSfilename = _selectedSOSFile.getName();

		final String Inputfilepath=_selectedInputFile.getLocation().toString();
		final String Inputfilename = _selectedInputFile.getName();

		final File tempdir = new File(projectPath+"/tempClasses");
		tempdir.mkdir();
		
		final Job job = new Job("Generating Transition System...") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {		
				PrintStream out = System.out;
				PrintStream err = System.err;
		        System.setOut(getConsole().getOutStream());
		        System.setErr(getConsole().getErrStream());
	
		        new ClassPathManager().update();
			
				if(!checkBuildSOSFile(projectPath, SOSfilepath)) return Status.CANCEL_STATUS;
				if(!checkBuildInputFile(projectPath, Inputfilepath, Inputfilename)) return Status.CANCEL_STATUS;
				
				try {
					jpl.JPL.init();
					InputStream sosfundamentals = this.getClass().getResourceAsStream("/model/sosfundamentals.pl");
					FileWriter fw = new FileWriter(projectPath+"/tempClasses/sosfundamentals.pl");
					BufferedWriter bw = new BufferedWriter(fw);
					if(sosfundamentals.available() > 0) {
						Scanner scan = new Scanner(sosfundamentals);
						while(scan.hasNextLine()) {
							bw.write(scan.nextLine()+"\n");
						}
						bw.close();
						System.out.println("querying: "+projectPath+"/tempClasses/sosfundamentals.pl");
						new Query(Util.textToTerm("consult('"+projectPath+"/tempClasses/sosfundamentals.pl"+"')")).oneSolution();
						File f = new File(projectPath+"/tempClasses/sosfundamentals.pl");
						f.delete();
					}
					System.out.println("querying: "+SOSfilepath+".pl");					
					new Query(Util.textToTerm("consult('"+SOSfilepath+".pl')")).oneSolution();
					System.out.println("querying: "+Inputfilepath+".pl");					
					new Query(Util.textToTerm("consult('"+Inputfilepath+".pl')")).oneSolution();
					System.out.println("querying outputFixPoint...");
					new Query(Util.textToTerm("outputFixPoint('"+Inputfilepath+"','"+Inputfilename.replace(".", "_")+"').")).oneSolution();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				System.setOut(out);
		        System.setErr(err);

		        return Status.OK_STATUS;				
			}

			private boolean checkBuildInputFile(String projectPath,
					String Inputfilepath, String Inputfilename) {
				System.out.println("Checking Input file: " + Inputfilepath+".pl ...");
				File InputFilePL = new File(Inputfilepath+".pl");
				if(!InputFilePL.exists()) {
					System.out.println(
							"SOSBuilder " + 
							"Compiling prolog file from Input file.");

					String directory = new File(Inputfilepath).getParentFile().getPath();
					// load the input model - its in the filepath
					Pair<String,String> p = new mprolog.methods.Methods().
								getRootAndMetaModel(Inputfilepath);
					if(p.snd.isEmpty()) {
						System.err.println("Not a valid input file: " + Inputfilepath + " >> missing Metamodel information.");
						return false;
					}
					String transformationFile = directory+"\\"+p.fst+".dsltrans";
					System.out.println("Trying to load transformation: "+ transformationFile);
					if(!new File(transformationFile).exists()) {
						System.out.println("Building transformation file: "+ transformationFile);
						new mprolog.methods.Methods().transformToMPrologDSLTrans(projectPath, directory+"\\"+p.fst);
					}
					System.out.println("\t"+ transformationFile + ": Check!");
					System.out.println("Compiling to MPrologTermReference...");
					new mprolog.methods.Methods().
						transformAnyToMPrologTR(projectPath,Inputfilepath);
					System.out.println("Changing FileName...");
					mprolog.methods.Methods.changeFileName(Inputfilename, Inputfilepath+".mprologTR");
					System.out.println("Compiling to MProlog...");
					String filepath1 = new mprolog.methods.Methods().
						transformToMProlog(projectPath, Inputfilepath+".mprologTR");
					System.out.println("Compiling to Text...");				
					filepath1 = new mprolog.methods.Methods().
							transformToText(projectPath, filepath1);
					System.out.println("Serializing to file...");				
					new Text.methods.Serializer(projectPath,filepath1).Output();
					if(!InputFilePL.exists()) {
						System.err.println("Something Wrong happened with the building of the file: "+Inputfilepath+".pl");
						return false;
					}					
				}
				System.out.println("\t"+ Inputfilepath+".pl" + ": Check!");
				return true;
			}

			private boolean checkBuildSOSFile(final String projectPath,
					final String SOSfilepath) {
				System.out.println("Checking SOS file: " + SOSfilepath+".pl ...");
				File SOSFilePL = new File(SOSfilepath+".pl");
				if(!SOSFilePL.exists()) {
					System.out.println(
							"SOSBuilder " + 
							"Compiling prolog file from SOS specification.");
					new sosbuilder.Methods().compileToProlog(projectPath, SOSfilepath);
					if(!SOSFilePL.exists()) {
						System.err.println("Something Wrong happened with the building of the file: "+SOSfilepath+".pl");
						return false;
					}
				}
				System.out.println("\t"+ SOSfilepath+".pl" + ": Check!");
				return true;
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
		Iterator<?> iter = ((IStructuredSelection) selection).iterator();
		_selectedSOSFile = _selectedInputFile = null;
		while(iter.hasNext()) {
			Object obj = iter.next();
			if(obj instanceof IFile){
				if (((IFile)obj).getName().endsWith(".SOS"))
					_selectedSOSFile = (IFile)obj;
				if (((IFile)obj).getName().endsWith(".xmi"))
					_selectedInputFile = (IFile)obj;
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
