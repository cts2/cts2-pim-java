package CTS_PIM.ComputationalModel.Core.InterfaceElements;

import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;

import java.util.Date;

/**
 *
 */
public class ReadContext {

    /**
     *
     */
    public ReadContext() {
    }

    /**
     *
     */
    public ActiveOrAll active;

    /**
     *
     */
    public NameOrURI referenceLanguage;

    /**
     *
     */
    public Date referenceTime;

    /**
     *
     */
    public ChangeSetURI changeSetContext;

}