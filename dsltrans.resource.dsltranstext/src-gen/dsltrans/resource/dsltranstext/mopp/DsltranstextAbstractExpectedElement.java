/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class DsltranstextAbstractExpectedElement implements dsltrans.resource.dsltranstext.IDsltranstextExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public DsltranstextAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(dsltrans.resource.dsltranstext.IDsltranstextExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
