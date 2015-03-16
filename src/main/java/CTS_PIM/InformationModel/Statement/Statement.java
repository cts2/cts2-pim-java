package CTS_PIM.InformationModel.Statement;

import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ModelAttributeReference;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceAndRoleReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

import java.util.Set;

/**
 *
 */
public class Statement extends Changeable {

    /**
     *
     */
    public Statement() {
    }

    /**
     *
     */
    private ExternalURI statementURI;

    /**
     *
     */
    public StatementSubject subject;

    /**
     *
     */
    public URIAndEntityName predicate;

    /**
     *
     */
    public ModelAttributeReference associatedAttribute;

    /**
     *
     */
    public Set<SourceAndRoleReference> source;

    /**
     *
     */
    public CodeSystemVersionReference assertedBy;

    /**
     *
     */
    public CodeSystemVersionReference assertedIn;

}