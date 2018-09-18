/**
 */
package iot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.Motor#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link iot.Motor#getPins <em>Pins</em>}</li>
 *   <li>{@link iot.Motor#getName <em>Name</em>}</li>
 *   <li>{@link iot.Motor#getLibrary <em>Library</em>}</li>
 *   <li>{@link iot.Motor#getConectorMotorMotor <em>Conector Motor Motor</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getMotor()
 * @model annotation="gmf.node figure='figures.PersonFigure' label.icon='false' label='name' label.placement='external'"
 * @generated
 */
public interface Motor extends EObject
{
  /**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(String)
	 * @see iot.IotPackage#getMotor_Degrees()
	 * @model
	 * @generated
	 */
	String getDegrees();

	/**
	 * Sets the value of the '{@link iot.Motor#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(String value);

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
	 * @see iot.IotPackage#getMotor_Pins()
	 * @model
	 * @generated
	 */
	int getPins();

	/**
	 * Sets the value of the '{@link iot.Motor#getPins <em>Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pins</em>' attribute.
	 * @see #getPins()
	 * @generated
	 */
	void setPins(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.IotPackage#getMotor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.Motor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see iot.IotPackage#getMotor_Library()
	 * @model
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link iot.Motor#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Conector Motor Motor</b></em>' reference list.
	 * The list contents are of type {@link iot.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conector Motor Motor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conector Motor Motor</em>' reference list.
	 * @see iot.IotPackage#getMotor_ConectorMotorMotor()
	 * @model annotation="gmf.link width='2' color='0,255,0' source.decoration='arrow' target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<Motor> getConectorMotorMotor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void turn();

} // Motor
