/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IPlResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public mprolog.resource.pl.IPlResourcePostProcessor getResourcePostProcessor();
	
}
