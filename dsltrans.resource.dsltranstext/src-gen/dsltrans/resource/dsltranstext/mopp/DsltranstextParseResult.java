/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextParseResult implements dsltrans.resource.dsltranstext.IDsltranstextParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>> commands = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>>();
	
	public DsltranstextParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
