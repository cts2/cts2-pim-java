package CTS_PIM.ComputationalModel.ConceptDomainBindingServices.ConceptDomainBindingQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.ConceptDomainBinding.ConceptDomainBindingDirectory;
import CTS_PIM.InformationModel.ConceptDomainBinding.ConceptDomainBindingList;
import CTS_PIM.InformationModel.Core.Directory.ConceptDomainBindingDirectoryURI;

/**
 *
 */
public interface ConceptDomainBindingQueryService extends BaseQueryService {

    /**
     *
     */
    public ConceptDomainBindingDirectoryURI conceptDomainBindings();

    /**
     * @param directory
     * @param conceptDomain
     * @return
     */
    public ConceptDomainBindingDirectoryURI restrictToConceptDomain(ConceptDomainBindingDirectoryURI directory, NameOrURI conceptDomain);

    /**
     * @param directory
     * @param contexts
     * @return
     */
    public ConceptDomainBindingDirectoryURI restrictToContexts(ConceptDomainBindingDirectoryURI directory, NameOrURIList contexts);

    /**
     * @param directory
     * @param valueSets
     * @return
     */
    public ConceptDomainBindingDirectoryURI restrictToValueSets(ConceptDomainBindingDirectoryURI directory, NameOrURIList valueSets);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainBindingDirectory resolve(ConceptDomainBindingDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainBindingList resolveAsList(ConceptDomainBindingDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}