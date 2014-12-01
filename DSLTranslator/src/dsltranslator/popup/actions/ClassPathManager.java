package dsltranslator.popup.actions;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;
import org.eclipse.osgi.service.resolver.PlatformAdmin;
import org.eclipse.osgi.service.resolver.State;

public class ClassPathManager {

	private static final String TRANSFORMER_SYM_NAME = "Transformer2.0";
	public static final String JAVA_CLASS_PATH = "java.class.path";

	public void update() {
		System.out.println("Updating java class path...");

		String path = System.getProperty(JAVA_CLASS_PATH);

		System.out.println("Old classpath: " + path);

		PlatformAdmin pa = Platform.getPlatformAdmin();
		State platformAdminState = pa.getState();
		BundleDescription transformerBundleDescription = platformAdminState.getBundles(TRANSFORMER_SYM_NAME)[0];

		System.out.println("BUNDLE: " + transformerBundleDescription.getSymbolicName());
		
		String installPath = Platform.getInstallLocation().getURL().getPath().toString();
		
		List<String> slist = new LinkedList<String>();
		resolveRequires(transformerBundleDescription, slist, platformAdminState, installPath);
		for (String s : slist) {
			if (Platform.getOS().equals(Platform.OS_LINUX))
				path += ":" + s;
			else
				path += ";" + s;
		}

		System.out.println("New classpath: " + path);

		System.setProperty(JAVA_CLASS_PATH, path);

		System.out.println("Updating java class path... DONE");
	}

	private void resolveRequires(BundleDescription bundle, List<String> slist, State platformAdminState, String installPath) {
		System.out.println("Resolving dependencies...");
		
		System.out.println("For bundle: " + bundle.getSymbolicName());
		
		System.out.println("Is resolved: " + bundle.isResolved());
		
		for (BundleSpecification bundleSpec : bundle.getRequiredBundles()) {
			String requiredBundleName = bundleSpec.getName();
			
			System.out.println("Required bundle name found: " + requiredBundleName);

			BundleDescription bd = findUniqueBundle(requiredBundleName, platformAdminState);
			if (bd != null){
				System.out.println("Required bundle found: " + bd.getSymbolicName());
				addBundlePath(bd, slist, installPath);
				resolveRequires(bd, slist, platformAdminState, installPath);
			}
		}
		
		for (ImportPackageSpecification packageSpec : bundle.getImportPackages()) {
			
			String requiredBundleName = packageSpec.getBundleSymbolicName();
			
			System.out.println("Required bundle name found (by package): " + requiredBundleName);
			
			if (requiredBundleName != null) { // cgg requiredBundleName can be null for packages				
				BundleDescription bd = findUniqueBundle(requiredBundleName, platformAdminState);
				if (bd != null){
					System.out.println("Required bundle found (by package): " + bd.getSymbolicName());
					addBundlePath(bd, slist, installPath);
					resolveRequires(bd, slist, platformAdminState, installPath);
				}
			}
		}
		
		for (BundleDescription bd : bundle.getResolvedRequires()) {
			
			System.out.println("Required bundle found (by getResolvedRequires): " + bd.getSymbolicName());

			addBundlePath(bd, slist, installPath);
			resolveRequires(bd, slist, platformAdminState, installPath);
		}
		
		System.out.println("Resolving dependencies... DONE");
	}

	private BundleDescription findUniqueBundle(String requiredBundleName, State platformAdminState) {
		BundleDescription[] bundles = platformAdminState.getBundles(requiredBundleName);
		BundleDescription result = null;
		if (bundles.length == 1){
			result = bundles[0];
		}
		return result;
	}

	private void addBundlePath(BundleDescription bd, List<String> pathList, String installPath) {
		
		String bundleLocation = bd.getLocation().replaceFirst("reference:file:", "");
		
		System.out.println("Bundle location: " + bundleLocation);

		URI bundleLoc = URI.createURI("file:" + bundleLocation);
		if (bundleLoc.isRelative()){
			bundleLoc = URI.createURI("file:" + installPath + bd.getLocation());
		}
		
		String fs = bundleLoc.toFileString();
		
		System.out.println("Bundle file path: " + fs);
		
		if (fs!=null){
			File f = new File(fs);
			if (f.exists()){
				if (!hasFile(pathList, fs)) {
					pathList.add(fs);
				} else {
					System.out.println("Already in file path.");
				}
			} else {
				throw new InvalidPathException(fs, "Does not exist.");
			}
		}

	}

	private boolean hasFile(List<String> slist, String fs) {
		for (String s : slist) {
			if (s.equals(fs))
				return true;
		}
		return false;
	}

}
