package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.MapVersion.MapVersion;
import CTS_PIM.InformationModel.MapVersion.MapVersionList;

import java.util.Date;

/**
 *
 */
public interface MapVersionHistoryService extends BaseHistoryService {

    /**
     * @param mapVersion
     * @param toDate
     * @param fromDate
     * @return
     */
    public MapVersionList getChangeHistoryFor(NameOrURI mapVersion, Date toDate, Date fromDate);

    /**
     * @param mapVersion
     * @return
     */
    public MapVersion getEarliestChangeFor(NameOrURI mapVersion);

    /**
     * @param mapVersion
     * @return
     */
    public MapVersion getLatestChangeFor(NameOrURI mapVersion);

}