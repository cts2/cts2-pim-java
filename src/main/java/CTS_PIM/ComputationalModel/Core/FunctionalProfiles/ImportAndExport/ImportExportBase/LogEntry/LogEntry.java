package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry;

import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.LocalURI;

import java.util.Date;

/**
 *
 */
public class LogEntry {

    /**
     *
     */
    public LogEntry() {
    }

    /**
     *
     */
    public LocalURI processID;

    /**
     *
     */
    public Date entryTime;

    /**
     *
     */
    public LoggingLevel entryType;

    /**
     *
     */
    public String message;

    /**
     *
     */
    public String programName;

    /**
     *
     */
    public ExternalURI messageID;

}