package CTS_PIM.ComputationalModel.Core.BaseService;

import CTS_PIM.ImplementationProfile.ImplementationProfile;
import CTS_PIM.ImplementationProfile.ProfileElement;
import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.ResourceReference.FormatReference;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceReference;

import java.util.Set;

/**
 *
 */
public interface BaseService {

    /**
     *
     */
    public String serviceName();

    /**
     *
     */
    public OpaqueData serviceDescription();

    /**
     *
     */
    public SourceReference serviceProvider();

    /**
     *
     */
    public String serviceVersion();

    /**
     *
     */
    public Set<FormatReference> supportedFormat();

    /**
     *
     */
    public FormatReference defaultFormat();

    /**
     *
     */
    public Set<ProfileElement> supportedProfile();

    /**
     *
     */
    public Set<ImplementationProfile> implementationType();

    /**
     *
     */
    public Set<DocumentedNamespaceReference> knownNamespace();

}