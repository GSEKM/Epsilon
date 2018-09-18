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
  String eNS_URI = "iot";

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
	 * The feature id for the '<em><b>Arduino</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ARDUINO = 0;

		/**
	 * The feature id for the '<em><b>Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MOTOR = 1;

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
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__MODEL = 0;

		/**
	 * The feature id for the '<em><b>Conector</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARDUINO__CONECTOR = 1;

  /**
	 * The feature id for the '<em><b>Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__PINS = 2;

		/**
	 * The number of structural features of the '<em>Arduino</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARDUINO_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__DEGREES = 0;

		/**
	 * The feature id for the '<em><b>Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PINS = 1;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = 2;

		/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__LIBRARY = 3;

		/**
	 * The feature id for the '<em><b>Conector Motor Motor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__CONECTOR_MOTOR_MOTOR = 4;

		/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOTOR_FEATURE_COUNT = 5;


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
	 * Returns the meta object for the containment reference list '{@link iot.Board#getArduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino</em>'.
	 * @see iot.Board#getArduino()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Arduino();

		/**
	 * Returns the meta object for the containment reference list '{@link iot.Board#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motor</em>'.
	 * @see iot.Board#getMotor()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Motor();

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
	 * Returns the meta object for the attribute '{@link iot.Arduino#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see iot.Arduino#getModel()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Model();

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
	 * Returns the meta object for the attribute '{@link iot.Arduino#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pins</em>'.
	 * @see iot.Arduino#getPins()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Pins();

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
	 * Returns the meta object for the attribute '{@link iot.Motor#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see iot.Motor#getDegrees()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Degrees();

		/**
	 * Returns the meta object for the attribute '{@link iot.Motor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pins</em>'.
	 * @see iot.Motor#getPins()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Pins();

		/**
	 * Returns the meta object for the attribute '{@link iot.Motor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.Motor#getName()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Name();

		/**
	 * Returns the meta object for the attribute '{@link iot.Motor#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see iot.Motor#getLibrary()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Library();

		/**
	 * Returns the meta object for the reference list '{@link iot.Motor#getConectorMotorMotor <em>Conector Motor Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conector Motor Motor</em>'.
	 * @see iot.Motor#getConectorMotorMotor()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_ConectorMotorMotor();

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
		 * The meta object literal for the '<em><b>Arduino</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__ARDUINO = eINSTANCE.getBoard_Arduino();

				/**
		 * The meta object literal for the '<em><b>Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__MOTOR = eINSTANCE.getBoard_Motor();

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
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__MODEL = eINSTANCE.getArduino_Model();

				/**
		 * The meta object literal for the '<em><b>Conector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ARDUINO__CONECTOR = eINSTANCE.getArduino_Conector();

    /**
		 * The meta object literal for the '<em><b>Pins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__PINS = eINSTANCE.getArduino_Pins();

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
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__DEGREES = eINSTANCE.getMotor_Degrees();

				/**
		 * The meta object literal for the '<em><b>Pins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__PINS = eINSTANCE.getMotor_Pins();

				/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__NAME = eINSTANCE.getMotor_Name();

				/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__LIBRARY = eINSTANCE.getMotor_Library();

				/**
		 * The meta object literal for the '<em><b>Conector Motor Motor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__CONECTOR_MOTOR_MOTOR = eINSTANCE.getMotor_ConectorMotorMotor();

  }

} //IotPackage
