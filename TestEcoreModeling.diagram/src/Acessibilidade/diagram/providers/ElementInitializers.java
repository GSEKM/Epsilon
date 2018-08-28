/*
 * 
 */
package Acessibilidade.diagram.providers;

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
		ElementInitializers cached = Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
