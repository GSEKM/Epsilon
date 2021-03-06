/*
 * 
 */
package iot.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import iot.IotPackage;
import iot.diagram.edit.parts.ArduinoConectorEditPart;
import iot.diagram.edit.parts.ArduinoEditPart;
import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.MotorConectorMotorMotorEditPart;
import iot.diagram.edit.parts.MotorEditPart;
import iot.diagram.part.IotDiagramEditorPlugin;

/**
 * @generated
 */
public class IotElementTypes {

	/**
	* @generated
	*/
	private IotElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			IotDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Board_1000 = getElementType("model.gmf.example.diagram.Board_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Arduino_2006 = getElementType("model.gmf.example.diagram.Arduino_2006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Motor_2007 = getElementType("model.gmf.example.diagram.Motor_2007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ArduinoConector_4005 = getElementType(
			"model.gmf.example.diagram.ArduinoConector_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType MotorConectorMotorMotor_4006 = getElementType(
			"model.gmf.example.diagram.MotorConectorMotorMotor_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Board_1000, IotPackage.eINSTANCE.getBoard());

			elements.put(Arduino_2006, IotPackage.eINSTANCE.getArduino());

			elements.put(Motor_2007, IotPackage.eINSTANCE.getMotor());

			elements.put(ArduinoConector_4005, IotPackage.eINSTANCE.getArduino_Conector());

			elements.put(MotorConectorMotorMotor_4006, IotPackage.eINSTANCE.getMotor_ConectorMotorMotor());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Board_1000);
			KNOWN_ELEMENT_TYPES.add(Arduino_2006);
			KNOWN_ELEMENT_TYPES.add(Motor_2007);
			KNOWN_ELEMENT_TYPES.add(ArduinoConector_4005);
			KNOWN_ELEMENT_TYPES.add(MotorConectorMotorMotor_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BoardEditPart.VISUAL_ID:
			return Board_1000;
		case ArduinoEditPart.VISUAL_ID:
			return Arduino_2006;
		case MotorEditPart.VISUAL_ID:
			return Motor_2007;
		case ArduinoConectorEditPart.VISUAL_ID:
			return ArduinoConector_4005;
		case MotorConectorMotorMotorEditPart.VISUAL_ID:
			return MotorConectorMotorMotor_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return iot.diagram.providers.IotElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return iot.diagram.providers.IotElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return iot.diagram.providers.IotElementTypes.getElement(elementTypeAdapter);
		}
	};

}
