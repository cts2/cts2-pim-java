package CTS_PIM.ComputationalModel.CodeSystemCatalogServices.CodeSystemHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntry;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntryList;

import java.util.Date;

/**
 *
 */
public interface CodeSystemCatalogHistoryService extends BaseHistoryService {

    /**
     * @param codeSystem
     * @return
     */
    public CodeSystemCatalogEntry getEarliestChangeFor(NameOrURI codeSystem);

    /**
     * @param codeSystem
     * @return
     */
    public CodeSystemCatalogEntry getLastChangeFor(NameOrURI codeSystem);

    /**
     * @param codeSystem
     * @param fromDate
     * @param toDate
     * @return
     */
    public CodeSystemCatalogEntryList getChangeHistoryFor(NameOrURI codeSystem, Date fromDate, Date toDate);

}