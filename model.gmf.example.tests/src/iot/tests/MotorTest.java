/**
 */
package iot.tests;

import iot.IotFactory;
import iot.Motor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link iot.Motor#girar() <em>Girar</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MotorTest extends TestCase
{

  /**
	 * The fixture for this Motor test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Motor fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(MotorTest.class);
	}

  /**
	 * Constructs a new Motor test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MotorTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Motor test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(Motor fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Motor test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Motor getFixture()
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
		setFixture(IotFactory.eINSTANCE.createMotor());
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
	 * Tests the '{@link iot.Motor#girar() <em>Girar</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see iot.Motor#girar()
	 * @generated
	 */
  public void testGirar()
  {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //MotorTest
