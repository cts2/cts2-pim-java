package CTS_PIM.InformationModel.MapVersion;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.EntityReference.EntityExpression;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.ResourceReference.MapCorrelationReference;

/**
 *
 */
public class MapTarget {

    /**
     *
     */
    public MapTarget() {
    }

    /**
     *
     */
    public MapRule rule;

    /**
     *
     */
    public URIAndEntityName mapTo;

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