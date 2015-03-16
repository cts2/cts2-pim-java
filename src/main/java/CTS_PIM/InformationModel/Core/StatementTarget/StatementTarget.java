package CTS_PIM.InformationModel.Core.StatementTarget;

import CTS_PIM.InformationModel.Core.DataTypes.OpaqueData;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

import java.util.Set;

/**
 *
 */
public class StatementTarget {

    /**
     *
     */
    public StatementTarget() {
    }

    /**
     *
     */
    public StatementTargetType targetType;

    /**
     *
     */
    public String externalIdentifier;

    /**
     *
     */
    public OpaqueData literal;

    /**
     *
     */
    public ExternalURI resource;

    /**
     *
     */
    public URIAndEntityName entity;

    /**
     *
     */
    public Set<AnonymousStatement> bnode;

}