/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

public class SOSHoverTextProvider implements SOS.resource.SOS.ISOSHoverTextProvider {
	
	private SOS.resource.SOS.ui.SOSDefaultHoverTextProvider defaultProvider = new SOS.resource.SOS.ui.SOSDefaultHoverTextProvider();
	
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
