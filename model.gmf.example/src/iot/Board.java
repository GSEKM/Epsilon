/**
 */
package iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.Board#getArduino <em>Arduino</em>}</li>
 *   <li>{@link iot.Board#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getBoard()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Board extends EObject
{
  /**
	 * Returns the value of the '<em><b>Arduino</b></em>' containment reference list.
	 * The list contents are of type {@link iot.Arduino}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino</em>' containment reference list.
	 * @see iot.IotPackage#getBoard_Arduino()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino> getArduino();

	/**
	 * Returns the value of the '<em><b>Motor</b></em>' containment reference list.
	 * The list contents are of type {@link iot.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' containment reference list.
	 * @see iot.IotPackage#getBoard_Motor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motor> getMotor();

} // Board
