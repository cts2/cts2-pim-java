package CTS_PIM.ComputationalModel.AssociationServices.AssociationRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Association.Association;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

/**
 *
 */
public interface AssociationReadService extends BaseReadService {

    /**
     * @param associationID
     * @param queryControl
     * @param context
     * @return
     */
    public Association read(URI associationID, QueryControl queryControl, ReadContext context);

    /**
     * @param associationID
     * @param context
     */
    public void exists(URI associationID, ReadContext context);

    /**
     * @param externalStatementId
     * @param scopingNamespace
     * @param queryControl
     * @param context
     * @return
     */
    public Association readByExternalStatementId(String externalStatementId, NameOrURI scopingNamespace, QueryControl queryControl, ReadContext context);

    /**
     * @param externalStatementId
     * @param scopingNamespace
     * @param context
     */
    public void existsByExternalStatementId(String externalStatementId, NameOrURI scopingNamespace, ReadContext context);

}