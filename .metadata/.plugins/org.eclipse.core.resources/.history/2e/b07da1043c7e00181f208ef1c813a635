/*
 * 
 */
package iot.diagram.part;

import iot.Board;
import iot.IotPackage;
import iot.diagram.edit.parts.ArduinoConectorEditPart;
import iot.diagram.edit.parts.ArduinoEditPart;
import iot.diagram.edit.parts.ArduinoModeloEditPart;
import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.MotorEditPart;
import iot.diagram.edit.parts.MotorGrausEditPart;
import iot.diagram.edit.parts.WrappingLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class IotVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "model.gmf.example.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (BoardEditPart.MODEL_ID.equals(view.getType())) {
				return BoardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return iot.diagram.part.IotVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				IotDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (IotPackage.eINSTANCE.getBoard().isSuperTypeOf(domainElement.eClass()) && isDiagram((Board) domainElement)) {
			return BoardEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = iot.diagram.part.IotVisualIDRegistry.getModelID(containerView);
		if (!BoardEditPart.MODEL_ID.equals(containerModelID) && !"iot".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (BoardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = iot.diagram.part.IotVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BoardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case BoardEditPart.VISUAL_ID:
			if (IotPackage.eINSTANCE.getArduino().isSuperTypeOf(domainElement.eClass())) {
				return ArduinoEditPart.VISUAL_ID;
			}
			if (IotPackage.eINSTANCE.getMotor().isSuperTypeOf(domainElement.eClass())) {
				return MotorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = iot.diagram.part.IotVisualIDRegistry.getModelID(containerView);
		if (!BoardEditPart.MODEL_ID.equals(containerModelID) && !"iot".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (BoardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = iot.diagram.part.IotVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BoardEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case BoardEditPart.VISUAL_ID:
			if (ArduinoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MotorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArduinoEditPart.VISUAL_ID:
			if (ArduinoModeloEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MotorEditPart.VISUAL_ID:
			if (MotorGrausEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArduinoConectorEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Board element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case BoardEditPart.VISUAL_ID:
			return false;
		case ArduinoEditPart.VISUAL_ID:
		case MotorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return iot.diagram.part.IotVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return iot.diagram.part.IotVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return iot.diagram.part.IotVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return iot.diagram.part.IotVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return iot.diagram.part.IotVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return iot.diagram.part.IotVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
