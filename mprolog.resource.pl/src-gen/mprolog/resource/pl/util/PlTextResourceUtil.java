/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.util;

/**
 * Class PlTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * mprolog.resource.pl.util.PlResourceUtil.
 */
public class PlTextResourceUtil {
	
	@Deprecated	
	public static mprolog.resource.pl.mopp.PlResource getResource(org.eclipse.core.resources.IFile file) {
		return mprolog.resource.pl.util.PlResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static mprolog.resource.pl.mopp.PlResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return mprolog.resource.pl.util.PlResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static mprolog.resource.pl.mopp.PlResource getResource(org.eclipse.emf.common.util.URI uri) {
		return mprolog.resource.pl.util.PlResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static mprolog.resource.pl.mopp.PlResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return mprolog.resource.pl.util.PlResourceUtil.getResource(uri, options);
	}
	
}
