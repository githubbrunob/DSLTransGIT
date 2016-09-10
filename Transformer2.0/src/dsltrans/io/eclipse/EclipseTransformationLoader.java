package dsltrans.io.eclipse;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dsltrans.DsltransPackage;
import dsltrans.TransformationModel;

public class EclipseTransformationLoader {

	public static TransformationModel ReadModel(URI uri){
		
		//debug
		System.out.println("LOADING TransformationModel");
		System.out.println(uri.toString());
		
		TransformationModel tm = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
			
		resourceSet.getPackageRegistry().put(DsltransPackage.eNS_URI, DsltransPackage.eINSTANCE);				
		
		Resource resource = resourceSet.getResource(uri,true);
		
		List<EObject> list = resource.getContents();
		if(list.size()>0) {
			EObject obj = list.get(0);
			if(obj instanceof TransformationModel) {
				tm = (TransformationModel) obj;
			}
		}
		
		return tm;
	}

	public static TransformationModel ReadModel(String url) {
		return ReadModel(URI.createFileURI(url));
	}
}
