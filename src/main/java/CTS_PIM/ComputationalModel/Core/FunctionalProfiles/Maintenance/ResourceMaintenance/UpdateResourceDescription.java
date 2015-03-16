package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance;

import CTS_PIM.InformationModel.Core.DataTypes.EntryDescription;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;
import CTS_PIM.InformationModel.Core.Note.Comment;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceAndRoleReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

import java.util.Set;

/**
 *
 */
public abstract class UpdateResourceDescription {

    /**
     *
     */
    public UpdateResourceDescription() {
    }

    /**
     *
     */
    public String formalName;

    /**
     *
     */
    public Set<String> keywords;

    /**
     *
     */
    public Set<EntityReference> resourceTypes;

    /**
     *
     */
    public EntryDescription resourceSynopsis;

    /**
     *
     */
    public Set<URI> additionalDocumentation;

    /**
     *
     */
    public Set<SourceAndRoleReference> sourcesAndRoles;

    /**
     *
     */
    public OpaqueData rights;

    /**
     *
     */
    public Set<Comment> notes;

    /**
     *
     */
    public Set<Property> property;

    /**
     *
     */
    public Set<ExternalURI> alternateID;

}