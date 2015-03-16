package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Update.UpdateService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ValidationResponse;
import CTS_PIM.InformationModel.Core.ChangeModel.ChangeSet;
import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.ChangeModel.EntryState;
import CTS_PIM.InformationModel.Core.ChangeModel.IteratableChangeSet;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.StatementTarget.StatementTarget;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.PersistentURI;

import java.util.Date;

/**
 *
 */
public interface BaseMaintenanceService extends UpdateService {

    /**
     * @return
     */
    public ChangeSet createChangeSet();

    /**
     * @param changeSet
     * @param queryControl
     * @return
     */
    public IteratableChangeSet readIteratableChangeSet(ChangeSetURI changeSet, QueryControl queryControl);

    /**
     * @param changeSet
     * @param queryControl
     * @return
     */
    public ChangeSet readChangeSet(ChangeSetURI changeSet, QueryControl queryControl);

    /**
     * @param changeSet
     * @param creator
     * @param changeInstructions
     * @param officialEffectiveDate
     * @return
     */
    public Changeable updateChangeSetMetadata(ChangeSetURI changeSet, NameOrURI creator, OpaqueData changeInstructions, Date officialEffectiveDate);

    /**
     * @param changeSet
     * @return
     */
    public ValidationResponse commitChangeSet(ChangeSetURI changeSet);

    /**
     * @param changeSet
     * @return
     */
    public ValidationResponse rollbackChangeSet(ChangeSetURI changeSet);

    /**
     * @param changeSet
     * @param entryID
     * @param status
     * @param entryState
     * @param effectiveDate
     * @param changeNotes
     * @param changeSource
     * @return
     */
    public Changeable updateChangeableMetadata(ChangeSetURI changeSet, PersistentURI entryID, NameOrURI status, EntryState entryState, Date effectiveDate, OpaqueData changeNotes, SourceReference changeSource);

    /**
     * @param changeSet
     * @param changeableResource
     */
    public void deleteChangeable(ChangeSetURI changeSet, Changeable changeableResource);

    /**
     * @param predicate
     * @param value
     * @param externalIdentifier
     * @return
     */
    public Property newProperty(EntityNameOrURI predicate, StatementTarget value, String externalIdentifier);

    /**
     * @param resource
     * @return
     */
    public StatementTarget newResourceTarget(ExternalURI resource);

    /**
     * @param literal
     * @return
     */
    public StatementTarget newLiteralTarget(OpaqueData literal);

    /**
     * @param entity
     * @return
     */
    public StatementTarget newEntityReferenceTarget(EntityNameOrURI entity);

}