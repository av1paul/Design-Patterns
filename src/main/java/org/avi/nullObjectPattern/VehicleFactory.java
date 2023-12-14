package org.avi.nullObjectPattern;

import java.util.Objects;

public class VehicleFactory {

    static Vehicle getVehicle(String type) {
        if(Objects.equals(type, "Car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
