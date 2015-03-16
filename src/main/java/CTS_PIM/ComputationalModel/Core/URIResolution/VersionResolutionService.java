package CTS_PIM.ComputationalModel.Core.URIResolution;

import CTS_PIM.InformationModel.Core.ResourceReference.VersionTagReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

/**
 *
 */
public interface VersionResolutionService {

    /**
     *
     */
    public Number placeholder();

    /**
     * @param resourceURI
     * @return
     */
    public URI uriToCanonicalURI(URI resourceURI);

    /**
     * @param versionedResourceURI
     * @return
     */
    public URI uriToAbstractResourceURI(URI versionedResourceURI);

    /**
     * @param uri
     * @return
     */
    public URI uriToVersionedResourceURI(URI uri);

    /**
     * @param uri
     * @param externalResourceVersionId
     * @return
     */
    public URI uriAndVersionToVersionedResourceURI(URI uri, String externalResourceVersionId);

    /**
     * @param uri
     * @param versionTag
     * @return
     */
    public URI uriAndTagToVersionedResourceURI(URI uri, VersionTagReference versionTag);

}