/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextResourceFactoryDelegator implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	protected java.util.Map<String, org.eclipse.emf.ecore.resource.Resource.Factory> factories = null;
	
	public DsltranstextResourceFactoryDelegator() {
		init();
	}
	
	protected void init() {
		if (factories == null) {
			factories = new java.util.LinkedHashMap<String, org.eclipse.emf.ecore.resource.Resource.Factory>();
		}
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(dsltrans.resource.dsltranstext.mopp.DsltranstextPlugin.EP_ADDITIONAL_EXTENSION_PARSER_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					String type = element.getAttribute("type");
					org.eclipse.emf.ecore.resource.Resource.Factory factory = (org.eclipse.emf.ecore.resource.Resource.Factory) element.createExecutableExtension("class");
					if (type == null) {
						type = "";
					}
					org.eclipse.emf.ecore.resource.Resource.Factory otherFactory = factories.get(type);
					if (otherFactory != null) {
						Class<?> superClass = factory.getClass().getSuperclass();
						while(superClass != Object.class) {
							if (superClass.equals(otherFactory.getClass())) {
								factories.put(type, factory);
								break;
							}
							superClass = superClass.getClass();
						}
					}
					else {
						factories.put(type, factory);
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					dsltrans.resource.dsltranstext.mopp.DsltranstextPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		if (factories.get("") == null) {
			factories.put("", new dsltrans.resource.dsltranstext.mopp.DsltranstextResourceFactory());
		}
	}
	
	public java.util.Map<String, org.eclipse.emf.ecore.resource.Resource.Factory> getResourceFactoriesMap() {
		return factories;
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory getFactoryForURI(org.eclipse.emf.common.util.URI uri) {
		org.eclipse.emf.common.util.URI trimmedURI = uri.trimFileExtension();
		String secondaryFileExtension = trimmedURI.fileExtension();
		org.eclipse.emf.ecore.resource.Resource.Factory factory = factories.get(secondaryFileExtension);
		if (factory == null) {
			factory = factories.get("");
		}
		return factory;
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return getFactoryForURI(uri).createResource(uri);
	}
	
}
