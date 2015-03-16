package CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance.UpdateResourceVersionDescription;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

import java.util.Set;

/**
 *
 */
public class UpdateCodeSystemVersionRequest extends UpdateResourceVersionDescription {

    /**
     *
     */
    public UpdateCodeSystemVersionRequest() {
    }

    /**
     *
     */
    public NameOrURI defaultLanguage;

    /**
     *
     */
    public DocumentURI documentURI;

    /**
     *
     */
    public Set<NameOrURI> imports;

}