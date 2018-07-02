/*
 * 
 */
package iot.diagram.edit.parts;

import iot.diagram.part.IotVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class IotEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (IotVisualIDRegistry.getVisualID(view)) {

			case BoardEditPart.VISUAL_ID:
				return new BoardEditPart(view);

			case ArduinoEditPart.VISUAL_ID:
				return new ArduinoEditPart(view);

			case ArduinoModeloEditPart.VISUAL_ID:
				return new ArduinoModeloEditPart(view);

			case MotorEditPart.VISUAL_ID:
				return new MotorEditPart(view);

			case MotorGrausEditPart.VISUAL_ID:
				return new MotorGrausEditPart(view);

			case ArduinoConectorEditPart.VISUAL_ID:
				return new ArduinoConectorEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
