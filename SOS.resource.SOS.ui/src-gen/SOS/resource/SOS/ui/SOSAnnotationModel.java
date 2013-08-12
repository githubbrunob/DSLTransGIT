/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

public class SOSAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public SOSAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new SOS.resource.SOS.ui.SOSMarkerAnnotation(marker);
	}
	
}
