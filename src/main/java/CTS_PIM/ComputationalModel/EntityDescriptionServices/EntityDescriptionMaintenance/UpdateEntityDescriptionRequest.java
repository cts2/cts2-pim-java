package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionMaintenance;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.InformationModel.Core.EntityReference.CodeSystemRole;
import CTS_PIM.InformationModel.Core.EntityReference.ScopedEntityName;
import CTS_PIM.InformationModel.Core.Note.Comment;
import CTS_PIM.InformationModel.Core.Note.Definition;
import CTS_PIM.InformationModel.Core.Note.Example;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Entity.ClassDescription.ClassDescriptionState;
import CTS_PIM.InformationModel.Entity.ClassDescription.ClassDescriptionType;
import CTS_PIM.InformationModel.Entity.Designation.Designation;
import CTS_PIM.InformationModel.Entity.PredicateDescription.ObjectPropertyDirectionality;
import CTS_PIM.InformationModel.Entity.PredicateDescription.Transitivity;

import java.util.Set;

/**
 *
 */
public class UpdateEntityDescriptionRequest {

    /**
     *
     */
    public UpdateEntityDescriptionRequest() {
    }

    /**
     *
     */
    public Set<ScopedEntityName> alternateEntityID;

    /**
     *
     */
    private CodeSystemRole codeSystemRole;

    /**
     *
     */
    public Set<Definition> definition;

    /**
     *
     */
    public ClassDescriptionState descriptionState;

    /**
     *
     */
    public ClassDescriptionType descriptionType;

    /**
     *
     */
    public Set<Designation> designation;

    /**
     *
     */
    public ObjectPropertyDirectionality directed;

    /**
     *
     */
    public Set<EntityNameOrURI> entityType;

    /**
     *
     */
    public Set<Example> example;

    /**
     *
     */
    public String forwardName;

    /**
     *
     */
    public Set<Comment> note;

    /**
     *
     */
    public Set<EntityNameOrURI> parent;

    /**
     *
     */
    public Set<Property> property;

    /**
     *
     */
    public String reverseName;

    /**
     *
     */
    public Transitivity transitivity;

}