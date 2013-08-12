/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IDsltranstextParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>> getPostParseCommands();
	
}
