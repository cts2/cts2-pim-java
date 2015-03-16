package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.History;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.InformationModel.Core.ChangeModel.ChangeSet;
import CTS_PIM.InformationModel.Core.ChangeModel.IteratableChangeSet;
import CTS_PIM.InformationModel.Core.Directory.ChangeSetDirectoryURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;

import java.util.Date;

/**
 *
 */
public interface BaseHistoryService extends BaseQueryService {

    /**
     *
     */
    public Date earliestChange();

    /**
     *
     */
    public Date latestChange();

    /**
     *
     */
    public ChangeSetDirectoryURI changeHistory();

    /**
     * @param changeSetURI
     * @return
     */
    public ChangeSet readChangeSet(ChangeSetURI changeSetURI);

    /**
     * @param changeSet
     * @param queryControl
     * @return
     */
    public IteratableChangeSet resolve(ChangeSetURI changeSet, QueryControl queryControl);

}