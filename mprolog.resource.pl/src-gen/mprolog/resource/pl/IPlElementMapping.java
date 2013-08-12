/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IPlElementMapping<ReferenceType> extends mprolog.resource.pl.IPlReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
