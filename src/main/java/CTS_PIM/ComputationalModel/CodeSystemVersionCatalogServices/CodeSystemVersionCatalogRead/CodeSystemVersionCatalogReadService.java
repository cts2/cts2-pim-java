package CTS_PIM.ComputationalModel.CodeSystemVersionCatalogServices.CodeSystemVersionCatalogRead;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Read.BaseReadService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.QueryControl;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.ReadContext;
import CTS_PIM.InformationModel.CodeSystemVersionCatalog.CodeSystemVersionCatalogEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;

import java.util.Set;

/**
 *
 */
public interface CodeSystemVersionCatalogReadService extends BaseReadService {

    /**
     *
     */
    public Set<VersionTagReference> supportedTag();

    /**
     * @param codeSystemVersion
     * @param context
     */
    public void exists(NameOrURI codeSystemVersion, ReadContext context);

    /**
     * @param codeSystemVersion
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemVersionCatalogEntry read(NameOrURI codeSystemVersion, QueryControl queryControl, ReadContext context);

    /**
     * @param codeSystem
     * @param tag
     * @param context
     */
    public void existsCodeSystemVersionForCodeSystem(NameOrURI codeSystem, NameOrURI tag, ReadContext context);

    /**
     * @param codeSystem
     * @param tag
     * @param queryControl
     * @param context
     * @return
     */
    public CodeSystemVersionCatalogEntry getCodeSystemVersionForCodeSystem(NameOrURI codeSystem, NameOrURI tag, QueryControl queryControl, ReadContext context);

    /**
     * @param codeSystem
     * @param officialResourceVersionId
     * @param context
     */
    public void existsVersionId(NameOrURI codeSystem, String officialResourceVersionId, ReadContext context);

    /**
     * @param codeSystem
     * @param officialResourceVersionId
     * @param context
     * @return
     */
    public CodeSystemVersionCatalogEntry getCodeSystemByVersionId(NameOrURI codeSystem, String officialResourceVersionId, ReadContext context);

}