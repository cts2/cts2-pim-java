package CTS_PIM.ComputationalModel.ValueSetCatalogServices.ValueSetCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.ChangeModel.ChangeSet;
import CTS_PIM.InformationModel.Core.Naming.ValueSetName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetCatalog.ValueSetCatalogEntry;

/**
 *
 */
public interface ValueSetCatalogMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param uri
     * @param name
     * @return
     */
    public ValueSetCatalogEntry createValueSet(ChangeSetURI changeSet, ExternalURI uri, ValueSetName name);

    /**
     * @param changeSet
     * @param valueSet
     * @param request
     * @return
     */
    public ValueSetCatalogEntry updateValueSet(ChangeSet changeSet, NameOrURI valueSet, UpdateValueSetRequest request);

}