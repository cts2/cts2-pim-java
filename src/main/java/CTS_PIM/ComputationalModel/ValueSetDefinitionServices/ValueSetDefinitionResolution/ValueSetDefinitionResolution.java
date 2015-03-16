package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ValueSetDefinitionResolution;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReferenceList;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.IterableResolvedValueSet;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSet;

/**
 *
 */
public interface ValueSetDefinitionResolution extends BaseService {

    /**
     * @param valueSetDefinitionURI
     * @param codeSystemVersionList
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public IterableResolvedValueSet resolve(ExternalURI valueSetDefinitionURI, NameOrURIList codeSystemVersionList, NameOrURI tag, QueryControl queryControl, ReadContext context);

    /**
     * @param valueSetDefinitionURI
     * @param codeSystemVersionList
     * @param tag
     * @param entityList
     * @param context
     * @return
     */
    public EntityReferenceList contains(ExternalURI valueSetDefinitionURI, NameOrURIList codeSystemVersionList, VersionTagReference tag, EntityNameOrURIList entityList, ReadContext context);

    /**
     * @param valueSetDefinitionURI
     * @param codeSystemVersionList
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI resolveAsEntityDirectory(ExternalURI valueSetDefinitionURI, NameOrURIList codeSystemVersionList, VersionTagReference tag, QueryControl queryControl, ReadContext context);

    /**
     * @param valueSetDefinitionURI
     * @param codeSystemVersionList
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public ResolvedValueSet resolveAsCompleteSet(ExternalURI valueSetDefinitionURI, NameOrURIList codeSystemVersionList, VersionTagReference tag, QueryControl queryControl, ReadContext context);

    /**
     * @param conceptDomain
     * @param contexts
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public IterableResolvedValueSet resolveConceptDomain(NameOrURI conceptDomain, NameOrURIList contexts, NameOrURI tag, QueryControl queryControl, ReadContext context);

    /**
     * @param conceptDomain
     * @param contexts
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI resolveConceptDomainAsEntityDirectory(NameOrURI conceptDomain, NameOrURIList contexts, VersionTagReference tag, QueryControl queryControl, ReadContext context);

    /**
     * @param conceptDomain
     * @param contexts
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public ResolvedValueSet resolveConceptDomainAsCompleteSet(NameOrURI conceptDomain, EntityNameOrURIList contexts, VersionTagReference tag, QueryControl queryControl, ReadContext context);

}