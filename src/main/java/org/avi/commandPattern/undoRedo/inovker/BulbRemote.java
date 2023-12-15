package org.avi.commandPattern.undoRedo.inovker;

import org.avi.commandPattern.undoRedo.command.Command;

import java.util.Stack;

public class BulbRemote {

    private Stack<Command> commandHistory;
    private Command command;

    public BulbRemote() {
        this.commandHistory = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if(command == null) {
            return;
        }
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if(!commandHistory.isEmpty()) {
            Command prevCommand = commandHistory.pop();
            prevCommand.undo();
        }
    }

    public void redo() {
        if(!commandHistory.isEmpty()) {
            Command prevCommand = commandHistory.peek();
            prevCommand.execute();
            commandHistory.push(prevCommand);
        }
    }
}
