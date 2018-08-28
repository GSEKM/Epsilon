/**
 */
package Acessibilidade.tests;

import Acessibilidade.AcessibilidadeFactory;
import Acessibilidade.RadioGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadioGroupTest extends InputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RadioGroupTest.class);
	}

	/**
	 * Constructs a new Radio Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Radio Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RadioGroup getFixture() {
		return (RadioGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcessibilidadeFactory.eINSTANCE.createRadioGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RadioGroupTest
