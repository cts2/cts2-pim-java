package CTS_PIM.InformationModel.CodeSystemVersionCatalog;

import CTS_PIM.InformationModel.Core.Naming.CodeSystemVersionName;
import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescriptionDirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public class CodeSystemVersionCatalogEntrySummary extends ResourceVersionDescriptionDirectoryEntry {

    /**
     *
     */
    public CodeSystemVersionCatalogEntrySummary() {
    }

    /**
     *
     */
    public CodeSystemVersionName codeSystemVersionName;

    /**
     *
     */
    public CodeSystemReference versionOf;

    /**
     *
     */
    public Set<VersionTagReference> codeSystemVersionTag;

    /**
     *
     */
    public CodeSystemVersionReference predecessor;

}