package CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntry;
import CTS_PIM.InformationModel.Core.DataTypes.LocalIdentifier;
import CTS_PIM.InformationModel.Core.Naming.CodeSystemVersionName;
import CTS_PIM.InformationModel.Core.ResourceDescription.SourceAndNotation;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public interface CodeSystemVersionCatalogMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param uri
     * @param name
     * @param sourceAndNotation
     * @param versionOf
     * @return
     */
    public CodeSystemVersionCatalogEntry createCodeSystemVersion(ChangeSetURI changeSet, ExternalURI uri, CodeSystemVersionName name, SourceAndNotation sourceAndNotation, NameOrURI versionOf);

    /**
     * @param changeSet
     * @param codeSystemVersion
     * @param request
     * @return
     */
    public CodeSystemVersionCatalogEntry updateCodeSystemVersion(ChangeSetURI changeSet, NameOrURI codeSystemVersion, UpdateCodeSystemVersionRequest request);

    /**
     * @param changeSet
     * @param resourceToClone
     * @param versionIdentifier
     * @param versionURI
     * @return
     */
    public CodeSystemVersionCatalogEntry clone(ChangeSetURI changeSet, NameOrURI resourceToClone, LocalIdentifier versionIdentifier, ExternalURI versionURI);

}