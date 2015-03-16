package CTS_PIM.InformationModel.Core.StatementTarget;

import CTS_PIM.InformationModel.Core.ResourceReference.PredicateReference;

import java.util.Set;

/**
 *
 */
public class AnonymousStatement {

    /**
     *
     */
    public AnonymousStatement() {
    }

    /**
     *
     */
    public PredicateReference predicate;

    /**
     *
     */
    public Set<StatementTarget> target;

    /**
     *
     */
    public Set<Property> statementQualifier;

}