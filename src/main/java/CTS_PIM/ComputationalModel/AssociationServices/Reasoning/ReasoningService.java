package CTS_PIM.ComputationalModel.AssociationServices.Reasoning;

import CTS_PIM.ComputationalModel.AssociationServices.AssociationQuery.AssociationQueryService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Association.AssociationList;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;

/**
 *
 */
public interface ReasoningService extends AssociationQueryService {

    /**
     * @param associationList
     * @param codeSystemVersion
     * @param context
     * @param queryControl
     * @return
     */
    public AssociationList classify(AssociationList associationList, CodeSystemVersionReference codeSystemVersion, ReadContext context, QueryControl queryControl);

}