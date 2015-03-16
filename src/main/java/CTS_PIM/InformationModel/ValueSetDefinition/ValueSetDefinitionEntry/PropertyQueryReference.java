package CTS_PIM.InformationModel.ValueSetDefinition.ValueSetDefinitionEntry;

import CTS_PIM.InformationModel.Core.FiltersAndSorting.FilterComponent;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

/**
 *
 */
public class PropertyQueryReference extends ValueSetDefinitionEntry {

    /**
     *
     */
    public PropertyQueryReference() {
    }

    /**
     *
     */
    public CodeSystemReference codeSystem;

    /**
     *
     */
    public CodeSystemVersionReference codeSystemVersion;

    /**
     *
     */
    public FilterComponent filter;

}