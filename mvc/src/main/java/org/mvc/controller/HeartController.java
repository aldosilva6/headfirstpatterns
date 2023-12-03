package org.mvc.controller;

import org.mvc.HeartModelAdapter;
import org.mvc.model.HeartModelInterface;
import org.mvc.view.DJView;

/**
 * Created by ainacio on Dec, 2023
 */
public class HeartController implements ControllerInterface{

    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(new HeartModelAdapter(model), this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void increaseBPM() {
    }

    @Override
    public void decreaseBPM() {
    }

    @Override
    public void setBPM(int bpm) {
    }
}
