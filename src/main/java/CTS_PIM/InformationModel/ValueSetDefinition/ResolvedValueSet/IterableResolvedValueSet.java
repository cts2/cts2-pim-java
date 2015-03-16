package CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet;

import CTS_PIM.InformationModel.Core.Directory.Directory;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;

import java.util.Set;

/**
 *
 */
public class IterableResolvedValueSet extends Directory {

    /**
     *
     */
    public IterableResolvedValueSet() {
    }

    /**
     *
     */
    public ResolvedValueSetHeader resolutionInfo;

    /**
     *
     */
    public Set<URIAndEntityName> entry;

}