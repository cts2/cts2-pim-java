package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Entity.EntityList;
import CTS_PIM.InformationModel.Entity.NamedEntityDescription;

import java.util.Date;

/**
 *
 */
public interface EntityDescriptionHistoryService extends BaseHistoryService {

    /**
     * @param entityDescription
     * @return
     */
    public NamedEntityDescription getEarliestChangeFor(EntityNameOrURI entityDescription);

    /**
     * @param entityDescription
     * @return
     */
    public NamedEntityDescription getLatestChangeFor(EntityNameOrURI entityDescription);

    /**
     * @param entityDescription
     * @return
     */
    public NamedEntityDescription getEarliestServiceChangeFor(EntityNameOrURI entityDescription);

    /**
     * @param entityDescription
     * @return
     */
    public NamedEntityDescription getLatestServiceChangeFor(EntityNameOrURI entityDescription);

    /**
     * @param entityDescription
     * @param fromDate
     * @param toDate
     * @return
     */
    public EntityDirectoryURI getChangeHistoryFor(EntityNameOrURI entityDescription, Date fromDate, Date toDate);

    /**
     * @param entityDescription
     * @param fromDate
     * @param toDate
     * @return
     */
    public EntityList getServiceHistoryFor(EntityNameOrURI entityDescription, Date fromDate, Date toDate);

}