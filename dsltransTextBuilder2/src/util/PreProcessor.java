package util;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dsltrans.AbstractClass;
import dsltrans.ApplyAttribute;
import dsltrans.Attribute;
import dsltrans.DsltransPackage;
import dsltrans.MatchAttribute;
import dsltrans.TransformationModel;
import dsltrans.impl.DsltransPackageImpl;
import dsltrans.resource.dsltranstext.mopp.DsltranstextResourceFactory;

public class PreProcessor {

	private int numberClass;
	private int numberAttrib;
	private String projectPath;
	private String fileName;	
	private static final String tempFilePrefix = "temp";

	public PreProcessor(String projectPath, String fileName) {			
		this.fileName = fileName;
		this.projectPath = projectPath;
		this.numberClass = 0;
		this.numberAttrib = 0;
	}

	public String perform() {		

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
		System.out.println("Loading file to transform:"+ projectPath+"/"+fileName);
		Resource xmiResource = rs.getResource(
				URI.createFileURI(projectPath+"/"+fileName),true);
		System.out.println("Creating temporary file...");
		String tempPath = projectPath+"/"+tempFilePrefix+fileName;
		Resource write = rs.createResource(
				URI.createFileURI(tempPath));

		System.out.println("Pre-processing file...");
		visit(xmiResource.getContents().get(0));
		write.getContents().add((TransformationModel)xmiResource.getContents().get(0));
		try {
			write.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tempPath;
	}

	private void visit(EObject eObject) {
		check(eObject);
		EList<EObject> cont = eObject.eContents();
		for (EObject o : cont) {
			visit(o);
		}
	}

	private void check(EObject eObject) {
		if  (eObject instanceof AbstractClass) {
			checkDescriptions((AbstractClass)eObject);
			((AbstractClass) eObject).setId("cl"+this.numberClass++);
		}
		else if (eObject instanceof MatchAttribute)
		{			
			((Attribute) eObject).setId("at"+this.numberAttrib++);
		}
		else if (eObject instanceof ApplyAttribute) {
			String name = ((ApplyAttribute) eObject).getAttributeName();
			if (name !=null && name.equals("ApplyAttribute"))
				((ApplyAttribute) eObject).setAttributeName("");
		}
	}

	private void checkDescriptions(AbstractClass eObject) {
		if (eObject!=null){
			String desc = eObject.getDescription();
			if (desc!=null) {
				String desctr = desc.trim();
				if (!desctr.equals("")) {
					if (!desctr.startsWith("/*") )
						desc="/*"+desc;
					if (!desctr.endsWith("*/") )
						desc=desc+"*/";
					eObject.setDescription(desc);
				}
			}
		}
	}
}


