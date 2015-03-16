package CTS_PIM.InformationModel.Core.Note;

import CTS_PIM.InformationModel.Core.ResourceReference.ContextReference;

import java.util.Set;

/**
 *
 */
public class Definition extends Note {

    /**
     *
     */
    public Definition() {
    }

    /**
     *
     */
    public DefinitionRole definitionRole;

    /**
     *
     */
    public Set<ContextReference> usageContext;

}