package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

import java.util.Date;

/**
 *
 */
public class ResourceVersionDescriptionDirectoryEntry extends ResourceDescriptionDirectoryEntry {

    /**
     *
     */
    public ResourceVersionDescriptionDirectoryEntry() {
    }

    /**
     *
     */
    public DocumentURI documentURI;

    /**
     *
     */
    public String officialResourceVersionId;

    /**
     *
     */
    public Date officialReleaseDate;

}