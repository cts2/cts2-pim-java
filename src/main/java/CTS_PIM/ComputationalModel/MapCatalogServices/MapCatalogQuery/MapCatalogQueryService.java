package CTS_PIM.ComputationalModel.MapCatalogServices.MapCatalogQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ComponentReferenceList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.ComputationalModel.MapVersionServices.MapVersionQuery.MapRole;
import CTS_PIM.InformationModel.Core.Directory.MapCatalogEntryDirectoryURI;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntryDirectory;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntryListEntry;

/**
 *
 */
public interface MapCatalogQueryService extends BaseQueryService {

    /**
     *
     */
    public MapCatalogEntryDirectoryURI allMaps();

    /**
     * @param directory
     * @param codeSystems
     * @param mapRole
     * @return
     */
    public MapCatalogEntryDirectoryURI restrictByCodeSystem(MapCatalogEntryDirectoryURI directory, NameOrURIList codeSystems, MapRole mapRole);

    /**
     * @param directory
     * @param valueSets
     * @return
     */
    public MapCatalogEntryDirectoryURI restrictByValueSet(MapCatalogEntryDirectoryURI directory, NameOrURIList valueSets);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public MapCatalogEntryDirectory resolve(MapCatalogEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public MapCatalogEntryListEntry resolveAsList(MapCatalogEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}