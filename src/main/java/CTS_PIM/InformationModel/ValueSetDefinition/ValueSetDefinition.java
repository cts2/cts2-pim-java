package CTS_PIM.InformationModel.ValueSetDefinition;

import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public class ValueSetDefinition extends ResourceVersionDescription {

    /**
     *
     */
    public ValueSetDefinition() {
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