package java5totext.popup.actions;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.framework.internal.core.AbstractBundle;
import org.eclipse.osgi.framework.internal.core.BundleHost;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class ClassPathManager {
	
	public void update() {
		String path = System.getProperty("java.class.path");
		Bundle[] bundles = Platform.getBundles("Transformer2.0", null);
		for(Bundle bundle : bundles) {
			System.out.println(bundle.getSymbolicName());
			List<String> slist = new LinkedList<String>();
			
			resolveRequires(((AbstractBundle) bundle).getBundleDescription(),slist);
			for(String s:slist){
				if(Platform.getOS().equals(Platform.OS_LINUX))
					path += ":"+s;
				else
					path += ";"+s;
			}
			System.setProperty("java.class.path", path);			
		}		
	}
	
	private void resolveRequires(BundleDescription b, List<String> slist) {
		for(BundleDescription bd : b.getResolvedRequires()) {
			//URI loc = URI.createURI(bd.getLocation().replaceFirst("reference:file:/", ""));
			String fs = bd.getLocation().replaceFirst("reference:file:", "");
			
			if(!new File(fs).exists())
				fs = "."+fs;
			if(new File(fs).exists() && !hasFile(slist,fs)) {
				System.out.println("//// "+fs);				
				slist.add(fs);
			}
			resolveRequires(bd,slist);
		}
	}

	private boolean hasFile(List<String> slist, String fs) {
		for(String s:slist){
			if(s.equals(fs))
				return true;
		}
		return false;
	}
	
}
