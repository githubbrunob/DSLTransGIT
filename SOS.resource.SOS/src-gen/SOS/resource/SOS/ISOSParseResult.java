/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ISOSParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>> getPostParseCommands();
	
}
