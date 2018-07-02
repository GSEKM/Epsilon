/*
* 
*/
package iot.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import iot.diagram.part.IotVisualIDRegistry;

/**
 * @generated
 */
public class IotNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4007;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof IotNavigatorItem) {
			IotNavigatorItem item = (IotNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return IotVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
