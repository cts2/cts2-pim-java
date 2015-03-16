package CTS_PIM.ComputationalModel.Core.InterfaceElements.ExceptionModel;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry.LoggingLevel;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;

/**
 *
 */
public abstract class CTS2Exception {

    /**
     *
     */
    public CTS2Exception() {
    }

    /**
     *
     */
    public OpaqueData message;

    /**
     *
     */
    public LoggingLevel severity;

}