/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

/**
 * A basic implementation of the mprolog.resource.pl.IPlReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class PlReferenceResolveResult<ReferenceType> implements mprolog.resource.pl.IPlReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<mprolog.resource.pl.IPlReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<mprolog.resource.pl.IPlQuickFix> quickFixes;
	
	public PlReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<mprolog.resource.pl.IPlQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(mprolog.resource.pl.IPlQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<mprolog.resource.pl.IPlQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<mprolog.resource.pl.IPlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new mprolog.resource.pl.mopp.PlElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<mprolog.resource.pl.IPlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new mprolog.resource.pl.mopp.PlURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
