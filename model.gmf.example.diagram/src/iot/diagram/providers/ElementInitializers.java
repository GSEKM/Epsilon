/*
 * 
 */
package iot.diagram.providers;

import iot.diagram.part.IotDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = IotDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			IotDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
