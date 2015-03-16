package CTS_PIM.InformationModel.Core.Directory;

import CTS_PIM.InformationModel.Core.FiltersAndSorting.Filter;
import CTS_PIM.InformationModel.Core.FiltersAndSorting.SortCriteria;
import CTS_PIM.InformationModel.Core.ResourceDescription.CTS2ResourceType;
import CTS_PIM.InformationModel.Core.TypesOfURI.DirectoryURI;

/**
 *
 */
public abstract class Directory {

    /**
     *
     */
    public Directory() {
    }

    /**
     *
     */
    public CTS2ResourceType type;

    /**
     *
     */
    public Filter directoryFilter;

    /**
     *
     */
    public SortCriteria sortCriteria;

    /**
     *
     */
    public Number numEntries;

    /**
     *
     */
    public CompleteDirectory complete;

    /**
     *
     */
    public DirectoryURI next;

    /**
     *
     */
    public DirectoryURI prev;

}