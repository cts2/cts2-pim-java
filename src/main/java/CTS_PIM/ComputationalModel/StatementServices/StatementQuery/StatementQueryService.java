package CTS_PIM.ComputationalModel.StatementServices.StatementQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.ComputationalModel.Core.URIResolution.URIList;
import CTS_PIM.InformationModel.Core.Directory.StatementDirectoryURI;
import CTS_PIM.InformationModel.Statement.StatementDirectory;
import CTS_PIM.InformationModel.Statement.StatementList;

/**
 *
 */
public interface StatementQueryService extends BaseQueryService {

    /**
     *
     */
    StatementDirectoryURI statements();

    /**
     * @param directory
     * @param subjects
     * @return
     */
    public StatementDirectoryURI restrictToResourceSubjects(StatementDirectoryURI directory, NameOrURIList subjects);

    /**
     * @param directory
     * @param subjects
     * @return
     */
    public StatementDirectoryURI restrictToEntitySubjects(StatementDirectoryURI directory, EntityNameOrURIList subjects);

    /**
     * @param directory
     * @param predicates
     * @return
     */
    public StatementDirectoryURI restrictToPredicates(StatementDirectoryURI directory, EntityNameOrURIList predicates);

    /**
     * @param directory
     * @param targets
     * @return
     */
    public StatementDirectoryURI restrictToResourceTargets(StatementDirectoryURI directory, URIList targets);

    /**
     * @param directory
     * @param targets
     * @return
     */
    public StatementDirectoryURI restrictToEntityTargets(StatementDirectoryURI directory, EntityNameOrURIList targets);

    /**
     * @param directory
     * @param attributes
     * @return
     */
    public StatementDirectoryURI restrictToModelAttribute(StatementDirectoryURI directory, NameOrURI attributes);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public StatementDirectory resolve(StatementDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public StatementList resolveAsList(StatementDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}