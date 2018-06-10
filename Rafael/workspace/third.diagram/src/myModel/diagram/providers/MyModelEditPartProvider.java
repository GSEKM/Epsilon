/*
 * 
 */
package myModel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class MyModelEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MyModelEditPartProvider() {
		super(new myModel.diagram.edit.parts.MyModelEditPartFactory(),
				myModel.diagram.part.MyModelVisualIDRegistry.TYPED_INSTANCE,
				myModel.diagram.edit.parts.ArduinoEditPart.MODEL_ID);
	}

}
