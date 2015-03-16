package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.MapVersion.MapVersion;

/**
 *
 */
public interface MapVersionMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param createParameters
     * @return
     */
    public MapVersion createMapVersion(ChangeSetURI changeSet, CreateMapVersionRequest createParameters);

    /**
     * @param changeSet
     * @param mapVersion
     * @param updateRequest
     * @return
     */
    public MapVersion updateMapVersion(ChangeSetURI changeSet, NameOrURI mapVersion, UpdateMapVersionRequest updateRequest);

    /**
     * @param changeSet
     * @param resourceToClone
     * @param versionIdentifier
     * @param versionURI
     * @return
     */
    public MapVersion clone(ChangeSetURI changeSet, NameOrURI resourceToClone, LocalIdentifier versionIdentifier, ExternalURI versionURI);

}