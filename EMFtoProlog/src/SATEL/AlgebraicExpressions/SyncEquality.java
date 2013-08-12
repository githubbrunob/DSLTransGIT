/**
 * <copyright>
 * </copyright>
 *
 * $Id: SyncEquality.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions;

import SATEL.HMLFormula.SynchronizationTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermL <em>Synchronization Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermR <em>Synchronization Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getSyncEquality()
 * @model
 * @generated
 */
public interface SyncEquality extends AlgebraicEquality {
	/**
	 * Returns the value of the '<em><b>Synchronization Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Term L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Term L</em>' containment reference.
	 * @see #setSynchronizationTermL(SynchronizationTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getSyncEquality_SynchronizationTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SynchronizationTerm getSynchronizationTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermL <em>Synchronization Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Term L</em>' containment reference.
	 * @see #getSynchronizationTermL()
	 * @generated
	 */
	void setSynchronizationTermL(SynchronizationTerm value);

	/**
	 * Returns the value of the '<em><b>Synchronization Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Term R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Term R</em>' containment reference.
	 * @see #setSynchronizationTermR(SynchronizationTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getSyncEquality_SynchronizationTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SynchronizationTerm getSynchronizationTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermR <em>Synchronization Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Term R</em>' containment reference.
	 * @see #getSynchronizationTermR()
	 * @generated
	 */
	void setSynchronizationTermR(SynchronizationTerm value);

} // SyncEquality
