package CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry;

import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.FiltersAndSorting.AssociationDirection;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;

/**
 *
 */
public class AssociatedEntitiesReference extends ValueSetDefinitionEntry {

    /**
     *
     */
    public AssociatedEntitiesReference() {
    }

    /**
     *
     */
    public URIAndEntityName referencedEntity;

    /**
     *
     */
    public CodeSystemReference codeSystem;

    /**
     *
     */
    public CodeSystemVersionReference codeSystemVersion;

    /**
     *
     */
    public PredicateReference predicate;

    /**
     *
     */
    public AssociationDirection direction;

    /**
     *
     */
    public TransitiveClosure transitivity;

    /**
     *
     */
    public LeafOrAll leafOnly;

}