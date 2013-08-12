/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IPlParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>> getPostParseCommands();
	
}
