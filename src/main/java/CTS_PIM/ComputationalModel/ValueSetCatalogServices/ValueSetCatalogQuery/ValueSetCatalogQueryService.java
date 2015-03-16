package CTS_PIM.ComputationalModel.ValueSetCatalogServices.ValueSetCatalogQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Core.Directory.ValueSetCatalogEntryDirectoryURI;
import CTS_PIM.InformationModel.ValueSetCatalog.ValueSetCatalogEntryDirectory;

/**
 *
 */
public interface ValueSetCatalogQueryService extends BaseQueryService {

    /**
     *
     */
    public ValueSetCatalogEntryDirectoryURI allValueSetCatalogEntries();

    /**
     * @param directory
     * @param versionTag
     * @param codeSystem
     * @return
     */
    public ValueSetCatalogEntryDirectoryURI restrictToCodeSystem(ValueSetCatalogEntryDirectoryURI directory, NameOrURI versionTag, NameOrURI codeSystem);

    /**
     * @param directory
     * @param versionTag
     * @param valueSet
     * @return
     */
    public ValueSetCatalogEntryDirectoryURI restrictToContainedValueSet(ValueSetCatalogEntryDirectoryURI directory, NameOrURI versionTag, NameOrURI valueSet);

    /**
     * @param directory
     * @param versionTag
     * @param propertyReference
     * @return
     */
    public ValueSetCatalogEntryDirectoryURI restrictToPropertyReference(ValueSetCatalogEntryDirectoryURI directory, NameOrURI versionTag, EntityNameOrURI propertyReference);

    /**
     * @param directory
     * @param versionTag
     * @param entities
     * @return
     */
    public ValueSetCatalogEntryDirectoryURI restrictToDefinitionEntities(ValueSetCatalogEntryDirectory directory, NameOrURI versionTag, EntityNameOrURIList entities);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetCatalogEntryDirectory resolve(ValueSetCatalogEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public ValueSetCatalogEntryDirectory resolveAsList(ValueSetCatalogEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}