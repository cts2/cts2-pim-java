package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.Import;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ErrorResponse;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ProcessStatus.ProcessStatus;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.SyncOrAsync;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

import java.util.Set;

/**
 *
 */
public class ImportStatus extends ProcessStatus {

    /**
     *
     */
    public ImportStatus() {
    }

    /**
     *
     */
    public OntologyLanguageAndSyntax languageAndSyntax;

    /**
     *
     */
    public DocumentURI source;

    /**
     *
     */
    public DocumentURI metadata;

    /**
     *
     */
    public SyncOrAsync synchronicity;

    /**
     *
     */
    public ErrorResponse errorResponse;

    /**
     *
     */
    public Number numElementsImported;

    /**
     *
     */
    public Set<RenderingURI> loadedURI;

}