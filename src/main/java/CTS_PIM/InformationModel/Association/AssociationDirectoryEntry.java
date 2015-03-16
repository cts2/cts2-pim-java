package CTS_PIM.InformationModel.Association;

import CTS_PIM.InformationModel.Core.Directory.DirectoryEntry;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;
import CTS_PIM.InformationModel.Core.StatementTarget.StatementTarget;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

/**
 *
 */
public class AssociationDirectoryEntry extends DirectoryEntry {

    /**
     *
     */
    public AssociationDirectoryEntry() {
    }

    /**
     *
     */
    public URI associationID;

    /**
     *
     */
    public EntityReference subject;

    /**
     *
     */
    public PredicateReference predicate;

    /**
     *
     */
    public StatementTarget target;

    /**
     *
     */
    public CodeSystemVersionReference assertedBy;

    /**
     *
     */
    public AssociationDerivation derivation;

}