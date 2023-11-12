package org.automation.remote.invoker;

import org.automation.remote.command.Command;

/**
 * Created by ainacio on Nov, 2023
 *
 * Invoker class
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
