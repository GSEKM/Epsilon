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
 *   <li>{@link iot.Board#getModelo <em>Modelo</em>}</li>
 *   <li>{@link iot.Board#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getBoard()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Board extends EObject
{
  /**
	 * Returns the value of the '<em><b>Modelo</b></em>' containment reference list.
	 * The list contents are of type {@link iot.Arduino}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelo</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' containment reference list.
	 * @see iot.IotPackage#getBoard_Modelo()
	 * @model containment="true"
	 * @generated
	 */
  EList<Arduino> getModelo();

		/**
	 * Returns the value of the '<em><b>Modulo</b></em>' containment reference list.
	 * The list contents are of type {@link iot.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulo</em>' containment reference list.
	 * @see iot.IotPackage#getBoard_Modulo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motor> getModulo();

} // Board