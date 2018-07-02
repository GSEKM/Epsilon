/*
* 
*/
package iot.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import iot.diagram.edit.parts.ArduinoConectorEditPart;
import iot.diagram.edit.parts.ArduinoEditPart;
import iot.diagram.edit.parts.ArduinoModelEditPart;
import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.MotorEditPart;
import iot.diagram.edit.parts.MotorNameEditPart;
import iot.diagram.part.IotDiagramEditorPlugin;
import iot.diagram.part.IotVisualIDRegistry;
import iot.diagram.providers.IotElementTypes;
import iot.diagram.providers.IotParserProvider;

/**
 * @generated
 */
public class IotNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		IotDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		IotDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof IotNavigatorItem && !isOwnView(((IotNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof IotNavigatorGroup) {
			IotNavigatorGroup group = (IotNavigatorGroup) element;
			return IotDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof IotNavigatorItem) {
			IotNavigatorItem navigatorItem = (IotNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case BoardEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?iot?Board", IotElementTypes.Board_1000); //$NON-NLS-1$
		case ArduinoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?iot?Arduino", IotElementTypes.Arduino_2006); //$NON-NLS-1$
		case MotorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?iot?Motor", IotElementTypes.Motor_2007); //$NON-NLS-1$
		case ArduinoConectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?iot?Arduino?conector", IotElementTypes.ArduinoConector_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = IotDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && IotElementTypes.isKnownElementType(elementType)) {
			image = IotElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof IotNavigatorGroup) {
			IotNavigatorGroup group = (IotNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof IotNavigatorItem) {
			IotNavigatorItem navigatorItem = (IotNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (IotVisualIDRegistry.getVisualID(view)) {
		case BoardEditPart.VISUAL_ID:
			return getBoard_1000Text(view);
		case ArduinoEditPart.VISUAL_ID:
			return getArduino_2006Text(view);
		case MotorEditPart.VISUAL_ID:
			return getMotor_2007Text(view);
		case ArduinoConectorEditPart.VISUAL_ID:
			return getArduinoConector_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getBoard_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getArduino_2006Text(View view) {
		IParser parser = IotParserProvider.getParser(IotElementTypes.Arduino_2006,
				view.getElement() != null ? view.getElement() : view,
				IotVisualIDRegistry.getType(ArduinoModelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IotDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMotor_2007Text(View view) {
		IParser parser = IotParserProvider.getParser(IotElementTypes.Motor_2007,
				view.getElement() != null ? view.getElement() : view,
				IotVisualIDRegistry.getType(MotorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IotDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArduinoConector_4005Text(View view) {
		IParser parser = IotParserProvider.getParser(IotElementTypes.ArduinoConector_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IotDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return BoardEditPart.MODEL_ID.equals(IotVisualIDRegistry.getModelID(view));
	}

}
