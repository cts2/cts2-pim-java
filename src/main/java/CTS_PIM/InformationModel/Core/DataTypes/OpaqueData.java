package CTS_PIM.InformationModel.Core.DataTypes;

import CTS_PIM.InformationModel.Core.ResourceReference.FormatReference;
import CTS_PIM.InformationModel.Core.ResourceReference.LanguageReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

/**
 *
 */
public class OpaqueData {

    /**
     *
     */
    public OpaqueData() {
    }

    /**
     *
     */
    public FormatReference format;

    /**
     *
     */
    public DocumentURI schema;

    /**
     *
     */
    public LanguageReference language;

    /**
     *
     */
    public String value;

}