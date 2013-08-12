/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A basic implementation of the
 * dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class DsltranstextReferenceResolveResult<ReferenceType> implements dsltrans.resource.dsltranstext.IDsltranstextReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> quickFixes;
	
	public DsltranstextReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<dsltrans.resource.dsltranstext.IDsltranstextQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(dsltrans.resource.dsltranstext.IDsltranstextQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<dsltrans.resource.dsltranstext.IDsltranstextQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new dsltrans.resource.dsltranstext.mopp.DsltranstextElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new dsltrans.resource.dsltranstext.mopp.DsltranstextURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
