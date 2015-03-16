package CTS_PIM.ComputationalModel.AssociationServices.AssociationMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Association.Association;
import CTS_PIM.InformationModel.Core.StatementTarget.StatementTarget;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

/**
 *
 */
public interface AssociationMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param assertingCodeSystemVersion
     * @param subject
     * @param predicate
     * @param target
     * @param externalStatementId
     * @return
     */
    public Association createAssociation(ChangeSetURI changeSet, NameOrURI assertingCodeSystemVersion, EntityNameOrURI subject, EntityNameOrURI predicate, StatementTarget target, String externalStatementId);

    /**
     * @param changeSet
     * @param association
     * @return
     */
    public Association addAssociation(ChangeSetURI changeSet, Association association);

    /**
     * @param changeSet
     * @param assertingCodeSystemVersion
     * @param associationURI
     * @param externalStatementID
     * @param updateRequest
     * @return
     */
    public Association updateAssociation(ChangeSetURI changeSet, NameOrURI assertingCodeSystemVersion, URI associationURI, String externalStatementID, UpdateAssociationRequest updateRequest);

}