package org.avi.strategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle sports = new SportsVehicle();
        sports.drive();
        Vehicle passenger = new PassengerVehicle();
        passenger.drive();
        Vehicle offRoad = new OffRoadVehicle();
        offRoad.drive();
    }
}
