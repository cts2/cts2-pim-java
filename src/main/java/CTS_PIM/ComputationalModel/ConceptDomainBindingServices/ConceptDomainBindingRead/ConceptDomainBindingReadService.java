package CTS_PIM.ComputationalModel.ConceptDomainBindingServices.ConceptDomainBindingRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.ConceptDomainBinding.ConceptDomainBinding;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

import java.util.Set;

/**
 *
 */
public interface ConceptDomainBindingReadService extends BaseReadService {

    /**
     *
     */
    public Set<VersionTagReference> supportedTag();

    /**
     * @param conceptDomain
     * @param valueSet
     * @param applicableContext
     * @param bindingQualifier
     * @param context
     */
    public void exists(NameOrURI conceptDomain, NameOrURI valueSet, NameOrURI applicableContext, NameOrURI bindingQualifier, ReadContext context);

    /**
     * @param conceptDomain
     * @param valueSet
     * @param applicableContext
     * @param bindingQualifier
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainBinding read(NameOrURI conceptDomain, NameOrURI valueSet, NameOrURI applicableContext, NameOrURI bindingQualifier, QueryControl queryControl, ReadContext context);

    /**
     * @param uri
     * @param context
     */
    public void existsURI(ExternalURI uri, ReadContext context);

    /**
     * @param uri
     * @param queryControl
     * @param context
     * @return
     */
    public ConceptDomainBinding readByURI(ExternalURI uri, QueryControl queryControl, ReadContext context);

}