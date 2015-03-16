package CTS_PIM.ComputationalModel.ConceptDomainCatalogServices.ConceptDomainCatalogHistory;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History.BaseHistoryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntry;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntryList;

import java.util.Date;

/**
 *
 */
public interface ConceptDomainHistoryService extends BaseHistoryService {

    /**
     * @param conceptDomain
     * @return
     */
    public ConceptDomainCatalogEntry getEarliestChangeFor(NameOrURI conceptDomain);

    /**
     * @param conceptDomain
     * @return
     */
    public ConceptDomainCatalogEntry getLatestChangeFor(NameOrURI conceptDomain);

    /**
     * @param conceptDomain
     * @param fromDate
     * @param toDate
     * @return
     */
    public ConceptDomainCatalogEntryList getChangeHistoryFor(NameOrURI conceptDomain, Date fromDate, Date toDate);

}