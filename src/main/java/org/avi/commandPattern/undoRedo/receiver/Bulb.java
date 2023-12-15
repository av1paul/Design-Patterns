package org.avi.commandPattern.undoRedo.receiver;

public class Bulb {

    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Turned OFF");
    }
}
