package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.MapVersion.MapEntryList;

import java.util.Date;

/**
 *
 */
public interface MapEntryHistoryService extends BaseHistoryService {

    /**
     * @param mapVersion
     * @param fromEntity
     * @param fromDate
     * @param toDate
     * @return
     */
    public MapEntryList getChangeHistoryFor(NameOrURI mapVersion, EntityNameOrURI fromEntity, Date fromDate, Date toDate);

}