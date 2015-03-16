package CTS_PIM.ComputationalModel.CodeSystemCatalogServices.CodeSystemCatalogQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ComponentReferenceList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntryDirectory;
import CTS_PIM.InformationModel.CodeSystemCatalog.CodeSystemCatalogEntryList;
import CTS_PIM.InformationModel.Core.Directory.CodeSystemCatalogEntryDirectoryURI;

/**
 *
 */
public interface CodeSystemCatalogQueryService extends BaseQueryService {

    /**
     *
     */
    public CodeSystemCatalogEntryDirectoryURI allCodeSystems();

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemCatalogEntryDirectory resolve(CodeSystemCatalogEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemCatalogEntryList resolveAsList(CodeSystemCatalogEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}