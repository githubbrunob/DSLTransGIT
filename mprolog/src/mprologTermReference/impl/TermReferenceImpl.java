/**
 * <copyright>
 * </copyright>
 *
 * $Id: TermReferenceImpl.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference.impl;

import mprologTermReference.MprologTermReferencePackage;
import mprologTermReference.TermReference;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TermReferenceImpl extends TermImpl implements TermReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologTermReferencePackage.Literals.TERM_REFERENCE;
	}

} //TermReferenceImpl
