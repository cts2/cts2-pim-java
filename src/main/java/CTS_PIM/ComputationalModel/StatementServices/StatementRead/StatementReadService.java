package CTS_PIM.ComputationalModel.StatementServices.StatementRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Statement.Statement;

/**
 *
 */
public interface StatementReadService extends BaseReadService {

    /**
     * @param StatementID
     * @param context
     */
    public void exists(ExternalURI StatementID, ReadContext context);

    /**
     * @param statementID
     * @param queryControl
     * @param context
     * @return
     */
    public Statement read(ExternalURI statementID, QueryControl queryControl, ReadContext context);

}