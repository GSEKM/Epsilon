/**
 */
package iot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iot.IotFactory
 * @model kind="package"
 * @generated
 */
public interface IotPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "iot";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "friends";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  IotPackage eINSTANCE = iot.impl.IotPackageImpl.init();

  /**
	 * The meta object id for the '{@link iot.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.impl.BoardImpl
	 * @see iot.impl.IotPackageImpl#getBoard()
	 * @generated
	 */
  int BOARD = 0;

  /**
	 * The feature id for the '<em><b>Modelo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOARD__MODELO = 0;

  /**
	 * The feature id for the '<em><b>Modulo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MODULO = 1;

		/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOARD_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link iot.impl.ArduinoImpl <em>Arduino</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.impl.ArduinoImpl
	 * @see iot.impl.IotPackageImpl#getArduino()
	 * @generated
	 */
  int ARDUINO = 1;

  /**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARDUINO__MODELO = 0;

  /**
	 * The feature id for the '<em><b>Conector</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARDUINO__CONECTOR = 1;

  /**
	 * The number of structural features of the '<em>Arduino</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARDUINO_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link iot.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.impl.MotorImpl
	 * @see iot.impl.IotPackageImpl#getMotor()
	 * @generated
	 */
  int MOTOR = 2;

  /**
	 * The feature id for the '<em><b>Graus</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOTOR__GRAUS = 0;

  /**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOTOR_FEATURE_COUNT = 1;


  /**
	 * Returns the meta object for class '{@link iot.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see iot.Board
	 * @generated
	 */
  EClass getBoard();

  /**
	 * Returns the meta object for the containment reference list '{@link iot.Board#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelo</em>'.
	 * @see iot.Board#getModelo()
	 * @see #getBoard()
	 * @generated
	 */
  EReference getBoard_Modelo();

  /**
	 * Returns the meta object for the containment reference list '{@link iot.Board#getModulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modulo</em>'.
	 * @see iot.Board#getModulo()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Modulo();

		/**
	 * Returns the meta object for class '{@link iot.Arduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino</em>'.
	 * @see iot.Arduino
	 * @generated
	 */
  EClass getArduino();

  /**
	 * Returns the meta object for the attribute '{@link iot.Arduino#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see iot.Arduino#getModelo()
	 * @see #getArduino()
	 * @generated
	 */
  EAttribute getArduino_Modelo();

  /**
	 * Returns the meta object for the reference list '{@link iot.Arduino#getConector <em>Conector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conector</em>'.
	 * @see iot.Arduino#getConector()
	 * @see #getArduino()
	 * @generated
	 */
  EReference getArduino_Conector();

  /**
	 * Returns the meta object for class '{@link iot.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see iot.Motor
	 * @generated
	 */
  EClass getMotor();

  /**
	 * Returns the meta object for the attribute '{@link iot.Motor#getGraus <em>Graus</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graus</em>'.
	 * @see iot.Motor#getGraus()
	 * @see #getMotor()
	 * @generated
	 */
  EAttribute getMotor_Graus();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  IotFactory getIotFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link iot.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see iot.impl.BoardImpl
		 * @see iot.impl.IotPackageImpl#getBoard()
		 * @generated
		 */
    EClass BOARD = eINSTANCE.getBoard();

    /**
		 * The meta object literal for the '<em><b>Modelo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BOARD__MODELO = eINSTANCE.getBoard_Modelo();

    /**
		 * The meta object literal for the '<em><b>Modulo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__MODULO = eINSTANCE.getBoard_Modulo();

				/**
		 * The meta object literal for the '{@link iot.impl.ArduinoImpl <em>Arduino</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see iot.impl.ArduinoImpl
		 * @see iot.impl.IotPackageImpl#getArduino()
		 * @generated
		 */
    EClass ARDUINO = eINSTANCE.getArduino();

    /**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ARDUINO__MODELO = eINSTANCE.getArduino_Modelo();

    /**
		 * The meta object literal for the '<em><b>Conector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ARDUINO__CONECTOR = eINSTANCE.getArduino_Conector();

    /**
		 * The meta object literal for the '{@link iot.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see iot.impl.MotorImpl
		 * @see iot.impl.IotPackageImpl#getMotor()
		 * @generated
		 */
    EClass MOTOR = eINSTANCE.getMotor();

    /**
		 * The meta object literal for the '<em><b>Graus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MOTOR__GRAUS = eINSTANCE.getMotor_Graus();

  }

} //IotPackage