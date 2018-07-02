/*
* 
*/
package iot.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import iot.diagram.providers.IotElementTypes;

/**
 * @generated
 */
public class ArduinoConectorItemSemanticEditPolicy extends IotBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArduinoConectorItemSemanticEditPolicy() {
		super(IotElementTypes.ArduinoConector_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
