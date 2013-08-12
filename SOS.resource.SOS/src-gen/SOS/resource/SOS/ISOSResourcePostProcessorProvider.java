/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISOSResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public SOS.resource.SOS.ISOSResourcePostProcessor getResourcePostProcessor();
	
}
