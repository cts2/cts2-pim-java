package CTS_PIM.ComputationalModel.MapCatalogServices.MapCatalogRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.MapCatalog.MapCatalogEntry;

/**
 *
 */
public interface MapCatalogReadService extends BaseReadService {

    /**
     * @param mapId
     * @param context
     */
    public void exists(NameOrURI mapId, ReadContext context);

    /**
     * @param mapId
     * @param queryControl
     * @param context
     * @return
     */
    public MapCatalogEntry read(NameOrURI mapId, QueryControl queryControl, ReadContext context);

}