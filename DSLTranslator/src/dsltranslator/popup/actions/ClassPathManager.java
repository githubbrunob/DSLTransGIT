package dsltranslator.popup.actions;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;
import org.osgi.framework.Bundle;

public class ClassPathManager {

	private static final String TRANSFORMER_SYM_NAME = "Transformer2.0";
	public static final String JAVA_CLASS_PATH = "java.class.path";

	public void update() {
		System.out.println("Updating java class path...");

		String path = System.getProperty(JAVA_CLASS_PATH);

		System.out.println("Old classpath: " + path);

		Bundle transformerBundle = Platform.getBundle(TRANSFORMER_SYM_NAME);

		BundleDescription bundleDescription = Platform.getPlatformAdmin().getState().getBundle(transformerBundle.getBundleId());
		
		System.out.println("BUNDLE: " + transformerBundle.getSymbolicName());

		// String installPath =
		// Platform.getInstallLocation().getURL().getPath().toString();

		// System.out.println("installPath: " + installPath);

		List<String> slist = new LinkedList<String>();
		resolveRequires(transformerBundle, bundleDescription, slist);
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

	private void resolveRequires(Bundle bundle, BundleDescription bundleDescription, List<String> slist) {
		System.out.println("Resolving dependencies...");

		System.out.println("For bundle: " + bundle.getSymbolicName());
		
		for (BundleSpecification bundleSpec : bundleDescription.getRequiredBundles()) {
			
			String requiredBundleName = bundleSpec.getName();
			
			System.out.println("Required bundle name found: " + requiredBundleName);

			Bundle bd = findUniqueBundle(requiredBundleName);
			
			if (bd != null) {
				BundleDescription bdDescription = Platform.getPlatformAdmin().getState().getBundle(bd.getBundleId());
				System.out.println("Required bundle found: " + bd.getSymbolicName() + " " + bd.getVersion().toString());
				addBundlePath(bd, slist);
				resolveRequires(bd, bdDescription, slist);
			}
		}

		for (ImportPackageSpecification packageSpec : bundleDescription.getImportPackages()) {

			String requiredBundleName = packageSpec.getBundleSymbolicName();

			if (requiredBundleName != null) { // cgg requiredBundleName can be
												// null for packages
				System.out.println("Required bundle name found (by package): " + requiredBundleName);

				Bundle bd = findUniqueBundle(requiredBundleName);
				
				if (bd != null) {
					System.out.println("Required bundle found (by package): " + bd.getSymbolicName() + " " + bd.getVersion().toString());
					BundleDescription bdDescription = Platform.getPlatformAdmin().getState().getBundle(bd.getBundleId());
					addBundlePath(bd, slist);
					resolveRequires(bd, bdDescription, slist);
				}
			}
		}

		for (BundleDescription bdSpec : bundleDescription.getResolvedRequires()) {

			Bundle bd = findUniqueBundle(bdSpec.getSymbolicName());
			if (bd != null) {
				System.out.println("Required bundle found (by getResolvedRequires): " + bd.getSymbolicName() + " " + bd.getVersion().toString());
				
				addBundlePath(bd, slist);
				resolveRequires(bd, bdSpec, slist);
			}
		}

		System.out.println("Resolving dependencies... DONE");
	}

	private Bundle findUniqueBundle(String requiredBundleName) {
		Bundle result = Platform.getBundle(requiredBundleName);
		return result;
	}

	private void addBundlePath(Bundle bd, List<String> pathList) {
		try {
			if (bd != null) {
				File bundleLocation = FileLocator.getBundleFile(bd);
				String fs = bundleLocation.getAbsolutePath();
				System.out.println("Bundle file path: " + fs);

				if (!hasFile(pathList, fs)) {
					pathList.add(fs);
				} else {
					System.out.println("Already in file path.");
				}
			}
		} catch (IOException e) {
			// ignore.
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
