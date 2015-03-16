package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.Import;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ErrorResponse;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ImportExportBase;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry.LogEntry;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.SyncOrAsync;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ValidationLevel;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;

/**
 *
 */
public interface BaseImportService extends ImportExportBase {

    /**
     * @param processId
     * @return
     */
    public ImportStatus getStatus(LocalURI processId);

    /**
     * @param languageAndSyntax
     * @param source
     * @param metadata
     * @param errorResponse
     * @param synchronicity
     * @return
     */
    public abstract LocalURI import_(OntologyLanguageAndSyntax languageAndSyntax, DocumentURI source, DocumentURI metadata, ErrorResponse errorResponse, SyncOrAsync synchronicity);

    /**
     * @param languageAndSyntax
     * @param source
     * @param metadata
     * @param validationLevel
     * @return
     */
    public abstract LogEntry validate(OntologyLanguageAndSyntax languageAndSyntax, DocumentURI source, DocumentURI metadata, ValidationLevel validationLevel);

}