package CTS_PIM.ComputationalModel.ConceptDomainBindingServices.ConceptDomainBindingMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.ConceptDomainBinding.ConceptDomainBinding;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public interface ConceptDomainBindingMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param uri
     * @param bindingFor
     * @param boundValueSet
     * @param applicableContext
     * @param bindingQualifier
     * @return
     */
    public ConceptDomainBinding createConceptDomainBinding(ChangeSetURI changeSet, ExternalURI uri, NameOrURI bindingFor, NameOrURI boundValueSet, NameOrURI applicableContext, NameOrURI bindingQualifier);

    /**
     * @param changeSet
     * @param conceptDomainBinding
     * @param request
     * @return
     */
    public ConceptDomainBinding updateConceptDomainBinding(ChangeSetURI changeSet, ExternalURI conceptDomainBinding, UpdateConceptDomainBindingRequest request);

}