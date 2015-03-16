package CTS_PIM.InformationModel.Core.EntityReference;

import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

import java.util.Set;

/**
 *
 */
public abstract class EntityReference {

    /**
     *
     */
    public EntityReference() {
    }

    /**
     *
     */
    public EntityReferenceType entityReferenceType;

    /**
     *
     */
    public URI about;

    /**
     *
     */
    public ScopedEntityName name;

    /**
     *
     */
    public Set<DescriptionInCodeSystem> knownEntityDescription;

}