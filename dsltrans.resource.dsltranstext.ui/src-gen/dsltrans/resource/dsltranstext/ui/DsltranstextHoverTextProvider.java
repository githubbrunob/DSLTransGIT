/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

public class DsltranstextHoverTextProvider implements dsltrans.resource.dsltranstext.IDsltranstextHoverTextProvider {
	
	private dsltrans.resource.dsltranstext.ui.DsltranstextDefaultHoverTextProvider defaultProvider = new dsltrans.resource.dsltranstext.ui.DsltranstextDefaultHoverTextProvider();
	
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
