package org.mvc;

import org.mvc.controller.ControllerInterface;
import org.mvc.controller.HeartController;
import org.mvc.model.HeartModelInterface;

/**
 * Created by ainacio on Dec, 2023
 */
public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModelInterface heartModelInterface = new HeartModel();
        ControllerInterface controller = new HeartController(heartModelInterface);
    }
}
