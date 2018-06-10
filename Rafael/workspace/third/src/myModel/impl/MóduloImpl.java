/**
 */
package myModel.impl;

import java.util.Collection;

import myModel.Arduino;
import myModel.MyModelPackage;
import myModel.M�dulo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>M�dulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myModel.impl.M�duloImpl#getM�dulos <em>M�dulos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class M�duloImpl extends EObjectImpl implements M�dulo {
	/**
	 * The cached value of the '{@link #getM�dulos() <em>M�dulos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM�dulos()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino> m�dulos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M�duloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.M�DULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino> getM�dulos() {
		if (m�dulos == null) {
			m�dulos = new EObjectResolvingEList<Arduino>(Arduino.class, this, MyModelPackage.M�DULO__M�DULOS);
		}
		return m�dulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.M�DULO__M�DULOS:
				return getM�dulos();
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
			case MyModelPackage.M�DULO__M�DULOS:
				getM�dulos().clear();
				getM�dulos().addAll((Collection<? extends Arduino>)newValue);
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
			case MyModelPackage.M�DULO__M�DULOS:
				getM�dulos().clear();
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
			case MyModelPackage.M�DULO__M�DULOS:
				return m�dulos != null && !m�dulos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //M�duloImpl
