package org.avi.strategyPattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
