package Text.methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Text.Block;
import Text.Content;
import Text.Directory;
import Text.EmptyLine;
import Text.File;
import Text.Line;
import Text.Model;
import Text.TextPackage;

public class Serializer {

    private ResourceSet resourceSet;
    private Model _model=null;
    private String _projectPath = "";
    
 
    public Serializer(String projectPath, String filepath) {
    	System.out.println("Serializing on Project: "+projectPath+" the file "+ filepath);
		URI fileURI = URI.createFileURI(filepath);
		resourceSet = new ResourceSetImpl();
		_projectPath = projectPath;
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "ecore",new EcoreResourceFactoryImpl());		
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//		("text", new TextFactoryImpl());
        resourceSet.getPackageRegistry().put(TextPackage.eNS_URI,TextPackage.eINSTANCE);
		// create resource
		Resource aResource = resourceSet.getResource(fileURI, true);		
		System.out.println(">> "+fileURI + " file loaded.");
		// get root model element (container)
		EObject textModel = (EObject) aResource.getContents().get(0);		
		if (textModel!=null && textModel instanceof Text.impl.ModelImpl){
			setModel((Text.Model) textModel);
		}
	}
	
	public void setModel(Model _model) {
		this._model = _model;
	}

	public Model getModel() {
		return _model;
	}

	public void Output() {
		if(getModel() == null) return;

		try {		
			for(Directory dir : getModel().getDirectory()) {
					processDirectory(_projectPath,dir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">> Serialization ended.");
	}

	private void processDirectory(String prevdir, Directory dir) throws IOException {
		String thisDirectoryName = prevdir+"\\"+dir.getPath();
		
		java.io.File thisDirectory = new java.io.File(thisDirectoryName);
		thisDirectory.mkdir(); // create this directory
				
		for(File file : dir.getFile()) {
			processFile(thisDirectoryName,file);
		}
		
		for(Directory subdir :dir.getDirectory()) {
			processDirectory(thisDirectoryName,subdir);
		}		
	}

	private void processFile(String thisDirectoryName, File file) throws IOException {
		java.io.File thisFile = new java.io.File(thisDirectoryName+"\\"+file.getPath());
		thisFile.createNewFile(); // create this file
		FileWriter fw = new FileWriter(thisFile);
		BufferedWriter out = new BufferedWriter(fw);
		for(Block block : file.getInnerBlock()) {
			processBlock(block,out,0);
		}
		out.close();
	}

	private void processBlock(Block block, java.io.Writer out, int tabs) throws IOException {
		if(block.isTabbed())
			tabs++;
		// first process pre line
		processLine(block.getPreLine(),out,tabs);
		
		// then process inner lines
		for(Line innerLine: block.getInnerLine()) {
			processLine(innerLine, out,tabs);
		}

		for(Content innerContent: block.getContent()) {
			processContent(innerContent, out,false,tabs);
		}		
		
		// process inner blocks which were left behind
		for(Block innerblock : block.getInnerBlock()) {
			processBlock(innerblock,out,tabs);
		}
		
		// finally process post line
		processLine(block.getPostLine(),out,tabs);
	}

	private void processLine(Line thisline, java.io.Writer out, int tabs) throws IOException {
		if(thisline == null) return;

		for(int i = 0; i < tabs; i++) {
			out.write("\t");
		}
		
		if(thisline instanceof Content) {
			processContent((Content) thisline, out,true,tabs);
		}
		if(thisline instanceof EmptyLine) {
			out.write(System.getProperty("line.separator"));
		}
	}

	private void processContent(Content thisContent, java.io.Writer out, boolean endLine, int tabs) throws IOException {
		// first process this content text
		if(thisContent.getText() != null) {
			out.write(thisContent.getText());
		}
		// then process the inner content inside the line
		for(Content innerContent : thisContent.getContent()) {
			processContent(innerContent,out,false,tabs);
		}
		
		if(thisContent.getNext() != null) {
			processContent(thisContent.getNext(),out,false,tabs);
		}		
		
		if(endLine) {
			out.write(System.getProperty("line.separator"));
		}
		
		if(thisContent.getInnerBlock() != null) {
			processBlock(thisContent.getInnerBlock(),out,tabs);
		}		
	}
	
}
