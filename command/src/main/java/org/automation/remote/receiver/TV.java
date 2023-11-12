package org.automation.remote.receiver;

/**
 * Created by ainacio on Nov, 2023
 */
public class TV {

    private String location;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " turning TV on");
    }

    public void off(){
        System.out.println(location + " turning TV Off");
    }

    public void setInputChannel(int inputChannel){
        System.out.println(location + " the input chanel:" + inputChannel);
    }

    public void setVolume(int volume){
        System.out.println(" set the volume:" + volume);
    }
}
