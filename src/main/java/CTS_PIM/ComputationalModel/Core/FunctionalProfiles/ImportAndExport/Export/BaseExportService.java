package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.Export;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ErrorResponse;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ImportExportBase;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.SyncOrAsync;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.TypesOfURI.DirectoryURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

/**
 *
 */
public interface BaseExportService extends ImportExportBase {

    /**
     * @param processId
     * @return
     */
    public ExportStatus getStatus(LocalURI processId);

    /**
     * @param languageAndSyntax
     * @param resourceDirectory
     * @param destination
     * @param overwrite
     * @param errorResponse
     * @param synchronicity
     * @return
     */
    public LocalURI export(OntologyLanguageAndSyntax languageAndSyntax, DirectoryURI resourceDirectory, URI destination, OverwriteRule overwrite, ErrorResponse errorResponse, SyncOrAsync synchronicity);

}