/**
 * <copyright>
 * </copyright>
 *
 * $Id: AtomicSort.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getAtomicSort()
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
	 * @see SATEL.APN.adtmm.AdtmmPackage#getAtomicSort_Declaration()
	 * @model required="true"
	 * @generated
	 */
	SortDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(SortDeclaration value);

} // AtomicSort
