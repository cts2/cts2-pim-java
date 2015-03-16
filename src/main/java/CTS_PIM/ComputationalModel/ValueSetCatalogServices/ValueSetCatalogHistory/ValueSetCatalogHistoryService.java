package CTS_PIM.ComputationalModel.ValueSetCatalogServices.ValueSetCatalogHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.ValueSetCatalog.ValueSetCatalogEntry;
import CTS_PIM.InformationModel.ValueSetCatalog.ValueSetCatalogEntryList;

import java.util.Date;

/**
 *
 */
public interface ValueSetCatalogHistoryService extends BaseHistoryService {

    /**
     * @param valueSet
     * @return
     */
    public ValueSetCatalogEntry getEarliestChangeFor(NameOrURI valueSet);

    /**
     * @param valueSet
     * @return
     */
    public ValueSetCatalogEntry getLastChangeFor(NameOrURI valueSet);

    /**
     * @param valueSet
     * @param fromDate
     * @param toDate
     * @return
     */
    public ValueSetCatalogEntryList getChangeHistoryFor(NameOrURI valueSet, Date fromDate, Date toDate);

}