/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConditionBody.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.ConditionBody#getConditionAtom <em>Condition Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getConditionBody()
 * @model
 * @generated
 */
public interface ConditionBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Atom</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.ConditionAtom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Atom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Atom</em>' containment reference list.
	 * @see SATEL.SATELPackage#getConditionBody_ConditionAtom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionAtom> getConditionAtom();

} // ConditionBody
