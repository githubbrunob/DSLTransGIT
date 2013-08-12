package dsltranslator.popup.actions;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.framework.internal.core.BundleHost;
import org.eclipse.osgi.service.resolver.BundleDescription;

@SuppressWarnings("restriction")
public class ClassPathManager {
	
	public void update(){
		String path = System.getProperty("java.class.path");		

		BundleHost b = (BundleHost)Platform.getBundle("Transformer2.0");
		System.out.println("BUNDLE: "+b.getSymbolicName());
		
		List<String> slist = new LinkedList<String>();
		resolveRequires(b.getBundleDescription(),slist);
		for(String s:slist){
			if(Platform.getOS().equals(Platform.OS_LINUX))
				path += ":"+s;
			else
				path += ";"+s;
		}
		System.setProperty("java.class.path", path);
	}
	
	private void resolveRequires(BundleDescription b, List<String> slist) {
		for(BundleDescription bd : b.getResolvedRequires()) {
			//System.out.println("INSTALL: "+Platform.getInstallLocation().getURL().getPath().toString());
			String installPath = Platform.getInstallLocation().getURL().getPath().toString();
//			System.out.println("LOCATION: "+"file:"+installPath+bd.getLocation().replaceFirst("reference:file:",""));
//			System.out.println(bd.getLocation());
			URI loc = URI.createURI("file:"+installPath+bd.getLocation().replaceFirst("reference:file:",""));
//			System.out.println("LOC: "+loc.toFileString());
			String fs = loc.toFileString();
//			System.out.println(fs);
			File f = new File(fs);
			if (f.exists())
				if(!hasFile(slist,fs)) {
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
