package org.automation.remote.receiver;

/**
 * Created by ainacio on Nov, 2023
 *
 * Receiver
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " turn the light on");
    }

    public void off(){
        System.out.println(location + " turn the light off");
    }
}
