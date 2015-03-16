package CTS_PIM.InformationModel.CodeSystemCatalog;

import CTS_PIM.InformationModel.Core.Directory.CodeSystemVersionCatalogEntryDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.CodeSystemName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

/**
 *
 */
public class CodeSystemCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry {

    /**
     *
     */
    public CodeSystemCatalogEntrySummary() {
    }

    /**
     *
     */
    public CodeSystemName codeSystemName;

    /**
     *
     */
    public CodeSystemVersionCatalogEntryDirectoryURI versions;

    /**
     *
     */
    public CodeSystemVersionReference currentVersion;

}