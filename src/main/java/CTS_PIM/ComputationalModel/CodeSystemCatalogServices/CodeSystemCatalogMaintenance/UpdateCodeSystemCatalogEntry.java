package CTS_PIM.ComputationalModel.CodeSystemCatalogServices.CodeSystemCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance.UpdateAbstractResourceDescription;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;

import java.util.Set;

/**
 *
 */
public class UpdateCodeSystemCatalogEntry extends UpdateAbstractResourceDescription {

    /**
     *
     */
    public UpdateCodeSystemCatalogEntry() {
    }

    /**
     *
     */
    public NameOrURI codeSystemCategory;

    /**
     *
     */
    public Set<NameOrURI> ontologyDomain;

    /**
     *
     */
    public NameOrURI ontologyType;

    /**
     *
     */
    public Set<NameOrURI> designedForOntologyTask;

    /**
     *
     */
    public NameOrURI hasOntologyLanguage;

    /**
     *
     */
    public Set<NameOrURI> usedOntologyEngineeringTool;

}