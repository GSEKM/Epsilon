/**
 */
package myModel;

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
 * @see myModel.MyModelFactory
 * @model kind="package"
 * @generated
 */
public interface MyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "myModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iotgmf/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmf.diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModelPackage eINSTANCE = myModel.impl.MyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link myModel.impl.ArduinoImpl <em>Arduino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myModel.impl.ArduinoImpl
	 * @see myModel.impl.MyModelPackageImpl#getArduino()
	 * @generated
	 */
	int ARDUINO = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__MODULES = 1;

	/**
	 * The number of structural features of the '<em>Arduino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link myModel.impl.M�duloImpl <em>M�dulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myModel.impl.M�duloImpl
	 * @see myModel.impl.MyModelPackageImpl#getM�dulo()
	 * @generated
	 */
	int M�DULO = 1;

	/**
	 * The feature id for the '<em><b>M�dulos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M�DULO__M�DULOS = 0;

	/**
	 * The number of structural features of the '<em>M�dulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M�DULO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link myModel.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myModel.impl.ModuleImpl
	 * @see myModel.impl.MyModelPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link myModel.Arduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino</em>'.
	 * @see myModel.Arduino
	 * @generated
	 */
	EClass getArduino();

	/**
	 * Returns the meta object for the attribute '{@link myModel.Arduino#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board</em>'.
	 * @see myModel.Arduino#getBoard()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link myModel.Arduino#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see myModel.Arduino#getModules()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Modules();

	/**
	 * Returns the meta object for class '{@link myModel.M�dulo <em>M�dulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M�dulo</em>'.
	 * @see myModel.M�dulo
	 * @generated
	 */
	EClass getM�dulo();

	/**
	 * Returns the meta object for the reference list '{@link myModel.M�dulo#getM�dulos <em>M�dulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>M�dulos</em>'.
	 * @see myModel.M�dulo#getM�dulos()
	 * @see #getM�dulo()
	 * @generated
	 */
	EReference getM�dulo_M�dulos();

	/**
	 * Returns the meta object for class '{@link myModel.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see myModel.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link myModel.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myModel.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyModelFactory getMyModelFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link myModel.impl.ArduinoImpl <em>Arduino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myModel.impl.ArduinoImpl
		 * @see myModel.impl.MyModelPackageImpl#getArduino()
		 * @generated
		 */
		EClass ARDUINO = eINSTANCE.getArduino();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__BOARD = eINSTANCE.getArduino_Board();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__MODULES = eINSTANCE.getArduino_Modules();

		/**
		 * The meta object literal for the '{@link myModel.impl.M�duloImpl <em>M�dulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myModel.impl.M�duloImpl
		 * @see myModel.impl.MyModelPackageImpl#getM�dulo()
		 * @generated
		 */
		EClass M�DULO = eINSTANCE.getM�dulo();

		/**
		 * The meta object literal for the '<em><b>M�dulos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M�DULO__M�DULOS = eINSTANCE.getM�dulo_M�dulos();

		/**
		 * The meta object literal for the '{@link myModel.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myModel.impl.ModuleImpl
		 * @see myModel.impl.MyModelPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

	}

} //MyModelPackage
