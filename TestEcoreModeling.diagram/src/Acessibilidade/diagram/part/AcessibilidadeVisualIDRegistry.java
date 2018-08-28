/*
* 
*/
package Acessibilidade.diagram.part;

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
public class AcessibilidadeVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "TestEcoreModeling.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID.equals(view.getType())) {
				return Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(view.getType());
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
				Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
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
		if (Acessibilidade.AcessibilidadePackage.eINSTANCE.getApplication().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Acessibilidade.Application) domainElement)) {
			return Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID;
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
		String containerModelID = Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getModelID(containerView);
		if (!Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID.equals(containerModelID)
				&& !"Acessibilidade".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getModelID(containerView);
		if (!Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID.equals(containerModelID)
				&& !"Acessibilidade".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
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
	private static boolean isDiagram(Acessibilidade.Application element) {
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
		case Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID:
			return false;
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
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
