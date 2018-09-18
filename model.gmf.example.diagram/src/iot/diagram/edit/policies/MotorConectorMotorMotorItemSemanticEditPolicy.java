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
public class MotorConectorMotorMotorItemSemanticEditPolicy extends IotBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MotorConectorMotorMotorItemSemanticEditPolicy() {
		super(IotElementTypes.MotorConectorMotorMotor_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
