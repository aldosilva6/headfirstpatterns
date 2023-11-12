package org.automation.remote.concreteCommand;

import org.automation.remote.command.Command;
import org.automation.remote.receiver.GarageDoor;

/**
 * Created by ainacio on Nov, 2023
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
