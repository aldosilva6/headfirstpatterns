package org.automation.remote.concreteCommand;

import org.automation.remote.command.Command;
import org.automation.remote.receiver.Light;

/**
 * Created by ainacio on Nov, 2023
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
