package CTS_PIM.ComputationalModel.AssociationServices.AssociationQuery;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Query.BaseQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.*;
import CTS_PIM.InformationModel.Association.AssociationDirectory;
import CTS_PIM.InformationModel.Association.AssociationList;
import CTS_PIM.InformationModel.Core.Directory.AssociationDirectoryURI;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityExpression;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

import java.util.Set;

/**
 *
 */
public interface AssociationQueryService extends BaseQueryService {

    /**
     *
     */
    public AssociationDirectoryURI allAssociations();

    /**
     *
     */
    public Set<CodeSystemReference> knownCodeSystem();

    /**
     *
     */
    public Set<CodeSystemVersionReference> knownCodeSystemVersion();

    /**
     * @param directory
     * @param codeSystemVersion
     * @return
     */
    public AssociationDirectoryURI restrictToCodeSystemVersion(AssociationDirectoryURI directory, NameOrURI codeSystemVersion);

    /**
     * @param directory
     * @param sourceEntity
     * @return
     */
    public AssociationDirectoryURI restrictToSourceEntity(AssociationDirectoryURI directory, EntityNameOrURI sourceEntity);

    /**
     * @param directory
     * @param predicate
     * @return
     */
    public AssociationDirectoryURI restrictToPredicate(AssociationDirectoryURI directory, EntityNameOrURI predicate);

    /**
     * @param directory
     * @param target
     * @return
     */
    public AssociationDirectoryURI restrictToTargetEntity(AssociationDirectoryURI directory, EntityNameOrURI target);

    /**
     * @param directory
     * @param target
     * @return
     */
    public AssociationDirectoryURI restrictToTargetLiteral(AssociationDirectoryURI directory, String target);

    /**
     * @param directory
     * @param target
     * @return
     */
    public AssociationDirectoryURI restrictToTargetExpression(AssociationDirectoryURI directory, EntityExpression target);

    /**
     * @param directory
     * @param entity
     * @return
     */
    public AssociationDirectoryURI restrictToSourceOrTargetEntity(AssociationDirectoryURI directory, EntityNameOrURI entity);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI getSourceEntities(AssociationDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI getPredicates(AssociationDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI getTargetEntities(AssociationDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDirectoryURI getAllSourceAndTargetEntities(AssociationDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param queryControl
     * @param context
     * @return
     */
    public AssociationDirectory resolve(AssociationDirectoryURI directory, QueryControl queryControl, ReadContext context);

    /**
     * @param directory
     * @param returnFilter
     * @param queryControl
     * @param context
     * @return
     */
    public AssociationList resolveAsList(AssociationDirectoryURI directory, ComponentReferenceList returnFilter, QueryControl queryControl, ReadContext context);

}