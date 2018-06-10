/*
 * 
 */
package myModel.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class MyModelNewDiagramFileWizard extends Wizard {

	/**
	* @generated
	*/
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	* @generated
	*/
	private myModel.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	* @generated
	*/
	private TransactionalEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	public MyModelNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_CreationPageName, StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(
				NLS.bind(myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_CreationPageDescription,
						myModel.diagram.edit.parts.ArduinoEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(
				myModel.diagram.part.MyModelDiagramEditorUtil.getUniqueFileName(filePath, fileName, "mymodel_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage
				.setTitle(myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	* @generated
	*/
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		myModel.diagram.part.MyModelDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(myEditingDomain,
				myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = myModel.diagram.part.MyModelVisualIDRegistry
						.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != myModel.diagram.edit.parts.ArduinoEditPart.VISUAL_ID) {
					return CommandResult.newErrorCommandResult(
							myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(diagramRootElementSelectionPage.getModelElement(),
						myModel.diagram.edit.parts.ArduinoEditPart.MODEL_ID,
						myModel.diagram.part.MyModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
			diagramResource.save(myModel.diagram.part.MyModelDiagramEditorUtil.getSaveOptions());
			myModel.diagram.part.MyModelDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", //$NON-NLS-1$
					e);
		} catch (IOException ex) {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance()
					.logError("Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	* @generated
	*/
	private static class DiagramRootElementSelectionPage extends myModel.diagram.part.ModelElementSelectionPage {

		/**
		* @generated
		*/
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		* @generated
		*/
		protected String getSelectionTitle() {
			return myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		* @generated
		*/
		protected boolean validatePage() {
			if (getModelElement() == null) {
				setErrorMessage(
						myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService.getInstance()
					.provides(new CreateDiagramViewOperation(new EObjectAdapter(getModelElement()),
							myModel.diagram.edit.parts.ArduinoEditPart.MODEL_ID,
							myModel.diagram.part.MyModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: myModel.diagram.part.Messages.MyModelNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
