/*
* 
*/
package Acessibilidade.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AcessibilidadeNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 1002;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 1001;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) {
			Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem item = (Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
