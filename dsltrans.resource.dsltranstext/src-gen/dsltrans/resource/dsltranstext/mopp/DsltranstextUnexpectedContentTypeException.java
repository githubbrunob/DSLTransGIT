/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see dsltrans.resource.dsltranstext.IDsltranstextOptions.RESOURCE_CONTENT_TYPE
 */
public class DsltranstextUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  DsltranstextUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
