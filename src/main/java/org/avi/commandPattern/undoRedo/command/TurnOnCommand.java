package org.avi.commandPattern.undoRedo.command;

import org.avi.commandPattern.undoRedo.receiver.Bulb;

public class TurnOnCommand implements Command {

    private Bulb bulb;

    public TurnOnCommand(Bulb bulb) {
        this.bulb = bulb;
    }


    @Override
    public void execute() {
        bulb.turnOn();
    }

    @Override
    public void undo() {
        bulb.turnOff();
    }
}
