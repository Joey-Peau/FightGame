package Model.Buildings;

import Model.Resources.Resource;

public interface Yieldable {

    Resource getYieldedResource();

    int getAmountYielded();

}
