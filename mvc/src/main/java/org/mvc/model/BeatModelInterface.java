package org.mvc.model;

import org.mvc.BPMObserver;
import org.mvc.BeatObserver;

/**
 * Created by ainacio on Nov, 2023
 */
public interface BeatModelInterface {

    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
