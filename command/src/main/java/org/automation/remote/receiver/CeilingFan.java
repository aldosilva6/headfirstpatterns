package org.automation.remote.receiver;

/**
 * Created by ainacio on Nov, 2023
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        System.out.println(location + " celing fan is on high");
        speed = HIGH;
    }

    public void medium(){
        System.out.println(location + " celing fan is on medium");
        speed = MEDIUM;
    }

    public void low(){
        System.out.println(location + " celing fan is on low");
        speed = LOW;
    }

    public void off(){
        System.out.println(location + " celing fan is off");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
