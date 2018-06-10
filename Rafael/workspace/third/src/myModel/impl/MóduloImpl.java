/**
 */
package myModel.impl;

import java.util.Collection;

import myModel.Arduino;
import myModel.MyModelPackage;
import myModel.Módulo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Módulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myModel.impl.MóduloImpl#getMódulos <em>Módulos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MóduloImpl extends EObjectImpl implements Módulo {
	/**
	 * The cached value of the '{@link #getMódulos() <em>Módulos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMódulos()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino> módulos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MóduloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyModelPackage.Literals.MÓDULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino> getMódulos() {
		if (módulos == null) {
			módulos = new EObjectResolvingEList<Arduino>(Arduino.class, this, MyModelPackage.MÓDULO__MÓDULOS);
		}
		return módulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyModelPackage.MÓDULO__MÓDULOS:
				return getMódulos();
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
			case MyModelPackage.MÓDULO__MÓDULOS:
				getMódulos().clear();
				getMódulos().addAll((Collection<? extends Arduino>)newValue);
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
			case MyModelPackage.MÓDULO__MÓDULOS:
				getMódulos().clear();
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
			case MyModelPackage.MÓDULO__MÓDULOS:
				return módulos != null && !módulos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MóduloImpl
