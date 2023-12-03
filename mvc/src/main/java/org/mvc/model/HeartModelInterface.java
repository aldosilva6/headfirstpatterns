package org.mvc.model;

import org.mvc.BPMObserver;
import org.mvc.BeatObserver;

/**
 * Created by ainacio on Dec, 2023
 */
public interface HeartModelInterface {

    int getHeartHate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
