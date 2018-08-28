/**
 */
package Acessibilidade.tests;

import Acessibilidade.AcessibilidadeFactory;
import Acessibilidade.Text_Output;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Text_OutputTest extends OutputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Text_OutputTest.class);
	}

	/**
	 * Constructs a new Text Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_OutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Text_Output getFixture() {
		return (Text_Output)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcessibilidadeFactory.eINSTANCE.createText_Output());
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

} //Text_OutputTest
