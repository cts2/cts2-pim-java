package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryMaintenance;

import CTS_PIM.InformationModel.Core.ResourceReference.SourceAndRoleReference;
import CTS_PIM.InformationModel.MapVersion.MapProcessingRule;

import java.util.Set;

/**
 *
 */
public class UpdateMapEntryRequest {

    /**
     *
     */
    public UpdateMapEntryRequest() {
    }

    /**
     *
     */
    public MapProcessingRule processingRule;

    /**
     *
     */
    public Set<SourceAndRoleReference> source;

}