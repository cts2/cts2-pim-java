package CTS_PIM.ComputationalModel.AssociationServices.AssociationHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.InformationModel.Association.Association;

import java.net.URI;
import java.util.Date;

/**
 *
 */
public interface AssociationHistoryService extends BaseHistoryService {

    /**
     * @param associationID
     * @return
     */
    public Association getEarliestChangeFor(URI associationID);

    /**
     * @param associationID
     * @return
     */
    public Association getLatestChangeFor(URI associationID);

    /**
     * @param associationID
     * @return
     */
    public Association getEarliestServiceChangeFor(URI associationID);

    /**
     * @param associationID
     * @return
     */
    public Association getLatestServiceChangeFor(URI associationID);

    /**
     * @param associationID
     * @param fromDate
     * @param toDate
     * @return
     */
    public URI getChangeHistoryFor(URI associationID, Date fromDate, Date toDate);

    /**
     * @param associationID
     * @param fromDate
     * @param toDate
     * @return
     */
    public URI getServiceHistoryFor(URI associationID, Date fromDate, Date toDate);

}