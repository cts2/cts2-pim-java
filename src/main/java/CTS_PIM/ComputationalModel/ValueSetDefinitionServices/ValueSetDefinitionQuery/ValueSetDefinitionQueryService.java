package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ValueSetDefinitionQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ComponentReferenceList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Core.Directory.ValueSetDefinitionDirectoryURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionDirectory;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionList;

/**
 *
 */
public interface ValueSetDefinitionQueryService extends BaseQueryService {

    /**
     * @param valueSetDefinitionDirectory
     * @param codeSystem
     * @return
     */
    public ValueSetDefinitionDirectoryURI restrictToCodeSystem(ValueSetDefinitionDirectoryURI valueSetDefinitionDirectory, NameOrURI codeSystem);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetDefinitionDirectory resolve(ValueSetDefinitionDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetDefinitionList resolveAsList(ValueSetDefinitionDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}