package CTS_PIM.ComputationalModel.MapVersionServices.MapVersionMaintenance;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURIList;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public class CreateMapVersionRequest {

    /**
     *
     */
    public CreateMapVersionRequest() {
    }

    /**
     *
     */
    public ExternalURI mapVersionURI;

    /**
     *
     */
    public LocalIdentifier mapVersionName;

    /**
     *
     */
    public NameOrURI fromCodeSystemVersion;

    /**
     *
     */
    public NameOrURI fromValueSetDefinition;

    /**
     *
     */
    public NameOrURI toCodeSystemVersion;

    /**
     *
     */
    public NameOrURI toValueSetDefinition;

    /**
     *
     */
    public NameOrURIList useCodeSystemVersions;

}