package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance.UpdateResourceVersionDescription;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;

/**
 *
 */
public class UpdateMapVersionRequest extends UpdateResourceVersionDescription {

    /**
     *
     */
    public UpdateMapVersionRequest() {
    }

    /**
     *
     */
    public NameOrURIList useCodeSystemVersions;

    /**
     *
     */
    public NameOrURIList applicableContexts;

}