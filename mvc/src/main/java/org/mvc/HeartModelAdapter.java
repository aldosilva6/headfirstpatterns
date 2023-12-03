package org.mvc;

import org.mvc.model.BeatModelInterface;
import org.mvc.model.HeartModelInterface;

/**
 * Created by ainacio on Dec, 2023
 */
public class HeartModelAdapter implements BeatModelInterface {

    HeartModelInterface heartModel;

    public HeartModelAdapter(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public void setBPM(int bpm) {
    }

    @Override
    public int getBPM() {
        return heartModel.getHeartHate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heartModel.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heartModel.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heartModel.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heartModel.removeObserver(o);
    }
}
