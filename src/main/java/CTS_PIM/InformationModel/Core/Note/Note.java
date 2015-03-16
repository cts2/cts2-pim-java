package CTS_PIM.InformationModel.Core.Note;

import CTS_PIM.InformationModel.Core.DataTypes.EntryDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

/**
 *
 */
public abstract class Note extends EntryDescription {

    /**
     *
     */
    public Note() {
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

}