package org.automation.remote;

import org.automation.remote.concreteCommand.*;
import org.automation.remote.invoker.RemoteControl;
import org.automation.remote.receiver.GarageDoor;
import org.automation.remote.receiver.Light;
import org.automation.remote.receiver.Stereo;

/**
 * Created by ainacio on Nov, 2023
 */
public class RemoteLoaderLambda {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garage = new GarageDoor("Garage Door");
        Stereo stereo = new Stereo("Living Room");

        //The Command interface should have only one method to works
        /*remoteControl.setCommand(0, () -> new LightOnCommand(livingRoomLight), () -> new LightOffCommand(livingRoomLight));
        remoteControl.setCommand(1, () -> new LightOnCommand(kitchenLight), () -> new LightOffCommand(kitchenLight));
        remoteControl.setCommand(2, () -> new GarageDoorOpenCommand(garage), () -> new GarageDoorCloseCommand(garage));
        remoteControl.setCommand(3, () -> new StereoOnWithCDCommand(stereo), () -> new StereoOffWithCDCommand(stereo));*/

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
