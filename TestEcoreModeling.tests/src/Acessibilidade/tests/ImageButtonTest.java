/**
 */
package Acessibilidade.tests;

import Acessibilidade.AcessibilidadeFactory;
import Acessibilidade.ImageButton;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Button</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageButtonTest extends InputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageButtonTest.class);
	}

	/**
	 * Constructs a new Image Button test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageButtonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageButton getFixture() {
		return (ImageButton)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcessibilidadeFactory.eINSTANCE.createImageButton());
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

} //ImageButtonTest
