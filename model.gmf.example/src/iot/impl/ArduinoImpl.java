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
 *   <li>{@link iot.impl.ArduinoImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link iot.impl.ArduinoImpl#getConector <em>Conector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoImpl extends EObjectImpl implements Arduino
{
  /**
	 * The default value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
  protected static final String MODELO_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
  protected String modelo = MODELO_EDEFAULT;

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
  public String getModelo()
  {
		return modelo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setModelo(String newModelo)
  {
		String oldModelo = modelo;
		modelo = newModelo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ARDUINO__MODELO, oldModelo, modelo));
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
			case IotPackage.ARDUINO__MODELO:
				return getModelo();
			case IotPackage.ARDUINO__CONECTOR:
				return getConector();
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
			case IotPackage.ARDUINO__MODELO:
				setModelo((String)newValue);
				return;
			case IotPackage.ARDUINO__CONECTOR:
				getConector().clear();
				getConector().addAll((Collection<? extends Motor>)newValue);
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
			case IotPackage.ARDUINO__MODELO:
				setModelo(MODELO_EDEFAULT);
				return;
			case IotPackage.ARDUINO__CONECTOR:
				getConector().clear();
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
			case IotPackage.ARDUINO__MODELO:
				return MODELO_EDEFAULT == null ? modelo != null : !MODELO_EDEFAULT.equals(modelo);
			case IotPackage.ARDUINO__CONECTOR:
				return conector != null && !conector.isEmpty();
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
		result.append(" (modelo: ");
		result.append(modelo);
		result.append(')');
		return result.toString();
	}

} //ArduinoImpl
