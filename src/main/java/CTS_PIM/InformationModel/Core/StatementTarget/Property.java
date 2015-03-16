package CTS_PIM.InformationModel.Core.StatementTarget;

import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;
import CTS_PIM.InformationModel.Core.TypesOfURI.RenderingURI;

import java.util.Set;

/**
 *
 */
public class Property {

    /**
     *
     */
    public Property() {
    }

    /**
     *
     */
    public PredicateReference predicate;

    /**
     *
     */
    public Set<StatementTarget> value;

    /**
     *
     */
    public RenderingURI correspondingStatement;

    /**
     *
     */
    public Set<Property> propertyQualifier;

}