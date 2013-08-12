/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlMetaInformation implements mprolog.resource.pl.IPlMetaInformation {
	
	public String getSyntaxName() {
		return "pl";
	}
	
	public String getURI() {
		return "mprolog";
	}
	
	public mprolog.resource.pl.IPlTextScanner createLexer() {
		return new mprolog.resource.pl.mopp.PlAntlrScanner(new mprolog.resource.pl.mopp.PlLexer());
	}
	
	public mprolog.resource.pl.IPlTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new mprolog.resource.pl.mopp.PlParser().createInstance(inputStream, encoding);
	}
	
	public mprolog.resource.pl.IPlTextPrinter createPrinter(java.io.OutputStream outputStream, mprolog.resource.pl.IPlTextResource resource) {
		return new mprolog.resource.pl.mopp.PlPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new mprolog.resource.pl.mopp.PlSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new mprolog.resource.pl.mopp.PlSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public mprolog.resource.pl.IPlReferenceResolverSwitch getReferenceResolverSwitch() {
		return new mprolog.resource.pl.mopp.PlReferenceResolverSwitch();
	}
	
	public mprolog.resource.pl.IPlTokenResolverFactory getTokenResolverFactory() {
		return new mprolog.resource.pl.mopp.PlTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.mprolog/metamodel/mprolog.cs";
	}
	
	public String[] getTokenNames() {
		return new mprolog.resource.pl.mopp.PlParser(null).getTokenNames();
	}
	
	public mprolog.resource.pl.IPlTokenStyle getDefaultTokenStyle(String tokenName) {
		return new mprolog.resource.pl.mopp.PlTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlBracketPair> getBracketPairs() {
		return new mprolog.resource.pl.mopp.PlBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new mprolog.resource.pl.mopp.PlFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new mprolog.resource.pl.mopp.PlResourceFactory();
	}
	
	public mprolog.resource.pl.mopp.PlNewFileContentProvider getNewFileContentProvider() {
		return new mprolog.resource.pl.mopp.PlNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new mprolog.resource.pl.mopp.PlResourceFactory());
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
		return "mprolog.resource.pl.ui.launchConfigurationType";
	}
	
}
