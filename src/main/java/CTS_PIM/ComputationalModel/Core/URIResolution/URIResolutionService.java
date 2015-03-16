package CTS_PIM.ComputationalModel.Core.URIResolution;

import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.URI;

import java.util.Date;

/**
 *
 */
public interface URIResolutionService {

    /**
     *
     */
    public Date lastUpdated();

    /**
     * @param aliasURI
     * @param canonicalURI
     */
    public void addMapping(ExternalURI aliasURI, ExternalURI canonicalURI);

    /**
     * @param oldCanonicalURI
     * @param newCanonicalURI
     */
    public void changeCanonicalURI(ExternalURI oldCanonicalURI, ExternalURI newCanonicalURI);

    /**
     * @param canonicalURI
     * @return
     */
    public URIList getURIAliases(ExternalURI canonicalURI);

    /**
     * @param canonicalURI
     */
    public void removeAllMapsFor(URI canonicalURI);

    /**
     * @param aliasURI
     * @param canonicalURI
     */
    public void removeMapping(URI aliasURI, URI canonicalURI);

    /**
     * @param uri
     * @return
     */
    public URI uriToCanonicalURI(URI uri);

}