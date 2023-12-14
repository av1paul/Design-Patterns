package org.avi.nullObjectPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        System.out.println(car.getFuelLevel());
        Vehicle random = VehicleFactory.getVehicle(null);
        System.out.println(random.getFuelLevel());
    }
}
