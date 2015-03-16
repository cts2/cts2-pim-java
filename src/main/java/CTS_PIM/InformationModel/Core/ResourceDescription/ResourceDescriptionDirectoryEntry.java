package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.DataTypes.EntryDescription;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.Directory.DirectoryEntry;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public abstract class ResourceDescriptionDirectoryEntry extends DirectoryEntry {

    /**
     *
     */
    public ResourceDescriptionDirectoryEntry() {
    }

    /**
     *
     */
    public ExternalURI about;

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
    public CTS2ResourceType describedResourceType;

    /**
     *
     */
    public EntryDescription resourceSynopsis;

}