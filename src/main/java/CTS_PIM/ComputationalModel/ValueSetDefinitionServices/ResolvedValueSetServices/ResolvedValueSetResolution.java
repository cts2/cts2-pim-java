package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ResolvedValueSetServices;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReferenceList;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.IterableResolvedValueSet;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSet;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSetSummary;

import java.util.Set;

/**
 *
 */
public interface ResolvedValueSetResolution extends BaseService {

    /**
     *
     */
    public Set<ResolvedValueSetSummary> knownValueSet();

    /**
     * @param resolvedValueSetURI
     * @param queryControl
     * @return
     */
    public IterableResolvedValueSet resolve(LocalURI resolvedValueSetURI, QueryControl queryControl);

    /**
     * @param resolvedValueSetURI
     * @param queryControl
     * @return
     */
    public EntityDirectoryURI resolveAsEntityDirectory(LocalURI resolvedValueSetURI, QueryControl queryControl);

    /**
     * @param resolvedValueSetURI
     * @param entityList
     * @return
     */
    public EntityReferenceList contains(LocalURI resolvedValueSetURI, EntityNameOrURIList entityList);

    /**
     * @param resolvedValueSetURI
     * @param queryControl
     * @return
     */
    public ResolvedValueSet resolveAsCompleteSet(LocalURI resolvedValueSetURI, QueryControl queryControl);

}