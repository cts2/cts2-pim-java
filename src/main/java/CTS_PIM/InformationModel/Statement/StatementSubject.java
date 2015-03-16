package CTS_PIM.InformationModel.Statement;

import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.TypesOfURI.ExternalURI;

/**
 *
 */
public class StatementSubject {

    /**
     *
     */
    public StatementSubject() {
    }

    /**
     *
     */
    public StatementSubjectType subjectType;

    /**
     *
     */
    public ExternalURI resource;

    /**
     *
     */
    public URIAndEntityName entity;

}