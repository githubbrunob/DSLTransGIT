/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class DsltranstextExpectedStructuralFeature extends dsltrans.resource.dsltranstext.mopp.DsltranstextAbstractExpectedElement {
	
	private dsltrans.resource.dsltranstext.grammar.DsltranstextPlaceholder placeholder;
	
	public DsltranstextExpectedStructuralFeature(dsltrans.resource.dsltranstext.grammar.DsltranstextPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof DsltranstextExpectedStructuralFeature) {
			return getFeature().equals(((DsltranstextExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
