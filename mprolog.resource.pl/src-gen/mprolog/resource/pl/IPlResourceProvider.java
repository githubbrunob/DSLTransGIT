/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IPlResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public mprolog.resource.pl.IPlTextResource getResource();
	
}
