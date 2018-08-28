/*
 * 
 */
package Acessibilidade.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Acessibilidade.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		Acessibilidade.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		Acessibilidade.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		Acessibilidade.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		Acessibilidade.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
