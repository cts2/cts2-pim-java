package CTS_PIM.InformationModel.Association;

import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.Directory.StatementDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ReasoningAlgorithmReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.StatementTarget.StatementTarget;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

import java.util.Set;

/**
 *
 */
public class Association extends Changeable {

    /**
     *
     */
    public Association() {
    }

    /**
     *
     */
    public URI associationID;

    /**
     *
     */
    public URIAndEntityName subject;

    /**
     *
     */
    public PredicateReference predicate;

    /**
     *
     */
    public Set<StatementTarget> target;

    /**
     *
     */
    public Set<Property> associationQualifier;

    /**
     *
     */
    public CodeSystemVersionReference assertedBy;

    /**
     *
     */
    public CodeSystemVersionReference assertedIn;

    /**
     *
     */
    public AssociationDerivation derivation;

    /**
     *
     */
    public Set<ReasoningAlgorithmReference> derivationReasoningAlgorithm;

    /**
     *
     */
    public StatementDirectoryURI sourceStatements;

}