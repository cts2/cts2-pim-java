package CTS_PIM.InformationModel.Core.FiltersAndSorting;

import CTS_PIM.InformationModel.Core.ResourceReference.MatchAlgorithmReference;

import java.util.Set;

/**
 *
 */
public class FilterComponent {

    /**
     *
     */
    public FilterComponent() {
    }

    /**
     *
     */
    public Set<ComponentReference> filterComponent;

    /**
     *
     */
    public MatchAlgorithmReference matchAlgorithm;

    /**
     *
     */
    public String matchValue;

}