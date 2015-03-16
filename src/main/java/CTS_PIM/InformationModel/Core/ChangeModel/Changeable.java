package CTS_PIM.InformationModel.Core.ChangeModel;

import CTS_PIM.InformationModel.Core.ResourceReference.StatusReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.PersistentURI;

/**
 *
 */
public abstract class Changeable {

    /**
     *
     */
    public Changeable() {
    }

    /**
     *
     */
    public PersistentURI entryID;

    /**
     *
     */
    public EntryState entryState;

    /**
     *
     */
    public StatusReference status;

}