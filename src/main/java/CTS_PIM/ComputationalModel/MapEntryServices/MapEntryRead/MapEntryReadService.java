package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.MapVersion.MapEntry;

/**
 *
 */
public interface MapEntryReadService extends BaseReadService {

    /**
     * @param mapVersion
     * @param mapFrom
     * @param context
     */
    public void exists(NameOrURI mapVersion, EntityNameOrURI mapFrom, ReadContext context);

    /**
     * @param mapVersion
     * @param mapFrom
     * @param context
     * @return
     */
    public MapEntry read(NameOrURI mapVersion, EntityNameOrURI mapFrom, ReadContext context);

}