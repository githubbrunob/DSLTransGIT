/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * An <code>IContextDependentURIFragment</code> points at an element referenced
 * from another element through an <code>identifier</code>. In contrast to a
 * normal EMF URI fragment (<code>URI.fragment</code>), which is a String that can
 * be resolved to an element within a <code>Resource</code>, the
 * <code>identifier</code> of a <code>IContextDependentURIFragment</code> does not
 * have to be globally unique.
 * <p>
 * An <code>IContextDependentURIFragment</code> is registered a
 * <code>ITextResource</code> for a proxy for which it defines the URI
 * fragment.<code>ITextResource.getEObject()</code> uses
 * the<code>IContextDependentURIFragment.resolve()</code> instead of the
 * normal<code>URI.fragment</code>-based resolving when
 * an<code>IContextDependentURIFragment.resolve()</code> is available.
 * 
 * @param <ReferenceType> the type of the reference that can be resolved by this
 * fragment
 */
public interface IPlContextDependentURIFragment<ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	/**
	 * A prefix that can be used in a <code>URI.fragment</code> String of a proxy to
	 * indicate the existence of an <code>IContextDependentURIFragment</code>.
	 */
	public static final String INTERNAL_URI_FRAGMENT_PREFIX = "EMFTEXT_INTERNAL_URI_FRAGMENT_";
	
	/**
	 * 
	 * @return The proxy object.
	 */
	public org.eclipse.emf.ecore.EObject getProxy();
	
	/**
	 * 
	 * @return An identifier that identifies the element(s) at which the proxy points
	 * in context.
	 */
	public String getIdentifier();
	
	/**
	 * 
	 * @return The element that references the proxy.
	 */
	public org.eclipse.emf.ecore.EObject getContainer();
	
	/**
	 * 
	 * @return The references of the container's <code>EClass</code> that holds the
	 * proxy.
	 */
	public org.eclipse.emf.ecore.EReference getReference();
	
	/**
	 * 
	 * @return The position if reference is multiple; -1 otherwise.
	 */
	public int getPositionInReference();
	
	/**
	 * Resolves the proxy to the real element(s) using context information.
	 * 
	 * @return result of resolving process
	 */
	public mprolog.resource.pl.IPlReferenceResolveResult<ReferenceType> resolve();
	
	/**
	 * 
	 * @return <code>true</code> if <code>resolve()</code> was called successfully
	 * before.
	 */
	public boolean isResolved();
	
}
