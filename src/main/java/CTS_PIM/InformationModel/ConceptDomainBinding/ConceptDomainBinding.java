package CTS_PIM.InformationModel.ConceptDomainBinding;

import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.ResourceReference.*;
import CTS_PIM.InformationModel.Core.TypesOfURI.DocumentURI;

import java.util.Set;

/**
 *
 */
public class ConceptDomainBinding extends Changeable {

    /**
     *
     */
    public ConceptDomainBinding() {
    }

    /**
     *
     */
    public DocumentURI bindingURI;

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
    public ContextReference applicableContext;

    /**
     *
     */
    public BindingQualifierReference bindingQualifier;

    /**
     *
     */
    public ValueSetDefinitionReference boundValueSetDefinition;

    /**
     *
     */
    public Set<CodeSystemVersionReference> useCodeSystemVersion;

}