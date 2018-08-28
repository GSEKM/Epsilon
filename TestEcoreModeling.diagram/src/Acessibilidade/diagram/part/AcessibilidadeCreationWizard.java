/*
 * 
 */
package Acessibilidade.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class AcessibilidadeCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected Acessibilidade.diagram.part.AcessibilidadeCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected Acessibilidade.diagram.part.AcessibilidadeCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizardTitle);
		setDefaultPageImageDescriptor(Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewAcessibilidadeWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new Acessibilidade.diagram.part.AcessibilidadeCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "acessibilidade_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new Acessibilidade.diagram.part.AcessibilidadeCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "acessibilidade") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".acessibilidade_diagram".length()); //$NON-NLS-1$
					setFileName(Acessibilidade.diagram.part.AcessibilidadeDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "acessibilidade")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = Acessibilidade.diagram.part.AcessibilidadeDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						Acessibilidade.diagram.part.AcessibilidadeDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Acessibilidade.diagram.part.Messages.AcessibilidadeCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				Acessibilidade.diagram.part.AcessibilidadeDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
