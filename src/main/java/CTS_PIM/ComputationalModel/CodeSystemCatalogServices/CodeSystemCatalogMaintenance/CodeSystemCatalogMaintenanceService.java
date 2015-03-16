package CTS_PIM.ComputationalModel.CodeSystemCatalogServices.CodeSystemCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntry;
import CTS_PIM.InformationModel.Core.Naming.CodeSystemName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public interface CodeSystemCatalogMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param uri
     * @param name
     * @return
     */
    public CodeSystemCatalogEntry createCodeSystem(ChangeSetURI changeSet, ExternalURI uri, CodeSystemName name);

    /**
     * @param changeSet
     * @param codeSystem
     * @param request
     * @return
     */
    public CodeSystemCatalogEntry updateCodeSystem(ChangeSetURI changeSet, NameOrURI codeSystem, UpdateCodeSystemCatalogEntry request);

}