/**
 */
package iot.impl;

import iot.Arduino;
import iot.Board;
import iot.IotFactory;
import iot.IotPackage;
import iot.Motor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotPackageImpl extends EPackageImpl implements IotPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass boardEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass arduinoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass motorEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iot.IotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private IotPackageImpl()
  {
		super(eNS_URI, IotFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static IotPackage init()
  {
		if (isInited) return (IotPackage)EPackage.Registry.INSTANCE.getEPackage(IotPackage.eNS_URI);

		// Obtain or create and register package
		IotPackageImpl theIotPackage = (IotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IotPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIotPackage.createPackageContents();

		// Initialize created meta-data
		theIotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IotPackage.eNS_URI, theIotPackage);
		return theIotPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBoard()
  {
		return boardEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Arduino() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Motor() {
		return (EReference)boardEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getArduino()
  {
		return arduinoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Model() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArduino_Conector()
  {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Pins() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMotor()
  {
		return motorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Degrees() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Pins() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Name() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Library() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_ConectorMotorMotor() {
		return (EReference)motorEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IotFactory getIotFactory()
  {
		return (IotFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__ARDUINO);
		createEReference(boardEClass, BOARD__MOTOR);

		arduinoEClass = createEClass(ARDUINO);
		createEAttribute(arduinoEClass, ARDUINO__MODEL);
		createEReference(arduinoEClass, ARDUINO__CONECTOR);
		createEAttribute(arduinoEClass, ARDUINO__PINS);

		motorEClass = createEClass(MOTOR);
		createEAttribute(motorEClass, MOTOR__DEGREES);
		createEAttribute(motorEClass, MOTOR__PINS);
		createEAttribute(motorEClass, MOTOR__NAME);
		createEAttribute(motorEClass, MOTOR__LIBRARY);
		createEReference(motorEClass, MOTOR__CONECTOR_MOTOR_MOTOR);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Arduino(), this.getArduino(), null, "Arduino", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Motor(), this.getMotor(), null, "Motor", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoEClass, Arduino.class, "Arduino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduino_Model(), ecorePackage.getEString(), "model", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Conector(), this.getMotor(), null, "conector", null, 0, -1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Pins(), ecorePackage.getEInt(), "pins", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(arduinoEClass, null, "setup", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(arduinoEClass, null, "loop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotor_Degrees(), ecorePackage.getEString(), "degrees", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Pins(), ecorePackage.getEInt(), "pins", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Library(), ecorePackage.getEString(), "library", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_ConectorMotorMotor(), this.getMotor(), null, "conectorMotorMotor", null, 0, -1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(motorEClass, null, "turn", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf.diagram";	
		addAnnotation
		  (boardEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.node";	
		addAnnotation
		  (arduinoEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ArduinoFigure",
			 "label.icon", "false",
			 "label", "model",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (motorEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.PersonFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.link";	
		addAnnotation
		  (getArduino_Conector(), 
		   source, 
		   new String[] {
			 "width", "2",
			 "color", "0,255,0",
			 "source.decoration", "arrow",
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getMotor_ConectorMotorMotor(), 
		   source, 
		   new String[] {
			 "width", "2",
			 "color", "0,255,0",
			 "source.decoration", "arrow",
			 "target.decoration", "arrow",
			 "style", "dash"
		   });
	}

} //IotPackageImpl
