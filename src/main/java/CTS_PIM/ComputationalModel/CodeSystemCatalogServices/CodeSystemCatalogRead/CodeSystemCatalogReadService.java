package CTS_PIM.ComputationalModel.CodeSystemCatalogServices.CodeSystemCatalogRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntry;

/**
 *
 */
public interface CodeSystemCatalogReadService extends BaseReadService {

    /**
     * @param codeSystemId
     * @param context
     */
    public void exists(NameOrURI codeSystemId, ReadContext context);

    /**
     * @param codeSystemId
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemCatalogEntry read(NameOrURI codeSystemId, QueryControl queryControl, ReadContext context);

}