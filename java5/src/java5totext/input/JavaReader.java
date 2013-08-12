 /*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sébastien Minguet (Mia-Software) - initial API and implementation
 *    Frédéric Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *******************************************************************************/

package java5totext.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java5totext.input.binding.BindingManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import Java5.Java5Factory;
import Java5.Model;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 * The aim of this class is to parse Java code to produce Java model.
 * It uses JDT model contruction. It is dedicated to J2SE5 (JDK 5 ~ JLS 3).
 * Using a more recent JLS release may require a new Mia metamodel definition,
 * since some new meta-objects may be required.
 * This reader does not work outside of an eclipse workspace context :
 * javaProject should reference a java project of an alive Eclipse Workspace !
 * (cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=87852)
 * @author Fabien Giquel, Sebastien Minguet 
 *
 */
public class JavaReader {

	/**
	 * @param javaProject must be a javaProject from an Eclipse Workspace
	 */
	public static Resource readModel(IJavaProject javaProject){
		//Set resourceSet with the newly created model
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(URI.createFileURI("temp.j2se5"));

		Java5Factory factory = Java5Factory.eINSTANCE;		
		BindingManager globalBindings = new BindingManager(factory);

		//Ceeation of the root element		
		Model resultModel = factory.createModel();
		resource.getContents().add(resultModel);
		
		try {
			if (javaProject != null) {
				resultModel.setName(javaProject.getElementName());	

				IPackageFragment[] packageFolder = javaProject.getPackageFragments();
				int classCount = 0;

				// loop on CompilationUnit-s
				for (IPackageFragment parent : packageFolder) {
					ICompilationUnit[] children = parent.getCompilationUnits();

					for (ICompilationUnit cu : children) {
						// Code parsing : here is indicated the version of jdk (~JLS) to consider, see Class comments
						ASTParser parser = ASTParser.newParser(AST.JLS3);
						parser.setResolveBindings(true);
						parser.setSource(cu);
						org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit = (CompilationUnit) parser.createAST(null);

						IProject aProject = javaProject.getProject();

						try {
							String filePathString = getRelativePath(aProject, parsedCompilationUnit);
							IFile theIFile = ResourcesPlugin.getWorkspace().getRoot().getFile(parsedCompilationUnit.getJavaElement().getPath());
							String fileContent = getContent(theIFile).toString();
							JDTVisitor jdtVisitor = new JDTVisitor(factory, resultModel, globalBindings, filePathString, fileContent);
							parsedCompilationUnit.accept(jdtVisitor);

//							CommentsManager.resolveCommentPositions(jdtVisitor);
//							CommentsManager.resolveCommentContentsAndPositions(jdtVisitor.getCommentList(), fileContent, resultModel, 
//									jdtVisitor.getNodesCreated(), jdtVisitor.getRootTypeOrEnum(),
//									jdtVisitor.getRootRealStartPosition(), jdtVisitor.getRootRealEndPosition());
//							List<Object> alleNodesCreated = new ArrayList<Object>(jdtVisitor.getNodesCreated());
//							alleNodesCreated.addAll(jdtVisitor.getCommentList());
//							LinePositionsManager.computeLineAndColumnPositions(fileContent, resultModel, alleNodesCreated,
//									jdtVisitor.getRootTypeOrEnum(),	jdtVisitor.getRootRealStartPosition(), jdtVisitor.getRootRealEndPosition());						
						}
						catch (RuntimeException e) {
							e.printStackTrace();	
						}
						catch (CoreException e) {
							e.printStackTrace();				
						}
						catch (IOException e) {
							e.printStackTrace();						
						}							
						classCount++;
					}
				}

				globalBindings.resolveBindings(resultModel);
				MethodRedefinitionManager.resolveMethodRedefintions(resultModel);

//				//Set resourceSet with the newly created model
//				ResourceSet resourceSet = new ResourceSetImpl();
//
//				resourceSet.setResourceFactoryRegistry(new ResourceFactoryRegistryImpl());
//				resourceSet.setPackageRegistry(new EPackageRegistryImpl());
//				resourceSet.getResources().add(EcorePackage.eINSTANCE.eResource());
//				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//
//				resource = new XMIResourceImpl();
//				resource.basicSetResourceSet(resourceSet, null);
//
//				resource.getContents().add(resultModel);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}


	private static String getRelativePath(IProject aProject, org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit) {
		IPath projectpath = aProject.getFullPath();
		IPath filepath = parsedCompilationUnit.getJavaElement().getPath();
		//	we want path relative to project directory
		if (projectpath.isPrefixOf(filepath))
			filepath = filepath.removeFirstSegments(projectpath.segmentCount());
		String filePathString = filepath.toOSString();
		if (!filePathString.startsWith(java.io.File.separator))
			filePathString = java.io.File.separator + filePathString;
		return filePathString;
	}


	protected static StringBuffer getContent(IFile anIFile) throws CoreException, IOException {
		InputStream is = anIFile.getContents();
		StringBuffer cuText = new StringBuffer();
		Reader r = new InputStreamReader(is);
		char[] chars = new char[100];
		int read;
		while ((read = r.read(chars)) != -1) {
			if (read == 100)
				cuText.append(chars);
			else
				cuText.append(chars, 0, read);
		}
		return cuText;
	}
}
