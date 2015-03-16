package CTS_PIM.InformationModel.ConceptDomainCatalog;

import CTS_PIM.InformationModel.Core.Directory.ConceptDomainBindingDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.EntityReference;
import CTS_PIM.InformationModel.Core.Naming.ConceptDomainName;
import CTS_PIM.InformationModel.Core.ResourceDescription.AbstractResourceDescriptionDirectoryEntry;

/**
 *
 */
public class ConceptDomainCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry {

    /**
     *
     */
    public ConceptDomainCatalogEntrySummary() {
    }

    /**
     *
     */
    public ConceptDomainName conceptDomainName;

    /**
     *
     */
    public EntityReference definingEntity;

    /**
     *
     */
    public ConceptDomainBindingDirectoryURI bindings;

}