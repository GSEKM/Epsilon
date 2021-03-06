/**
 */
package iot.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>iot</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotTests extends TestSuite
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(suite());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Test suite()
  {
		TestSuite suite = new IotTests("iot Tests");
		suite.addTestSuite(ArduinoTest.class);
		suite.addTestSuite(MotorTest.class);
		return suite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IotTests(String name)
  {
		super(name);
	}

} //IotTests
