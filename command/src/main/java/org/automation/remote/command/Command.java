package org.automation.remote.command;

/**
 * Created by ainacio on Nov, 2023
 */
public interface Command {

    public void execute();

    public void undo();
}
