package CTS_PIM.InformationModel.MapVersion;

import CTS_PIM.InformationModel.Core.Directory.MapEntryDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.MapVersionName;
import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.*;

import java.util.Set;

/**
 *
 */
public class MapVersion extends ResourceVersionDescription {

    /**
     *
     */
    public MapVersion() {
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
    public ValueSetDefinitionReference fromValueSetDefinition;

    /**
     *
     */
    public CodeSystemVersionReference fromCodeSystemVersion;

    /**
     *
     */
    public ValueSetDefinitionReference toValueSetDefinition;

    /**
     *
     */
    public CodeSystemVersionReference toCodeSystemVersion;

    /**
     *
     */
    public Set<CodeSystemVersionReference> useCodeSystemVersion;

    /**
     *
     */
    public Set<ContextReference> applicableContext;

    /**
     *
     */
    public Set<VersionTagReference> versionTag;

    /**
     *
     */
    public MapEntryDirectoryURI entries;

}