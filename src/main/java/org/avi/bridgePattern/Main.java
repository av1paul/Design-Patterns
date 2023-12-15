package org.avi.bridgePattern;

public class Main {
    public static void main(String[] args) {
        LivingOrg dog = new Dog(new LandBreatheImplementation());
        LivingOrg fish = new Fish(new WaterBreatheImplementation());
        dog.breathe();
        fish.breathe();
    }
}
