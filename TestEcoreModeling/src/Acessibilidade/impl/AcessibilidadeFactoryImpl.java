/**
 */
package Acessibilidade.impl;

import Acessibilidade.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcessibilidadeFactoryImpl extends EFactoryImpl implements AcessibilidadeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcessibilidadeFactory init() {
		try {
			AcessibilidadeFactory theAcessibilidadeFactory = (AcessibilidadeFactory)EPackage.Registry.INSTANCE.getEFactory(AcessibilidadePackage.eNS_URI);
			if (theAcessibilidadeFactory != null) {
				return theAcessibilidadeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AcessibilidadeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcessibilidadeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AcessibilidadePackage.APPLICATION: return createApplication();
			case AcessibilidadePackage.WINDOW: return createWindow();
			case AcessibilidadePackage.OUTPUT: return createOutput();
			case AcessibilidadePackage.WIDGET: return createWidget();
			case AcessibilidadePackage.TEXT_OUTPUT: return createText_Output();
			case AcessibilidadePackage.IMAGE: return createImage();
			case AcessibilidadePackage.INPUT: return createInput();
			case AcessibilidadePackage.TEXT_INPUT: return createText_Input();
			case AcessibilidadePackage.COMBO_BOX: return createComboBox();
			case AcessibilidadePackage.RADIO_GROUP: return createRadioGroup();
			case AcessibilidadePackage.RADIO_BUTTON: return createRadioButton();
			case AcessibilidadePackage.BUTTON: return createButton();
			case AcessibilidadePackage.IMAGE_BUTTON: return createImageButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_Output createText_Output() {
		Text_OutputImpl text_Output = new Text_OutputImpl();
		return text_Output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_Input createText_Input() {
		Text_InputImpl text_Input = new Text_InputImpl();
		return text_Input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioGroup createRadioGroup() {
		RadioGroupImpl radioGroup = new RadioGroupImpl();
		return radioGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageButton createImageButton() {
		ImageButtonImpl imageButton = new ImageButtonImpl();
		return imageButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcessibilidadePackage getAcessibilidadePackage() {
		return (AcessibilidadePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AcessibilidadePackage getPackage() {
		return AcessibilidadePackage.eINSTANCE;
	}

} //AcessibilidadeFactoryImpl
