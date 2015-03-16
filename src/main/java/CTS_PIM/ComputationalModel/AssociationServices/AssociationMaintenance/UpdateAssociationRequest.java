package CTS_PIM.ComputationalModel.AssociationServices.AssociationMaintenance;

import CTS_PIM.InformationModel.Association.AssociationDerivation;
import CTS_PIM.InformationModel.Core.ResourceReference.ReasoningAlgorithmReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.StatementTarget.StatementTarget;

import java.util.Set;

/**
 *
 */
public class UpdateAssociationRequest {

    /**
     *
     */
    public UpdateAssociationRequest() {
    }

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
    private AssociationDerivation derivation;

    /**
     *
     */
    private ReasoningAlgorithmReference derivationReasoningAlgorithm;

}