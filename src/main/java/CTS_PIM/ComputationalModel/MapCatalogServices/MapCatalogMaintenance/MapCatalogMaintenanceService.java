package CTS_PIM.ComputationalModel.MapCatalogServices.MapCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.Naming.MapName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntry;

/**
 *
 */
public interface MapCatalogMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param mapName
     * @param fromCodeSystem
     * @param fromValueSet
     * @param toCodeSystem
     * @param toValueSet
     * @return
     */
    public MapCatalogEntry createMapCatalogEntry(ChangeSetURI changeSet, MapName mapName, NameOrURI fromCodeSystem, NameOrURI fromValueSet, NameOrURI toCodeSystem, NameOrURI toValueSet);

    /**
     * @param changeSet
     * @param map
     * @param request
     * @return
     */
    public MapCatalogEntry updateMap(ChangeSetURI changeSet, NameOrURI map, UpdateMapCatalogRequest request);

}