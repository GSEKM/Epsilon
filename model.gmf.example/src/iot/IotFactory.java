/**
 */
package iot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iot.IotPackage
 * @generated
 */
public interface IotFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  IotFactory eINSTANCE = iot.impl.IotFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
  Board createBoard();

  /**
	 * Returns a new object of class '<em>Arduino</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino</em>'.
	 * @generated
	 */
  Arduino createArduino();

  /**
	 * Returns a new object of class '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor</em>'.
	 * @generated
	 */
  Motor createMotor();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  IotPackage getIotPackage();

} //IotFactory
