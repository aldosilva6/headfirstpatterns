package org.automation.remote.concreteCommand;

import org.automation.remote.command.Command;
import org.automation.remote.receiver.GarageDoor;

/**
 * Created by ainacio on Nov, 2023
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
