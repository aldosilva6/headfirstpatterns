package org.mvc.controller;

/**
 * Created by ainacio on Nov, 2023
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
