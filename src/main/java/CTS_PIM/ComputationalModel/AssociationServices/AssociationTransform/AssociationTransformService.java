package CTS_PIM.ComputationalModel.AssociationServices.AssociationTransform;

import CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogRead.CodeSystemVersionCatalogReadService;
import CTS_PIM.ComputationalModel.Core.BaseService.BaseService;
import CTS_PIM.InformationModel.Association.AssociationList;
import CTS_PIM.InformationModel.Association.OntologyLanguageAndSyntax;
import CTS_PIM.InformationModel.Core.EntityReference.EntityExpression;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

import java.util.Set;

/**
 *
 */
public interface AssociationTransformService extends BaseService {

    /**
     *
     */
    public Set<OntologyLanguageAndSyntax> supportedOntologyLanguageAndSyntax();

    /**
     *
     */
    public CodeSystemVersionCatalogReadService knownCodeSystemVersion();

    /**
     * @param entityExpression
     * @param codeSystemVersion
     * @return
     */
    public AssociationList toAssociationFormat(EntityExpression entityExpression, CodeSystemVersionReference codeSystemVersion);

    /**
     * @param languageAndSyntax
     * @param associationList
     * @return
     */
    public EntityExpression fromAssociationList(OntologyLanguageAndSyntax languageAndSyntax, AssociationList associationList);

}