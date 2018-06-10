/*
* 
*/
package myModel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

/**
 * @generated
 */
public class MyModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof myModel.diagram.navigator.MyModelNavigatorItem
				&& !isOwnView(((myModel.diagram.navigator.MyModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof myModel.diagram.navigator.MyModelNavigatorGroup) {
			myModel.diagram.navigator.MyModelNavigatorGroup group = (myModel.diagram.navigator.MyModelNavigatorGroup) element;
			return myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof myModel.diagram.navigator.MyModelNavigatorItem) {
			myModel.diagram.navigator.MyModelNavigatorItem navigatorItem = (myModel.diagram.navigator.MyModelNavigatorItem) element;
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
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://iotgmf/1.0?Arduino", //$NON-NLS-1$
					myModel.diagram.providers.MyModelElementTypes.Arduino_1000);
		case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://iotgmf/1.0?Module", //$NON-NLS-1$
					myModel.diagram.providers.MyModelElementTypes.Module_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& myModel.diagram.providers.MyModelElementTypes.isKnownElementType(elementType)) {
			image = myModel.diagram.providers.MyModelElementTypes.getImage(elementType);
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
		if (element instanceof myModel.diagram.navigator.MyModelNavigatorGroup) {
			myModel.diagram.navigator.MyModelNavigatorGroup group = (myModel.diagram.navigator.MyModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof myModel.diagram.navigator.MyModelNavigatorItem) {
			myModel.diagram.navigator.MyModelNavigatorItem navigatorItem = (myModel.diagram.navigator.MyModelNavigatorItem) element;
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
		switch (myModel.diagram.part.MyModelVisualIDRegistry.getVisualID(view)) {
		case myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID:
			return getArduino_1000Text(view);
		case myModel.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArduino_1000Text(View view) {
		myModel.Arduino domainModelElement = (myModel.Arduino) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getBoard();
		} else {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModule_2001Text(View view) {
		IParser parser = myModel.diagram.providers.MyModelParserProvider.getParser(
				myModel.diagram.providers.MyModelElementTypes.Module_2001,
				view.getElement() != null ? view.getElement() : view, myModel.diagram.part.MyModelVisualIDRegistry
						.getType(myModel.diagram.edit.parts.ModuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return myModel.diagram.edit.parts.ArduinoEditPart.MODEL_ID
				.equals(myModel.diagram.part.MyModelVisualIDRegistry.getModelID(view));
	}

}
