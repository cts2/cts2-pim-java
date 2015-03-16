package CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry;

import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetDefinitionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;

/**
 *
 */
public class CompleteValueSetReference extends ValueSetDefinitionEntry {

    /**
     *
     */
    public CompleteValueSetReference() {
    }

    /**
     *
     */
    public ValueSetReference valueSet;

    /**
     *
     */
    public ValueSetDefinitionReference valueSetDefinition;

    /**
     *
     */
    public CodeSystemVersionReference referenceCodeSystemVersion;

}