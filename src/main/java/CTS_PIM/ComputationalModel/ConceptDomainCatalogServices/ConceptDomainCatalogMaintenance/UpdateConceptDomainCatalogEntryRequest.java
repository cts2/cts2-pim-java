package CTS_PIM.ComputationalModel.ConceptDomainCatalogServices.ConceptDomainCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance.UpdateAbstractResourceDescription;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;

/**
 *
 */
public class UpdateConceptDomainCatalogEntryRequest extends UpdateAbstractResourceDescription {

    /**
     *
     */
    public UpdateConceptDomainCatalogEntryRequest() {
    }

    /**
     *
     */
    public EntityReference definingEntity;

}