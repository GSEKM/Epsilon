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
 *   <li>{@link iot.impl.BoardImpl#getArduino <em>Arduino</em>}</li>
 *   <li>{@link iot.impl.BoardImpl#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends EObjectImpl implements Board
{
  /**
	 * The cached value of the '{@link #getArduino() <em>Arduino</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino> arduino;

	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> motor;

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
	public EList<Arduino> getArduino() {
		if (arduino == null) {
			arduino = new EObjectContainmentEList<Arduino>(Arduino.class, this, IotPackage.BOARD__ARDUINO);
		}
		return arduino;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMotor() {
		if (motor == null) {
			motor = new EObjectContainmentEList<Motor>(Motor.class, this, IotPackage.BOARD__MOTOR);
		}
		return motor;
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
			case IotPackage.BOARD__ARDUINO:
				return ((InternalEList<?>)getArduino()).basicRemove(otherEnd, msgs);
			case IotPackage.BOARD__MOTOR:
				return ((InternalEList<?>)getMotor()).basicRemove(otherEnd, msgs);
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
			case IotPackage.BOARD__ARDUINO:
				return getArduino();
			case IotPackage.BOARD__MOTOR:
				return getMotor();
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
			case IotPackage.BOARD__ARDUINO:
				getArduino().clear();
				getArduino().addAll((Collection<? extends Arduino>)newValue);
				return;
			case IotPackage.BOARD__MOTOR:
				getMotor().clear();
				getMotor().addAll((Collection<? extends Motor>)newValue);
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
			case IotPackage.BOARD__ARDUINO:
				getArduino().clear();
				return;
			case IotPackage.BOARD__MOTOR:
				getMotor().clear();
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
			case IotPackage.BOARD__ARDUINO:
				return arduino != null && !arduino.isEmpty();
			case IotPackage.BOARD__MOTOR:
				return motor != null && !motor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoardImpl
