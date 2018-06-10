/*
 * 
 */
package myModel.diagram.providers;

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
		ElementInitializers cached = myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
