package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;

import java.util.Set;

/**
 *
 */
public abstract class AbstractResourceDescription extends ResourceDescription {

    /**
     *
     */
    public AbstractResourceDescription() {
    }

    /**
     *
     */
    public OpaqueData releaseDocumentation;

    /**
     *
     */
    public Set<SourceAndNotation> releaseFormat;

}