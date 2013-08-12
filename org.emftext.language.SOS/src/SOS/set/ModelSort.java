/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.adtmm.Sort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.ModelSort#getClassName <em>Class Name</em>}</li>
 *   <li>{@link SOS.set.ModelSort#getPackageName <em>Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getModelSort()
 * @model
 * @generated
 */
public interface ModelSort extends Sort {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see SOS.set.SetPackage#getModelSort_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link SOS.set.ModelSort#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see SOS.set.SetPackage#getModelSort_PackageName()
	 * @model required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link SOS.set.ModelSort#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

} // ModelSort
