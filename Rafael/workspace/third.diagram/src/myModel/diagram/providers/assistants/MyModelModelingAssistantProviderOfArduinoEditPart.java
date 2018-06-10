/*
 * 
 */
package myModel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyModelModelingAssistantProviderOfArduinoEditPart
		extends myModel.diagram.providers.MyModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(myModel.diagram.providers.MyModelElementTypes.Module_2001);
		return types;
	}

}
