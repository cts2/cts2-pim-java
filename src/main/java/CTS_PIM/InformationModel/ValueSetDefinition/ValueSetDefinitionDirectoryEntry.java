package CTS_PIM.InformationModel.ValueSetDefinition;

import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public class ValueSetDefinitionDirectoryEntry extends ResourceVersionDescriptionDirectoryEntry {

    /**
     *
     */
    public ValueSetDefinitionDirectoryEntry() {
    }

    /**
     *
     */
    public ValueSetReference definedValueSet;

    /**
     *
     */
    public Set<VersionTagReference> versionTag;

}