/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSParseResult implements SOS.resource.SOS.ISOSParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>> commands = new java.util.ArrayList<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>>();
	
	public SOSParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
