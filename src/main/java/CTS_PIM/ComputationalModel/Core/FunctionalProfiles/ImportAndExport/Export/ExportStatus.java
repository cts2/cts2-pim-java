package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.Export;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ErrorResponse;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ProcessStatus.ProcessStatus;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.SyncOrAsync;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.TypesOfURI.DirectoryURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

import java.util.Set;

/**
 *
 */
public class ExportStatus extends ProcessStatus {

    /**
     *
     */
    public ExportStatus() {
    }

    /**
     *
     */
    public OntologyLanguageAndSyntax languageAndSyntax;

    /**
     *
     */
    public Set<DirectoryURI> resourceDirectory;

    /**
     *
     */
    public URI destination;

    /**
     *
     */
    public OverwriteRule overwrite;

    /**
     *
     */
    public ErrorResponse errorResponse;

    /**
     *
     */
    public SyncOrAsync synchronicity;

    /**
     *
     */
    public Number numElementsExported;

    /**
     *
     */
    public Set<URI> exportedURI;

}