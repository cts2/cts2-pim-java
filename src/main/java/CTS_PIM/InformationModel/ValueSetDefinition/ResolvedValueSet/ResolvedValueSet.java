package CTS_PIM.InformationModel.ValueSetDefinition.ResolvedValueSet;

import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;

import java.util.Set;

/**
 *
 */
public class ResolvedValueSet {

    /**
     *
     */
    public ResolvedValueSet() {
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