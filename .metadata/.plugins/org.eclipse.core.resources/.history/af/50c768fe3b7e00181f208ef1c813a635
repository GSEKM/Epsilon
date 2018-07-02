/**
 */
package iot.impl;

import iot.Arduino;
import iot.Board;
import iot.IotPackage;

import iot.Motor;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.impl.BoardImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link iot.impl.BoardImpl#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends EObjectImpl implements Board
{
  /**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
  protected EList<Arduino> modelo;

  /**
	 * The cached value of the '{@link #getModulo() <em>Modulo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulo()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> modulo;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BoardImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return IotPackage.Literals.BOARD;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Arduino> getModelo()
  {
		if (modelo == null) {
			modelo = new EObjectContainmentEList<Arduino>(Arduino.class, this, IotPackage.BOARD__MODELO);
		}
		return modelo;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getModulo() {
		if (modulo == null) {
			modulo = new EObjectContainmentEList<Motor>(Motor.class, this, IotPackage.BOARD__MODULO);
		}
		return modulo;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case IotPackage.BOARD__MODELO:
				return ((InternalEList<?>)getModelo()).basicRemove(otherEnd, msgs);
			case IotPackage.BOARD__MODULO:
				return ((InternalEList<?>)getModulo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case IotPackage.BOARD__MODELO:
				return getModelo();
			case IotPackage.BOARD__MODULO:
				return getModulo();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case IotPackage.BOARD__MODELO:
				getModelo().clear();
				getModelo().addAll((Collection<? extends Arduino>)newValue);
				return;
			case IotPackage.BOARD__MODULO:
				getModulo().clear();
				getModulo().addAll((Collection<? extends Motor>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case IotPackage.BOARD__MODELO:
				getModelo().clear();
				return;
			case IotPackage.BOARD__MODULO:
				getModulo().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case IotPackage.BOARD__MODELO:
				return modelo != null && !modelo.isEmpty();
			case IotPackage.BOARD__MODULO:
				return modulo != null && !modulo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoardImpl
