/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SOSExpectedStructuralFeature extends SOS.resource.SOS.mopp.SOSAbstractExpectedElement {
	
	private SOS.resource.SOS.grammar.SOSPlaceholder placeholder;
	
	public SOSExpectedStructuralFeature(SOS.resource.SOS.grammar.SOSPlaceholder placeholder) {
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
		if (o instanceof SOSExpectedStructuralFeature) {
			return getFeature().equals(((SOSExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
