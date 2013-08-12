/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class PlAbstractExpectedElement implements mprolog.resource.pl.IPlExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public PlAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(mprolog.resource.pl.IPlExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
