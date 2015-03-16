package CTS_PIM.ComputationalModel.StatementServices.StatementHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Statement.Statement;
import CTS_PIM.InformationModel.Statement.StatementList;

import java.util.Date;

/**
 *
 */
public interface StatementHistoryService extends BaseHistoryService {

    /**
     * @param statementID
     * @return
     */
    public Statement getEarliestChangeFor(ExternalURI statementID);

    /**
     * @param statementID
     * @return
     */
    public Statement getLastChangeFor(ExternalURI statementID);

    /**
     * @param statementID
     * @param fromDate
     * @param toDate
     * @return
     */
    public StatementList getChangeHistoryFor(ExternalURI statementID, Date fromDate, Date toDate);

}