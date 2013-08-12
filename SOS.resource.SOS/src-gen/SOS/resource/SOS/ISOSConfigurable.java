/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface ISOSConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(java.util.Map<?,?> options);
}
