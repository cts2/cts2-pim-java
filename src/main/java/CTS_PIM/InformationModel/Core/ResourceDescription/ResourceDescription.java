package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.DataTypes.EntryDescription;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.Directory.StatementDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.Note.Comment;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceAndRoleReference;
import CTS_PIM.InformationModel.Core.StatementTarget.Property;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.PersistentURI;

import java.util.Set;

/**
 *
 */
public abstract class ResourceDescription extends Changeable {

    /**
     *
     */
    public ResourceDescription() {
    }

    /**
     *
     */
    public ExternalURI about;

    /**
     *
     */
    public CTS2ResourceType describedResourceType;

    /**
     *
     */
    public LocalIdentifier resourceID;

    /**
     *
     */
    public String formalName;

    /**
     *
     */
    public Set<String> keyword;

    /**
     *
     */
    public Set<URIAndEntityName> resourceType;

    /**
     *
     */
    public EntryDescription resourceSynopsis;

    /**
     *
     */
    public Set<PersistentURI> additionalDocumentation;

    /**
     *
     */
    public Set<SourceAndRoleReference> sourceAndRole;

    /**
     *
     */
    public OpaqueData rights;

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
    public Set<ExternalURI> alternateID;

    /**
     *
     */
    public StatementDirectoryURI sourceStatements;

}