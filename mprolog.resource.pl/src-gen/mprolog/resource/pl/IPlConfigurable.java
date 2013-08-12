/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface IPlConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(java.util.Map<?,?> options);
}
