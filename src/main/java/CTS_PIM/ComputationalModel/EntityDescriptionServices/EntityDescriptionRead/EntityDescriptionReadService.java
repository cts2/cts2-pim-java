package CTS_PIM.ComputationalModel.EntityDescriptionServices.EntityDescriptionRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemReference;
import CTS_PIM.InformationModel.Core.ResourceReference.CodeSystemVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Entity.EntityDescriptionBase;
import CTS_PIM.InformationModel.Entity.EntityList;

import java.util.Set;

/**
 *
 */
public interface EntityDescriptionReadService extends BaseReadService {

    /**
     *
     */
    public Set<CodeSystemReference> knownCodeSystem();

    /**
     *
     */
    public Set<CodeSystemVersionReference> knownCodeSystemVersion();

    /**
     *
     */
    public Set<VersionTagReference> supportedVersionTag();

    /**
     * @param entityID
     * @param context
     * @return
     */
    public EntityReference availableDescriptions(EntityNameOrURI entityID, ReadContext context);

    /**
     * @param entityID
     * @param codeSystemVersion
     * @param context
     */
    public void exists(EntityNameOrURI entityID, NameOrURI codeSystemVersion, ReadContext context);

    /**
     * @param entityID
     * @param codeSystem
     * @param tag
     * @param context
     */
    public void existsInCodeSystem(EntityNameOrURI entityID, NameOrURI codeSystem, NameOrURI tag, ReadContext context);

    /**
     * @param entityID
     * @param codeSystemVersion
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDescriptionBase read(EntityNameOrURI entityID, NameOrURI codeSystemVersion, QueryControl queryControl, ReadContext context);

    /**
     * @param entityID
     * @param codeSystem
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public EntityDescriptionBase readByCodeSystem(EntityNameOrURI entityID, NameOrURI codeSystem, NameOrURI tag, QueryControl queryControl, ReadContext context);

    /**
     * @param entityID
     * @param queryControl
     * @param context
     * @return
     */
    public EntityList readEntityDescriptions(EntityNameOrURI entityID, QueryControl queryControl, ReadContext context);

}