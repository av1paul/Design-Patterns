package org.avi.commandPattern.undoRedo;

import org.avi.commandPattern.undoRedo.command.Command;
import org.avi.commandPattern.undoRedo.command.TurnOnCommand;
import org.avi.commandPattern.undoRedo.inovker.BulbRemote;
import org.avi.commandPattern.undoRedo.receiver.Bulb;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        BulbRemote remote = new BulbRemote();
        Command turnOn = new TurnOnCommand(bulb);
        remote.setCommand(turnOn);
        remote.pressButton();
        remote.redo();
        remote.undo();
        remote.undo();
        remote.undo();
    }
}
