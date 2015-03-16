package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ResolvedValueSetServices;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.ComputationalModel.Core.URIResolution.URIList;
import CTS_PIM.InformationModel.Core.Directory.ResolvedValueSetDirectoryURI;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSetDirectory;

import java.util.Set;

/**
 *
 */
public interface ResolvedValueSetQueryService extends BaseQueryService {

    /**
     *
     */
    public ResolvedValueSetDirectoryURI allResolvedValueSets();

    /**
     *
     */
    public Set<CodeSystemReference> knownCodeSystem();

    /**
     *
     */
    public Set<CodeSystemVersionReference> knownCodeSystemVersion();

    /**
     *
     */
    public Set<ValueSetReference> knownValueSet();

    /**
     *
     */
    public Set<ExternalURI> knownValueSetDefinition();

    /**
     * @param directory
     * @param valueSet
     * @return
     */
    public ResolvedValueSetDirectoryURI restrictToValueSets(ResolvedValueSetDirectoryURI directory, NameOrURIList valueSet);

    /**
     * @param directory
     * @param definitions
     * @return
     */
    public ResolvedValueSetDirectoryURI restrictToValueSetDefinitions(ResolvedValueSetDirectoryURI directory, URIList definitions);

    /**
     * @param directory
     * @param codeSystems
     * @return
     */
    public ResolvedValueSetDirectoryURI restrictToCodeSystems(ResolvedValueSetDirectoryURI directory, NameOrURIList codeSystems);

    /**
     * @param directory
     * @param codeSystemVersions
     * @return
     */
    public ResolvedValueSetDirectoryURI restrictToCodeSystemVersions(ResolvedValueSetDirectoryURI directory, NameOrURIList codeSystemVersions);

    /**
     * @param directory
     * @param list
     * @return
     */
    public ResolvedValueSetDirectoryURI restrictToEntities(ResolvedValueSetDirectoryURI directory, EntityNameOrURIList list);

    /**
     * @param directory
     * @param context
     * @param queryControl
     * @return
     */
    public ResolvedValueSetDirectory resolve(ResolvedValueSetDirectoryURI directory, ReadContext context, QueryControl queryControl);

}