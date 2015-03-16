package CTS_PIM.ComputationalModel.MapCatalogServices.MapCatalogHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntry;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntryList;

import java.util.Date;

/**
 *
 */
public interface MapCatalogHistoryService extends BaseHistoryService {

    /**
     * @param mapCatalog
     * @param fromDate
     * @param toDate
     * @return
     */
    public MapCatalogEntryList getChangeHistoryFor(NameOrURI mapCatalog, Date fromDate, Date toDate);

    /**
     * @param mapCatalog
     * @return
     */
    public MapCatalogEntry getEarliestChangeFor(NameOrURI mapCatalog);

    /**
     * @param mapCatalog
     * @return
     */
    public MapCatalogEntry getLastChangeFor(NameOrURI mapCatalog);

}