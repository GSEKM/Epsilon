/*
 * 
 */
package iot.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import iot.IotPackage;
import iot.diagram.edit.parts.ArduinoModelEditPart;
import iot.diagram.edit.parts.MotorNameEditPart;
import iot.diagram.parsers.MessageFormatParser;
import iot.diagram.part.IotVisualIDRegistry;

/**
 * @generated
 */
public class IotParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser arduinoModel_5006Parser;

	/**
	* @generated
	*/
	private IParser getArduinoModel_5006Parser() {
		if (arduinoModel_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { IotPackage.eINSTANCE.getArduino_Model() };
			MessageFormatParser parser = new MessageFormatParser(features);
			arduinoModel_5006Parser = parser;
		}
		return arduinoModel_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser motorName_5007Parser;

	/**
	* @generated
	*/
	private IParser getMotorName_5007Parser() {
		if (motorName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { IotPackage.eINSTANCE.getMotor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			motorName_5007Parser = parser;
		}
		return motorName_5007Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArduinoModelEditPart.VISUAL_ID:
			return getArduinoModel_5006Parser();
		case MotorNameEditPart.VISUAL_ID:
			return getMotorName_5007Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(IotVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(IotVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (IotElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
