package CTS_PIM.ComputationalModel.MapEntryServices.MapEntryMaintenance;

import CTS_PIM.ComputationalModel.Core.FunctionalProfiles.Maintenance.BaseMaintenanceService;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.EntityNameOrURI;
import CTS_PIM.ComputationalModel.Core.InterfaceElements.NameOrURI;
import CTS_PIM.InformationModel.Core.TypesOfURI.ChangeSetURI;
import CTS_PIM.InformationModel.MapVersion.MapEntry;
import CTS_PIM.InformationModel.MapVersion.MapProcessingRule;
import CTS_PIM.InformationModel.MapVersion.MapSet;

/**
 *
 */
public interface MapEntryMaintenanceService extends BaseMaintenanceService {

    /**
     * @param changeSet
     * @param assertedBy
     * @param mapFrom
     * @param processingRule
     * @return
     */
    public MapEntry createMapEntry(ChangeSetURI changeSet, NameOrURI assertedBy, EntityNameOrURI mapFrom, MapProcessingRule processingRule);

    /**
     * @param changeSet
     * @param mapVersion
     * @param mapFrom
     * @param request
     * @return
     */
    public MapEntry updateMapEntry(ChangeSetURI changeSet, NameOrURI mapVersion, EntityNameOrURI mapFrom, UpdateMapEntryRequest request);

    /**
     * @param changeSet
     * @param mapVersion
     * @param mapFrom
     * @param entryOrder
     * @param processingRule
     * @return
     */
    public MapEntry addMapSet(ChangeSetURI changeSet, NameOrURI mapVersion, EntityNameOrURI mapFrom, Number entryOrder, MapProcessingRule processingRule);

    /**
     * @param changeSet
     * @param mapVersion
     * @param mapFrom
     * @param setNumber
     * @return
     */
    public MapSet removeMapSet(ChangeSetURI changeSet, NameOrURI mapVersion, EntityNameOrURI mapFrom, Number setNumber);

    /**
     * @param changeSet
     * @param entry
     * @param addToSet
     * @param targetSlot
     * @param target
     * @return
     */
    public MapEntry addMapTarget(ChangeSetURI changeSet, MapEntry entry, Number addToSet, Number targetSlot, MapTargetRequest target);

    /**
     * @param changeSet
     * @param mapVersion
     * @param mapFrom
     * @param changeInSet
     * @param targetSlot
     * @param request
     * @return
     */
    public MapSet updateMapTarget(ChangeSetURI changeSet, NameOrURI mapVersion, EntityNameOrURI mapFrom, Number changeInSet, Number targetSlot, MapTargetRequest request);

    /**
     * @param changeSet
     * @param mapVersion
     * @param mapFrom
     * @param changeInSet
     * @param targetSlot
     * @return
     */
    public MapSet removeMapTarget(ChangeSetURI changeSet, NameOrURI mapVersion, EntityNameOrURI mapFrom, Number changeInSet, Number targetSlot);

}