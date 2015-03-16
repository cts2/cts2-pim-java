package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Core.Directory.MapEntryDirectoryURI;
import CTS_PIM.InformationModel.MapVersion.MapEntryDirectory;
import CTS_PIM.InformationModel.MapVersion.MapEntryList;

/**
 *
 */
public interface MapEntryQueryService extends BaseQueryService {

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public MapEntryDirectory resolve(MapEntryDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public MapEntryList resolveAsList(MapEntryDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param targetEntities
     * @param allOrSome
     * @return
     */
    public MapEntryDirectoryURI restrictToTargetEntities(MapEntryDirectoryURI directory, EntityNameOrURIList targetEntities, RestrictionType allOrSome);

}