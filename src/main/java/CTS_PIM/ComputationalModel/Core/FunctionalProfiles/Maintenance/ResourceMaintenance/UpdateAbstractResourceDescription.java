package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.ResourceDescription.SourceAndNotation;

import java.util.Set;

/**
 *
 */
public class UpdateAbstractResourceDescription extends UpdateResourceDescription {

    /**
     *
     */
    public UpdateAbstractResourceDescription() {
    }

    /**
     *
     */
    public OpaqueData releaseDocumentation;

    /**
     *
     */
    public Set<SourceAndNotation> releaseFormats;

}