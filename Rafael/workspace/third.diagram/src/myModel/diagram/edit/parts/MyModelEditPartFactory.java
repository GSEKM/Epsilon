/*
 * 
 */
package myModel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MyModelEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {

			case myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID:
				return new myModel.diagram.edit.parts.ArduinoEditPart(view);

			case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
				return new myModel.diagram.edit.parts.ModuleEditPart(view);

			case myModel.diagram.edit.parts.ModuleNameEditPart.VISUAL_ID:
				return new myModel.diagram.edit.parts.ModuleNameEditPart(view);
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
