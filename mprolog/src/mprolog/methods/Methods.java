package mprolog.methods;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Hashtable;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import mprologTermReference.MprologTermReferencePackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;

import com.sun.tools.javac.util.Pair;

import dsltrans.AbstractTemporalRelation;
import dsltrans.Rule;

public class Methods {

	public String transformToMProlog(
			final String projectPath, final String filepath) {
		URL transformationurl = this.getClass().getResource("/model/mprologTermReference.ecore.dsltrans");
		URL sourceurl = this.getClass().getResource("/model/mprologTermReference.ecore");
		URL targeturl = this.getClass().getResource("/model/mprolog.ecore");	
		
		String outfilepath = filepath + ".mprolog";
		TransformerProcessor tP = new TransformerProcessor(projectPath);
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
			tP.setFileURI("inputModel", filepath);
			tP.setMetaModelURI("inputModel", sourceurl.toURI().toASCIIString());
			tP.setMetaModelURI("References", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("Entities", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("Associations", targeturl.toURI().toASCIIString());
			tP.setFileURI("References", "");
			tP.setFileURI("Entities", "");
			tP.setFileURI("Associations", outfilepath);					
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
	
	public String transformToText(
			final String projectPath, final String filepath) {
		URL transformationurl = this.getClass().getResource("/model/mprolog.ecore.dsltrans");
		URL sourceurl = this.getClass().getResource("/model/mprolog.ecore");
		URL targeturl = this.getClass().getResource("/model/text.ecore");	
		
		String outfilepath = filepath + ".text";
		TransformerProcessor tP = new TransformerProcessor(projectPath);
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
			tP.setFileURI("inputModel", filepath);
			tP.setMetaModelURI("inputModel", sourceurl.toURI().toASCIIString());
			tP.setMetaModelURI("Entities", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("Associations", targeturl.toURI().toASCIIString());
			tP.setFileURI("Entities", "");
			tP.setFileURI("Associations", outfilepath);					
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

	public String transformToDSLTrans(String projectPath, String filepath) {
		URL transformationurl = this.getClass().getResource("/model/mprologTermReference.ecore.lift.dsltrans");
		URL sourceurl = this.getClass().getResource("/model/mprologTermReference.ecore");
		URL targeturl = this.getClass().getResource("/model/DSLTrans.ecore");	
		
		String outfilepath = filepath + ".dsltrans";
		TransformerProcessor tP = new TransformerProcessor(projectPath);
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
			tP.setFileURI("input", filepath);
			tP.setMetaModelURI("input", sourceurl.toURI().toASCIIString());
			tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());
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
	
	public String transformToMPrologDSLTrans(String projectPath, String filepath) {
		URL transformationurl = this.getClass().getResource("/model/GenMPrologSerializer.dsltrans");
		URL sourceurl = this.getClass().getResource("/model/Ecore.ecore");
		URL targeturl = this.getClass().getResource("/model/DSLTrans.ecore");	
		
		String outfilepath = filepath + ".dsltrans";
		TransformerProcessor tP = new TransformerProcessor(projectPath);
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationurl.toURI().toASCIIString()));
			System.out.println("Input metamodel: "+ filepath);
			tP.setFileURI("input", filepath);
			System.out.println("Ecore metamodel: "+ sourceurl);
			tP.setMetaModelURI("input", sourceurl.toURI().toASCIIString());
			System.out.println("Using DSLTrans metamodel: "+ targeturl);
			tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output5", targeturl.toURI().toASCIIString());			
			tP.setFileURI("output1", "");
			tP.setFileURI("output2", "");
			tP.setFileURI("output3", "");
			tP.setFileURI("output4", "");			
			System.out.println("Output DSLTrans model: "+ outfilepath);
			tP.setFileURI("output5", outfilepath);
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

	public String transformAnyToMPrologTR(
			final String projectPath, final String filepath) {
		//URL transformationurl = this.getClass().getResource("/model/mprologTermReference.ecore.dsltrans");

		String directory = new File(filepath).getParentFile().getPath();
		// load the input model - its in the filepath
		Pair<String,String> p = getRootAndMetaModel(filepath);
		if(p.snd.isEmpty()) return "";
		String transformationFile = directory+"\\"+p.fst+".dsltrans";
		System.out.println("Trying to load transformation: "+ transformationFile);
		if(!new File(transformationFile).exists())
			System.err.println("Transformation not found!.. aborting..");
		transformationFile = "file://" + transformationFile;
		processTransformation(transformationFile,p.snd);
		
		TransformerProcessor tP = new TransformerProcessor(projectPath);

		URL targeturl = this.getClass().getResource("/model/mprologTermReference.ecore");
		
		String outfilepath = filepath + ".mprologTR";
		try {
			tP.LoadModel(org.eclipse.emf.common.util.URI.createURI(transformationFile));
			tP.setFileURI("input", filepath);
			tP.setMetaModelURI("input", "file://" + directory+"/"+p.fst);

			tP.setMetaModelURI("output1", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output2", targeturl.toURI().toASCIIString());						
			tP.setMetaModelURI("output3", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output4", targeturl.toURI().toASCIIString());
			tP.setMetaModelURI("output5", targeturl.toURI().toASCIIString());			
			tP.setFileURI("output1", "");
			tP.setFileURI("output2", "");
			tP.setFileURI("output3", "");
			tP.setFileURI("output4", "");			
			tP.setFileURI("output5", outfilepath);			
			tP.Execute();

			Methods.genIds(outfilepath);
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

	public static void genIds(String filepath) {
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
			
		resourceSet.getPackageRegistry().put(MprologTermReferencePackage.eNS_URI, MprologTermReferencePackage.eINSTANCE);				
		
		Resource resource = resourceSet.getResource(URI.createFileURI(filepath),true);

		TreeIterator<EObject> tree = resource.getAllContents();
		Hashtable<String,Integer> table = new Hashtable<String,Integer>();
		while(tree.hasNext()) {
			EObject obj = tree.next();
			if(obj instanceof mprologTermReference.Functor) {
				mprologTermReference.Functor atom = (mprologTermReference.Functor) obj;
				String key = atom.getText();
				if(key.startsWith("#") &&
						key.endsWith("#")) {
					if(table.containsKey(key)) {
						table.put(key, table.get(key)+1);
					} else {
						table.put(key, 0);
					}
					atom.setText("id"+table.get(key).toString());
				}
			}
			if(obj instanceof mprologTermReference.Variable) {
				mprologTermReference.Variable atom = (mprologTermReference.Variable) obj;
				String key = atom.getName();
				if(key.startsWith("#") &&
						key.endsWith("#")) {
					if(table.containsKey(key)) {
						table.put(key, table.get(key)+1);
					} else {
						table.put(key, 0);
					}
					atom.setName("Id"+table.get(key).toString());
				}
			}			
		}
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void processTransformation(String transformationFile, String rootName) {
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
				
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());
				
			resourceSet.getPackageRegistry().put(dsltrans.DsltransPackage.eNS_URI, dsltrans.DsltransPackage.eINSTANCE);	
			
			Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(transformationFile),true);
			
			TreeIterator<EObject> tree = resource.getAllContents();
			boolean changed=false;
			LinkedList<EObject> toRemove = new LinkedList<EObject>();
			while(tree.hasNext()) {
				EObject obj = tree.next();
				if(obj instanceof dsltrans.FilePort) {
					dsltrans.FilePort fp = (dsltrans.FilePort)obj;
					String[] temp = fp.getMetaModelId().getMetaModelName().split("\\.");
					String newMMName = "";
					for(int i = 0; i < temp.length-1; i++) {
						newMMName += temp[i]+".";
					}
					String className = temp[temp.length-1];
					String rest = className.substring(1);
					String fstChar = className.substring(0,1);
					newMMName += fstChar.toUpperCase()+rest;
					System.out.println("Computed new MetaModel name... " + newMMName);
					fp.getMetaModelId().setMetaModelName(newMMName);
					changed = true;
				}
				if(obj instanceof dsltrans.AnyMatchClass) {
					dsltrans.AnyMatchClass mc = (dsltrans.AnyMatchClass) obj;
					String value = mc.getClassName();
					if(value.equals("#root#")) {
						EList<EObject> list = mc.eContainer().eContents();
						for(EObject x: list) {
							if(x instanceof dsltrans.AnyMatchClass) {
								dsltrans.AnyMatchClass mc1 = (dsltrans.AnyMatchClass)x;
								if(mc1.getClassName().equals(rootName)) {
									toRemove.add(x);
									dsltrans.Rule r = (Rule) mc.eContainer().eContainer();
									for(AbstractTemporalRelation br: r.getBackwards()) {
										br.setSourceClass(mc);
									}
								}
							}
						}
						mc.setClassName(rootName);
						changed = true;
					}
				}
			}
			for(EObject obj:toRemove) {
				dsltrans.MatchModel mm = (dsltrans.MatchModel)obj.eContainer();
				EList<dsltrans.MatchClass> set = mm.getClass_();
				set.remove(obj);
			}
			if(changed)
				resource.save(null);
		} catch (SecurityException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Pair<String, String> getRootAndMetaModel(final String filepath) {
		String metamodelName = "";
		String rootName = "";
		System.out.println("Inspecting " + filepath + " ...");
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			Node rootPackageElement = doc.getFirstChild();
			String temp[] = rootPackageElement.getNodeName().split("\\:");
			System.out.println("\tRoot element: " + temp[1]);
			rootName = temp[1];
			NamedNodeMap rootPackageAttributes = rootPackageElement.getAttributes();
			Attr xsiSchemaLocation = (Attr) rootPackageAttributes.getNamedItem("xsi:schemaLocation");
			if (xsiSchemaLocation!=null) {
				String temp1[] = xsiSchemaLocation.getValue().split(" ");
				System.out.println("\tMetamodel found: "+temp1[1]);
				metamodelName = temp1[1];
			}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Pair<String, String>(metamodelName,rootName);
	}
	
	public static void changeFileName(String filename, String filepath) {
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
			
		resourceSet.getPackageRegistry().put(MprologTermReferencePackage.eNS_URI, MprologTermReferencePackage.eINSTANCE);				
		
		Resource resource = resourceSet.getResource(URI.createFileURI(filepath),true);
		EList<EObject> list = resource.getContents();
		if(list != null && list.size() > 0) {
			((mprologTermReference.Model) list.get(0)).setName(filename);
		}
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
