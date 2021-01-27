package Model.Buildings;

import Model.Resources.Resource;

import java.util.LinkedList;

public interface Buildable {

    /**
     * Resources requirements to build
     * @return List of resources needed to build
     */
    LinkedList<Resource> getRequirements();

}
