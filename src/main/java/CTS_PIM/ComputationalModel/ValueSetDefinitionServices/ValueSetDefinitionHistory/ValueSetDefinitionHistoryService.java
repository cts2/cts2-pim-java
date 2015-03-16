package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ValueSetDefinitionHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinition;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionList;

import java.util.Date;

/**
 *
 */
public interface ValueSetDefinitionHistoryService extends BaseHistoryService {

    /**
     * @param valueSetDefinition
     * @return
     */
    public ValueSetDefinition getEarliestChangeFor(ExternalURI valueSetDefinition);

    /**
     * @param valueSetDefinition
     * @return
     */
    public ValueSetDefinition getLastChangeFor(ExternalURI valueSetDefinition);

    /**
     * @param valueSetDefinition
     * @param fromDate
     * @param toDate
     * @return
     */
    public ValueSetDefinitionList getChangeHistoryFor(ExternalURI valueSetDefinition, Date fromDate, Date toDate);

}