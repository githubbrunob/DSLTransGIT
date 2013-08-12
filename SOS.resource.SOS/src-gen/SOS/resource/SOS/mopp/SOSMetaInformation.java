/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSMetaInformation implements SOS.resource.SOS.ISOSMetaInformation {
	
	public String getSyntaxName() {
		return "SOS";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/SOS";
	}
	
	public SOS.resource.SOS.ISOSTextScanner createLexer() {
		return new SOS.resource.SOS.mopp.SOSAntlrScanner(new SOS.resource.SOS.mopp.SOSLexer());
	}
	
	public SOS.resource.SOS.ISOSTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new SOS.resource.SOS.mopp.SOSParser().createInstance(inputStream, encoding);
	}
	
	public SOS.resource.SOS.ISOSTextPrinter createPrinter(java.io.OutputStream outputStream, SOS.resource.SOS.ISOSTextResource resource) {
		return new SOS.resource.SOS.mopp.SOSPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new SOS.resource.SOS.mopp.SOSSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new SOS.resource.SOS.mopp.SOSSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public SOS.resource.SOS.ISOSReferenceResolverSwitch getReferenceResolverSwitch() {
		return new SOS.resource.SOS.mopp.SOSReferenceResolverSwitch();
	}
	
	public SOS.resource.SOS.ISOSTokenResolverFactory getTokenResolverFactory() {
		return new SOS.resource.SOS.mopp.SOSTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.SOS/metamodel/SOS.cs";
	}
	
	public String[] getTokenNames() {
		return new SOS.resource.SOS.mopp.SOSParser(null).getTokenNames();
	}
	
	public SOS.resource.SOS.ISOSTokenStyle getDefaultTokenStyle(String tokenName) {
		return new SOS.resource.SOS.mopp.SOSTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<SOS.resource.SOS.ISOSBracketPair> getBracketPairs() {
		return new SOS.resource.SOS.mopp.SOSBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new SOS.resource.SOS.mopp.SOSFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new SOS.resource.SOS.mopp.SOSResourceFactory();
	}
	
	public SOS.resource.SOS.mopp.SOSNewFileContentProvider getNewFileContentProvider() {
		return new SOS.resource.SOS.mopp.SOSNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new SOS.resource.SOS.mopp.SOSResourceFactory());
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
		return "SOS.resource.SOS.ui.launchConfigurationType";
	}
	
}
