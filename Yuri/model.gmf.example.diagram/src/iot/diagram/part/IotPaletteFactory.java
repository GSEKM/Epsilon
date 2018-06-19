/*
 * 
 */
package iot.diagram.part;

import iot.diagram.providers.IotElementTypes;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class IotPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createArduino1CreationTool());
		paletteContainer.add(createMotor2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConector1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArduino1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Arduino1CreationTool_title,
				Messages.Arduino1CreationTool_desc, Collections.singletonList(IotElementTypes.Arduino_2002));
		entry.setId("createArduino1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IotElementTypes.getImageDescriptor(IotElementTypes.Arduino_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Motor2CreationTool_title,
				Messages.Motor2CreationTool_desc, Collections.singletonList(IotElementTypes.Motor_2003));
		entry.setId("createMotor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IotElementTypes.getImageDescriptor(IotElementTypes.Motor_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConector1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Conector1CreationTool_title,
				Messages.Conector1CreationTool_desc, Collections.singletonList(IotElementTypes.ArduinoConector_4004));
		entry.setId("createConector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IotElementTypes.getImageDescriptor(IotElementTypes.ArduinoConector_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
