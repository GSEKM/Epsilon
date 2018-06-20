/*
 * 
 */
package iot.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import iot.diagram.providers.IotElementTypes;
import iot.diagram.providers.IotModelingAssistantProvider;

/**
 * @generated
 */
public class IotModelingAssistantProviderOfBoardEditPart extends IotModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IotElementTypes.Arduino_2002);
		types.add(IotElementTypes.Motor_2003);
		return types;
	}

}
