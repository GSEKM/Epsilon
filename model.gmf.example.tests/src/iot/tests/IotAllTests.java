/**
 */
package iot.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Iot</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotAllTests extends TestSuite
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
		TestSuite suite = new IotAllTests("Iot Tests");
		suite.addTest(IotTests.suite());
		return suite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IotAllTests(String name)
  {
		super(name);
	}

} //IotAllTests
