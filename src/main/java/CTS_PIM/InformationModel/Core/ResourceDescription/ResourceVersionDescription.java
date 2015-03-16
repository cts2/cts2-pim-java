package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.ResourceReference.NameAndMeaningReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

import java.util.Date;

/**
 *
 */
public abstract class ResourceVersionDescription extends ResourceDescription {

    /**
     *
     */
    public ResourceVersionDescription() {
    }

    /**
     *
     */
    public DocumentURI documentURI;

    /**
     *
     */
    public SourceAndNotation sourceAndNotation;

    /**
     *
     */
    public NameAndMeaningReference predecessor;

    /**
     *
     */
    public String officialResourceVersionId;

    /**
     *
     */
    public Date officialReleaseDate;

    /**
     *
     */
    public Date officialActivationDate;

}