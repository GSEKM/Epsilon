/**
 */
package myModel;

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
 *   <li>{@link myModel.Arduino#getBoard <em>Board</em>}</li>
 *   <li>{@link myModel.Arduino#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see myModel.MyModelPackage#getArduino()
 * @model
 * @generated
 */
public interface Arduino extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' attribute.
	 * @see #setBoard(String)
	 * @see myModel.MyModelPackage#getArduino_Board()
	 * @model
	 * @generated
	 */
	String getBoard();

	/**
	 * Sets the value of the '{@link myModel.Arduino#getBoard <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' attribute.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link myModel.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see myModel.MyModelPackage#getArduino_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

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
