package org.automation.remote.receiver;

/**
 * Created by ainacio on Nov, 2023
 *
 * Receiver
 */
public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println(location + " is Open!");
    }

    public void down(){
        System.out.println(location + " is Down");
    }

    public void stop(){
        System.out.println(location + " is Stop");
    }

    public void lightOn(){
        System.out.println(location + "Light On!");
    }

    void lightOff(){
        System.out.println(location + "Light Off!");
    }
}
