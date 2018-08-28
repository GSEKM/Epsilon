/**
 */
package Acessibilidade.impl;

import Acessibilidade.AcessibilidadePackage;
import Acessibilidade.RadioButton;
import Acessibilidade.RadioGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.impl.RadioGroupImpl#getRadioButtons <em>Radio Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioGroupImpl extends InputImpl implements RadioGroup {
	/**
	 * The cached value of the '{@link #getRadioButtons() <em>Radio Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<RadioButton> radioButtons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcessibilidadePackage.Literals.RADIO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RadioButton> getRadioButtons() {
		if (radioButtons == null) {
			radioButtons = new EObjectContainmentEList<RadioButton>(RadioButton.class, this, AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS);
		}
		return radioButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS:
				return ((InternalEList<?>)getRadioButtons()).basicRemove(otherEnd, msgs);
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
			case AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS:
				return getRadioButtons();
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
			case AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS:
				getRadioButtons().clear();
				getRadioButtons().addAll((Collection<? extends RadioButton>)newValue);
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
			case AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS:
				getRadioButtons().clear();
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
			case AcessibilidadePackage.RADIO_GROUP__RADIO_BUTTONS:
				return radioButtons != null && !radioButtons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RadioGroupImpl
