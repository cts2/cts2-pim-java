package CTS_PIM.InformationModel.Entity;

import CTS_PIM.InformationModel.Core.Directory.AssociationDirectoryURI;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.Directory.StatementDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.CodeSystemRole;
import CTS_PIM.InformationModel.Core.EntityReference.ScopedEntityName;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.Note.Comment;
import CTS_PIM.InformationModel.Core.Note.Definition;
import CTS_PIM.InformationModel.Core.Note.Example;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;
import CTS_PIM.InformationModel.Entity.Designation.Designation;

import java.util.Set;

/**
 *
 */
public abstract class EntityDescriptionBase {

    /**
     *
     */
    public EntityDescriptionBase() {
    }

    /**
     *
     */
    public EntityDescriptionType entityDescriptionType;

    /**
     *
     */
    public URI about;

    /**
     *
     */
    public ScopedEntityName entityID;

    /**
     *
     */
    public Set<ScopedEntityName> alternateEntityID;

    /**
     *
     */
    public CodeSystemVersionReference describingCodeSystemVersion;

    /**
     *
     */
    private CodeSystemRole codeSystemRole;

    /**
     *
     */
    public Set<Designation> designation;

    /**
     *
     */
    public Set<Definition> definition;

    /**
     *
     */
    public Set<Example> example;

    /**
     *
     */
    public Set<Comment> note;

    /**
     *
     */
    public Set<Property> property;

    /**
     *
     */
    public StatementDirectoryURI sourceStatements;

    /**
     *
     */
    public AssociationDirectoryURI subjectOf;

    /**
     *
     */
    public AssociationDirectoryURI predicateOf;

    /**
     *
     */
    public AssociationDirectoryURI targetOf;

    /**
     *
     */
    public Set<URIAndEntityName> parent;

    /**
     *
     */
    public EntityDirectoryURI parents;

    /**
     *
     */
    public EntityDirectoryURI ancestors;

    /**
     *
     */
    public EntityDirectoryURI children;

    /**
     *
     */
    public EntityDirectoryURI descendants;

    /**
     *
     */
    public Set<URIAndEntityName> entityType;

    /**
     *
     */
    public EntityDirectoryURI instances;

    /**
     *
     */
    public Set<URIAndEntityName> equivalentEntity;

}