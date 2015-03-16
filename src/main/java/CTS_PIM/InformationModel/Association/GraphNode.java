package CTS_PIM.InformationModel.Association;

import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.FiltersAndSorting.AssociationDirection;

/**
 *
 */
public class GraphNode extends AssociationDirectoryEntry {

    /**
     *
     */
    public GraphNode() {
    }

    /**
     *
     */
    public Number nodeNumber;

    /**
     *
     */
    public AssociationDirection direction;

    /**
     *
     */
    public Number nextNodeNumber;

    /**
     *
     */
    public URIAndEntityName nodeEntity;

    /**
     *
     */
    public Number depth;

}