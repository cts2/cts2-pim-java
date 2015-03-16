package CTS_PIM.InformationModel.MapVersion;

import CTS_PIM.InformationModel.Core.Directory.DirectoryEntry;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.ResourceReference.MapVersionReference;

/**
 *
 */
public class MapEntryDirectoryEntry extends DirectoryEntry {

    /**
     *
     */
    public MapEntryDirectoryEntry() {
    }

    /**
     *
     */
    public MapVersionReference assertedBy;

    /**
     *
     */
    public URIAndEntityName mapFrom;

}