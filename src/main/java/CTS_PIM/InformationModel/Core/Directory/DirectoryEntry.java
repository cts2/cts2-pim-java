package CTS_PIM.InformationModel.Core.Directory;

import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.ResourceDescription.CTS2ResourceType;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

/**
 *
 */
public abstract class DirectoryEntry {

    /**
     *
     */
    public DirectoryEntry() {
    }

    /**
     *
     */
    public CTS2ResourceType type;

    /**
     *
     */
    public LocalIdentifier resourceName;

    /**
     *
     */
    public RenderingURI href;

    /**
     *
     */
    public Float matchStrength;

}