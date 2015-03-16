package CTS_PIM.InformationModel.CodeSystemCatalog;

import CTS_PIM.InformationModel.Core.Directory.CodeSystemVersionCatalogEntryDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.CodeSystemName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.*;

import java.util.Set;

/**
 *
 */
public class CodeSystemCatalogEntry extends AbstractResourceDescription {

    /**
     *
     */
    public CodeSystemCatalogEntry() {
    }

    /**
     *
     */
    public CodeSystemName codeSystemName;

    /**
     *
     */
    public CodeSystemCategoryReference codeSystemCategory;

    /**
     *
     */
    public Set<OntologyDomainReference> ontologyDomain;

    /**
     *
     */
    public OntologyTypeReference ontologyType;

    /**
     *
     */
    public Set<OntologyTaskReference> designedForOntologyTask;

    /**
     *
     */
    public OntologyLanguageReference hasOntologyLanguage;

    /**
     *
     */
    public Set<CodeSystemReference> includes;

    /**
     *
     */
    public CodeSystemVersionCatalogEntryDirectoryURI versions;

    /**
     *
     */
    public CodeSystemVersionReference currentVersion;

    /**
     *
     */
    public Set<OntologyEngineeringToolReference> usedOntologyEngineeringTool;

}