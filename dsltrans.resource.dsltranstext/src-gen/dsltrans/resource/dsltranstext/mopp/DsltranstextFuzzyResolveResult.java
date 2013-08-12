/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A FuzzyResolveResult is an implementation of the
 * IDsltranstextReferenceResolveResult interface that delegates all method calls
 * to a given IDsltranstextReferenceResolveResult with ReferenceType EObject. It
 * is used by reference resolver switches to collect results from different
 * reference resolvers in a type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class DsltranstextFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<ReferenceType> {
	
	private dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public DsltranstextFuzzyResolveResult(dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(dsltrans.resource.dsltranstext.IDsltranstextQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
