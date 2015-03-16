package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReferenceList;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Entity.EntityDirectory;
import CTS_PIM.InformationModel.Entity.EntityList;

import java.util.Set;

/**
 *
 */
public interface EntityDescriptionQueryService extends BaseQueryService {

    /**
     *
     */
    public EntityDirectoryURI allEntities();

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
    public Set<VersionTagReference> supportedTag();

    /**
     * @param directory
     * @param codeSystem
     * @param tag
     * @return
     */
    public EntityDirectoryURI restrictToCodeSystem(EntityDirectoryURI directory, NameOrURI codeSystem, VersionTagReference tag);

    /**
     * @param directory
     * @param codeSystemVersion
     * @return
     */
    public EntityDirectoryURI restrictToCodeSystemVersion(EntityDirectoryURI directory, NameOrURI codeSystemVersion);

    /**
     * @param directory
     * @param list
     * @return
     */
    public EntityDirectoryURI restrictToEntities(EntityDirectoryURI directory, EntityNameOrURIList list);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectory resolve(EntityDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param resolveOnlyCodeSystem
     * @param queryControl
     * @param context
     * @return
     */
    public EntityList resolveAsList(EntityDirectoryURI directory, ComponentReferenceList returnFilter, NameOrURI resolveOnlyCodeSystem, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityReferenceList resolveAsEntityReferenceList(EntityDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param entityReference
     * @param context
     */
    public void isEntityInSet(EntityDirectoryURI directory, EntityNameOrURI entityReference, ReadContext context);

    /**
     * @param directory
     * @param entityList
     * @param context
     * @return
     */
    public EntityNameOrURIList intersectEntityList(EntityDirectoryURI directory, EntityNameOrURIList entityList, ReadContext context);

}