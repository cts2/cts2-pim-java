package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionTransform;

import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.Directory.EntityDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityExpression;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Entity.EntityList;

import java.util.Set;

/**
 *
 */
public interface EntityDescriptionTransformService extends BaseService {

    /**
     *
     */
    public Set<OntologyLanguageAndSyntax> supportedOntologyLanguageAndSyntax();

    /**
     *
     */
    public Set<CodeSystemReference> knownCodeSystemVersion();

    /**
     * @param entityExpression
     * @param codeSystemVersion
     * @return
     */
    public EntityList toEntityDescriptions(EntityExpression entityExpression, NameOrURI codeSystemVersion);

    /**
     * @param toLanguageAndSyntax
     * @param entityList
     * @return
     */
    public EntityExpression fromEntityDescriptionList(OntologyLanguageAndSyntax toLanguageAndSyntax, EntityList entityList);

    /**
     * @param toLanguageAndSyntax
     * @param directory
     * @return
     */
    public EntityExpression fromEntityDirectory(OntologyLanguageAndSyntax toLanguageAndSyntax, EntityDirectoryURI directory);

}