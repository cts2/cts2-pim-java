package CTS_PIM.InformationModel.MapCatalog;

import CTS_PIM.InformationModel.Core.Directory.MapVersionDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.MapName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.MapVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;

/**
 *
 */
public class MapCatalogEntry extends AbstractResourceDescription {

    /**
     *
     */
    public MapCatalogEntry() {
    }

    /**
     *
     */
    public MapName mapName;

    /**
     *
     */
    public CodeSystemReference fromCodeSystem;

    /**
     *
     */
    public ValueSetReference fromValueSet;

    /**
     *
     */
    public CodeSystemReference toCodeSystem;

    /**
     *
     */
    public ValueSetReference toValueSet;

    /**
     *
     */
    public MapVersionDirectoryURI versions;

    /**
     *
     */
    public MapVersionReference currentVersion;

}