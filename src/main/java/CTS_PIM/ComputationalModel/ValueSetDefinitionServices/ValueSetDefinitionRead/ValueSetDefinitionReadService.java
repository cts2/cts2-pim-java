package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ValueSetDefinitionRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinition;

import java.util.Set;

/**
 *
 */
public interface ValueSetDefinitionReadService extends BaseReadService {

    /**
     *
     */
    public Set<VersionTagReference> supportedTag();

    /**
     * @param valueSetDefinitionURI
     * @param context
     */
    public void exists(ExternalURI valueSetDefinitionURI, ReadContext context);

    /**
     * @param valueSetDefinitionURI
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetDefinition read(ExternalURI valueSetDefinitionURI, QueryControl queryControl, ReadContext context);

    /**
     * @param valueSet
     * @param tag
     * @param context
     */
    public void existsDefinitionForValueSet(NameOrURI valueSet, NameOrURI tag, ReadContext context);

    /**
     * @param valueSet
     * @param tag
     * @param context
     * @return
     */
    public ValueSetDefinition readDefinitionForValueSet(NameOrURI valueSet, NameOrURI tag, ReadContext context);

}