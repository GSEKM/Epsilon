/*
 * 
 */
package iot.diagram.providers;

import iot.diagram.edit.parts.BoardEditPart;
import iot.diagram.edit.parts.IotEditPartFactory;
import iot.diagram.part.IotVisualIDRegistry;

import java.lang.ref.WeakReference;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

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
