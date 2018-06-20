/**
 */
package iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.Arduino#getModelo <em>Modelo</em>}</li>
 *   <li>{@link iot.Arduino#getConector <em>Conector</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getArduino()
 * @model annotation="gmf.node figure='figures.ArduinoFigure' label.icon='false' label='modelo' label.placement='external'"
 * @generated
 */
public interface Arduino extends EObject
{
  /**
	 * Returns the value of the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' attribute.
	 * @see #setModelo(String)
	 * @see iot.IotPackage#getArduino_Modelo()
	 * @model
	 * @generated
	 */
  String getModelo();

  /**
	 * Sets the value of the '{@link iot.Arduino#getModelo <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo</em>' attribute.
	 * @see #getModelo()
	 * @generated
	 */
  void setModelo(String value);

  /**
	 * Returns the value of the '<em><b>Conector</b></em>' reference list.
	 * The list contents are of type {@link iot.Motor}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conector</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Conector</em>' reference list.
	 * @see iot.IotPackage#getArduino_Conector()
	 * @model annotation="gmf.link width='2' color='0,255,0' source.decoration='arrow' target.decoration='arrow' style='dash'"
	 * @generated
	 */
  EList<Motor> getConector();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void setup();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void loop();

} // Arduino
