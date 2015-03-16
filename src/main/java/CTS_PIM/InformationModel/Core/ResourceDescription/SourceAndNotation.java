package CTS_PIM.InformationModel.Core.ResourceDescription;

import CTS_PIM.InformationModel.Core.ResourceReference.OntologyLanguageReference;
import CTS_PIM.InformationModel.Core.ResourceReference.OntologySyntaxReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.PersistentURI;

/**
 *
 */
public class SourceAndNotation {

    /**
     *
     */
    public SourceAndNotation() {
    }

    /**
     *
     */
    public String sourceAndNotationDescription;

    /**
     *
     */
    public PersistentURI sourceDocument;

    /**
     *
     */
    public OntologyLanguageReference sourceLanguage;

    /**
     *
     */
    public OntologySyntaxReference sourceDocumentSyntax;

}