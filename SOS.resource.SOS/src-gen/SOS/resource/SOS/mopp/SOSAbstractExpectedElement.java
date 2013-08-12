/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SOSAbstractExpectedElement implements SOS.resource.SOS.ISOSExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public SOSAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(SOS.resource.SOS.ISOSExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
