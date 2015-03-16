package CTS_PIM.InformationModel.Core.EntityReference;

import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

/**
 *
 */
public class DescriptionInCodeSystem {

    /**
     *
     */
    public DescriptionInCodeSystem() {
    }

    /**
     *
     */
    public CodeSystemVersionReference describingCodeSystemVersion;

    /**
     *
     */
    public String designation;

    /**
     *
     */
    public RenderingURI href;

    /**
     *
     */
    public CodeSystemRole codeSystemRole;

}