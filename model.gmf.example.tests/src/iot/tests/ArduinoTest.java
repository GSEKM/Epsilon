/**
 */
package iot.tests;

import iot.Arduino;
import iot.IotFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link iot.Arduino#setup() <em>Setup</em>}</li>
 *   <li>{@link iot.Arduino#loop() <em>Loop</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ArduinoTest extends TestCase
{

  /**
	 * The fixture for this Arduino test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Arduino fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ArduinoTest.class);
	}

  /**
	 * Constructs a new Arduino test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArduinoTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Arduino test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(Arduino fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Arduino test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Arduino getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(IotFactory.eINSTANCE.createArduino());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

  /**
	 * Tests the '{@link iot.Arduino#setup() <em>Setup</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.Arduino#setup()
	 * @generated
	 */
  public void testSetup()
  {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

  /**
	 * Tests the '{@link iot.Arduino#loop() <em>Loop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.Arduino#loop()
	 * @generated
	 */
  public void testLoop()
  {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ArduinoTest
