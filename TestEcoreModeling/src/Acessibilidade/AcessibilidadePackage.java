/**
 */
package Acessibilidade;

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
 * @see Acessibilidade.AcessibilidadeFactory
 * @model kind="package"
 * @generated
 */
public interface AcessibilidadePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Acessibilidade";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pucpr.ppgia.geps.mestrado.luanmelo.projeto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Acessibilidade";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcessibilidadePackage eINSTANCE = Acessibilidade.impl.AcessibilidadePackageImpl.init();

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.ApplicationImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Nome Projeto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NOME_PROJETO = 0;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__WINDOWS = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.WindowImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Laucher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_LAUCHER = 1;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDGETS = 2;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.WidgetImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = 0;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MARGIN_TOP = 1;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MARGIN_BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MARGIN_LEFT = 3;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MARGIN_RIGHT = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CONTENT_DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.OutputImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MARGIN_TOP = WIDGET__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MARGIN_BOTTOM = WIDGET__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MARGIN_LEFT = WIDGET__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MARGIN_RIGHT = WIDGET__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTENT_DESCRIPTION = WIDGET__CONTENT_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.Text_OutputImpl <em>Text Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.Text_OutputImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getText_Output()
	 * @generated
	 */
	int TEXT_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__ID = OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__MARGIN_TOP = OUTPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__MARGIN_BOTTOM = OUTPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__MARGIN_LEFT = OUTPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__MARGIN_RIGHT = OUTPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__WIDTH = OUTPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__HEIGHT = OUTPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__CONTENT_DESCRIPTION = OUTPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT__TEXT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.ImageImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARGIN_TOP = OUTPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARGIN_BOTTOM = OUTPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARGIN_LEFT = OUTPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARGIN_RIGHT = OUTPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = OUTPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = OUTPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT_DESCRIPTION = OUTPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE_PATH = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.InputImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MARGIN_TOP = WIDGET__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MARGIN_BOTTOM = WIDGET__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MARGIN_LEFT = WIDGET__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MARGIN_RIGHT = WIDGET__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CONTENT_DESCRIPTION = WIDGET__CONTENT_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.Text_InputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.Text_InputImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getText_Input()
	 * @generated
	 */
	int TEXT_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__MARGIN_TOP = INPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__MARGIN_BOTTOM = INPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__MARGIN_LEFT = INPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__MARGIN_RIGHT = INPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__WIDTH = INPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGHT = INPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__CONTENT_DESCRIPTION = INPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TYPE = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.ComboBoxImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__MARGIN_TOP = INPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__MARGIN_BOTTOM = INPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__MARGIN_LEFT = INPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__MARGIN_RIGHT = INPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__WIDTH = INPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__HEIGHT = INPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__CONTENT_DESCRIPTION = INPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TEXT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.RadioGroupImpl <em>Radio Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.RadioGroupImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getRadioGroup()
	 * @generated
	 */
	int RADIO_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__MARGIN_TOP = INPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__MARGIN_BOTTOM = INPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__MARGIN_LEFT = INPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__MARGIN_RIGHT = INPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__WIDTH = INPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__HEIGHT = INPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__CONTENT_DESCRIPTION = INPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Radio Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__RADIO_BUTTONS = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.RadioButtonImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__CONTENT_DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.ButtonImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARGIN_TOP = INPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARGIN_BOTTOM = INPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARGIN_LEFT = INPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARGIN_RIGHT = INPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = INPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = INPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENT_DESCRIPTION = INPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Acessibilidade.impl.ImageButtonImpl <em>Image Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Acessibilidade.impl.ImageButtonImpl
	 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getImageButton()
	 * @generated
	 */
	int IMAGE_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__MARGIN_TOP = INPUT__MARGIN_TOP;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__MARGIN_BOTTOM = INPUT__MARGIN_BOTTOM;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__MARGIN_LEFT = INPUT__MARGIN_LEFT;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__MARGIN_RIGHT = INPUT__MARGIN_RIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__WIDTH = INPUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__HEIGHT = INPUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__CONTENT_DESCRIPTION = INPUT__CONTENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON__IMAGE_PATH = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUTTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Acessibilidade.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see Acessibilidade.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Application#getNomeProjeto <em>Nome Projeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Projeto</em>'.
	 * @see Acessibilidade.Application#getNomeProjeto()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_NomeProjeto();

	/**
	 * Returns the meta object for the containment reference list '{@link Acessibilidade.Application#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see Acessibilidade.Application#getWindows()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Windows();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see Acessibilidade.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Window#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Acessibilidade.Window#getId()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Id();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Window#isIsLaucher <em>Is Laucher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Laucher</em>'.
	 * @see Acessibilidade.Window#isIsLaucher()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_IsLaucher();

	/**
	 * Returns the meta object for the containment reference list '{@link Acessibilidade.Window#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see Acessibilidade.Window#getWidgets()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Widgets();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see Acessibilidade.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see Acessibilidade.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Acessibilidade.Widget#getId()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Id();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see Acessibilidade.Widget#getMarginTop()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see Acessibilidade.Widget#getMarginBottom()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MarginBottom();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see Acessibilidade.Widget#getMarginLeft()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MarginLeft();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see Acessibilidade.Widget#getMarginRight()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MarginRight();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Acessibilidade.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Width();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see Acessibilidade.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Height();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Widget#getContentDescription <em>Content Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Description</em>'.
	 * @see Acessibilidade.Widget#getContentDescription()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_ContentDescription();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Text_Output <em>Text Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Output</em>'.
	 * @see Acessibilidade.Text_Output
	 * @generated
	 */
	EClass getText_Output();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Text_Output#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Acessibilidade.Text_Output#getText()
	 * @see #getText_Output()
	 * @generated
	 */
	EAttribute getText_Output_Text();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see Acessibilidade.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Image#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see Acessibilidade.Image#getImagePath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_ImagePath();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see Acessibilidade.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Text_Input <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see Acessibilidade.Text_Input
	 * @generated
	 */
	EClass getText_Input();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Text_Input#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Acessibilidade.Text_Input#getText()
	 * @see #getText_Input()
	 * @generated
	 */
	EAttribute getText_Input_Text();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Text_Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Acessibilidade.Text_Input#getType()
	 * @see #getText_Input()
	 * @generated
	 */
	EAttribute getText_Input_Type();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see Acessibilidade.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.ComboBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Acessibilidade.ComboBox#getText()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_Text();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Group</em>'.
	 * @see Acessibilidade.RadioGroup
	 * @generated
	 */
	EClass getRadioGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link Acessibilidade.RadioGroup#getRadioButtons <em>Radio Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Radio Buttons</em>'.
	 * @see Acessibilidade.RadioGroup#getRadioButtons()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_RadioButtons();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see Acessibilidade.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.RadioButton#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Acessibilidade.RadioButton#getId()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Id();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.RadioButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Acessibilidade.RadioButton#getText()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.RadioButton#getContentDescription <em>Content Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Description</em>'.
	 * @see Acessibilidade.RadioButton#getContentDescription()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_ContentDescription();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see Acessibilidade.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Acessibilidade.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for class '{@link Acessibilidade.ImageButton <em>Image Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Button</em>'.
	 * @see Acessibilidade.ImageButton
	 * @generated
	 */
	EClass getImageButton();

	/**
	 * Returns the meta object for the attribute '{@link Acessibilidade.ImageButton#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see Acessibilidade.ImageButton#getImagePath()
	 * @see #getImageButton()
	 * @generated
	 */
	EAttribute getImageButton_ImagePath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcessibilidadeFactory getAcessibilidadeFactory();

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
		 * The meta object literal for the '{@link Acessibilidade.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.ApplicationImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Nome Projeto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NOME_PROJETO = eINSTANCE.getApplication_NomeProjeto();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__WINDOWS = eINSTANCE.getApplication_Windows();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.WindowImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ID = eINSTANCE.getWindow_Id();

		/**
		 * The meta object literal for the '<em><b>Is Laucher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__IS_LAUCHER = eINSTANCE.getWindow_IsLaucher();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__WIDGETS = eINSTANCE.getWindow_Widgets();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.OutputImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.WidgetImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MARGIN_TOP = eINSTANCE.getWidget_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MARGIN_BOTTOM = eINSTANCE.getWidget_MarginBottom();

		/**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MARGIN_LEFT = eINSTANCE.getWidget_MarginLeft();

		/**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MARGIN_RIGHT = eINSTANCE.getWidget_MarginRight();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDTH = eINSTANCE.getWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__HEIGHT = eINSTANCE.getWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Content Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CONTENT_DESCRIPTION = eINSTANCE.getWidget_ContentDescription();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.Text_OutputImpl <em>Text Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.Text_OutputImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getText_Output()
		 * @generated
		 */
		EClass TEXT_OUTPUT = eINSTANCE.getText_Output();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_OUTPUT__TEXT = eINSTANCE.getText_Output_Text();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.ImageImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__IMAGE_PATH = eINSTANCE.getImage_ImagePath();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.InputImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.Text_InputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.Text_InputImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getText_Input()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getText_Input();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT = eINSTANCE.getText_Input_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TYPE = eINSTANCE.getText_Input_Type();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.ComboBoxImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__TEXT = eINSTANCE.getComboBox_Text();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.RadioGroupImpl <em>Radio Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.RadioGroupImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getRadioGroup()
		 * @generated
		 */
		EClass RADIO_GROUP = eINSTANCE.getRadioGroup();

		/**
		 * The meta object literal for the '<em><b>Radio Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_GROUP__RADIO_BUTTONS = eINSTANCE.getRadioGroup_RadioButtons();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.RadioButtonImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__ID = eINSTANCE.getRadioButton_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__TEXT = eINSTANCE.getRadioButton_Text();

		/**
		 * The meta object literal for the '<em><b>Content Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__CONTENT_DESCRIPTION = eINSTANCE.getRadioButton_ContentDescription();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.ButtonImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '{@link Acessibilidade.impl.ImageButtonImpl <em>Image Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Acessibilidade.impl.ImageButtonImpl
		 * @see Acessibilidade.impl.AcessibilidadePackageImpl#getImageButton()
		 * @generated
		 */
		EClass IMAGE_BUTTON = eINSTANCE.getImageButton();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_BUTTON__IMAGE_PATH = eINSTANCE.getImageButton_ImagePath();

	}

} //AcessibilidadePackage
