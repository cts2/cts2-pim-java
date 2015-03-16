package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryMaintenance;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.EntityReference.EntityExpression;
import CTS_PIM.InformationModel.Core.ResourceReference.MapCorrelationReference;
import CTS_PIM.InformationModel.MapVersion.MapRule;

/**
 *
 */
public class MapTargetRequest {

    /**
     *
     */
    public MapTargetRequest() {
    }

    /**
     *
     */
    public MapRule mapRule;

    /**
     *
     */
    public EntityNameOrURI mapTo;

    /**
     *
     */
    public OpaqueData targetDescription;

    /**
     *
     */
    public EntityExpression targetExpression;

    /**
     *
     */
    public MapCorrelationReference correlation;

    /**
     *
     */
    public String externalEntryId;

}