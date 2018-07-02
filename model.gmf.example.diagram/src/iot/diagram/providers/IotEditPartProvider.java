/*
 * 
 */
package iot.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.IotEditPartFactory;
import iot.diagram.part.IotVisualIDRegistry;

/**
 * @generated
 */
public class IotEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public IotEditPartProvider() {
		super(new IotEditPartFactory(), IotVisualIDRegistry.TYPED_INSTANCE, BoardEditPart.MODEL_ID);
	}

}
