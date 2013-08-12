/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextMetaInformation implements dsltrans.resource.dsltranstext.IDsltranstextMetaInformation {
	
	public String getSyntaxName() {
		return "dsltranstext";
	}
	
	public String getURI() {
		return "http://dsltrans/2.0";
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextScanner createLexer() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextAntlrScanner(new dsltrans.resource.dsltranstext.mopp.DsltranstextLexer());
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextParser().createInstance(inputStream, encoding);
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextPrinter createPrinter(java.io.OutputStream outputStream, dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextReferenceResolverSwitch getReferenceResolverSwitch() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextReferenceResolverSwitch();
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTokenResolverFactory getTokenResolverFactory() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "dsltransText2/model/DSLTrans.cs";
	}
	
	public String[] getTokenNames() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextParser(null).getTokenNames();
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTokenStyle getDefaultTokenStyle(String tokenName) {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextBracketPair> getBracketPairs() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextResourceFactory();
	}
	
	public dsltrans.resource.dsltranstext.mopp.DsltranstextNewFileContentProvider getNewFileContentProvider() {
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new dsltrans.resource.dsltranstext.mopp.DsltranstextResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "dsltrans.resource.dsltranstext.ui.launchConfigurationType";
	}
	
}
