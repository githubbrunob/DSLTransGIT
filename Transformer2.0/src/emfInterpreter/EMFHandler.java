package emfInterpreter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

import org.eclipse.core.runtime.Path;
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
import org.eclipse.emf.codegen.merge.java.JMerger;
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

	public void generateMetaModelClasses(String absolutePathDir, String metamodelFileName) throws IOException {
		// ///////////////////////////////////////////////////////////////////////////////////////////////
		// performing genmodel automation
		System.out.println("metamodel:" + metamodelFileName);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());

		URI ecoreURI = createAbsoluteURI(absolutePathDir, metamodelFileName);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource resource = resourceSet.getResource(ecoreURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);
		System.out.println("uri: " + ePackage.eResource().getURI().toString());
		
		if (ePackage.getNsPrefix().equals("ecore"))
			return;
		
		URI genModelURI = URI.createURI(metamodelFileName + ".genmodel");
		System.out.println("genModelURI: " + genModelURI.toString());
		Resource genModelResource = new XMIResourceFactoryImpl().createResource(genModelURI);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);
		String projectName = getProjectNameFromAbsolutePath(absolutePathDir);
		String genModelDirectory = "/" + projectName + "/tempClasses";
		System.out.println("genModelDirectory: " + genModelDirectory.toString());
		genModel.setModelDirectory(genModelDirectory);
		genModel.initialize(Collections.singleton(ePackage));
		for (EPackage pack : genModel.getMissingPackages()) {
			GenModel tempModel = GenModelFactory.eINSTANCE.createGenModel();
			processPack(projectName, pack, tempModel);
			genModel.getUsedGenPackages().addAll(tempModel.getGenPackages());
		}
		genModel.getUsedGenPackages().addAll(genModel.computeMissingUsedGenPackages());
		genModel.setValidateModel(true);
		genModel.setForceOverwrite(true);
		genModel.setCanGenerate(true);
		genModel.setFacadeHelperClass(JMerger.DEFAULT_FACADE_HELPER_CLASS);
		String modelname = genModelURI.trimFileExtension().lastSegment();
		System.out.println("modelname: " + modelname);
		genModel.setModelName(modelname);
		final List<String> names = new LinkedList<String>();
		final List<ByteArrayOutputStream> sources = new LinkedList<ByteArrayOutputStream>();
		registerGenerator("file://" + absolutePathDir + "/tempClasses", names, sources);

		Generator generator = new Generator();
		generator.setInput(genModel);
		System.out.println("Generating root genmodel...");
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor());
		System.out.println("Generating root genmodel... DONE");
		System.out.println("Generating dependent genmodels...");
		for (GenPackage genPack : genModel.getUsedGenPackages()) {
			GenModel gm = genPack.getGenModel();
			generator.setInput(gm);
			generator.generate(gm, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor());
		}
		System.out.println("Generating dependent genmodels... DONE");
		
		System.out.println("Compiling generated classes...");
		JavaCompiler compiler = com.sun.tools.javac.api.JavacTool.create();// ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

		List<JavaFileObject> files = new LinkedList<JavaFileObject>();
		int i = 0;
		for (ByteArrayOutputStream baos : sources) {
			String out = "";
			
			out = new String(baos.toByteArray(), "UTF-8");
			
			JavaFileObject file = new JavaSourceFromString(names.get(i++).replace(" ", "%20"), out);
			
			files.add(file);
		}

		Iterable<? extends JavaFileObject> compilationUnits1 = files;

		System.out.println("System class path to be used by the compiler: " + System.getProperty("java.class.path"));
		
		List<String> optionList = new ArrayList<String>();
		optionList.addAll(Arrays.asList("-classpath", System.getProperty("java.class.path")));

		fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Collections.singleton(new File(URI.createURI(absolutePathDir + "/tempClasses").toString())));


		compiler.getTask(null, fileManager, null, optionList, null, compilationUnits1).call();

		fileManager.close();
		
		System.out.println("Compiling generated classes... DONE");

	}

	public static String getProjectNameFromAbsolutePath(String absolutePathDir) {
		String projectName = null;
		Path path = new Path(absolutePathDir);
		if (!path.isAbsolute()) {
			throw new InvalidPathException(absolutePathDir, "Must be absolut path");
		}
		projectName = path.lastSegment();
		return projectName;
	}

	public static URI createAbsoluteURI(String absolutePathDir, String fileRelativePath) {
		URI result = URI.createURI(fileRelativePath);

		if (!result.isRelative()) {
			throw new InvalidPathException(fileRelativePath, "Must be relative.");
		}

		if (fileRelativePath.contains(absolutePathDir)) {
			throw new InvalidPathException(fileRelativePath, "Must be relative.");
		}

		result = URI.createURI("file://" + absolutePathDir + "/" + fileRelativePath);

		return result;
	}

	private void processPack(String projectName, EPackage pack, GenModel tempModel) {
		tempModel.setModelDirectory("/" + projectName + "/tempClasses");
		tempModel.setValidateModel(true);
		tempModel.setForceOverwrite(true);
		tempModel.setCanGenerate(true);
		tempModel.setFacadeHelperClass(JMerger.DEFAULT_FACADE_HELPER_CLASS);
		tempModel.setModelName(pack.getName());
		tempModel.initialize(Collections.singleton(pack));

		for (EPackage mypack : tempModel.getMissingPackages()) {
			GenModel mytempModel = GenModelFactory.eINSTANCE.createGenModel();
			processPack(projectName, mypack, mytempModel);
			tempModel.getUsedGenPackages().addAll(mytempModel.getGenPackages());
		}
		tempModel.getUsedGenPackages().addAll(tempModel.computeMissingUsedGenPackages());
	}

	private void registerGenerator(final String modelDir, final List<String> names, final List<ByteArrayOutputStream> sources) {
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, new GeneratorAdapterFactory.Descriptor() {
			public GeneratorAdapterFactory createAdapterFactory() {
				return new GenModelGeneratorAdapterFactory() {

					@Override
					public Adapter createGenEnumAdapter() {
						return new GenEnumGeneratorAdapter(this) {

							@Override
							protected boolean exists(URI workspacePath) {
								return false;// getURIConverter().exists(toPlatformResourceURI(workspacePath),
												// null);
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
							protected boolean exists(URI workspacePath) {
								return false;// getURIConverter().exists(toPlatformResourceURI(workspacePath),
												// null);
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
							protected boolean exists(URI workspacePath) {
								return false;// getURIConverter().exists(toPlatformResourceURI(workspacePath),
												// null);
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
