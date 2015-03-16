package CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet;

import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetDefinitionReference;

import java.util.Set;

/**
 *
 */
public class ResolvedValueSetHeader {

    /**
     *
     */
    public ResolvedValueSetHeader() {
    }

    /**
     *
     */
    public ValueSetDefinitionReference resolutionOf;

    /**
     *
     */
    public Set<CodeSystemVersionReference> resolvedUsingCodeSystem;

    /**
     *
     */
    public Set<ResolvedValueSetHeader> includesResolvedValueSet;

}