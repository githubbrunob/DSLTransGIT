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



public class TransformerToEMF {

	private String filePath;
	private String projectPath;
	private String fileName;
	private NEWFILEEXTENSION fileExtentionSetting;

	public TransformerToEMF(String projectPath, String fileName, NEWFILEEXTENSION fileExtentionSetting) {
		this.projectPath = projectPath;
		this.fileName = fileName;
		this.filePath = projectPath+"/"+fileName;
		this.fileExtentionSetting = fileExtentionSetting;
	}
	
	public void perform() { 
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
		
		System.out.println("Loading file: "+filePath); //ficheiro .dsltrans
		Resource dslResource = rs.getResource(
				URI.createFileURI(filePath),true); 

		String finalFileName = calcFinalFileName(); //adiciona ou substitui a extensao
		
		System.out.println("Creating final file : "+projectPath+"/"+finalFileName);
		Resource xmiResource = rs.createResource(
				URI.createFileURI(projectPath+"/"+finalFileName));
		
		xmiResource.getContents().addAll(dslResource.getContents());

		System.out.println("Writing file...");
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("Done.");
	}
	
	private  String calcFinalFileName(){
		switch (fileExtentionSetting){
		case ADD_AT_THE_END:
			return fileName+Constants.DSLTRANS_EXTENSION;
		case REPLACE_EXTENSION:
			return fileName.substring(0, fileName.lastIndexOf('.'))+Constants.DSLTRANS_EXTENSION;
		}
		return fileName;
	}
	
}
