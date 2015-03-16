package CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry;

import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

/**
 *
 */
public class CompleteCodeSystemReference extends ValueSetDefinitionEntry {

    /**
     *
     */
    public CompleteCodeSystemReference() {
    }

    /**
     *
     */
    public CodeSystemReference codeSystem;

    /**
     *
     */
    public CodeSystemVersionReference codeSystemVersion;

}