/*
 * 
 */
package iot.diagram.edit.policies;

import iot.diagram.providers.IotElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArduinoConectorItemSemanticEditPolicy extends IotBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArduinoConectorItemSemanticEditPolicy() {
		super(IotElementTypes.ArduinoConector_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
