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
 *   <li>{@link iot.Arduino#getModel <em>Model</em>}</li>
 *   <li>{@link iot.Arduino#getConector <em>Conector</em>}</li>
 *   <li>{@link iot.Arduino#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getArduino()
 * @model annotation="gmf.node figure='figures.ArduinoFigure' label.icon='false' label='model' label.placement='external'"
 * @generated
 */
public interface Arduino extends EObject
{
  /**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see iot.IotPackage#getArduino_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link iot.Arduino#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

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
	 * Returns the value of the '<em><b>Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' attribute.
	 * @see #setPins(int)
	 * @see iot.IotPackage#getArduino_Pins()
	 * @model
	 * @generated
	 */
	int getPins();

		/**
	 * Sets the value of the '{@link iot.Arduino#getPins <em>Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pins</em>' attribute.
	 * @see #getPins()
	 * @generated
	 */
	void setPins(int value);

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
