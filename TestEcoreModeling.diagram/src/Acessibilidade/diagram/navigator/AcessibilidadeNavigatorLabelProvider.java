/*
* 
*/
package Acessibilidade.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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
public class AcessibilidadeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem
				&& !isOwnView(((Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup) {
			Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup group = (Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup) element;
			return Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) {
			Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem navigatorItem = (Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) element;
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
		switch (Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(view)) {
		case Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?pucpr.ppgia.geps.mestrado.luanmelo.projeto?Application", //$NON-NLS-1$
					Acessibilidade.diagram.providers.AcessibilidadeElementTypes.Application_1000);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Acessibilidade.diagram.providers.AcessibilidadeElementTypes.isKnownElementType(elementType)) {
			image = Acessibilidade.diagram.providers.AcessibilidadeElementTypes.getImage(elementType);
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
		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup) {
			Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup group = (Acessibilidade.diagram.navigator.AcessibilidadeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) {
			Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem navigatorItem = (Acessibilidade.diagram.navigator.AcessibilidadeNavigatorItem) element;
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
		switch (Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getVisualID(view)) {
		case Acessibilidade.diagram.edit.parts.ApplicationEditPart.VISUAL_ID:
			return getApplication_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getApplication_1000Text(View view) {
		Acessibilidade.Application domainModelElement = (Acessibilidade.Application) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNomeProjeto();
		} else {
			Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
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
		return Acessibilidade.diagram.edit.parts.ApplicationEditPart.MODEL_ID
				.equals(Acessibilidade.diagram.part.AcessibilidadeVisualIDRegistry.getModelID(view));
	}

}
