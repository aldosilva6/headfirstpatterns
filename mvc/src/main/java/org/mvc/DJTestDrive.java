package org.mvc;

import org.mvc.controller.BeatController;
import org.mvc.controller.ControllerInterface;
import org.mvc.model.BeatModelInterface;

import javax.naming.ldap.Control;

/**
 * Created by ainacio on Nov, 2023
 */
public class DJTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
