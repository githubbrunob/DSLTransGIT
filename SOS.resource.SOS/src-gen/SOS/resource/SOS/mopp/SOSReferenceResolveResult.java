/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A basic implementation of the SOS.resource.SOS.ISOSReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class SOSReferenceResolveResult<ReferenceType> implements SOS.resource.SOS.ISOSReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<SOS.resource.SOS.ISOSReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<SOS.resource.SOS.ISOSQuickFix> quickFixes;
	
	public SOSReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<SOS.resource.SOS.ISOSQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<SOS.resource.SOS.ISOSQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(SOS.resource.SOS.ISOSQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<SOS.resource.SOS.ISOSQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<SOS.resource.SOS.ISOSReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<SOS.resource.SOS.ISOSReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new SOS.resource.SOS.mopp.SOSElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<SOS.resource.SOS.ISOSReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new SOS.resource.SOS.mopp.SOSURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
