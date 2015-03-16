package CTS_PIM.InformationModel.Core.ChangeModel;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.ResourceReference.NameAndMeaningReference;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;

import java.util.Date;

/**
 *
 */
public class ChangeDescription {

    /**
     *
     */
    public ChangeDescription() {
    }

    /**
     *
     */
    public ChangeType changeType;

    /**
     *
     */
    public ChangeCommitted committed;

    /**
     *
     */
    public ChangeSetURI containingChangeSet;

    /**
     *
     */
    public ChangeSetURI prevChangeSet;

    /**
     *
     */
    public Date changeDate;

    /**
     *
     */
    public Date effectiveDate;

    /**
     *
     */
    public OpaqueData changeNotes;

    /**
     *
     */
    public SourceReference changeSource;

    /**
     *
     */
    public NameAndMeaningReference clonedResource;

}