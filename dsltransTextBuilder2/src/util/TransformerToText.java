package util;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dsltrans.DsltransPackage;
import dsltrans.impl.DsltransPackageImpl;
import dsltrans.resource.dsltranstext.mopp.DsltranstextResourceFactory;



public class TransformerToText {
	private static final String TEXT_EXTENSION = ".dsltranstext";
	private String filePath;
	private String projectPath;
	private String fileName;

	public TransformerToText(String projectPath , String intermfilePath, String fileName) {
		this.projectPath = projectPath;
		this.filePath = intermfilePath;
		this.fileName = fileName;
	}
	
	public String perform() throws IOException {
		System.out.println("Transforming to text...");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		).put("dsltranstext", new DsltranstextResourceFactory());


		EPackage.Registry.INSTANCE.put(
				DsltransPackage.eNS_URI, 
				DsltransPackageImpl.init()
		);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		).put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		
		System.out.println("Loading temporary file...");
		Resource xmiResource = rs.getResource(
				URI.createFileURI(filePath),true); 

		String finalFileName = fileName+TEXT_EXTENSION;
		System.out.println("Creating final file : "+projectPath+"/"+finalFileName);
		Resource dslResource = rs.createResource(
				URI.createFileURI(projectPath+"/"+finalFileName));
		dslResource.getContents().addAll(xmiResource.getContents());

		System.out.println("Writing file " + finalFileName + "...");
		
		dslResource.save(null);
		
		System.out.println("Writing file " + finalFileName + "... DONE");

		System.out.println("Transforming to text... DONE");
		
		return finalFileName;
	}
	
}
