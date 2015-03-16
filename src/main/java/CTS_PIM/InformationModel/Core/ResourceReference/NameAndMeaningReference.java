package CTS_PIM.InformationModel.Core.ResourceReference;

import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

/**
 *
 */
public class NameAndMeaningReference {

    /**
     *
     */
    public NameAndMeaningReference() {
    }

    /**
     *
     */
    public ReferenceType domain;

    /**
     *
     */
    public LocalIdentifier name;

    /**
     *
     */
    public ExternalURI uri;

    /**
     *
     */
    public RenderingURI href;

}