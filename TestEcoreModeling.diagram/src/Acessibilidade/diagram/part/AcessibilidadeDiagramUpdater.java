/*
* 
*/
package Acessibilidade.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class AcessibilidadeDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<Acessibilidade.diagram.part.AcessibilidadeNodeDescriptor> getSemanticChildren(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getContainedLinks(View view) {
		switch (Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(view)) {
		case Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID:
			return getApplication_1000ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getIncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getOutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getApplication_1000ContainedLinks(
			View view) {
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

		public List<Acessibilidade.diagram.part.AcessibilidadeNodeDescriptor> getSemanticChildren(View view) {
			return AcessibilidadeDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getContainedLinks(View view) {
			return AcessibilidadeDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getIncomingLinks(View view) {
			return AcessibilidadeDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<Acessibilidade.diagram.part.AcessibilidadeLinkDescriptor> getOutgoingLinks(View view) {
			return AcessibilidadeDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
