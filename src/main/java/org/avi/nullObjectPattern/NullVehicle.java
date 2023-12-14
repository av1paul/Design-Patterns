package org.avi.nullObjectPattern;

public class NullVehicle implements Vehicle {
    @Override
    public int getFuelLevel() {
        return 0;
    }
}
