package CTS_PIM.ComputationalModel.Core.InterfaceElements;

import CTS_PIM.InformationModel.Core.FiltersAndSorting.SortCriteria;

/**
 *
 */
public class QueryControl {

    /**
     *
     */
    public QueryControl() {
    }

    /**
     *
     */
    public Number maxToReturn;

    /**
     *
     */
    public Number timeLimit;

    /**
     *
     */
    public NameOrURI format;

    /**
     *
     */
    public SortCriteria sortOrder;

}