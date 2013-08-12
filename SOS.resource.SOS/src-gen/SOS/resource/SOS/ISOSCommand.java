/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISOSCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
