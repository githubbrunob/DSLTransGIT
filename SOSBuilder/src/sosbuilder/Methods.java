package sosbuilder;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;
import SOS.resource.SOS.mopp.SOSResourceFactory;

public class Methods {

	public void compileToProlog(final String projectPath,
			final String filepath) {
		System.out.println("Compiling to MPrologTermReference...");
		new sosbuilder.Methods().transformToMPrologTR(projectPath, filepath);
		System.out.println("Generating Ids...");				
		mprolog.methods.Methods.genIds(filepath+".mprologTR");
		System.out.println("Changing FileName...");
		File fname = new File(filepath);
		mprolog.methods.Methods.changeFileName(fname.getName(), filepath+".mprologTR");
		System.out.println("Compiling to MProlog...");				
		String filepath1 = new mprolog.methods.Methods().
				transformToMProlog(projectPath, filepath+".mprologTR");
		System.out.println("Compiling to Text...");				
		filepath1 = new mprolog.methods.Methods().
				transformToText(projectPath, filepath1);
		System.out.println("Serializing to file...");				
		new Text.methods.Serializer(projectPath,filepath1).Output();
	}
	
	public String transformToMPrologTR(String projectPath,
			String filepath) {
		URL transformationurl = this.getClass().getResource("/model/SOS_semantics.dsltrans");
		URL sourceurl = this.getClass().getResource("/model/SOS.ecore");				
		URL targeturl = this.getClass().getResource("/model/mprologTermReference.ecore");

		saveAsXMI(filepath);
		
		String outfilepath = filepath + ".mprologTR";
		TransformerProcessor tP = new TransformerProcessor(projectPath);
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
			tP.setFileURI("input", filepath+".xmi");
			tP.setMetaModelURI("input", sourceurl.toURI().toASCIIString());
			tP.setMetaModelURI("output0", targeturl.toURI().toASCIIString());					
			tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());
			tP.setFileURI("output0", "");					
			tP.setFileURI("output1", "");			
			tP.setFileURI("output2", "");
			tP.setFileURI("output3", "");			
			tP.setFileURI("output4", outfilepath);				
			tP.Execute();
			
		} catch (InvalidLayerRequirement e) {
			e.printStackTrace();
		} catch (TransformationSourceException e) {
			e.printStackTrace();
		} catch (TransformationLayerException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return outfilepath;
	}

	private void saveAsXMI(String filepath) {
		 // If you work outside Eclipse, you first have to register the different   
		 // resource factories with EMF:
		 
		 //register <DSL>ResourceFactory for "dslExtension" file extension 
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		     ).put("SOS", new SOSResourceFactory());
		    
		 //register XMI resource factory for all other extensions
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		   ).put(Resource.Factory.Registry.DEFAULT_EXTENSION,
		         new XMIResourceFactoryImpl());
		 
		 // Then you can load and save resources in the different 
		 // formats using a resource set:
		 ResourceSet rs = new ResourceSetImpl();
		 
		 //load xmi resource
		 Resource dslResource = rs.getResource(
		     URI.createFileURI(filepath),true);
		 
		 //create an empty DSL resource (will be an instance of <DSL>Resource)
		 Resource xmiResource = rs.createResource(
		     URI.createFileURI(filepath+".xmi"));
		 
		 //transfer content from XMI to DSL resource
		 xmiResource.getContents().addAll(dslResource.getContents());
		 
		 //save the dsl resource (this will automatically use the <DSL>Printer)
		 try {
			xmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}	
	
}
