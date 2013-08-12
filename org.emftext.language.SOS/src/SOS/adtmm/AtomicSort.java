/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getAtomicSort()
 * @model
 * @generated
 */
public interface AtomicSort extends Sort {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(SortDeclaration)
	 * @see SOS.adtmm.AdtmmPackage#getAtomicSort_Declaration()
	 * @model required="true"
	 * @generated
	 */
	SortDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link SOS.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(SortDeclaration value);

} // AtomicSort
