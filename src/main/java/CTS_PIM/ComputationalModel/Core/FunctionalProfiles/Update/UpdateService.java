package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Update;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ErrorResponse;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ProcessStatus.ProcessStatus;
import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ValidationLevel;
import CTS_PIM.ImplementationProfile.StructuralProfile;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;

import java.util.Date;
import java.util.Set;

/**
 *
 */
public interface UpdateService extends BaseService {

    /**
     *
     */
    public Set<StructuralProfile> supportedStructures();

    /**
     * @param validationLevel
     * @param changeSet
     * @return
     */
    public ProcessStatus validateChangeSet(ValidationLevel validationLevel, ChangeSetURI changeSet);

    /**
     * @param changeSet
     * @param errorResponse
     * @return
     */
    public ProcessStatus putChangeSet(ChangeSetURI changeSet, ErrorResponse errorResponse);

    /**
     * @param fromDate
     * @param toDate
     * @return
     */
    public ChangeSetEntryList listChanges(Date fromDate, Date toDate);

}