package CTS_PIM.ComputationalModel.MapEntryServices.MapResolution;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;

/**
 *
 */
public interface MapResolutionService extends BaseService {

    /**
     * @param mapVersion
     * @param mapFrom
     * @param resolutionContext
     * @return
     */
    public MapTargetList resolve(NameOrURI mapVersion, EntityNameOrURI mapFrom, OpaqueData resolutionContext);

    /**
     * @param mapVersion
     * @param mapFrom
     * @param resolutionContext
     * @return
     */
    public MapTargetListList resolveEntityList(NameOrURI mapVersion, EntityNameOrURIList mapFrom, OpaqueData resolutionContext);

}