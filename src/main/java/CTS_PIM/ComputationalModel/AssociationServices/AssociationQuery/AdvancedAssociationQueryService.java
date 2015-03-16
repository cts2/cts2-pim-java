package CTS_PIM.ComputationalModel.AssociationServices.AssociationQuery;

import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Association.AssociationGraph;
import CTS_PIM.InformationModel.Association.GraphDirection;
import CTS_PIM.InformationModel.Association.GraphFocus;
import CTS_PIM.InformationModel.Core.Directory.AssociationDirectoryURI;

/**
 *
 */
public interface AdvancedAssociationQueryService extends AssociationQueryService {

    /**
     * @param associationDirectory
     * @param graphFocus
     * @param focusEntity
     * @param resolveDirection
     * @param resolveDepth
     * @param queryControl
     * @param context
     * @return
     */
    public AssociationGraph resolveAsGraph(AssociationDirectoryURI associationDirectory, GraphFocus graphFocus, EntityNameOrURI focusEntity, GraphDirection resolveDirection, Number resolveDepth, QueryControl queryControl, ReadContext context);

}