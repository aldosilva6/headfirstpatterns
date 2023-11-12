package org.automation.remote.concreteCommand;

import org.automation.remote.command.Command;
import org.automation.remote.receiver.Stereo;

/**
 * Created by ainacio on Nov, 2023
 */
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
