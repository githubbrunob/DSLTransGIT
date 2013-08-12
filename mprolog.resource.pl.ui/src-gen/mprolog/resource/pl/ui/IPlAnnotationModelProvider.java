/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui;

/**
 * A provider for annotation models.
 */
public interface IPlAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
