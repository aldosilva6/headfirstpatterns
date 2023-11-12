package org.automation.remote.concreteCommand;

import org.automation.remote.command.Command;
import org.automation.remote.receiver.Stereo;

/**
 * Created by ainacio on Nov, 2023
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
