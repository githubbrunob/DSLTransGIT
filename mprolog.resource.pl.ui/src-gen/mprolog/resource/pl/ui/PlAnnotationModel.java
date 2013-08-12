/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui;

public class PlAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public PlAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new mprolog.resource.pl.ui.PlMarkerAnnotation(marker);
	}
	
}
