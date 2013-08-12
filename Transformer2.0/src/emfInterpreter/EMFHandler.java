package emfInterpreter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenEnumGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFHandler {

	public void generateMetaModelClasses(String dir, String mmPath) {
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// performing genmodel automation
		System.out.println("metamodel:" + mmPath);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		String path;
		URI mmPathURI = URI.createURI(mmPath);
		
		if(mmPathURI.isRelative() && 
		  !mmPath.contains(dir))
			path = "file://"+dir+"/"+mmPath;
		else
			path = mmPath;
		URI ecoreURI = URI.createURI(path); //".//Metamodels//AUIML.ecore");
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "ecore",new EcoreResourceFactoryImpl());		
		
		Resource resource = resourceSet.getResource(ecoreURI, true);
		EPackage ePackage = (EPackage)resource.getContents().get(0);
		System.out.println("uri: "+ePackage.eResource().getURI().toString());
		//ePackage.eResource().setURI(URI.createFileURI(".//AUIML.ecore"));
		if(ePackage.getNsPrefix().equals("ecore")) return;
		URI genModelURI = URI.createURI(mmPath+".genmodel");
		System.out.println(">>> "  + genModelURI.toString());
		Resource genModelResource = new XMIResourceFactoryImpl().createResource(genModelURI);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);
		//final String modelDir = outURI.toString();
		genModel.setModelDirectory("//"+dir+"/tempClasses");
//		genModel.getForeignModel().add(".//AUIML.ecore");
		genModel.initialize(Collections.singleton(ePackage));
		for(EPackage pack:genModel.getMissingPackages()) {
			GenModel tempModel = GenModelFactory.eINSTANCE.createGenModel();
			processPack(dir, pack, tempModel);
			genModel.getUsedGenPackages().addAll(tempModel.getGenPackages());
		}
		genModel.getUsedGenPackages().addAll(genModel.computeMissingUsedGenPackages());
		genModel.setValidateModel(true);
		genModel.setForceOverwrite(true);
		genModel.setCanGenerate(true);
		genModel.setFacadeHelperClass("null");
		String modelname = genModelURI.trimFileExtension().lastSegment();
		System.out.println("modelname: " + modelname);
		genModel.setModelName(modelname);
		final List<String> names = new LinkedList<String>();
		final List<ByteArrayOutputStream> sources = new LinkedList<ByteArrayOutputStream>();
		registerGenerator("file://"+dir+"/tempClasses",names,sources);
		
		Generator generator = new Generator();
		generator.setInput(genModel);
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor());
		for(GenPackage genPack: genModel.getUsedGenPackages()) {
			GenModel gm = genPack.getGenModel();
			generator.setInput(gm);
			generator.generate(gm, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor());			
		}
		
		JavaCompiler compiler = com.sun.tools.javac.api.JavacTool.create();//ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		
		List<JavaFileObject> files = new LinkedList<JavaFileObject>();
		int i = 0;
		for(ByteArrayOutputStream baos : sources) {
			String out = "";
			try {
				out = new String(baos.toByteArray(), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JavaFileObject file = new JavaSourceFromString(names.get(i++).replace(" ", "%20"), out);
			files.add(file);
		}
		
	    Iterable<? extends JavaFileObject> compilationUnits1 = files;
	    //List<String> options = new LinkedList<String>();
	    
	    //String options="";
	    List<String> optionList = new ArrayList<String>();
	    optionList.addAll(Arrays.asList("-classpath",System.getProperty("java.class.path")));
		//optionList.addAll(Arrays.asList(options));

	    try {
			fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Collections.singleton(new File(URI.createURI(dir+"/tempClasses").toString())));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    compiler.getTask(null, fileManager, null, optionList, null, compilationUnits1).call();
       try {
			fileManager.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private void processPack(String dir, EPackage pack, GenModel tempModel) {
		tempModel.setModelDirectory("//"+dir+"/tempClasses");
		tempModel.setValidateModel(true);
		tempModel.setForceOverwrite(true);
		tempModel.setCanGenerate(true);
		tempModel.setFacadeHelperClass("null");
		tempModel.setModelName(pack.getName());
		tempModel.initialize(Collections.singleton(pack));

		for(EPackage mypack:tempModel.getMissingPackages()) {
			GenModel mytempModel = GenModelFactory.eINSTANCE.createGenModel();
			processPack(dir,mypack,mytempModel);
			tempModel.getUsedGenPackages().addAll(mytempModel.getGenPackages());
		}
		tempModel.getUsedGenPackages().addAll(tempModel.computeMissingUsedGenPackages());
	}

	private void registerGenerator(final String modelDir, final List<String> names, final List<ByteArrayOutputStream> sources) {
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor
	     (GenModelPackage.eNS_URI,
	    		 new GeneratorAdapterFactory.Descriptor() {
	    	 		public GeneratorAdapterFactory createAdapterFactory() {
	    	 			return new GenModelGeneratorAdapterFactory() {

	    	 				@Override
	    	 				public Adapter createGenEnumAdapter() {
	    	 					return new GenEnumGeneratorAdapter(this) {
	    	 						
	    	    	 				@Override
	    	    	 				protected boolean exists(URI workspacePath)
	    	    	 				{
	    	    	 					return false;//getURIConverter().exists(toPlatformResourceURI(workspacePath), null);
	    	    	 				}
	    	 						
	    	 						@Override
	    	 						protected OutputStream createOutputStream(URI workspacePath) throws Exception {
	    	 							ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    	 							sources.add(baos);
	    	 							names.add(workspacePath.toString());
	    	 							return baos;
	    	 						}
	    	 						@Override
	    	 						protected URI toURI(String pathName) {
	    	 							return URI.createURI(modelDir);
	    	 						}
	    	 					};
	    	 				}
	    	 				@Override
	    	 				public Adapter createGenClassAdapter() {
	    	 					return new GenClassGeneratorAdapter(this) {
	    	    	 				@Override
	    	    	 				protected boolean exists(URI workspacePath)
	    	    	 				{
	    	    	 					return false;//getURIConverter().exists(toPlatformResourceURI(workspacePath), null);
	    	    	 				}	    	 						
	    	 						
	    	 						@Override
	    	 						protected OutputStream createOutputStream(URI workspacePath) throws Exception {
	    	 							ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    	 							sources.add(baos);
	    	 							names.add(workspacePath.toString());
	    	 							return baos;
	    	 						}
	    	 						@Override
	    	 						protected URI toURI(String pathName) {
	    	 							return URI.createURI(modelDir);
	    	 						}
	    	 					};
	    	 				}
	    	 				@Override
	    	 				public Adapter createGenPackageAdapter() {
	    	 					return new GenPackageGeneratorAdapter(this) {
	    	    	 				@Override
	    	    	 				protected boolean exists(URI workspacePath)
	    	    	 				{
	    	    	 					return false;//getURIConverter().exists(toPlatformResourceURI(workspacePath), null);
	    	    	 				}	    	 						
	    	 						
	    	 						@Override
	    	 						protected URI toURI(String pathName) {
	    	 							return URI.createURI(modelDir);
	    	 						}
	    	 						@Override
	    	 						protected OutputStream createOutputStream(URI workspacePath) throws Exception {
	    	 							ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    	 							sources.add(baos);
	    	 							names.add(workspacePath.toString());
	    	 							return baos;
	    	 						}
	    	 					};
	    	 				}
	    	 			};
	    	 		}
	     });		 
	}
}
