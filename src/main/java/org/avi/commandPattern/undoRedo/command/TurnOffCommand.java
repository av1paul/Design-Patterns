package org.avi.commandPattern.undoRedo.command;

import org.avi.commandPattern.undoRedo.receiver.Bulb;

public class TurnOffCommand implements Command {

    private Bulb bulb;

    public TurnOffCommand(Bulb bulb) {
        this.bulb = bulb;
    }


    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }
}
