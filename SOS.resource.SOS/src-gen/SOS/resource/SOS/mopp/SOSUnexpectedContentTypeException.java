/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see SOS.resource.SOS.ISOSOptions.RESOURCE_CONTENT_TYPE
 */
public class SOSUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SOSUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
