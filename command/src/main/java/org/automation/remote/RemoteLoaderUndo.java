package org.automation.remote;

import org.automation.remote.concreteCommand.CeilingFanHighCommand;
import org.automation.remote.concreteCommand.CeilingFanLowCommand;
import org.automation.remote.concreteCommand.CeilingFanMediumCommand;
import org.automation.remote.concreteCommand.CeilingFanOffCommand;
import org.automation.remote.invoker.RemoteControl;
import org.automation.remote.receiver.CeilingFan;

/**
 * Created by ainacio on Nov, 2023
 */
public class RemoteLoaderUndo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
