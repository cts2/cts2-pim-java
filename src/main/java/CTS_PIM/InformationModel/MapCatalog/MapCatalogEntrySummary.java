package CTS_PIM.InformationModel.MapCatalog;

import CTS_PIM.InformationModel.Core.Naming.MapName;
import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.MapVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;

/**
 *
 */
public class MapCatalogEntrySummary extends ResourceVersionDescriptionDirectoryEntry {

    /**
     *
     */
    public MapCatalogEntrySummary() {
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
    public MapVersionReference currentVersion;

}