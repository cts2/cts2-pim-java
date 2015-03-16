package CTS_PIM.ComputationalModel.ValueSetDefinitionServices.ValueSetDefinitionMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURIList;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.FiltersAndSorting.AssociationDirection;
import CTS_PIM.InformationModel.Core.FiltersAndSorting.ComponentReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinition;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry.LeafOrAll;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry.SetOperator;
import CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry.TransitiveClosure;

/**
 *
 */
public interface ValueSetDefinitionMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param valueSet
     * @param definition
     * @return
     */
    public ValueSetDefinition createExternalValueSetDefinition(ChangeSetURI changeSet, NameOrURI valueSet, OpaqueData definition);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param definition
     * @return
     */
    public ValueSetDefinition addExternalValueSetDefinition(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, OpaqueData definition);

    /**
     * @param changeSet
     * @param valueSet
     * @param codeSystem
     * @param codeSystemVersion
     * @return
     */
    public ValueSetDefinition createCompleteCodeSystemReference(ChangeSetURI changeSet, NameOrURI valueSet, NameOrURI codeSystem, NameOrURI codeSystemVersion);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param codeSystem
     * @param codeSystemVersion
     * @return
     */
    public ValueSetDefinition addCompleteCodeSystemReference(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, NameOrURI codeSystem, NameOrURI codeSystemVersion);

    /**
     * @param changeSet
     * @param valueSet
     * @param referenceValueSet
     * @param referenceValueSetDefinition
     * @param referenceCodeSystemVersions
     * @return
     */
    public ValueSetDefinition createCompleteValueSetReference(ChangeSetURI changeSet, NameOrURI valueSet, NameOrURI referenceValueSet, ExternalURI referenceValueSetDefinition, NameOrURIList referenceCodeSystemVersions);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param referenceValueSet
     * @param referenceValueSetDefinition
     * @param referenceCodeSystemVersions
     * @return
     */
    public ValueSetDefinition addCompleteValueSetReference(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, NameOrURI referenceValueSet, ExternalURI referenceValueSetDefinition, NameOrURIList referenceCodeSystemVersions);

    /**
     * @param changeSet
     * @param valueSet
     * @param codeSystem
     * @param codeSystemVersion
     * @param componentReference
     * @param matchAlgorithm
     * @param matchValue
     * @return
     */
    public ValueSetDefinition createPropertyQueryReference(ChangeSetURI changeSet, NameOrURI valueSet, NameOrURI codeSystem, NameOrURI codeSystemVersion, ComponentReference componentReference, NameOrURI matchAlgorithm, String matchValue);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param codeSystem
     * @param codeSystemVersion
     * @param componentReference
     * @param matchAlgorithm
     * @param matchValue
     * @return
     */
    public ValueSetDefinition addPropertyQueryReference(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, NameOrURI codeSystem, NameOrURI codeSystemVersion, ComponentReference componentReference, NameOrURI matchAlgorithm, String matchValue);

    /**
     * @param changeSet
     * @param valueSet
     * @param referencedEntity
     * @param codeSystem
     * @param codeSystemVersion
     * @param predicate
     * @param direction
     * @param transitivity
     * @param leafOnly
     * @return
     */
    public ValueSetDefinition createAssociatedEntitiesReference(ChangeSetURI changeSet, NameOrURI valueSet, EntityNameOrURI referencedEntity, NameOrURI codeSystem, NameOrURI codeSystemVersion, EntityNameOrURI predicate, AssociationDirection direction, TransitiveClosure transitivity, LeafOrAll leafOnly);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param referencedEntity
     * @param codeSystem
     * @param codeSystemVersion
     * @param predicate
     * @param direction
     * @param transitivity
     * @param leafOnly
     * @return
     */
    public ValueSetDefinition addAssociatedEntitiesReference(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, EntityNameOrURI referencedEntity, NameOrURI codeSystem, NameOrURI codeSystemVersion, EntityNameOrURI predicate, AssociationDirection direction, TransitiveClosure transitivity, LeafOrAll leafOnly);

    /**
     * @param changeSet
     * @param valueSet
     * @param referencedEntities
     * @return
     */
    public ValueSetDefinition createSpecificEntityListDefinition(ChangeSetURI changeSet, NameOrURI valueSet, EntityNameOrURIList referencedEntities);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param operator
     * @param referencedEntities
     * @return
     */
    public ValueSetDefinition addSpecificEntityListDefinition(ChangeSetURI changeSet, ExternalURI valueSetDefinition, SetOperator operator, EntityNameOrURIList referencedEntities);

    /**
     * @param changeSet
     * @param valueSetDefinition
     * @param entryToRemove
     * @return
     */
    public ValueSetDefinition removeDefinitionEntry(ChangeSetURI changeSet, ExternalURI valueSetDefinition, Number entryToRemove);

    /**
     * @param versionURI
     * @param versionIdentifier
     * @param changeSet
     * @param resourceToClone
     * @return
     */
    public ValueSetDefinition clone(ExternalURI versionURI, LocalIdentifier versionIdentifier, ChangeSetURI changeSet, NameOrURI resourceToClone);

}