package org.automation.remote;

import org.automation.remote.command.Command;
import org.automation.remote.concreteCommand.*;
import org.automation.remote.invoker.RemoteControl;
import org.automation.remote.receiver.Light;
import org.automation.remote.receiver.Stereo;
import org.automation.remote.receiver.TV;

/**
 * Created by ainacio on Nov, 2023
 */
public class PartyModeControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        Command[] partyOn = {lightOn, stereoOn, tvOnCommand};
        Command[] partyOff = {lightOff, stereoOff, tvOffCommand};
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);

        System.out.println("--- Undo Macro ---");
        remoteControl.undoButtonWasPushed();

        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
