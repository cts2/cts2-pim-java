package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.EntityReference.ScopedEntityName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Entity.EntityDescriptionBase;
import CTS_PIM.InformationModel.Entity.IndividualDescription.AnonymousIndividualDescription;
import CTS_PIM.InformationModel.Entity.NamedEntityDescription;

import java.util.Set;

/**
 *
 */
public interface EntityDescriptionMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createAnnotationPropertyDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param describingCodeSystemVersion
     * @return
     */
    public AnonymousIndividualDescription createAnonymousIndividualDescription(ChangeSetURI changeSet, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @param entityType
     * @return
     */
    public NamedEntityDescription createClassDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion, Set<EntityNameOrURI> entityType);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createDataTypeDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createDataPropertyDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createNamedEntityDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createNamedIndividualDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createObjectPropertyDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public NamedEntityDescription createPredicateDescription(ChangeSetURI changeSet, ScopedEntityName entityID, NameOrURI describingCodeSystemVersion);

    /**
     * @param changeSet
     * @param request
     * @param entityID
     * @param describingCodeSystemVersion
     * @return
     */
    public EntityDescriptionBase updateEntityDescription(ChangeSetURI changeSet, UpdateEntityDescriptionRequest request, EntityNameOrURI entityID, NameOrURI describingCodeSystemVersion);

}