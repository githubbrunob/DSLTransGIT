/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui;

public class PlHoverTextProvider implements mprolog.resource.pl.IPlHoverTextProvider {
	
	private mprolog.resource.pl.ui.PlDefaultHoverTextProvider defaultProvider = new mprolog.resource.pl.ui.PlDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
