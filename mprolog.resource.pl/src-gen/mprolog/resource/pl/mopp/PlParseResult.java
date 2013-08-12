/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlParseResult implements mprolog.resource.pl.IPlParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>> commands = new java.util.ArrayList<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>>();
	
	public PlParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
