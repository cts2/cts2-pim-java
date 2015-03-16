package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Core.ResourceReference.MatchAlgorithmReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ModelAttributeReference;
import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.DirectoryURI;

import java.util.Set;

/**
 *
 */
public interface BaseQueryService extends BaseService {

    /**
     *
     */
    public Set<MatchAlgorithmReference> supportedMatchAlgorithm();

    /**
     *
     */
    public Set<ModelAttributeReference> supportedModelAttribute();

    /**
     *
     */
    public Set<PredicateReference> knownProperty();

    /**
     * @param directory
     * @param matchAlgorithm
     * @param matchValue
     * @param filterComponent
     * @return
     */
    public DirectoryURI restrict(DirectoryURI directory, NameOrURI matchAlgorithm, String matchValue, EntityNameOrURIList filterComponent);

    /**
     * @param directory1
     * @param directory2
     * @return
     */
    public DirectoryURI union(DirectoryURI directory1, DirectoryURI directory2);

    /**
     * @param directory1
     * @param directory2
     * @return
     */
    public DirectoryURI intersect(DirectoryURI directory1, DirectoryURI directory2);

    /**
     * @param initialSet
     * @param elementsToRemove
     * @return
     */
    public DirectoryURI difference(DirectoryURI initialSet, DirectoryURI elementsToRemove);

    /**
     * @param directory
     * @param context
     * @param timeout
     * @return
     */
    public Number count(DirectoryURI directory, ReadContext context, Number timeout);

}