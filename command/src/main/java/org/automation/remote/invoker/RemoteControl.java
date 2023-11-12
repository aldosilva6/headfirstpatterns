package org.automation.remote.invoker;

import org.automation.remote.command.Command;
import org.automation.remote.concreteCommand.NoCommand;

/**
 * Created by ainacio on Nov, 2023
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        offCommands = new Command[7];
        onCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        if(onCommands[slot] != null){
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot){
        if(offCommands[slot] != null){
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control ------");
        for (int i = 0;i < onCommands.length; i++){
            stringBuffer.append("[slot "+ i + "] "+ onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName());
        return stringBuffer.toString();
    }
}
