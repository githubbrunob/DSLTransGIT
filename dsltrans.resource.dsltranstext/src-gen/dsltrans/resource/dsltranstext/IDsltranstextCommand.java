/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IDsltranstextCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
