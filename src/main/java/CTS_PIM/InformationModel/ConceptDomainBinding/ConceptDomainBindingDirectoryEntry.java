package CTS_PIM.InformationModel.ConceptDomainBinding;

import CTS_PIM.InformationModel.Core.Directory.DirectoryEntry;
import CTS_PIM.InformationModel.Core.ResourceReference.BindingQualifierReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ConceptDomainReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ContextReference;
import CTS_PIM.InformationModel.Core.ResourceReference.ValueSetReference;

/**
 *
 */
public class ConceptDomainBindingDirectoryEntry extends DirectoryEntry {

    /**
     *
     */
    public ConceptDomainBindingDirectoryEntry() {
    }

    /**
     *
     */
    public ConceptDomainReference bindingFor;

    /**
     *
     */
    public ValueSetReference boundValueSet;

    /**
     *
     */
    public BindingQualifierReference bindingQualifier;

    /**
     *
     */
    public ContextReference applicableContext;

}