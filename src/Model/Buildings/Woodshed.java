package Model.Buildings;

import Model.Resources.Resource;

import java.util.LinkedList;

public class Woodshed extends Building implements Yieldable{
    @Override
    public Resource getYieldedResource() {
        return null;
    }

    @Override
    public int getAmountYielded() {
        return 0;
    }

    @Override
    public LinkedList<Resource> getRequirements() {
        return null;
    }
}
