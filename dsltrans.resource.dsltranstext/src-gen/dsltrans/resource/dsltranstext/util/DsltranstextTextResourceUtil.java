/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.util;

/**
 * Class DsltranstextTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * dsltrans.resource.dsltranstext.util.DsltranstextResourceUtil.
 */
public class DsltranstextTextResourceUtil {
	
	@Deprecated	
	public static dsltrans.resource.dsltranstext.mopp.DsltranstextResource getResource(org.eclipse.core.resources.IFile file) {
		return dsltrans.resource.dsltranstext.util.DsltranstextResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static dsltrans.resource.dsltranstext.mopp.DsltranstextResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return dsltrans.resource.dsltranstext.util.DsltranstextResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static dsltrans.resource.dsltranstext.mopp.DsltranstextResource getResource(org.eclipse.emf.common.util.URI uri) {
		return dsltrans.resource.dsltranstext.util.DsltranstextResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static dsltrans.resource.dsltranstext.mopp.DsltranstextResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return dsltrans.resource.dsltranstext.util.DsltranstextResourceUtil.getResource(uri, options);
	}
	
}
