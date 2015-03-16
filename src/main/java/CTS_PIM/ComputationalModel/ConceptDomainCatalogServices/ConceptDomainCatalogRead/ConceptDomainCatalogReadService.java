package CTS_PIM.ComputationalModel.ConceptDomainCatalogServices.ConceptDomainCatalogRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.ConceptDomainCatalog.ConceptDomainCatalogEntry;

/**
 *
 */
public interface ConceptDomainCatalogReadService extends BaseReadService {

    /**
     * @param conceptDomainId
     * @param context
     */
    public void exists(NameOrURI conceptDomainId, ReadContext context);

    /**
     * @param conceptDomainId
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainCatalogEntry read(NameOrURI conceptDomainId, QueryControl queryControl, ReadContext context);

    /**
     * @param entity
     * @param context
     */
    public void existsDefiningEntity(EntityNameOrURI entity, ReadContext context);

    /**
     * @param entity
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainCatalogEntry readByDefiningEntity(EntityNameOrURI entity, QueryControl queryControl, ReadContext context);

}