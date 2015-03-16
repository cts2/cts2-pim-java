package CTS_PIM.InformationModel.ValueSetCatalog;

import CTS_PIM.InformationModel.Core.Directory.ValueSetDefinitionDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.ValueSetName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetDefinitionReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

/**
 *
 */
public class ValueSetCatalogEntry extends AbstractResourceDescription {

    /**
     *
     */
    public ValueSetCatalogEntry() {
    }

    /**
     *
     */
    public ValueSetName valueSetName;

    /**
     *
     */
    public ValueSetDefinitionDirectoryURI definitions;

    /**
     *
     */
    public ValueSetDefinitionReference currentDefinition;

    /**
     *
     */
    public RenderingURI currentResolution;

}