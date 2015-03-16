package CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.ProcessStatus;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.ImportAndExport.ImportExportBase.LogEntry.LogEntry;

import java.util.Date;
import java.util.List;

/**
 *
 */
public class ProcessStatus {

    /**
     *
     */
    public ProcessStatus() {
    }

    /**
     *
     */
    public Date startTime;

    /**
     *
     */
    public Date endTime;

    /**
     *
     */
    public ProcessCompletionState finalState;

    /**
     *
     */
    public String completionMessage;

    /**
     *
     */
    public Number numErrors;

    /**
     *
     */
    public Number numWarnings;

    /**
     *
     */
    public List<LogEntry> log;

}