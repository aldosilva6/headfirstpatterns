package org.automation.remote.receiver;

/**
 * Created by ainacio on Nov, 2023
 */
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " turning CD on");
    }

    public void off(){
        System.out.println(location + " turning CD off");
    }

    public void setCD(){
        System.out.println(location + " the setCD");
    }

    public void setRadio(){
        System.out.println(location + " set the radio");
    }

    public void setVolume(int volume){
        System.out.println(" set the volume:" + volume);
    }

}
