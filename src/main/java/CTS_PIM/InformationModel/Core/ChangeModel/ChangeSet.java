package CTS_PIM.InformationModel.Core.ChangeModel;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;

import java.util.Date;

/**
 *
 */
public class ChangeSet extends Finalizable {

    /**
     *
     */
    public ChangeSet() {
    }

    /**
     *
     */
    public ChangeSetURI changeSetURI;

    /**
     *
     */
    public Date creationDate;

    /**
     *
     */
    public SourceReference creator;

    /**
     *
     */
    public OpaqueData changeInstructions;

    /**
     *
     */
    public Date officialEffectiveDate;

    /**
     *
     */
    public Date closeDate;

    /**
     *
     */
    public Number entryCount;

}