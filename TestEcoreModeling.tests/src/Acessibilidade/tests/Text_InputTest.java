/**
 */
package Acessibilidade.tests;

import Acessibilidade.AcessibilidadeFactory;
import Acessibilidade.Text_Input;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Text_InputTest extends InputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Text_InputTest.class);
	}

	/**
	 * Constructs a new Text Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_InputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Text_Input getFixture() {
		return (Text_Input)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcessibilidadeFactory.eINSTANCE.createText_Input());
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

} //Text_InputTest
