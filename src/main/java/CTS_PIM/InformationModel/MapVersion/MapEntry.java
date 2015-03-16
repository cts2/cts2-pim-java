package CTS_PIM.InformationModel.MapVersion;

import CTS_PIM.InformationModel.Core.ChangeModel.Changeable;
import CTS_PIM.InformationModel.Core.Directory.StatementDirectoryURI;
import CTS_PIM.InformationModel.Core.EntityReference.URIAndEntityName;
import CTS_PIM.InformationModel.Core.ResourceReference.MapVersionReference;
import CTS_PIM.InformationModel.Core.ResourceReference.SourceAndRoleReference;

import java.util.Set;

/**
 *
 */
public class MapEntry extends Changeable {

    /**
     *
     */
    public MapEntry() {
    }

    /**
     *
     */
    public MapVersionReference assertedBy;

    /**
     *
     */
    public URIAndEntityName mapFrom;

    /**
     *
     */
    public MapProcessingRule processingRule;

    /**
     *
     */
    public Set<SourceAndRoleReference> source;

    /**
     *
     */
    public StatementDirectoryURI sourceStatements;

}