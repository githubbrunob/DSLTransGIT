/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.util;

/**
 * Class SOSTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * SOS.resource.SOS.util.SOSResourceUtil.
 */
public class SOSTextResourceUtil {
	
	@Deprecated	
	public static SOS.resource.SOS.mopp.SOSResource getResource(org.eclipse.core.resources.IFile file) {
		return SOS.resource.SOS.util.SOSResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static SOS.resource.SOS.mopp.SOSResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return SOS.resource.SOS.util.SOSResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static SOS.resource.SOS.mopp.SOSResource getResource(org.eclipse.emf.common.util.URI uri) {
		return SOS.resource.SOS.util.SOSResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static SOS.resource.SOS.mopp.SOSResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return SOS.resource.SOS.util.SOSResourceUtil.getResource(uri, options);
	}
	
}
