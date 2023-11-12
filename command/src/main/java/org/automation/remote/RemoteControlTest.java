package org.automation.remote;

import org.automation.remote.concreteCommand.GarageDoorOpenCommand;
import org.automation.remote.concreteCommand.LightOnCommand;
import org.automation.remote.invoker.SimpleRemoteControl;
import org.automation.remote.receiver.GarageDoor;
import org.automation.remote.receiver.Light;

/**
 * Hello world!
 *
 */
public class RemoteControlTest
{
    public static void main( String[] args )
    {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("Garage Door");
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
