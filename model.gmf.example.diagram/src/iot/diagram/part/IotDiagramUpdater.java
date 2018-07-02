/*
* 
*/
package iot.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import iot.Arduino;
import iot.Board;
import iot.IotPackage;
import iot.Motor;
import iot.diagram.edit.parts.ArduinoConectorEditPart;
import iot.diagram.edit.parts.ArduinoEditPart;
import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.MotorEditPart;
import iot.diagram.providers.IotElementTypes;

/**
 * @generated
 */
public class IotDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<IotNodeDescriptor> getSemanticChildren(View view) {
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case BoardEditPart.VISUAL_ID:
			return getBoard_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotNodeDescriptor> getBoard_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Board modelElement = (Board) view.getElement();
		LinkedList<IotNodeDescriptor> result = new LinkedList<IotNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArduino().iterator(); it.hasNext();) {
			Arduino childElement = (Arduino) it.next();
			int visualID = IotVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ArduinoEditPart.VISUAL_ID) {
				result.add(new IotNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMotor().iterator(); it.hasNext();) {
			Motor childElement = (Motor) it.next();
			int visualID = IotVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MotorEditPart.VISUAL_ID) {
				result.add(new IotNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getContainedLinks(View view) {
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case BoardEditPart.VISUAL_ID:
			return getBoard_1000ContainedLinks(view);
		case ArduinoEditPart.VISUAL_ID:
			return getArduino_2006ContainedLinks(view);
		case MotorEditPart.VISUAL_ID:
			return getMotor_2007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getIncomingLinks(View view) {
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case ArduinoEditPart.VISUAL_ID:
			return getArduino_2006IncomingLinks(view);
		case MotorEditPart.VISUAL_ID:
			return getMotor_2007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getOutgoingLinks(View view) {
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case ArduinoEditPart.VISUAL_ID:
			return getArduino_2006OutgoingLinks(view);
		case MotorEditPart.VISUAL_ID:
			return getMotor_2007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IotLinkDescriptor> getBoard_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getArduino_2006ContainedLinks(View view) {
		Arduino modelElement = (Arduino) view.getElement();
		LinkedList<IotLinkDescriptor> result = new LinkedList<IotLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Arduino_Conector_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getMotor_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getArduino_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getMotor_2007IncomingLinks(View view) {
		Motor modelElement = (Motor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IotLinkDescriptor> result = new LinkedList<IotLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Arduino_Conector_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getArduino_2006OutgoingLinks(View view) {
		Arduino modelElement = (Arduino) view.getElement();
		LinkedList<IotLinkDescriptor> result = new LinkedList<IotLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Arduino_Conector_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<IotLinkDescriptor> getMotor_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<IotLinkDescriptor> getIncomingFeatureModelFacetLinks_Arduino_Conector_4005(Motor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IotLinkDescriptor> result = new LinkedList<IotLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == IotPackage.eINSTANCE.getArduino_Conector()) {
				result.add(new IotLinkDescriptor(setting.getEObject(), target, IotElementTypes.ArduinoConector_4005,
						ArduinoConectorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<IotLinkDescriptor> getOutgoingFeatureModelFacetLinks_Arduino_Conector_4005(
			Arduino source) {
		LinkedList<IotLinkDescriptor> result = new LinkedList<IotLinkDescriptor>();
		for (Iterator<?> destinations = source.getConector().iterator(); destinations.hasNext();) {
			Motor destination = (Motor) destinations.next();
			result.add(new IotLinkDescriptor(source, destination, IotElementTypes.ArduinoConector_4005,
					ArduinoConectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<IotNodeDescriptor> getSemanticChildren(View view) {
			return IotDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<IotLinkDescriptor> getContainedLinks(View view) {
			return IotDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<IotLinkDescriptor> getIncomingLinks(View view) {
			return IotDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<IotLinkDescriptor> getOutgoingLinks(View view) {
			return IotDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
