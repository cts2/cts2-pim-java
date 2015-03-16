package CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntryDirectory;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntryList;
import CTS_PIM.InformationModel.Core.Directory.CodeSystemVersionCatalogEntryDirectoryURI;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public interface CodeSystemVersionCatalogQueryService extends BaseQueryService {

    /**
     *
     */
    public CodeSystemVersionCatalogEntryDirectoryURI codeSystemVersions();

    /**
     *
     */
    public Set<VersionTagReference> supportedTag();

    /**
     * @param codeSystemVersionDirectory
     * @param entities
     * @param allOrSome
     * @param active
     * @return
     */
    public CodeSystemVersionCatalogEntryDirectoryURI restrictToEntities(CodeSystemVersionCatalogEntryDirectoryURI codeSystemVersionDirectory, EntityNameOrURIList entities, RestrictionType allOrSome, ActiveOrAll active);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemVersionCatalogEntryDirectory resolve(CodeSystemVersionCatalogEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemVersionCatalogEntryList resolveAsList(CodeSystemVersionCatalogEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}