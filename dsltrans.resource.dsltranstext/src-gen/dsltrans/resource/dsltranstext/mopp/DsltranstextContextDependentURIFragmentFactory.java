/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class DsltranstextContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements dsltrans.resource.dsltranstext.IDsltranstextContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public DsltranstextContextDependentURIFragmentFactory(dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public dsltrans.resource.dsltranstext.IDsltranstextReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
