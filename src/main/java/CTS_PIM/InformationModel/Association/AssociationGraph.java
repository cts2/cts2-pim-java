package CTS_PIM.InformationModel.Association;

import CTS_PIM.InformationModel.Core.Directory.Directory;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;

/**
 *
 */
public class AssociationGraph extends Directory {

    /**
     *
     */
    public AssociationGraph() {
    }

    /**
     *
     */
    public Number expansionDepth;

    /**
     *
     */
    public GraphDirection expansionDirection;

    /**
     *
     */
    public GraphFocus graphFocus;

    /**
     *
     */
    public EntityReference focusEntity;

}