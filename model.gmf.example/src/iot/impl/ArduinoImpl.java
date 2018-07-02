/**
 */
package iot.impl;

import iot.Arduino;
import iot.IotPackage;
import iot.Motor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.impl.ArduinoImpl#getModel <em>Model</em>}</li>
 *   <li>{@link iot.impl.ArduinoImpl#getConector <em>Conector</em>}</li>
 *   <li>{@link iot.impl.ArduinoImpl#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoImpl extends EObjectImpl implements Arduino
{
  /**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

		/**
	 * The cached value of the '{@link #getConector() <em>Conector</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConector()
	 * @generated
	 * @ordered
	 */
  protected EList<Motor> conector;

  /**
	 * The default value of the '{@link #getPins() <em>Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected static final int PINS_EDEFAULT = 0;

		/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected int pins = PINS_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ArduinoImpl()
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
		return IotPackage.Literals.ARDUINO;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ARDUINO__MODEL, oldModel, model));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Motor> getConector()
  {
		if (conector == null) {
			conector = new EObjectResolvingEList<Motor>(Motor.class, this, IotPackage.ARDUINO__CONECTOR);
		}
		return conector;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPins() {
		return pins;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPins(int newPins) {
		int oldPins = pins;
		pins = newPins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ARDUINO__PINS, oldPins, pins));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setup()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void loop()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case IotPackage.ARDUINO__MODEL:
				return getModel();
			case IotPackage.ARDUINO__CONECTOR:
				return getConector();
			case IotPackage.ARDUINO__PINS:
				return getPins();
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
			case IotPackage.ARDUINO__MODEL:
				setModel((String)newValue);
				return;
			case IotPackage.ARDUINO__CONECTOR:
				getConector().clear();
				getConector().addAll((Collection<? extends Motor>)newValue);
				return;
			case IotPackage.ARDUINO__PINS:
				setPins((Integer)newValue);
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
			case IotPackage.ARDUINO__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case IotPackage.ARDUINO__CONECTOR:
				getConector().clear();
				return;
			case IotPackage.ARDUINO__PINS:
				setPins(PINS_EDEFAULT);
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
			case IotPackage.ARDUINO__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case IotPackage.ARDUINO__CONECTOR:
				return conector != null && !conector.isEmpty();
			case IotPackage.ARDUINO__PINS:
				return pins != PINS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (model: ");
		result.append(model);
		result.append(", pins: ");
		result.append(pins);
		result.append(')');
		return result.toString();
	}

} //ArduinoImpl
