/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IDsltranstextResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public dsltrans.resource.dsltranstext.IDsltranstextResourcePostProcessor getResourcePostProcessor();
	
}
