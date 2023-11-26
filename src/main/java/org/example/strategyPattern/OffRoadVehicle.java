package org.example.strategyPattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
