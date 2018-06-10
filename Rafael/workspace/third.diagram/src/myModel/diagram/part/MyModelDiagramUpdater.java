/*
* 
*/
package myModel.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyModelDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<myModel.diagram.part.MyModelNodeDescriptor> getSemanticChildren(View view) {
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID:
			return getArduino_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myModel.diagram.part.MyModelNodeDescriptor> getArduino_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		myModel.Arduino modelElement = (myModel.Arduino) view.getElement();
		LinkedList<myModel.diagram.part.MyModelNodeDescriptor> result = new LinkedList<myModel.diagram.part.MyModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModules().iterator(); it.hasNext();) {
			myModel.Module childElement = (myModel.Module) it.next();
			int visualID = myModel.diagram.part.MyModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID) {
				result.add(new myModel.diagram.part.MyModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getContainedLinks(View view) {
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID:
			return getArduino_1000ContainedLinks(view);
		case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getIncomingLinks(View view) {
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getArduino_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getModule_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getModule_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myModel.diagram.part.MyModelLinkDescriptor> getModule_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<myModel.diagram.part.MyModelNodeDescriptor> getSemanticChildren(View view) {
			return MyModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myModel.diagram.part.MyModelLinkDescriptor> getContainedLinks(View view) {
			return MyModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myModel.diagram.part.MyModelLinkDescriptor> getIncomingLinks(View view) {
			return MyModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myModel.diagram.part.MyModelLinkDescriptor> getOutgoingLinks(View view) {
			return MyModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
