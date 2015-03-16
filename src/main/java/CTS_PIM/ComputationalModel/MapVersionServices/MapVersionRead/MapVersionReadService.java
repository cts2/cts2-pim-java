package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.MapVersion.MapEntry;
import CTS_PIM.InformationModel.MapVersion.MapVersion;

/**
 *
 */
public interface MapVersionReadService extends BaseReadService {

    /**
     * @param mapVersion
     * @param context
     */
    public void exists(NameOrURI mapVersion, ReadContext context);

    /**
     * @param mapVersion
     * @param queryControl
     * @param context
     * @return
     */
    public MapVersion read(NameOrURI mapVersion, QueryControl queryControl, ReadContext context);

    /**
     * @param map
     * @param tag
     * @param context
     */
    public void existsMapVersionForMap(NameOrURI map, NameOrURI tag, ReadContext context);

    /**
     * @param map
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public MapVersion readMapVersionForMap(NameOrURI map, NameOrURI tag, QueryControl queryControl, ReadContext context);

    /**
     * @param mapVersion
     * @param sourceEntity
     */
    public void entryExists(NameOrURI mapVersion, EntityNameOrURI sourceEntity);

    /**
     * @param mapVersion
     * @param sourceEntity
     * @return
     */
    public MapEntry readEntry(NameOrURI mapVersion, EntityNameOrURI sourceEntity);

}