package CTS_PIM.InformationModel.CodeSystemVersionCatalog;

import CTS_PIM.InformationModel.Core.Directory.AssociationDirectoryURI;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.Naming.CodeSystemVersionName;
import CTS_PIM.InformationModel.Core.ResourceDescription.ResourceVersionDescription;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.LanguageReference;

import java.util.Set;

/**
 *
 */
public class CodeSystemVersionCatalogEntry extends ResourceVersionDescription {

    /**
     *
     */
    public CodeSystemVersionCatalogEntry() {
    }

    /**
     *
     */
    public CodeSystemVersionName codeSystemVersionName;

    /**
     *
     */
    public CodeSystemReference versionOf;

    /**
     *
     */
    public Set<CodeSystemVersionReference> imports;

    /**
     *
     */
    public LanguageReference defaultLanguage;

    /**
     *
     */
    public Set<LanguageReference> supportedLanguage;

    /**
     *
     */
    public AssociationDirectoryURI associations;

    /**
     *
     */
    public EntityDirectoryURI entityDescriptions;

    /**
     *
     */
    public EntityDirectoryURI classes;

    /**
     *
     */
    public EntityDirectoryURI individuals;

    /**
     *
     */
    public EntityDirectoryURI roles;

}