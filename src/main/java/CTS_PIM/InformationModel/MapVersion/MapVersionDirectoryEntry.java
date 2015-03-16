package CTS_PIM.InformationModel.MapVersion;

import CTS_PIM.InformationModel.Core.Naming.MapVersionName;
import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.MapReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public class MapVersionDirectoryEntry extends ResourceVersionDescriptionDirectoryEntry {

    /**
     *
     */
    public MapVersionDirectoryEntry() {
    }

    /**
     *
     */
    public MapVersionName mapVersionName;

    /**
     *
     */
    public MapReference versionOf;

    /**
     *
     */
    public Set<VersionTagReference> versionTag;

}