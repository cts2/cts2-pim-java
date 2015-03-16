package CTS_PIM.InformationModel.ConceptDomainCatalog;

import CTS_PIM.InformationModel.Core.Directory.ConceptDomainBindingDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.Naming.ConceptDomainName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescription;

/**
 *
 */
public class ConceptDomainCatalogEntry extends AbstractResourceDescription {

    /**
     *
     */
    public ConceptDomainCatalogEntry() {
    }

    /**
     *
     */
    public ConceptDomainName conceptDomainName;

    /**
     *
     */
    public URIAndEntityName definingEntity;

    /**
     *
     */
    public ConceptDomainBindingDirectoryURI bindings;

}