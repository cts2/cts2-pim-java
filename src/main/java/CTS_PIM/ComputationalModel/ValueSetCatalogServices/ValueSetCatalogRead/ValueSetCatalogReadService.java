package CTS_PIM.ComputationalModel.ValueSetCatalogServices.ValueSetCatalogRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.ValueSetCatalog.ValueSetCatalogEntry;

/**
 *
 */
public interface ValueSetCatalogReadService extends BaseReadService {

    /**
     * @param valueSetId
     * @param context
     */
    public void exists(NameOrURI valueSetId, ReadContext context);

    /**
     * @param valueSetId
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetCatalogEntry read(NameOrURI valueSetId, QueryControl queryControl, ReadContext context);

}