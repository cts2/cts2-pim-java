package CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntry;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntryList;

import java.util.Date;

/**
 *
 */
public interface CodeSystemVersionCatalogHistoryService extends BaseHistoryService {

    /**
     * @param codeSystemVersion
     * @return
     */
    public CodeSystemVersionCatalogEntry getEarliestChangeFor(NameOrURI codeSystemVersion);

    /**
     * @param codeSystemVersion
     * @return
     */
    public CodeSystemVersionCatalogEntry getLastChangeFor(NameOrURI codeSystemVersion);

    /**
     * @param codeSystemVersion
     * @param fromDate
     * @param toDate
     * @return
     */
    public CodeSystemVersionCatalogEntryList getChangeHistoryFor(NameOrURI codeSystemVersion, Date fromDate, Date toDate);

}