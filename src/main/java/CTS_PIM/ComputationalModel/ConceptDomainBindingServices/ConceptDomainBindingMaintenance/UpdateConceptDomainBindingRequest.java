package CTS_PIM.ComputationalModel.ConceptDomainBindingServices.ConceptDomainBindingMaintenance;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

import java.util.Set;

/**
 *
 */
public class UpdateConceptDomainBindingRequest {

    /**
     *
     */
    public UpdateConceptDomainBindingRequest() {
    }

    /**
     *
     */
    public DocumentURI boundValueSetDefinition;

    /**
     *
     */
    public Set<NameOrURIList> useCodeSystemVersion;

}