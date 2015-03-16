package CTS_PIM.ComputationalModel.ConceptDomainCatalogServices.ConceptDomainCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntry;
import CTS_PIM.InformationModel.Core.Naming.ConceptDomainName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public interface ConceptDomainCatalogMaintenaceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param uri
     * @param name
     * @param definingEntity
     * @return
     */
    public ConceptDomainCatalogEntry createConceptDomain(ChangeSetURI changeSet, ExternalURI uri, ConceptDomainName name, EntityNameOrURI definingEntity);

    /**
     * @param changeSet
     * @param conceptDomain
     * @param request
     * @return
     */
    public ConceptDomainCatalogEntry updateConceptDomain(ChangeSetURI changeSet, NameOrURI conceptDomain, UpdateConceptDomainCatalogEntryRequest request);

}