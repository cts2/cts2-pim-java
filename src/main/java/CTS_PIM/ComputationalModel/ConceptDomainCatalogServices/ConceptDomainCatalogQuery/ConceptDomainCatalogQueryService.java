package CTS_PIM.ComputationalModel.ConceptDomainCatalogServices.ConceptDomainCatalogQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ComponentReferenceList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntryDirectory;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntryList;
import CTS_PIM.InformationModel.Core.Directory.ConceptDomainCatalogEntryDirectoryURI;

/**
 *
 */
public interface ConceptDomainCatalogQueryService extends BaseQueryService {

    /**
     *
     */
    public ConceptDomainCatalogEntryDirectoryURI allConceptDomains();

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainCatalogEntryDirectory resolve(ConceptDomainCatalogEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainCatalogEntryList resolveAsList(ConceptDomainCatalogEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}