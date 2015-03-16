package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ResolvedValueSetServices;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSet;
import CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet.ResolvedValueSetSummary;

import java.util.Set;

/**
 *
 */
public interface ResolvedValueSetLoader extends BaseService {

    /**
     *
     */
    public Set<ResolvedValueSetSummary> knownValueSet();

    /**
     * @param resolvedValueSet
     * @return
     */
    public LocalURI load(ResolvedValueSet resolvedValueSet);

    /**
     * @param resolvedSet
     */
    public void delete(LocalURI resolvedSet);

}