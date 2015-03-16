package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.ResourceMaintenance;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.ChangeModel.FinalizableState;
import CTS_PIM.InformationModel.Core.ResourceDescription.SourceAndNotation;

import java.util.Date;

/**
 *
 */
public class UpdateResourceVersionDescription extends UpdateResourceDescription {

    /**
     *
     */
    public UpdateResourceVersionDescription() {
    }

    /**
     *
     */
    public FinalizableState state;

    /**
     *
     */
    public SourceAndNotation sourceAndNotation;

    /**
     *
     */
    public NameOrURI predecessor;

    /**
     *
     */
    public String officialResourceVersionId;

    /**
     *
     */
    public Date officialReleaseDate;

    /**
     *
     */
    public Date officialActivationDate;

}