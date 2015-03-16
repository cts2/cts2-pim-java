package CTS_PIM.InformationModel.ValueSetCatalog;

import CTS_PIM.InformationModel.Core.Naming.ValueSetName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetDefinitionReference;

/**
 *
 */
public class ValueSetCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry {

    /**
     *
     */
    public ValueSetCatalogEntrySummary() {
    }

    /**
     *
     */
    public ValueSetName valueSetName;

    /**
     *
     */
    public ValueSetDefinitionReference currentDefinition;

}