/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextNewFileContentProvider {
	
	public dsltrans.resource.dsltranstext.IDsltranstextMetaInformation getMetaInformation() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			dsltrans.DsltransPackage.eINSTANCE.getTransformationModel(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new dsltrans.resource.dsltranstext.util.DsltranstextMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		dsltrans.resource.dsltranstext.IDsltranstextTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			dsltrans.resource.dsltranstext.mopp.DsltranstextPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new dsltrans.resource.dsltranstext.mopp.DsltranstextResource());
	}
	
}
