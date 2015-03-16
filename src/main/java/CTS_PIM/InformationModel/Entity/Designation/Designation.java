package CTS_PIM.InformationModel.Entity.Designation;

import CTS_PIM.InformationModel.Core.DataTypes.EntryDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.*;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

import java.util.Set;

/**
 *
 */
public class Designation extends EntryDescription {

    /**
     *
     */
    public Designation() {
    }

    /**
     *
     */
    public CodeSystemVersionReference assertedInCodeSystemVersion;

    /**
     *
     */
    public String externalIdentifier;

    /**
     *
     */
    public RenderingURI correspondingStatement;

    /**
     *
     */
    public DesignationRole designationRole;

    /**
     *
     */
    public Set<ContextReference> usageContext;

    /**
     *
     */
    public Set<DesignationTypeReference> designationType;

    /**
     *
     */
    public CaseSignificanceReference caseSignificance;

    /**
     *
     */
    public DesignationFidelityReference degreeOfFidelity;

}