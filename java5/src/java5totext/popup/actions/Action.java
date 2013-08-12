package java5totext.popup.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java5totext.input.JavaReader;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class Action implements IObjectActionDelegate {

	protected IJavaProject project = null;
	protected IPath path;
	
	/**
	 * Constructor for Action1.
	 */
	public Action() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	private static final String ENCODING_PROPERTY = "file.encoding";
	public void run(IAction action) {
		// calculate path of target model

		this.path = this.project.getProject().getLocation().addTrailingSeparator().append(
							this.project.getElementName()).addFileExtension("java5");
		
		// Building
//		Job job = new Job("Building Java5 model") {
//			@Override
//			protected IStatus run(IProgressMonitor monitor) {
				try {					
					Map<String, String> options = new HashMap<String, String>();			
					options.put(XMLResource.OPTION_ENCODING, System.getProperty(ENCODING_PROPERTY));	

					URI outputURI = URI.createFileURI(Action.this.path.toString());
					Resource resource = JavaReader.readModel(Action.this.project);
					resource.setURI(outputURI);
					try {
						resource.save(options);
					} catch (IOException e) {
					}
					
				}catch (Exception e) {

				} finally {
					try {
						Action.this.project.getCorrespondingResource().refreshLocal(1, null);
					} catch (Exception e1) {
						//give up
					}	
				}
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		// If a project is selected then set it as the project to use if action
		// is called
		IJavaElement je = (IJavaElement) ((IStructuredSelection) selection).getFirstElement();
		this.project = (IJavaProject)je.getAncestor(IJavaElement.JAVA_PROJECT);
		
		
	}	
	
}
