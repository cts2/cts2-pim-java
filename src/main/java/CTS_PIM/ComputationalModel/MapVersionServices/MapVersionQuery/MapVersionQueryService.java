package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.Directory.MapVersionDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReferenceList;
import CTS_PIM.InformationModel.Core.ResourceReference.*;
import CTS_PIM.InformationModel.MapVersion.MapVersionDirectory;
import CTS_PIM.InformationModel.MapVersion.MapVersionList;

import java.util.Set;

/**
 *
 */
public interface MapVersionQueryService extends BaseQueryService {

    /**
     *
     */
    public MapVersionDirectoryURI mapVersions();

    /**
     *
     */
    public Set<VersionTagReference> supportedTag();

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
    public Set<ValueSetDefinitionReference> knownValueSetDefinition();

    /**
     * @param directory
     * @param codeSystems
     * @param mapRole
     * @return
     */
    public MapVersionDirectoryURI restrictToCodeSystems(MapVersionDirectoryURI directory, NameOrURIList codeSystems, MapRole mapRole);

    /**
     * @param directory
     * @param valueSets
     * @param mapRole
     * @return
     */
    public MapVersionDirectoryURI restrictToValueSets(MapVersionDirectoryURI directory, NameOrURIList valueSets, MapRole mapRole);

    /**
     * @param directory
     * @param entities
     * @param mapStatus
     * @param resrictionType
     * @param mapRole
     * @return
     */
    public MapVersionDirectoryURI restrictToEntities(MapVersionDirectoryURI directory, EntityNameOrURIList entities, MapStatus mapStatus, RestrictionType resrictionType, MapRole mapRole);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public MapVersionDirectory resolve(MapVersionDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public MapVersionList resolveAsList(MapVersionDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

    /**
     * @param mapRole
     * @param mapStatus
     * @param context
     * @return
     */
    public EntityDirectoryURI mapVersionEntities(MapRole mapRole, MapStatus mapStatus, ReadContext context);

    /**
     * @param mapRole
     * @param mapStatus
     * @param context
     * @param queryControl
     * @return
     */
    public EntityReferenceList mapVersionEntityReferences(MapRole mapRole, MapStatus mapStatus, ReadContext context, QueryControl queryControl);

}