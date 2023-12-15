package org.avi.commandPattern.undoRedo.command;

public interface Command {

    void execute();

    void undo();
}
