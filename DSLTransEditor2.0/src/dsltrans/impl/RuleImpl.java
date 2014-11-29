/**
 */
package dsltrans.impl;

import dsltrans.AbstractAttributeRelation;
import dsltrans.AbstractTemporalRelation;
import dsltrans.ApplyModel;
import dsltrans.DsltransPackage;
import dsltrans.Import;
import dsltrans.MatchModel;
import dsltrans.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.RuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsltrans.impl.RuleImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link dsltrans.impl.RuleImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link dsltrans.impl.RuleImpl#getBackwards <em>Backwards</em>}</li>
 *   <li>{@link dsltrans.impl.RuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link dsltrans.impl.RuleImpl#getAttributeRelations <em>Attribute Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchModel> match;

	/**
	 * The cached value of the '{@link #getApply() <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply()
	 * @generated
	 * @ordered
	 */
	protected ApplyModel apply;

	/**
	 * The cached value of the '{@link #getBackwards() <em>Backwards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackwards()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTemporalRelation> backwards;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getAttributeRelations() <em>Attribute Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAttributeRelation> attributeRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchModel> getMatch() {
		if (match == null) {
			match = new EObjectContainmentEList<MatchModel>(MatchModel.class, this, DsltransPackage.RULE__MATCH);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyModel getApply() {
		return apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApply(ApplyModel newApply, NotificationChain msgs) {
		ApplyModel oldApply = apply;
		apply = newApply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsltransPackage.RULE__APPLY, oldApply, newApply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApply(ApplyModel newApply) {
		if (newApply != apply) {
			NotificationChain msgs = null;
			if (apply != null)
				msgs = ((InternalEObject)apply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.RULE__APPLY, null, msgs);
			if (newApply != null)
				msgs = ((InternalEObject)newApply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.RULE__APPLY, null, msgs);
			msgs = basicSetApply(newApply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.RULE__APPLY, newApply, newApply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTemporalRelation> getBackwards() {
		if (backwards == null) {
			backwards = new EObjectContainmentEList<AbstractTemporalRelation>(AbstractTemporalRelation.class, this, DsltransPackage.RULE__BACKWARDS);
		}
		return backwards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, DsltransPackage.RULE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAttributeRelation> getAttributeRelations() {
		if (attributeRelations == null) {
			attributeRelations = new EObjectContainmentEList<AbstractAttributeRelation>(AbstractAttributeRelation.class, this, DsltransPackage.RULE__ATTRIBUTE_RELATIONS);
		}
		return attributeRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsltransPackage.RULE__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
			case DsltransPackage.RULE__APPLY:
				return basicSetApply(null, msgs);
			case DsltransPackage.RULE__BACKWARDS:
				return ((InternalEList<?>)getBackwards()).basicRemove(otherEnd, msgs);
			case DsltransPackage.RULE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
				return ((InternalEList<?>)getAttributeRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.RULE__DESCRIPTION:
				return getDescription();
			case DsltransPackage.RULE__MATCH:
				return getMatch();
			case DsltransPackage.RULE__APPLY:
				return getApply();
			case DsltransPackage.RULE__BACKWARDS:
				return getBackwards();
			case DsltransPackage.RULE__IMPORTS:
				return getImports();
			case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
				return getAttributeRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsltransPackage.RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DsltransPackage.RULE__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends MatchModel>)newValue);
				return;
			case DsltransPackage.RULE__APPLY:
				setApply((ApplyModel)newValue);
				return;
			case DsltransPackage.RULE__BACKWARDS:
				getBackwards().clear();
				getBackwards().addAll((Collection<? extends AbstractTemporalRelation>)newValue);
				return;
			case DsltransPackage.RULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
				getAttributeRelations().clear();
				getAttributeRelations().addAll((Collection<? extends AbstractAttributeRelation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsltransPackage.RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DsltransPackage.RULE__MATCH:
				getMatch().clear();
				return;
			case DsltransPackage.RULE__APPLY:
				setApply((ApplyModel)null);
				return;
			case DsltransPackage.RULE__BACKWARDS:
				getBackwards().clear();
				return;
			case DsltransPackage.RULE__IMPORTS:
				getImports().clear();
				return;
			case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
				getAttributeRelations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsltransPackage.RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DsltransPackage.RULE__MATCH:
				return match != null && !match.isEmpty();
			case DsltransPackage.RULE__APPLY:
				return apply != null;
			case DsltransPackage.RULE__BACKWARDS:
				return backwards != null && !backwards.isEmpty();
			case DsltransPackage.RULE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
				return attributeRelations != null && !attributeRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
