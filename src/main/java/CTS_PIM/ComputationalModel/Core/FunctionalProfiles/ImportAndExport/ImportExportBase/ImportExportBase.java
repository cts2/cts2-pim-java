package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry.LogEntries;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry.LoggingLevel;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;

import java.util.Set;

/**
 *
 */
public interface ImportExportBase extends BaseService {

    /**
     *
     */
    public Set<OntologyLanguageAndSyntax> supportedLanguageAndSyntax();

    /**
     * @param processId
     */
    public void clearLog(LocalURI processId);

    /**
     * @param level
     * @param processId
     * @return
     */
    public LogEntries getLog(LoggingLevel level, LocalURI processId);

}